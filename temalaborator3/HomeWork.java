package temalaborator3;

import java.util.ArrayList;
import java.util.Scanner;
public class HomeWork {
    public String[] firstArray = new String[]{"java", "test", "university"};
    public String[] secondArray = new String[]{"car", "university", "plane"};

    public static String[] findCommonElements(String[] arrayOne, String[] arrayTwo) {
        ArrayList<String> commonElements = new ArrayList<String>();

        for (int i = 0; i < arrayOne.length; i++) {
            for (int j = 0; j < arrayTwo.length; j++) {
                if (arrayOne[i].equals(arrayTwo[j])) {
                    commonElements.add(arrayOne[i]);
                }
            }
        }

        return commonElements.toArray(new String[0]);
    }

    public static void showFibonnaciString() {
        Scanner myObj = new Scanner(System.in);
        System.out.println("N=");

        int n = myObj.nextInt();

        ArrayList<Integer> fibannaciString = new ArrayList<Integer>();
        fibannaciString.add(0);
        fibannaciString.add(1);

        int i = 2;
        while (true) {
            int lastFibonnaciNumber = fibannaciString.get(i - 1) + fibannaciString.get(i - 2);
            if (lastFibonnaciNumber >= n) {
                break;
            }
            fibannaciString.add(lastFibonnaciNumber);
            i++;
        }

        for (int num : fibannaciString) {
            System.out.println(num);
        }
    }

    static boolean isPrime(int number) {
        if (number <= 1) {
            return false;
        }
        if (number <= 3) {
            return true;
        }
        if (number % 2 == 0 || number % 3 == 0) {
            return false;
        }

        for (int i = 5; i * i <= number; i += 6) {
            if (number % i == 0 || number % (i + 2) == 0) {
                return false;
            }
        }

        return true;
    }

    static void findPrimeNumbers(int[] numbers) {
        System.out.println("Numere prime din sir:");
        for (int num : numbers) {
            if (isPrime(num)) {
                System.out.println(num);
            }
        }
    }

    static boolean isPalindrome(int number) {
        String numStr = Integer.toString(number);
        String reversedNumStr = new StringBuilder(numStr).reverse().toString();

        return numStr.equals(reversedNumStr);
    }
}
