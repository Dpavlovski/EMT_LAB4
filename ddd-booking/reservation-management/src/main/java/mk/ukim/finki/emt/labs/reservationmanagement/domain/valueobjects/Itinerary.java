package mk.ukim.finki.emt.labs.reservationmanagement.domain.valueobjects;

import com.fasterxml.jackson.annotation.JsonCreator;
import lombok.Getter;
import mk.ukim.finki.emt.labs.sharedkernel.domain.base.ValueObject;

import java.util.List;

@Getter
public class Itinerary implements ValueObject {
    private final ItineraryId itineraryId;
    private final String name;
    private final String description;
    private final List<Attraction> attractions;

    private Itinerary () {
        itineraryId=ItineraryId.randomId(ItineraryId.class);
        name="";
        description="";
        attractions=null;
    }

    @JsonCreator
    public Itinerary(ItineraryId itineraryId, String name, String description, List<Attraction> attractions) {
        this.itineraryId = itineraryId;
        this.name = name;
        this.description = description;
        this.attractions = attractions;
    }
}
