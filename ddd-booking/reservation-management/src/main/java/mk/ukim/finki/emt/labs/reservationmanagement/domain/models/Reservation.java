package mk.ukim.finki.emt.labs.reservationmanagement.domain.models;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NonNull;
import mk.ukim.finki.emt.labs.reservationmanagement.domain.valueobjects.Destination;
import mk.ukim.finki.emt.labs.reservationmanagement.domain.valueobjects.DestinationId;
import mk.ukim.finki.emt.labs.reservationmanagement.domain.valueobjects.UserId;
import mk.ukim.finki.emt.labs.sharedkernel.payment.Currency;
import mk.ukim.finki.emt.labs.sharedkernel.payment.Money;
import mk.ukim.finki.emt.labs.sharedkernel.domain.base.AbstractEntity;
import java.time.Instant;

@Entity
@Getter
public class Reservation extends AbstractEntity<ReservationId> {

    @AttributeOverride(name = "id",column = @Column(name = "user_id"))
    private UserId userId;
    @AttributeOverride(name = "id",column = @Column(name = "destination_id"))
    private DestinationId destinationId;
    private Instant reservedOn;
    @Enumerated(value = EnumType.STRING)
    private Currency currency;

    public Reservation(UserId userId, DestinationId destinationId,Instant reservationDate) {
        this.userId = userId;
        this.destinationId = destinationId;
        this.reservedOn = reservationDate;
    }
    public Reservation(Instant now, @NonNull Currency currency){
        super(ReservationId.randomId(ReservationId.class));
        this.reservedOn=now;
        this.currency=currency;
    }

    public Reservation() {

    }

    public Money calculateTotalCost() {
        Destination d=new Destination();
        if(d.getDestinationId()==destinationId)
            return d.getMoney();
        return null;
    }



}
