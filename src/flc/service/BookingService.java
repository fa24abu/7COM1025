package flc.service;

import flc.model.*;

import java.util.ArrayList;
import java.util.List;

public class BookingService {

    private List<Booking> bookings = new ArrayList<>();
    private int counter = 1;

    public Booking book(Member m, Lesson l) {
 
        for (Booking b : bookings) {
            if (b.getMember().getId() == m.getId()
                    && b.getLesson().getId() == l.getId()
                    && !b.getStatus().equals(BookingStatus.CANCELLED)) {
                System.out.println("Duplicate booking!");
                return null;
            }
        }

        if (!l.hasSpace()) {
            System.out.println("Lesson full!");
            return null;
        }

        Booking b = new Booking(counter++, m, l);
        b.setStatus(BookingStatus.BOOKED);
        bookings.add(b);
        l.addBooking(b);
        return b;
    }

    public void cancel(int id) {
        Booking b = find(id);

        if (b == null) {
            System.out.println("Booking not found.");
            return;
        }

        if (b.getStatus().equals(BookingStatus.ATTENDED)) {
            System.out.println("Cannot cancel attended booking!");
            return;
        }

        b.getLesson().removeBooking(b);
        b.setStatus(BookingStatus.CANCELLED);
    }

    public boolean change(int id, Lesson newLesson) {
        Booking b = find(id);

        if (b == null) {
            System.out.println("Booking not found.");
            return false;
        }

        for (Booking existing : bookings) {
            if (existing.getMember().getId() == b.getMember().getId()
                    && existing.getLesson().getId() == newLesson.getId()
                    && !existing.getStatus().equals(BookingStatus.CANCELLED)
                    && existing.getId() != b.getId()) {
                System.out.println("Cannot change: duplicate booking would occur!");
                return false;
            }
        }

        if (!newLesson.hasSpace()) {
            System.out.println("Cannot change: lesson is full!");
            return false;
        }

        b.getLesson().removeBooking(b);

        b.setLesson(newLesson);
        newLesson.addBooking(b);

        b.setStatus(BookingStatus.CHANGED);
        System.out.println("Booking changed successfully. Booking ID remains: " + b.getId());
        return true;
    }

    public void attend(int bookingId) {
        Booking b = find(bookingId);

        if (b == null) return;

        if (b.getStatus().equals(BookingStatus.CANCELLED)) {
            System.out.println("Cannot attend cancelled booking");
            return;
        }

        if (b.getStatus().equals(BookingStatus.ATTENDED)) {
            System.out.println("Already attended");
            return;
        }

        b.setStatus(BookingStatus.ATTENDED);
    }

    public Booking find(int id) {
        return bookings.stream().filter(b -> b.getId() == id).findFirst().orElse(null);
    }

    public List<Booking> getAll() { return bookings; }
}
