package mk.ukim.finki.emt.labs.reservationmanagement.xport.client;

import mk.ukim.finki.emt.labs.reservationmanagement.domain.valueobjects.Destination;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpMethod;
import org.springframework.http.client.SimpleClientHttpRequestFactory;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.util.UriComponentsBuilder;
import java.util.Collections;
import java.util.List;

@Service
public class DestinationClient {
    private final RestTemplate restTemplate;
    private final String serverUrl;

    public DestinationClient (@Value("${app.destination-catalog.url}")String serverUrl) {
        this.serverUrl=serverUrl;
        this.restTemplate=new RestTemplate();
        var requestFactory= new SimpleClientHttpRequestFactory();
        this.restTemplate.setRequestFactory(requestFactory);
    }

    private UriComponentsBuilder uri () {
        return UriComponentsBuilder.fromUriString(this.serverUrl);
    }

    public List<Destination> findAll (){
        try {
            return restTemplate.exchange(uri().path("/api/destination").build().toUri(), HttpMethod.GET,null,new ParameterizedTypeReference<List<Destination>>(){}).getBody();
        } catch (Exception e) {
            return Collections.emptyList();
        }
    }
}
