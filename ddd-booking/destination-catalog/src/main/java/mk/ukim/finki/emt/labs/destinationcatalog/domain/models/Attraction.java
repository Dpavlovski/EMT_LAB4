package mk.ukim.finki.emt.labs.destinationcatalog.domain.models;

import jakarta.persistence.Entity;
import lombok.Getter;
import lombok.Setter;
import mk.ukim.finki.emt.labs.sharedkernel.payment.Money;
import mk.ukim.finki.emt.labs.destinationcatalog.valueobjects.Timestamp;
import mk.ukim.finki.emt.labs.sharedkernel.domain.base.AbstractEntity;

@Entity
@Getter
@Setter
public class Attraction extends AbstractEntity<AttractionId> {
    private String name;
    private String description;
    private Timestamp timestamp;
    private Money money;

    public Attraction(String name, String description, Timestamp timestamp, Money money) {
        this.name = name;
        this.description = description;
        this.timestamp = timestamp;
        this.money = money;
    }

    public Attraction() {

    }
}
