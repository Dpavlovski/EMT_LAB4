package mk.ukim.finki.emt.reviewcatalog.valueobjects;

import jakarta.persistence.Embeddable;
import lombok.Getter;
import mk.ukim.finki.emt.labs.sharedkernel.domain.base.ValueObject;

@Embeddable
@Getter
public class Rating implements ValueObject,Comparable<Rating> {
    private final float score;

    protected Rating (){
        score=0;
    }


    @Override
    public int compareTo(Rating o) {
        return Float.compare(this.score,o.score);
    }
}
