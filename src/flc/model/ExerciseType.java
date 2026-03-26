package flc.model;

public enum ExerciseType {

    YOGA(10.0),
    ZUMBA(12.0),
    AQUACISE(15.0),
    BOX_FIT(14.0),
    BODY_BLITZ(13.0);

    private final double price;

    ExerciseType(double price) {
        this.price = price;
    }

    public double getPrice() {
        return price;
    }
}
