package mk.ukim.finki.emt.reviewcatalog.models;

import jakarta.persistence.AttributeOverride;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import lombok.Getter;
import mk.ukim.finki.emt.labs.sharedkernel.domain.base.AbstractEntity;
import mk.ukim.finki.emt.reviewcatalog.valueobjects.Comment;
import mk.ukim.finki.emt.reviewcatalog.valueobjects.DestinationId;
import mk.ukim.finki.emt.reviewcatalog.valueobjects.Rating;
import mk.ukim.finki.emt.reviewcatalog.valueobjects.UserId;


@Entity
@Getter
public class Review extends AbstractEntity<ReviewId> {
    private Rating rating;
    private Comment comment;
    @AttributeOverride(name = "id",column = @Column(name = "user_id"))
    private UserId userId;
    @AttributeOverride(name = "id",column = @Column(name = "destination_id"))
    private DestinationId destinationId;

    public Review(Rating rating, Comment comment, UserId userId, DestinationId destinationId) {
        this.rating = rating;
        this.comment = comment;
        this.userId = userId;
        this.destinationId = destinationId;
    }

    public Review() {

    }
}
