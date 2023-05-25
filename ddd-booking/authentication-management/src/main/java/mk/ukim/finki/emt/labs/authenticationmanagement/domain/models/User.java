package mk.ukim.finki.emt.labs.authenticationmanagement.domain.models;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.Getter;
import mk.ukim.finki.emt.labs.sharedkernel.domain.base.AbstractEntity;


@Entity
@Getter
@Table(name = "Reservationist")
public class User extends AbstractEntity<UserId> {
    private String name;
    private String email;
    private String password;

    public User(String name, String email, String password) {
        this.name = name;
        this.email = email;
        this.password = password;
    }

    public User() {

    }
}
