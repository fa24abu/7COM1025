package flc.util;

import flc.model.*;
import flc.service.*;

import java.util.ArrayList;
import java.util.List;

public class DataInitializer {

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
        // Month 1: Weekends 1-4
        int month = 1;

        // Weekend 1
        ts.addLesson(new Lesson(1, ExerciseType.ZUMBA, DayType.SATURDAY, TimeSlot.MORNING, 12, month));
        ts.addLesson(new Lesson(2, ExerciseType.AQUACISE, DayType.SATURDAY, TimeSlot.AFTERNOON, 14, month));
        ts.addLesson(new Lesson(3, ExerciseType.BOXFIT, DayType.SATURDAY, TimeSlot.EVENING, 16, month));
        ts.addLesson(new Lesson(4, ExerciseType.BODYBLITZ, DayType.SUNDAY, TimeSlot.MORNING, 18, month));
        ts.addLesson(new Lesson(5, ExerciseType.YOGA, DayType.SUNDAY, TimeSlot.AFTERNOON, 10, month));
        ts.addLesson(new Lesson(6, ExerciseType.ZUMBA, DayType.SUNDAY, TimeSlot.EVENING, 12, month));

        // Weekend 2
        ts.addLesson(new Lesson(7, ExerciseType.AQUACISE, DayType.SATURDAY, TimeSlot.MORNING, 14, month));
        ts.addLesson(new Lesson(8, ExerciseType.BOXFIT, DayType.SATURDAY, TimeSlot.AFTERNOON, 16, month));
        ts.addLesson(new Lesson(9, ExerciseType.BODYBLITZ, DayType.SATURDAY, TimeSlot.EVENING, 18, month));
        ts.addLesson(new Lesson(10, ExerciseType.YOGA, DayType.SUNDAY, TimeSlot.MORNING, 10, month));
        ts.addLesson(new Lesson(11, ExerciseType.ZUMBA, DayType.SUNDAY, TimeSlot.AFTERNOON, 12, month));
        ts.addLesson(new Lesson(12, ExerciseType.AQUACISE, DayType.SUNDAY, TimeSlot.EVENING, 14, month));

        // Weekend 3
        ts.addLesson(new Lesson(13, ExerciseType.BOXFIT, DayType.SATURDAY, TimeSlot.MORNING, 16, month));
        ts.addLesson(new Lesson(14, ExerciseType.BODYBLITZ, DayType.SATURDAY, TimeSlot.AFTERNOON, 18, month));
        ts.addLesson(new Lesson(15, ExerciseType.YOGA, DayType.SATURDAY, TimeSlot.EVENING, 10, month));
        ts.addLesson(new Lesson(16, ExerciseType.ZUMBA, DayType.SUNDAY, TimeSlot.MORNING, 12, month));
        ts.addLesson(new Lesson(17, ExerciseType.AQUACISE, DayType.SUNDAY, TimeSlot.AFTERNOON, 14, month));
        ts.addLesson(new Lesson(18, ExerciseType.BOXFIT, DayType.SUNDAY, TimeSlot.EVENING, 16, month));

        // Weekend 4
        ts.addLesson(new Lesson(19, ExerciseType.BODYBLITZ, DayType.SATURDAY, TimeSlot.MORNING, 18, month));
        ts.addLesson(new Lesson(20, ExerciseType.YOGA, DayType.SATURDAY, TimeSlot.AFTERNOON, 10, month));
        ts.addLesson(new Lesson(21, ExerciseType.ZUMBA, DayType.SATURDAY, TimeSlot.EVENING, 12, month));
        ts.addLesson(new Lesson(22, ExerciseType.AQUACISE, DayType.SUNDAY, TimeSlot.MORNING, 14, month));
        ts.addLesson(new Lesson(23, ExerciseType.BOXFIT, DayType.SUNDAY, TimeSlot.AFTERNOON, 16, month));
        ts.addLesson(new Lesson(24, ExerciseType.BODYBLITZ, DayType.SUNDAY, TimeSlot.EVENING, 18, month));

        // Month 2: Weekends 5-8
        month = 2;

        // Weekend 5
        ts.addLesson(new Lesson(25, ExerciseType.YOGA, DayType.SATURDAY, TimeSlot.MORNING, 10, month));
        ts.addLesson(new Lesson(26, ExerciseType.ZUMBA, DayType.SATURDAY, TimeSlot.AFTERNOON, 12, month));
        ts.addLesson(new Lesson(27, ExerciseType.AQUACISE, DayType.SATURDAY, TimeSlot.EVENING, 14, month));
        ts.addLesson(new Lesson(28, ExerciseType.BOXFIT, DayType.SUNDAY, TimeSlot.MORNING, 16, month));
        ts.addLesson(new Lesson(29, ExerciseType.BODYBLITZ, DayType.SUNDAY, TimeSlot.AFTERNOON, 18, month));
        ts.addLesson(new Lesson(30, ExerciseType.YOGA, DayType.SUNDAY, TimeSlot.EVENING, 10, month));

        // Weekend 6
        ts.addLesson(new Lesson(31, ExerciseType.ZUMBA, DayType.SATURDAY, TimeSlot.MORNING, 12, month));
        ts.addLesson(new Lesson(32, ExerciseType.AQUACISE, DayType.SATURDAY, TimeSlot.AFTERNOON, 14, month));
        ts.addLesson(new Lesson(33, ExerciseType.BOXFIT, DayType.SATURDAY, TimeSlot.EVENING, 16, month));
        ts.addLesson(new Lesson(34, ExerciseType.BODYBLITZ, DayType.SUNDAY, TimeSlot.MORNING, 18, month));
        ts.addLesson(new Lesson(35, ExerciseType.YOGA, DayType.SUNDAY, TimeSlot.AFTERNOON, 10, month));
        ts.addLesson(new Lesson(36, ExerciseType.ZUMBA, DayType.SUNDAY, TimeSlot.EVENING, 12, month));

        // Weekend 7
        ts.addLesson(new Lesson(37, ExerciseType.AQUACISE, DayType.SATURDAY, TimeSlot.MORNING, 14, month));
        ts.addLesson(new Lesson(38, ExerciseType.BOXFIT, DayType.SATURDAY, TimeSlot.AFTERNOON, 16, month));
        ts.addLesson(new Lesson(39, ExerciseType.BODYBLITZ, DayType.SATURDAY, TimeSlot.EVENING, 18, month));
        ts.addLesson(new Lesson(40, ExerciseType.YOGA, DayType.SUNDAY, TimeSlot.MORNING, 10, month));
        ts.addLesson(new Lesson(41, ExerciseType.ZUMBA, DayType.SUNDAY, TimeSlot.AFTERNOON, 12, month));
        ts.addLesson(new Lesson(42, ExerciseType.AQUACISE, DayType.SUNDAY, TimeSlot.EVENING, 14, month));

        // Weekend 8
        ts.addLesson(new Lesson(43, ExerciseType.BOXFIT, DayType.SATURDAY, TimeSlot.MORNING, 16, month));
        ts.addLesson(new Lesson(44, ExerciseType.BODYBLITZ, DayType.SATURDAY, TimeSlot.AFTERNOON, 18, month));
        ts.addLesson(new Lesson(45, ExerciseType.YOGA, DayType.SATURDAY, TimeSlot.EVENING, 10, month));
        ts.addLesson(new Lesson(46, ExerciseType.ZUMBA, DayType.SUNDAY, TimeSlot.MORNING, 12, month));
        ts.addLesson(new Lesson(47, ExerciseType.AQUACISE, DayType.SUNDAY, TimeSlot.AFTERNOON, 14, month));
        ts.addLesson(new Lesson(48, ExerciseType.BOXFIT, DayType.SUNDAY, TimeSlot.EVENING, 16, month));
    }

    public static void seedBookingsAndReviews(
            List<Member> members,
            TimeTableService ts,
            BookingService bs,
            ReviewService rs) {

        Booking b1 = bs.book(members.get(0), ts.getLessonById(1));
        rs.addReview(b1, "Very satisfied", 5);

        Booking b2 = bs.book(members.get(1), ts.getLessonById(2));
        rs.addReview(b2, "Satisfied", 4);

        Booking b3 = bs.book(members.get(2), ts.getLessonById(3));
        rs.addReview(b3, "Ok", 3);

        Booking b4 = bs.book(members.get(3), ts.getLessonById(4));
        rs.addReview(b4, "Dissatisfied", 2);

        Booking b5 = bs.book(members.get(4), ts.getLessonById(5));
        rs.addReview(b5, "Very dissatisfied", 1);

        Booking b6 = bs.book(members.get(5), ts.getLessonById(6));
        rs.addReview(b6, "Very satisfied", 5);

        Booking b7 = bs.book(members.get(6), ts.getLessonById(7));
        rs.addReview(b7, "Satisfied", 4);

        Booking b8 = bs.book(members.get(7), ts.getLessonById(8));
        rs.addReview(b8, "Ok", 3);

        Booking b9 = bs.book(members.get(8), ts.getLessonById(9));
        rs.addReview(b9, "Dissatisfied", 2);

        Booking b10 = bs.book(members.get(9), ts.getLessonById(10));
        rs.addReview(b10, "Very dissatisfied", 1);

        Booking b11 = bs.book(members.get(0), ts.getLessonById(11));
        rs.addReview(b11, "Very satisfied", 5);

        Booking b12 = bs.book(members.get(1), ts.getLessonById(12));
        rs.addReview(b12, "Satisfied", 4);

        Booking b13 = bs.book(members.get(2), ts.getLessonById(13));
        rs.addReview(b13, "Ok", 3);

        Booking b14 = bs.book(members.get(3), ts.getLessonById(14));
        rs.addReview(b14, "Dissatisfied", 2);

        Booking b15 = bs.book(members.get(4), ts.getLessonById(15));
        rs.addReview(b15, "Very dissatisfied", 1);

        Booking b16 = bs.book(members.get(5), ts.getLessonById(16));
        rs.addReview(b16, "Very satisfied", 5);

        Booking b17 = bs.book(members.get(6), ts.getLessonById(17));
        rs.addReview(b17, "Satisfied", 4);

        Booking b18 = bs.book(members.get(7), ts.getLessonById(18));
        rs.addReview(b18, "Ok", 3);

        Booking b19 = bs.book(members.get(8), ts.getLessonById(19));
        rs.addReview(b19, "Dissatisfied", 2);

        Booking b20 = bs.book(members.get(9), ts.getLessonById(20));
        rs.addReview(b20, "Very dissatisfied", 1);
    }

    public static void printAllMembers(List<Member> members) {
        System.out.println("=== Members ===");
        for (Member m : members) {
            System.out.println("ID: " + m.getId() + " | Name: " + m.getName());
        }
    }

    public static void printAllLessons(TimeTableService ts) {
        System.out.println("\n=== Lessons ===");
        for (Lesson l : ts.getAllLessons()) {
            System.out.println("ID: " + l.getId() + " | Type: " + l.getType() +
                    " | Day: " + l.getDay() + " | Slot: " + l.getSlot() +
                    " | Price: $" + l.getPrice() +
                    " | Booked: " + l.getBookings().size() + "/" + 4);
        }
    }

    public static void printAllBookings(BookingService bs) {
        System.out.println("\n=== Bookings ===");
        for (Booking b : bs.getAll()) {
            System.out.println("BookingID: " + b.getId() + " | Member: " + b.getMember().getName() +
                    " | LessonID: " + b.getLesson().getId() + " | Status: " + b.getStatus() +
                    (b.getReview() != null ? " | Rating: " + b.getReview().getRating() +
                            " | Review: " + b.getReview().getComment() : ""));
        }
    }
}