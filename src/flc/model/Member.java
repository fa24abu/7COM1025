package flc.model;

public class Member {

    private final int memberId;
    private final String name;

    public Member(int memberId, String name) {
        this.memberId = memberId;
        this.name = name;
    }

    public int getMemberId() {
        return memberId;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Member{" +
                "id=" + memberId +
                ", name='" + name + '\'' +
                '}';
    }
}
