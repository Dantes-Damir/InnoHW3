package HW3Part2;

import HW3Part1.NumberClassException;

import java.util.*;

public class ObjectBox {
    List<Object> arrayList = new ArrayList<>();

    public ObjectBox() {

    }

    public Double summator() throws NumberClassException {
        Double sum = 0.0;
        for (Object temp : arrayList) {
            if (temp instanceof Number) {
                sum = sum + ((Number) temp).doubleValue();
            } else {
                throw new NumberClassException();
            }
        }
        return sum;
    }

    public Set splitter(Integer divider) throws NumberClassException {
        Set set = new TreeSet();

        if (divider == 0) throw new ArithmeticException();
        for (Object temp : arrayList) {
            if (temp instanceof Number) {
                set.add((double) (((Number) temp).intValue()) / divider);
            } else {
                throw new NumberClassException();
            }
        }
        return set;
    }

    public void delete(Object element) {
        arrayList.remove(element);
    }

    public void addObject(Object element) {
        arrayList.add(element);
    }

    public boolean deleteObject(Object element) {
        return arrayList.remove(element);
    }

    public void dump() {
        for (Object temp : arrayList)
            System.out.print(temp + " ");
    }

    @Override
    public String toString() {
        return "ObjectBox{" +
                "arrayList=" + arrayList +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ObjectBox objectBox = (ObjectBox) o;
        return Objects.equals(arrayList, objectBox.arrayList);
    }

    @Override
    public int hashCode() {
        return Objects.hash(arrayList);
    }
}
