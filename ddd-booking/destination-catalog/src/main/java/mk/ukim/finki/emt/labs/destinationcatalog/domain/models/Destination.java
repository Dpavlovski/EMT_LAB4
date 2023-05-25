package mk.ukim.finki.emt.labs.destinationcatalog.domain.models;

import jakarta.persistence.Entity;
import jakarta.persistence.OneToMany;
import lombok.Getter;
import mk.ukim.finki.emt.labs.destinationcatalog.valueobjects.Location;
import mk.ukim.finki.emt.labs.sharedkernel.domain.base.AbstractEntity;
import java.util.List;

@Entity
@Getter
public class Destination extends AbstractEntity<DestinationId> {
    private String name;
    private String description;
    private Location location;
    private String image;
    @OneToMany
    private List<Itinerary> itineraries;
    private int reservations = 0;

    public Destination() {

    }

    public static Destination build (String name,String description,Location location, String image, List<Itinerary> itineraries,int reservations) {
        Destination destination= new Destination();
        destination.name=name;
        destination.description=description;
        destination.location=location;
        destination.itineraries=itineraries;
        destination.image=image;
        destination.reservations=reservations;
        return destination;
    }

    public void addReservations() {
        reservations--;
    }

    public void removeReservations() {
        reservations++;
    }


}
