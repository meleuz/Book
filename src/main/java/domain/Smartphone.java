package domain;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Objects;

@Getter
@Setter
@NoArgsConstructor

public class Smartphone extends Product{
    private String maker;

    public Smartphone(int i, String callPhone1, int i1, String maker1) {
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Smartphone that = (Smartphone) o;
        return Objects.equals(maker, that.maker);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), maker);
    }
}