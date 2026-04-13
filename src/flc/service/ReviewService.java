package flc.service;

import flc.model.*;

public class ReviewService {

    public void addReview(Booking booking, String comment, int rating) {

        if (booking == null) return;

        if (!booking.getStatus().equals(BookingStatus.ATTENDED)) {
            System.out.println("You must attend lesson before reviewing!");
            return;
        }

        booking.setReview(new Review(comment, rating));
    }
}
