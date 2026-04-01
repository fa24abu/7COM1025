package test;

import flc.model.*;
import flc.service.*;
import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;

public class ReviewServiceTest {

    BookingService bs;
    ReviewService rs;
    Lesson lesson;
    Member member;

    @BeforeEach
    void setup() {
        bs = new BookingService();
        rs = new ReviewService();
        lesson = new Lesson(1, ExerciseType.YOGA, DayType.SATURDAY, TimeSlot.MORNING, 10, 5);
        member = new Member(1, "Ali");
    }

    @Test
    void testReviewAfterAttend() {
        Booking b = bs.book(member, lesson);
        bs.attend(b.getId());

        rs.addReview(b, "Good", 5);

        assertNotNull(b.getReview());
    }

    @Test
    void testReviewBeforeAttend() {
        Booking b = bs.book(member, lesson);

        rs.addReview(b, "Bad", 2);

        assertNull(b.getReview());
    }
}