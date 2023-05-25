package mk.ukim.finki.emt.reviewcatalog.valueobjects;

import jakarta.persistence.Embeddable;
import lombok.Getter;
import mk.ukim.finki.emt.labs.sharedkernel.domain.base.ValueObject;


@Embeddable
@Getter
public class Comment implements ValueObject {
    private final String content;

    protected Comment () {
        content="";
    }

    public int wordCount() {
        if (content.isEmpty()) {
            return 0;
        }

        String[] words = content.split("\\s+");
        return words.length;
    }
}
