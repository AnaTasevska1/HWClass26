package HWClass26;

import java.util.ArrayList;
import java.util.List;

public class Task4 {
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>();
        numbers.add(100);
        numbers.add(13);
        numbers.add(80);
        numbers.add(500);
        numbers.add(13);
        numbers.add(100);

        Integer sum = 0;

        for (Integer num : numbers) {
            sum = sum + num;
        }
        System.out.println(sum);
    }
}

/*

Create a collection of integers in which you can keep duplicates.
Write a logic to find sum of all integers
 */
