package mk.ukim.finki.emt.labs.destinationcatalog.service.impl;

import jakarta.transaction.Transactional;
import lombok.AllArgsConstructor;
import mk.ukim.finki.emt.labs.destinationcatalog.domain.exceptions.DestinationIdNotFoundException;
import mk.ukim.finki.emt.labs.destinationcatalog.domain.models.*;
import mk.ukim.finki.emt.labs.destinationcatalog.repository.DestinationRepository;
import mk.ukim.finki.emt.labs.destinationcatalog.service.DestinationService;
import mk.ukim.finki.emt.labs.destinationcatalog.service.forms.DestinationForm;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@Transactional
@AllArgsConstructor
public class DestinationServiceImpl implements DestinationService {
    private final DestinationRepository destinationRepository;

    @Override
    public List<Destination> getAll() {
        return destinationRepository.findAll();
    }

    @Override
    public Optional<Destination> findById(DestinationId id) {
        return destinationRepository.findById(id);
    }

    @Override
    public Destination createDestination(DestinationForm form) {
        Destination d =Destination.build(form.getName(),form.getDescription(),form.getLocation(),form.getImage(),form.getItineraries(),1);
        destinationRepository.save(d);
        return d;
    }

    @Override
    public Destination itineraryCreated(DestinationId Id, String name, String description, List<Attraction> attractions) {
        Destination d=destinationRepository.findById(Id).orElseThrow(DestinationIdNotFoundException::new);
        d.getItineraries().add(new Itinerary(name,description,attractions));
        destinationRepository.saveAndFlush(d);
        return d;
    }

    @Override
    public Destination itineraryRemoved(DestinationId destinationId, ItineraryId itineraryId) {
        Destination d=destinationRepository.findById(destinationId).orElseThrow(DestinationIdNotFoundException::new);
        d.getItineraries().removeIf(i->i.getId()==itineraryId);
        return d;
    }
}
