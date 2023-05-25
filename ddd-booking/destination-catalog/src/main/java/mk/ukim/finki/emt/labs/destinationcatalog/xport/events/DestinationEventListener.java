package mk.ukim.finki.emt.labs.destinationcatalog.xport.events;

import lombok.AllArgsConstructor;
import mk.ukim.finki.emt.labs.destinationcatalog.service.DestinationService;
import mk.ukim.finki.emt.labs.destinationcatalog.service.forms.DestinationForm;
import mk.ukim.finki.emt.labs.sharedkernel.domain.config.TopicHolder;
import mk.ukim.finki.emt.labs.sharedkernel.domain.events.DomainEvent;
import mk.ukim.finki.emt.labs.sharedkernel.domain.events.reservations.ReservationAdded;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class DestinationEventListener {
    private final DestinationService destinationService;

    @KafkaListener(topics = TopicHolder.TOPIC_reservation_added,groupId = "destinationCatalog")
    public void consumeNoReservationAvailableEvent(String jsonMessage,DestinationForm form){
        try {
             ReservationAdded event = DomainEvent.fromJson(jsonMessage,ReservationAdded.class);
             destinationService.createDestination(form);
        } catch (Exception e){
            System.out.println("No reservations available for this destination");
        }
    }
}
