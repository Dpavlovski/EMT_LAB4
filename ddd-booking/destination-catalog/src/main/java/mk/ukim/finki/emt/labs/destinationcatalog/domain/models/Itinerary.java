package mk.ukim.finki.emt.labs.destinationcatalog.domain.models;

import jakarta.persistence.Entity;
import jakarta.persistence.OneToMany;
import lombok.Getter;
import lombok.Setter;
import mk.ukim.finki.emt.labs.sharedkernel.domain.base.AbstractEntity;

import java.util.List;

@Entity
@Getter
@Setter
public class Itinerary extends AbstractEntity<ItineraryId> {
    private String name;
    private String description;
    @OneToMany
    private List<Attraction> attractions;

    public Itinerary(String name, String description, List<Attraction> attractions) {
        this.name = name;
        this.description = description;
        this.attractions = attractions;
    }

    public Itinerary() {

    }
}
