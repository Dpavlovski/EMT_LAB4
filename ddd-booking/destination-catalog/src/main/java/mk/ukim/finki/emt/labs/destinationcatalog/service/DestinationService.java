package mk.ukim.finki.emt.labs.destinationcatalog.service;

import mk.ukim.finki.emt.labs.destinationcatalog.domain.models.Attraction;
import mk.ukim.finki.emt.labs.destinationcatalog.domain.models.Destination;
import mk.ukim.finki.emt.labs.destinationcatalog.domain.models.DestinationId;
import mk.ukim.finki.emt.labs.destinationcatalog.domain.models.ItineraryId;
import mk.ukim.finki.emt.labs.destinationcatalog.service.forms.DestinationForm;
import java.util.List;
import java.util.Optional;

public interface DestinationService {
    List<Destination> getAll();
    Optional<Destination> findById(DestinationId id);
    Destination createDestination(DestinationForm form);
    Destination itineraryCreated(DestinationId Id,String name,String description,List<Attraction> attractions);
    Destination itineraryRemoved(DestinationId destinationId, ItineraryId itineraryId);

}
