package mk.ukim.finki.emt.labs.reservationmanagement.domain.valueobjects;

import com.fasterxml.jackson.annotation.JsonCreator;
import lombok.Getter;
import mk.ukim.finki.emt.labs.sharedkernel.domain.base.ValueObject;
import mk.ukim.finki.emt.labs.sharedkernel.payment.Money;

import java.sql.Timestamp;

@Getter
public class Attraction implements ValueObject {
    private final AttractionId attractionId;
    private final String name;
    private final String description;
    private final Timestamp timestamp;
    private final Money money;

    private Attraction () {
        attractionId=AttractionId.randomId(AttractionId.class);
        name="";
        description="";
        timestamp=null;
        money=null;
    }
    @JsonCreator
    public Attraction(AttractionId attractionId, String name, String description, Timestamp timestamp, Money money) {
        this.attractionId = attractionId;
        this.name = name;
        this.description = description;
        this.timestamp = timestamp;
        this.money = money;
    }
}
