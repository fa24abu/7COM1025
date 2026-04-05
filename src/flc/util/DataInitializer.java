package flc.util;

import flc.model.*;
import flc.service.*;

import java.util.ArrayList;
import java.util.List;

public class DataInitializer {

    private static final String VERY_SATISFIED = "Very satisfied";
    private static final String SATISFIED = "Satisfied";
    private static final String OK = "Ok";
    private static final String DISSATISFIED = "Dissatisfied";
    private static final String VERY_DISSATISFIED = "Very dissatisfied";

    public static List<Member> createMembers() {
        List<Member> list = new ArrayList<>();

        list.add(new Member(1, "Member1"));
        list.add(new Member(2, "Member2"));
        list.add(new Member(3, "Member3"));
        list.add(new Member(4, "Member4"));
        list.add(new Member(5, "Member5"));
        list.add(new Member(6, "Member6"));
        list.add(new Member(7, "Member7"));
        list.add(new Member(8, "Member8"));
        list.add(new Member(9, "Member9"));
        list.add(new Member(10, "Member10"));

        return list;
    }

    public static void createLessons(TimeTableService ts) {
        ts.addLesson(new Lesson(1, ExerciseType.ZUMBA, DayType.SATURDAY, TimeSlot.MORNING, 12, 1));
        ts.addLesson(new Lesson(2, ExerciseType.AQUACISE, DayType.SATURDAY, TimeSlot.AFTERNOON, 14, 1));
        ts.addLesson(new Lesson(3, ExerciseType.BOXFIT, DayType.SATURDAY, TimeSlot.EVENING, 16, 1));
        ts.addLesson(new Lesson(4, ExerciseType.BODYBLITZ, DayType.SUNDAY, TimeSlot.MORNING, 18, 1));
        ts.addLesson(new Lesson(5, ExerciseType.YOGA, DayType.SUNDAY, TimeSlot.AFTERNOON, 10, 1));
        ts.addLesson(new Lesson(6, ExerciseType.ZUMBA, DayType.SUNDAY, TimeSlot.EVENING, 12, 1));

        ts.addLesson(new Lesson(7, ExerciseType.AQUACISE, DayType.SATURDAY, TimeSlot.MORNING, 14, 1));
        ts.addLesson(new Lesson(8, ExerciseType.BOXFIT, DayType.SATURDAY, TimeSlot.AFTERNOON, 16, 1));
        ts.addLesson(new Lesson(9, ExerciseType.BODYBLITZ, DayType.SATURDAY, TimeSlot.EVENING, 18, 1));
        ts.addLesson(new Lesson(10, ExerciseType.YOGA, DayType.SUNDAY, TimeSlot.MORNING, 10, 1));
        ts.addLesson(new Lesson(11, ExerciseType.ZUMBA, DayType.SUNDAY, TimeSlot.AFTERNOON, 12, 1));
        ts.addLesson(new Lesson(12, ExerciseType.AQUACISE, DayType.SUNDAY, TimeSlot.EVENING, 14, 1));

        ts.addLesson(new Lesson(13, ExerciseType.BOXFIT, DayType.SATURDAY, TimeSlot.MORNING, 16, 1));
        ts.addLesson(new Lesson(14, ExerciseType.BODYBLITZ, DayType.SATURDAY, TimeSlot.AFTERNOON, 18, 1));
        ts.addLesson(new Lesson(15, ExerciseType.YOGA, DayType.SATURDAY, TimeSlot.EVENING, 10, 1));
        ts.addLesson(new Lesson(16, ExerciseType.ZUMBA, DayType.SUNDAY, TimeSlot.MORNING, 12, 1));
        ts.addLesson(new Lesson(17, ExerciseType.AQUACISE, DayType.SUNDAY, TimeSlot.AFTERNOON, 14, 1));
        ts.addLesson(new Lesson(18, ExerciseType.BOXFIT, DayType.SUNDAY, TimeSlot.EVENING, 16, 1));

        ts.addLesson(new Lesson(19, ExerciseType.BODYBLITZ, DayType.SATURDAY, TimeSlot.MORNING, 18, 1));
        ts.addLesson(new Lesson(20, ExerciseType.YOGA, DayType.SATURDAY, TimeSlot.AFTERNOON, 10, 1));
        ts.addLesson(new Lesson(21, ExerciseType.ZUMBA, DayType.SATURDAY, TimeSlot.EVENING, 12, 1));
        ts.addLesson(new Lesson(22, ExerciseType.AQUACISE, DayType.SUNDAY, TimeSlot.MORNING, 14, 1));
        ts.addLesson(new Lesson(23, ExerciseType.BOXFIT, DayType.SUNDAY, TimeSlot.AFTERNOON, 16, 1));
        ts.addLesson(new Lesson(24, ExerciseType.BODYBLITZ, DayType.SUNDAY, TimeSlot.EVENING, 18, 1));

        ts.addLesson(new Lesson(25, ExerciseType.YOGA, DayType.SATURDAY, TimeSlot.MORNING, 10, 2));
        ts.addLesson(new Lesson(26, ExerciseType.ZUMBA, DayType.SATURDAY, TimeSlot.AFTERNOON, 12, 2));
        ts.addLesson(new Lesson(27, ExerciseType.AQUACISE, DayType.SATURDAY, TimeSlot.EVENING, 14, 2));
        ts.addLesson(new Lesson(28, ExerciseType.BOXFIT, DayType.SUNDAY, TimeSlot.MORNING, 16, 2));
        ts.addLesson(new Lesson(29, ExerciseType.BODYBLITZ, DayType.SUNDAY, TimeSlot.AFTERNOON, 18, 2));
        ts.addLesson(new Lesson(30, ExerciseType.YOGA, DayType.SUNDAY, TimeSlot.EVENING, 10, 2));

        ts.addLesson(new Lesson(31, ExerciseType.ZUMBA, DayType.SATURDAY, TimeSlot.MORNING, 12, 2));
        ts.addLesson(new Lesson(32, ExerciseType.AQUACISE, DayType.SATURDAY, TimeSlot.AFTERNOON, 14, 2));
        ts.addLesson(new Lesson(33, ExerciseType.BOXFIT, DayType.SATURDAY, TimeSlot.EVENING, 16, 2));
        ts.addLesson(new Lesson(34, ExerciseType.BODYBLITZ, DayType.SUNDAY, TimeSlot.MORNING, 18, 2));
        ts.addLesson(new Lesson(35, ExerciseType.YOGA, DayType.SUNDAY, TimeSlot.AFTERNOON, 10, 2));
        ts.addLesson(new Lesson(36, ExerciseType.ZUMBA, DayType.SUNDAY, TimeSlot.EVENING, 12, 2));

        ts.addLesson(new Lesson(37, ExerciseType.AQUACISE, DayType.SATURDAY, TimeSlot.MORNING, 14, 2));
        ts.addLesson(new Lesson(38, ExerciseType.BOXFIT, DayType.SATURDAY, TimeSlot.AFTERNOON, 16, 2));
        ts.addLesson(new Lesson(39, ExerciseType.BODYBLITZ, DayType.SATURDAY, TimeSlot.EVENING, 18, 2));
        ts.addLesson(new Lesson(40, ExerciseType.YOGA, DayType.SUNDAY, TimeSlot.MORNING, 10, 2));
        ts.addLesson(new Lesson(41, ExerciseType.ZUMBA, DayType.SUNDAY, TimeSlot.AFTERNOON, 12, 2));
        ts.addLesson(new Lesson(42, ExerciseType.AQUACISE, DayType.SUNDAY, TimeSlot.EVENING, 14, 2));

        ts.addLesson(new Lesson(43, ExerciseType.BOXFIT, DayType.SATURDAY, TimeSlot.MORNING, 16, 2));
        ts.addLesson(new Lesson(44, ExerciseType.BODYBLITZ, DayType.SATURDAY, TimeSlot.AFTERNOON, 18, 2));
        ts.addLesson(new Lesson(45, ExerciseType.YOGA, DayType.SATURDAY, TimeSlot.EVENING, 10, 2));
        ts.addLesson(new Lesson(46, ExerciseType.ZUMBA, DayType.SUNDAY, TimeSlot.MORNING, 12, 2));
        ts.addLesson(new Lesson(47, ExerciseType.AQUACISE, DayType.SUNDAY, TimeSlot.AFTERNOON, 14, 2));
        ts.addLesson(new Lesson(48, ExerciseType.BOXFIT, DayType.SUNDAY, TimeSlot.EVENING, 16, 2));
    }

    public static void seedBookingsAndReviews(
            List<Member> members,
            TimeTableService ts,
            BookingService bs,
            ReviewService rs) {

        Booking[] bookings = new Booking[20];

        bookings[0] = bs.book(members.get(0), ts.getLessonById(1));
        bookings[0].setStatus("attended");
        rs.addReview(bookings[0], VERY_SATISFIED, 5);

        bookings[1] = bs.book(members.get(1), ts.getLessonById(2));
        bookings[1].setStatus("attended");
        rs.addReview(bookings[1], SATISFIED, 4);

        bookings[2] = bs.book(members.get(2), ts.getLessonById(3));
        bookings[2].setStatus("attended");
        rs.addReview(bookings[2], OK, 3);

        bookings[3] = bs.book(members.get(3), ts.getLessonById(4));
        bookings[3].setStatus("attended");
        rs.addReview(bookings[3], DISSATISFIED, 2);

        bookings[4] = bs.book(members.get(4), ts.getLessonById(5));
        bookings[4].setStatus("attended");
        rs.addReview(bookings[4], VERY_DISSATISFIED, 1);

        bookings[5] = bs.book(members.get(5), ts.getLessonById(6));
        bookings[5].setStatus("attended");
        rs.addReview(bookings[5], VERY_SATISFIED, 5);

        bookings[6] = bs.book(members.get(6), ts.getLessonById(7));
        bookings[6].setStatus("attended");
        rs.addReview(bookings[6], SATISFIED, 4);

        bookings[7] = bs.book(members.get(7), ts.getLessonById(8));
        bookings[7].setStatus("attended");
        rs.addReview(bookings[7], OK, 3);

        bookings[8] = bs.book(members.get(8), ts.getLessonById(9));
        bookings[8].setStatus("attended");
        rs.addReview(bookings[8], DISSATISFIED, 2);

        bookings[9] = bs.book(members.get(9), ts.getLessonById(10));
        bookings[9].setStatus("attended");
        rs.addReview(bookings[9], VERY_DISSATISFIED, 1);

        bookings[10] = bs.book(members.get(0), ts.getLessonById(11));
        bookings[10].setStatus("attended");
        rs.addReview(bookings[10], VERY_SATISFIED, 5);

        bookings[11] = bs.book(members.get(1), ts.getLessonById(12));
        bookings[11].setStatus("attended");
        rs.addReview(bookings[11], SATISFIED, 4);

        bookings[12] = bs.book(members.get(2), ts.getLessonById(13));
        bookings[12].setStatus("attended");
        rs.addReview(bookings[12], OK, 3);

        bookings[13] = bs.book(members.get(3), ts.getLessonById(14));
        bookings[13].setStatus("attended");
        rs.addReview(bookings[13], DISSATISFIED, 2);

        bookings[14] = bs.book(members.get(4), ts.getLessonById(15));
        bookings[14].setStatus("attended");
        rs.addReview(bookings[14], VERY_DISSATISFIED, 1);

        bookings[15] = bs.book(members.get(5), ts.getLessonById(16));
        bookings[15].setStatus("attended");
        rs.addReview(bookings[15], VERY_SATISFIED, 5);

        bookings[16] = bs.book(members.get(6), ts.getLessonById(17));
        bookings[16].setStatus("attended");
        rs.addReview(bookings[16], SATISFIED, 4);

        bookings[17] = bs.book(members.get(7), ts.getLessonById(18));
        bookings[17].setStatus("attended");
        rs.addReview(bookings[17], OK, 3);

        bookings[18] = bs.book(members.get(8), ts.getLessonById(19));
        bookings[18].setStatus("attended");
        rs.addReview(bookings[18], DISSATISFIED, 2);

        bookings[19] = bs.book(members.get(9), ts.getLessonById(20));
        bookings[19].setStatus("attended");
        rs.addReview(bookings[19], VERY_DISSATISFIED, 1);
    }
}
