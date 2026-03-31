package flc.controller;

import flc.model.*;
import flc.service.*;
import flc.util.*;

import java.util.List;
import java.util.Scanner;

public class FLCSystem {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        TimeTableService ts = new TimeTableService();
        BookingService bs = new BookingService();
        ReviewService rs = new ReviewService();
        ReportService rpt = new ReportService();

        List<Member> members = DataInitializer.createMembers();
        DataInitializer.createLessons(ts);
        DataInitializer.seedBookingsAndReviews(members, ts, bs, rs);

        while (true) {
            System.out.println("\n1.Book 2.Change/Cancel 3.Attend 4.Report 5.Champion 6.Exit");
            int c = sc.nextInt();

            if (c == 1) {
                System.out.println("1.Day 2.Type");
                int opt = sc.nextInt();

                List<Lesson> list;

                if (opt == 1) {
                    list = ts.getByDay(DayType.SATURDAY);
                } else {
                    list = ts.getByType(ExerciseType.YOGA);
                }

                list.forEach(l ->
                        System.out.println(
                                l.getId() + " | " +
                                        l.getDay() + " | " +
                                        l.getType() + " | " +
                                        l.getSlot()
                        )
                );
                Lesson l = ts.getLessonById(sc.nextInt());
                System.out.println("Enter Member ID:");
                int mid = sc.nextInt();

                Member m = members.stream()
                        .filter(x -> x.getId() == mid)
                        .findFirst()
                        .orElse(null);

                if (m == null) {
                    System.out.println("Invalid Member!");
                    continue;
                }

                Booking b = bs.book(m, l);
                if (b != null)
                    System.out.println("Booked ID: " + b.getId());
            }

            else if (c == 2) {
                System.out.println("Booking ID:");
                int id = sc.nextInt();

                System.out.println("1.Change 2.Cancel");
                int op = sc.nextInt();

                if (op == 1) {
                    Lesson l = ts.getLessonById(sc.nextInt());
                    bs.change(id, l);
                } else {
                    bs.cancel(id);
                }
            }

            else if (c == 3) {
                System.out.println("Booking ID:");
                int id = sc.nextInt();
                sc.nextLine();

                Booking b = bs.find(id);



                if (b == null) {
                    System.out.println("Invalid Booking ID");
                    continue;
                }

                bs.attend(id);

                System.out.println("Review:");
                String rev = sc.nextLine();

                System.out.println("Rating:");
                int r = sc.nextInt();

                rs.addReview(bs.find(id), rev, r);
            }

            else if (c == 4) {
                System.out.print("Enter month number: ");
                int month = sc.nextInt();
                rpt.lessonReport(ts.getAllLessons(), month);
            }

            else if (c == 5) {
                System.out.print("Enter month number: ");
                int month = sc.nextInt();
                rpt.championReport(ts.getAllLessons(), month);
            }

            else break;
        }
    }
}