package oop.q2;

import java.util.ArrayList;
import java.util.List;

/**
 * This program demonstrates a transformation process involving two predefined lists: {@code list1} and {@code list2}.
 * <p>
 * The integer values in {@code list1} are used as keys to extract specific elements from {@code list2} by calculating
 * a position using the formula {@code position = 1 + (num - 1) * 2}. The extracted elements are stored in {@code list3}.
 * <p>
 * The result of the transformation is printed, showing the original lists and the new list of mapped values.
 * The program is flexible enough to work with other values in {@code list1} and {@code list2} as well.
 *
 * @author nika lobzhanidze
 * @version 1.0
 */
public class t1 {

    /**
     * The entry point of the program that performs list mapping based on an index formula.
     *
     * @param args Command-line arguments (not used in this program)
     */
    public static void main(String[] args) {
        List<Integer> list1 = new ArrayList<>();
        list1.add(9);
        list1.add(9);
        list1.add(3);
        list1.add(8);
        list1.add(8);
        list1.add(8);
        list1.add(2);
        list1.add(5);
        list1.add(3);
        list1.add(2);
        list1.add(4);
        list1.add(9);
        list1.add(3);

        List<String> list2 = new ArrayList<>();
        list2.add("No");
        list2.add("BWR");
        list2.add("PPc");
        list2.add("vi7j");
        list2.add("eqE");
        list2.add("R10F");
        list2.add("sQfr");
        list2.add("wlIZ");
        list2.add("odt");
        list2.add("QJES");
        list2.add("87K");
        list2.add("RCA");
        list2.add("ManTX");
        list2.add("zSsF");
        list2.add("XdcvI");
        list2.add("YE1N6");
        list2.add("9ZYu0");
        list2.add("B6i");

        List<String> list3 = new ArrayList<>();

        for (Integer num : list1) {
            int position = 1 + (num - 1) * 2;
            list3.add(list2.get(position));
        }

        // Output the lists
        System.out.println("list1 = " + list1);
        System.out.println("list2 = " + list2);
        System.out.println("list3 = " + list3);
    }
}
