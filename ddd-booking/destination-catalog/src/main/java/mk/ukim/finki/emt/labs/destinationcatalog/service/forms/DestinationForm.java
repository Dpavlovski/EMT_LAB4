package mk.ukim.finki.emt.labs.destinationcatalog.service.forms;

import lombok.Getter;
import lombok.Setter;
import mk.ukim.finki.emt.labs.destinationcatalog.domain.models.Itinerary;
import mk.ukim.finki.emt.labs.destinationcatalog.valueobjects.Location;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.NotEmpty;
import java.util.List;

@Getter
@Setter
public class DestinationForm {

    @NotNull
    private String name;
    @NotNull
    private String description;
    @NotNull
    private String image;
    @NotNull
    private Location location;
    @Valid
    @NotEmpty
    private List<Itinerary> itineraries;
}
