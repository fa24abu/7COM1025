package flc.util;

import flc.model.*;
import flc.service.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class DataInitializer {

    public static List<Member> createMembers() {
        List<Member> list = new ArrayList<>();
        for (int i = 1; i <= 10; i++) {
            list.add(new Member(i, "Member" + i));
        }
        return list;
    }

    public static void createLessons(TimeTableService ts) {
        int id = 1;

        for (int week = 1; week <= 8; week++) {
            for (DayType day : DayType.values()) {
                for (TimeSlot slot : TimeSlot.values()) {
                    ExerciseType type = ExerciseType.values()[id % 5];
                    double price = 10 + (id % 5) * 2;

                    ts.addLesson(new Lesson(id++, type, day, slot, price));
                }
            }
        }
    }

    public static void seedBookingsAndReviews(
            List<Member> members,
            TimeTableService ts,
            BookingService bs,
            ReviewService rs) {

        Random rand = new Random();

        int reviewCount = 0;

        for (Lesson l : ts.getAllLessons()) {
            for (Member m : members) {

                if (l.hasSpace() && rand.nextBoolean()) {
                    Booking b = bs.book(m, l);

                    if (b != null && reviewCount < 20) {
                        rs.addReview(b, "Good session", rand.nextInt(5) + 1);
                        reviewCount++;
                    }
                }
            }
        }
    }
}