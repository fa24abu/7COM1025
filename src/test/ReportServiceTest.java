package test;

import flc.model.*;
import flc.service.*;
import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;

public class ReportServiceTest {

    @Test
    void testIncomeCalculation() {

        Lesson l = new Lesson(1, ExerciseType.YOGA, DayType.SATURDAY, TimeSlot.MORNING, 10, 5);
        BookingService bs = new BookingService();

        for (int i = 1; i <= 3; i++) {
            Booking b = bs.book(new Member(i, "M"), l);
            bs.attend(b.getId());
            b.setReview(new Review("Ok", 4));
        }

        double income = l.getBookings().size() * l.getPrice();

        assertEquals(30, income);
    }
}