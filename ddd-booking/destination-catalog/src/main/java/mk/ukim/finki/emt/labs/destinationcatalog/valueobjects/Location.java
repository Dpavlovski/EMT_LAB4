package mk.ukim.finki.emt.labs.destinationcatalog.valueobjects;


import jakarta.persistence.Embeddable;
import lombok.Getter;
import mk.ukim.finki.emt.labs.sharedkernel.domain.base.ValueObject;

@Embeddable
@Getter
public class Location implements ValueObject {
    private final String city;
    private final String country;

    protected Location() {
        this.city = "";
        this.country = "";
    }

    public Location( String city, String country) {
        this.city=city;
        this.country=country;
    }
}
