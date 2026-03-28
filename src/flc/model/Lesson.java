package flc.model;

import java.util.ArrayList;
import java.util.List;

public class Lesson {
    private int id;
    private ExerciseType type;
    private DayType day;
    private TimeSlot slot;
    private double price;
    private int capacity = 4;

    private List<Booking> bookings = new ArrayList<>();

    public Lesson(int id, ExerciseType type, DayType day, TimeSlot slot, double price) {
        this.id = id;
        this.type = type;
        this.day = day;
        this.slot = slot;
        this.price = price;
    }

    public boolean hasSpace() {
        return bookings.size() < capacity;
    }

    public void addBooking(Booking b) { bookings.add(b); }
    public void removeBooking(Booking b) { bookings.remove(b); }

    public List<Booking> getBookings() { return bookings; }

    public int getId() { return id; }
    public ExerciseType getType() { return type; }
    public DayType getDay() { return day; }
    public TimeSlot getSlot() { return slot; }
    public double getPrice() { return price; }
}