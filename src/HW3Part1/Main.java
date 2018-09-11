package HW3Part1;

public class Main {

    public static void main(String[] args) {

        Integer[] data = {46, 4, 34, 56, 43, 2};
        MathBox mathBox = new MathBox(data);

        // second task
        System.out.println(mathBox.summator());

        // third task
        System.out.println(mathBox.splitter(123));

        // Fifth task

        System.out.println(mathBox.delete(34));

        System.out.println(mathBox.dump());

    }
}
