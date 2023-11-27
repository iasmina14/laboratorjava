package laborator8;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class SortList {
        public static void main(String[] args) {

            List<Integer> numbers = Arrays.asList(5, 2, 8, 1, 6);
            List<Integer> sortedAsc = numbers.stream()
                    .sorted()
                    .collect(Collectors.toList());

            System.out.println("Sorted in ascending order: " + sortedAsc);

            List<Integer> sortedDesc = numbers.stream()
                    .sorted((a, b) -> b.compareTo(a))
                    .collect(Collectors.toList());

            System.out.println("Sorted in descending order: " + sortedDesc);
        }
    }

