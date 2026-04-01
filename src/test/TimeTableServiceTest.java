package test;

import flc.model.*;
import flc.service.*;
import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;

public class TimeTableServiceTest {

    TimeTableService ts;

    @BeforeEach
    void setup() {
        ts = new TimeTableService();

        ts.addLesson(new Lesson(1, ExerciseType.YOGA, DayType.SATURDAY, TimeSlot.MORNING, 10, 5));
        ts.addLesson(new Lesson(2, ExerciseType.ZUMBA, DayType.SUNDAY, TimeSlot.EVENING, 12, 5));
    }

    @Test
    void testGetByDay() {
        assertEquals(1, ts.getByDay(DayType.SATURDAY).size());
    }

    @Test
    void testGetByType() {
        assertEquals(1, ts.getByType(ExerciseType.YOGA).size());
    }
}
