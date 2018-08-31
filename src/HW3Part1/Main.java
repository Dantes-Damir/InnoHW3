package HW3Part1;

public class Main {

    public static void main(String[] args) {

        ObjectBox box = new ObjectBox();

        box.addObject(22);
        box.addObject(new ObjectBox());
        box.addObject(12);
        box.addObject("34");

        try {
            //System.out.println(box.summator());
            System.out.println(box.splitter(2));
        } catch (NumberClassException e) {
            System.out.println("Элементы массива не являются Number");
        }

        box.dump();

    }
}
