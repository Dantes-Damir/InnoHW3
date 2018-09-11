package HW3Part1;

import java.util.ArrayList;
import java.util.List;
import java.util.NavigableSet;
import java.util.TreeSet;

public class ObjectBox<T extends Number> {
    private NavigableSet<T> storage = new TreeSet<>();

    protected ObjectBox(Object[] data) {
        for (Object d : data) {
            try {
                this.storage.add((T) d);
            } catch (ClassCastException e) {
                throw new NumberClassException();
            }
        }
    }

    protected double summator() {
        double result = 0;
        for (Object current : this.storage) {
            result += getDoubleValue(current);
        }
        return result;
    }

    protected List<Double> splitter(int divider) {
        ArrayList<Double> result = new ArrayList<>();
        for (Object current : this.storage) {
            result.add(getDoubleValue(current) / divider);
        }
        return result;
    }


    private double getDoubleValue(Object current) {
        return (double) ((Integer) current);
    }


    protected boolean addObject(T obj) {
        boolean result = false;
        if (obj != null) {
            result = this.storage.add(obj);
        }
        return result;
    }


    protected boolean deleteObject(T obj) {
        return this.storage.remove(obj);
    }


    protected String dump() {
        StringBuilder builder = new StringBuilder();
        for (T element : this.storage) {
            builder.append(element + ", ");
        }
        return builder.toString();
    }
}
