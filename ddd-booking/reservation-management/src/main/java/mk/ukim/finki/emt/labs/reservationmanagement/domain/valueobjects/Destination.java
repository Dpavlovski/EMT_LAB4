package mk.ukim.finki.emt.labs.reservationmanagement.domain.valueobjects;



import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import mk.ukim.finki.emt.labs.sharedkernel.payment.Money;

import java.util.List;

@Getter
public class Destination {
    private DestinationId destinationId;
    private String name;

    private List<Itinerary> itineraries;
    private Money money;

    public Destination() {
        this.destinationId=DestinationId.randomId(DestinationId.class);
        this.name= "";
        this.itineraries=null;
        this.money=null;
    }


    @JsonCreator
    public Destination(@JsonProperty("id") DestinationId id,
                   @JsonProperty("productName") String name,
                   @JsonProperty("price") List<Itinerary> itineraries,
                       @JsonProperty("money") Money money) {
        this.destinationId = id;
        this.name = name;
        this.itineraries=itineraries;
        this.money=money;
    }



}
