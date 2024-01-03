package temalaborator3;

import java.util.ArrayList;
import java.util.Scanner;
public class HomeWork {
    String[] firstArray = new String[]{"java","test", "university"};
    String[] secondArray = new String[]{"car","university", "plane"};

    static String[] findCommonElements(String[] arrayOne, String[] arrayTwo) {
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

    static void showFibonnaciString() {
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

    static String showMiddleString(String string){
        if (string.length() % 2 == 0) {
            char middleChar1 = string.charAt(string.length() / 2 - 1);
            char middleChar2 = string.charAt(string.length() / 2);
            return String.valueOf(middleChar1) + String.valueOf(middleChar2);
        } else {
            char middleChar = string.charAt(string.length() / 2);
            return String.valueOf(middleChar);
        }
    }

    static int sum(int number){
        int sum = 0;
        while(number!=0){
            int lastNumber = number%10;
            number=number/10;
            sum+=lastNumber;
        }

        return sum;
    }

    public static void main(String[] args) {
        int[] numbers = {2, 3, 5, 7, 11, 12, 13, 17, 19, 20, 21, 22};
        int num1 = 121;

        HomeWork problems = new HomeWork();

        String[] result = problems.findCommonElements(problems.firstArray, problems.secondArray);
        for (String element : result) {
            System.out.println(element);
        }

        problems.showFibonnaciString();

        problems.findPrimeNumbers(numbers);

        System.out.println(num1 + (problems.isPalindrome(num1) ? " este" : " nu este") + " palindrom \n");

        System.out.println(problems.showMiddleString("masina"));

        System.out.println("Suma: " + problems.sum(254));

    }
}