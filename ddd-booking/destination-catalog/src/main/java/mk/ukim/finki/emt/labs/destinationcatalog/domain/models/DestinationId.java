package mk.ukim.finki.emt.labs.destinationcatalog.domain.models;

import lombok.NonNull;
import mk.ukim.finki.emt.labs.sharedkernel.domain.base.DomainObjectId;

public class DestinationId extends DomainObjectId {
    private DestinationId(){
        super(DestinationId.randomId(DestinationId.class).getId());
    }

    public DestinationId(@NonNull String uuid){
        super(uuid);
    }

    public static DestinationId of(String  uuid) {
        return new DestinationId(uuid);
    }
}
