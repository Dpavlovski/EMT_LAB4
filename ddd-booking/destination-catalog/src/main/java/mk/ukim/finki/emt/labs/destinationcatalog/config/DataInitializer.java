package mk.ukim.finki.emt.labs.destinationcatalog.config;

import jakarta.annotation.PostConstruct;
import lombok.AllArgsConstructor;
import mk.ukim.finki.emt.labs.destinationcatalog.domain.models.Destination;
import mk.ukim.finki.emt.labs.destinationcatalog.repository.DestinationRepository;
import mk.ukim.finki.emt.labs.destinationcatalog.valueobjects.Location;
import org.springframework.stereotype.Component;
import java.util.Arrays;

@Component
@AllArgsConstructor
public class DataInitializer {

    private final DestinationRepository destinationRepository;

    @PostConstruct
    public void initData() {
        Destination d1=Destination.build("d1","desc",new Location("Paris","France"),"p.jpg", null,1);
        Destination d2=Destination.build("d1","desc",new Location("Rome","Italy"),"r.jpg", null,3);
        if(destinationRepository.findAll().isEmpty()){
            destinationRepository.saveAll(Arrays.asList(d1,d2));
        }
    }

}
