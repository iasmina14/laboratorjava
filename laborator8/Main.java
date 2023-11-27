package laborator8;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[]args) {
        List<Integer>
                numbersWithDuplicates = Arrays.asList(1, 2, 3, 2, 4, 5, 6, 4, 7, 8, 9, 10, 1);

        List<Integer> distinctNumbers = numbersWithDuplicates.stream()
                .distinct()
                .collect(Collectors.toList());
        System.out.println("Original list" + numbersWithDuplicates);
        System.out.println("List after removing duplicates: " + distinctNumbers);
    }
}
