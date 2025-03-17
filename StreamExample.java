import java.util.*;
import java.util.stream.*;

public class StreamExample {
    public static void run() {
        List<Integer> numbers = IntStream.rangeClosed(1, 10)
                                         .boxed()
                                         .collect(Collectors.toList());

        System.out.println("Original List: " + numbers);

        // Filter even numbers
        List<Integer> evenNumbers = numbers.stream()
                                           .filter(n -> n % 2 == 0)
                                           .collect(Collectors.toList());
        System.out.println("Even Numbers: " + evenNumbers);

        // Map numbers to their squares
        List<Integer> squaredNumbers = numbers.stream()
                                              .map(n -> n * n)
                                              .collect(Collectors.toList());
        System.out.println("Squared Numbers: " + squaredNumbers);

        // Filter odd numbers and cube them
        List<Integer> oddCubes = numbers.stream()
                                        .filter(n -> n % 2 != 0)
                                        .map(n -> n * n * n)
                                        .collect(Collectors.toList());
        System.out.println("Cubes of Odd Numbers: " + oddCubes);

        // Reduce method to sum all numbers
        int sum = numbers.stream()
                         .reduce(0, Integer::sum);
        System.out.println("Sum of all numbers: " + sum);

        // Collect even numbers into a new list
        List<Integer> collectedEvens = numbers.stream()
                                              .filter(n -> n % 2 == 0)
                                              .collect(Collectors.toList());
        System.out.println("Collected Even Numbers: " + collectedEvens);
    }
}
