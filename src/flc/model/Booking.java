package flc.model;

public class Booking {
    private int id;
    private Member member;
    private Lesson lesson;
    private BookingStatus status;
    private Review review;

    public Booking(int id, Member member, Lesson lesson) {
        this.id = id;
        this.member = member;
        this.lesson = lesson;
        this.status = BookingStatus.BOOKED;
    }

    public int getId() { return id; }
    public Member getMember() { return member; }
    public Lesson getLesson() { return lesson; }

    public void setLesson(Lesson lesson) { this.lesson = lesson; }

    public BookingStatus getStatus() { return status; }
    public void setStatus(BookingStatus status) { this.status = status; }

    public void setReview(Review review) { this.review = review; }
    public Review getReview() { return review; }
}
