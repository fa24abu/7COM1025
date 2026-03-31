package flc.service;

import flc.model.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ReportService {

    public void lessonReport(List<Lesson> allLessons, int month) {
        System.out.println("Monthly Lesson Report for month: " + month);

        for (Lesson l : allLessons) {

            if (l.getMonth() != month) continue;

            int attendedCount = 0;
            int ratingTotal = 0;

            for (Booking b : l.getBookings()) {
                if (b.getStatus().equals("attended")) {
                    attendedCount++;

                    if (b.getReview() != null)
                        ratingTotal += b.getReview().getRating();
                }
            }

            double avgRating = (attendedCount == 0) ? 0 :
                    (double) ratingTotal / attendedCount;

            System.out.println(
                    "LessonID: " + l.getId() +
                            " | " + l.getType() +
                            " | " + l.getDay() +
                            " | " + l.getSlot() +
                            " | Attended: " + attendedCount +
                            " | Avg Rating: " + avgRating
            );
        }
    }

    public void championReport(List<Lesson> lessons, int month) {

        Map<ExerciseType, Double> map = new HashMap<>();

        for (Lesson l : lessons) {

            if (l.getMonth() != month) continue;

            double income = 0;

            for (Booking b : l.getBookings()) {
                if (b.getStatus().equals("attended")) {
                    income += l.getPrice();
                }
            }

            map.put(l.getType(),
                    map.getOrDefault(l.getType(), 0.0) + income);
        }

        ExerciseType best = null;
        double max = 0;

        for (ExerciseType t : map.keySet()) {
            System.out.println(t + " Income: " + map.get(t));

            if (map.get(t) > max) {
                max = map.get(t);
                best = t;
            }
        }

        System.out.println("Champion: " + best);
    }
}