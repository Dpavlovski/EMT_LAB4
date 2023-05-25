package mk.ukim.finki.emt.labs.destinationcatalog.xport.rest;

import lombok.AllArgsConstructor;
import mk.ukim.finki.emt.labs.destinationcatalog.domain.models.Destination;
import mk.ukim.finki.emt.labs.destinationcatalog.service.DestinationService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("api/destination")
@AllArgsConstructor
public class DestinationResource {
    private final DestinationService destinationService;

    @GetMapping
    public List<Destination> getAll(){
        return destinationService.getAll();
    }

}
