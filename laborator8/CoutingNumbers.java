package laborator8;

import java.util.Arrays;
import java.util.List;

public class CoutingNumbers {
    public static void main(String[] args){

        CoutingStringsStartingWithLetter();
    }
    static void CoutingStringsStartingWithLetter() {

            List<String> words = Arrays.asList("apple", "banana", "orange", "avocado", "pear", "grape");

            char targetLetter ='a';

            long count = words.stream()
                    .filter(word -> word.startsWith(String.valueOf(targetLetter)))
                    .count();

            System.out.println("Number of strings starting with ' " + targetLetter + "'" + count);
        }
    }

