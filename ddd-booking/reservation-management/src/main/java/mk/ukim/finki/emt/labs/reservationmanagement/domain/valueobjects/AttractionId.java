package mk.ukim.finki.emt.labs.reservationmanagement.domain.valueobjects;

import jakarta.persistence.Embeddable;
import mk.ukim.finki.emt.labs.sharedkernel.domain.base.DomainObjectId;

@Embeddable
public class AttractionId extends DomainObjectId {
    public AttractionId() {
        super(AttractionId.randomId(AttractionId.class).getId());
    }

    public AttractionId(String uuid) {
        super(uuid);
    }

}
