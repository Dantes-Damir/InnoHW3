package HW3Part1;

import java.util.Objects;
import java.util.Set;
import java.util.TreeSet;

public class MathBox extends ObjectBox {
    private Set<Integer> storage = new TreeSet<>();

    public MathBox(Integer[] data) {
        super(data);
    }

    public boolean delete(Integer digit) {
        return super.deleteObject(digit);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        MathBox mathBox = (MathBox) o;
        if (this.storage.hashCode() != mathBox.hashCode()) return false;
        return Objects.equals(this.storage, mathBox.storage);
    }

    @Override
    public int hashCode() {
        return this.storage.hashCode();
    }

    @Override
    public String toString() {
        return "MathBox{" +
                this.storage +
                '}';
    }
}