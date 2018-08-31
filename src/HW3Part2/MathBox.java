package HW3Part2;

import HW3Part1.NumberClassException;

import java.util.Objects;
import java.util.Set;
import java.util.TreeSet;

public class MathBox extends ObjectBox {
    private Set<Integer> sortedSet = new TreeSet();

    public MathBox(Integer[] mas) {
        for (int i = 0; i < mas.length; i++) {
            sortedSet.add(mas[i]);
        }
    }

    @Override
    public Double summator() throws NumberClassException {
        Double sum = 0.0;
        for (Integer temp : sortedSet) {
            sum += temp;
        }

        return sum;
    }

    @Override
    public Set splitter(Integer divider) throws NumberClassException {
        TreeSet set = new TreeSet();
        if (divider == 0) throw new ArithmeticException();
        for (Integer temp : sortedSet) {
            if (divider == 0) throw new ArithmeticException();
            set.add((double) temp / divider);
        }

        return set;
    }

    public void printSet() {
        for (Integer temp : sortedSet) {
            System.out.println(temp);
        }
    }

    public boolean delete(Integer element) {
        return sortedSet.remove(element);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        MathBox mathBox = (MathBox) o;
        return Objects.equals(sortedSet, mathBox.sortedSet);
    }

    @Override
    public int hashCode() {
        return Objects.hash(sortedSet);
    }
}
