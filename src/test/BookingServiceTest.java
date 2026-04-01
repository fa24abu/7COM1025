package test;

import flc.model.*;
import flc.service.*;
import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;

public class BookingServiceTest {

    BookingService service;
    Lesson lesson;
    Member member;

    @BeforeEach
    void setup() {
        service = new BookingService();
        lesson = new Lesson(1, ExerciseType.YOGA, DayType.SATURDAY, TimeSlot.MORNING, 10, 5);
        member = new Member(1, "Ali");
    }

    @Test
    void testBookingSuccess() {
        Booking b = service.book(member, lesson);

        assertNotNull(b);
        assertEquals("booked", b.getStatus());
    }

    @Test
    void testDuplicateBooking() {
        service.book(member, lesson);
        Booking b2 = service.book(member, lesson);

        assertNull(b2);
    }

    @Test
    void testCapacityLimit() {
        for (int i = 1; i <= 4; i++) {
            service.book(new Member(i, "M" + i), lesson);
        }

        Booking extra = service.book(new Member(99, "Extra"), lesson);
        assertNull(extra);
    }

    @Test
    void testCancelBooking() {
        Booking b = service.book(member, lesson);
        service.cancel(b.getId());

        assertEquals("cancelled", b.getStatus());
    }

    @Test
    void testChangeBooking() {
        Lesson newLesson = new Lesson(2, ExerciseType.ZUMBA, DayType.SUNDAY, TimeSlot.EVENING, 12, 5);

        Booking b = service.book(member, lesson);
        boolean changed = service.change(b.getId(), newLesson);

        assertTrue(changed);
        assertEquals(newLesson, b.getLesson());
    }

    @Test
    void testStatusAfterChange() {
        Booking b = service.book(member, lesson);

        Lesson newLesson = new Lesson(
                2,
                ExerciseType.ZUMBA,
                DayType.SUNDAY,
                TimeSlot.EVENING,
                12,
                4
        );

        boolean changed = service.change(b.getId(), newLesson);

        assertTrue(changed);
        assertEquals("changed", b.getStatus());
    }

    @Test
    void testStatusAfterAttend() {
        Booking b = service.book(member, lesson);

        service.attend(b.getId());

        assertEquals("attended", b.getStatus());
    }

    @Test
    void testStatusAfterCancel() {
        Booking b = service.book(member, lesson);

        service.cancel(b.getId());

        assertEquals("cancelled", b.getStatus());
    }

    @Test
    void testSeatReleasedAfterCancel() {
        Booking b = service.book(member, lesson);

        assertEquals(1, lesson.getBookings().size());

        service.cancel(b.getId());

        assertEquals(0, lesson.getBookings().size());
    }

    @Test
    void testSeatReleasedAfterChange() {
        Lesson newLesson = new Lesson(2, ExerciseType.ZUMBA,
                DayType.SUNDAY, TimeSlot.EVENING, 12, 4);

        Booking b = service.book(member, lesson);

        assertEquals(1, lesson.getBookings().size());
        assertEquals(0, newLesson.getBookings().size());

        service.change(b.getId(), newLesson);

        assertEquals(0, lesson.getBookings().size());

        assertEquals(1, newLesson.getBookings().size());
    }

    @Test
    void testCannotAttendCancelledBooking() {
        Booking b = service.book(member, lesson);

        service.cancel(b.getId());
        service.attend(b.getId());

        assertEquals("cancelled", b.getStatus());
    }

    @Test
    void testAttendOnlyOnce() {
        Booking b = service.book(member, lesson);

        service.attend(b.getId());
        service.attend(b.getId());

        assertEquals("attended", b.getStatus());
    }
}