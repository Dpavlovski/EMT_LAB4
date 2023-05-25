package mk.ukim.finki.emt.labs.reservationmanagement.service.forms;


import lombok.Getter;
import lombok.Setter;
import mk.ukim.finki.emt.labs.reservationmanagement.domain.valueobjects.Destination;
import mk.ukim.finki.emt.labs.sharedkernel.payment.Currency;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;


@Getter
@Setter
public class ReservationForm {
    @NotNull
    private Currency currency;
    @NotNull
    @Valid
    private Destination destination;

}
