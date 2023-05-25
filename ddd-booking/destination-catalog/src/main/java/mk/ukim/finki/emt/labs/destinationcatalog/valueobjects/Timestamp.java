package mk.ukim.finki.emt.labs.destinationcatalog.valueobjects;

import jakarta.persistence.Embeddable;
import lombok.Getter;
import mk.ukim.finki.emt.labs.sharedkernel.domain.base.ValueObject;

import java.time.LocalDateTime;

@Embeddable
@Getter
public class Timestamp implements ValueObject {
    private final LocalDateTime startDate;
    private final LocalDateTime endDate;
    private final int durationInMinutes;

    protected Timestamp(){
        startDate=null;
        endDate=null;
        durationInMinutes=0;
    }

    public boolean isInRange(LocalDateTime date) {
        return date.isAfter(startDate) && date.isBefore(endDate);
    }
}
