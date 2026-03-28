package flc.model;

public class Booking {
    private int id;
    private Member member;
    private Lesson lesson;
    private String status;
    private Review review;

    public Booking(int id, Member member, Lesson lesson) {
        this.id = id;
        this.member = member;
        this.lesson = lesson;
        this.status = "booked";
    }

    public int getId() { return id; }
    public Member getMember() { return member; }
    public Lesson getLesson() { return lesson; }

    public void setLesson(Lesson lesson) { this.lesson = lesson; }

    public String getStatus() { return status; }
    public void setStatus(String status) { this.status = status; }

    public void setReview(Review review) { this.review = review; }
    public Review getReview() { return review; }
}