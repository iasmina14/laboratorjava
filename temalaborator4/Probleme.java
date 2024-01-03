package temalaborator4;
import java.util.Arrays;

public class Probleme {
        public static void main(String[] args) {
            // Problema 1
            String inputStr = "masina";
            String middleChars = getMiddleChars(inputStr);
            System.out.println("Input: " + inputStr);
            System.out.println("Expected Output: " + middleChars);

            // Problema 2
            int inputNumber = 254;
            int digitSum = getDigitSum(inputNumber);
            System.out.println("\nInput: " + inputNumber);
            System.out.println("Expected Output: Sum is " + digitSum);

            // Problema 3
            Dog dog1 = new Dog("Buddy", "Labrador");
            Dog dog2 = new Dog("Daisy", "Golden Retriever");

            System.out.println("\nBefore Modification:");
            displayDogDetails(dog1);
            displayDogDetails(dog2);

            // Modificare folosind setter-ele
            dog1.setName("Charlie");
            dog2.setBreed("Dachshund");

            System.out.println("\nAfter Modification:");
            displayDogDetails(dog1);
            displayDogDetails(dog2);

            // Problema 4
            Rectangle rectangle = new Rectangle(5, 8);
            System.out.println("\nRectangle Details:");
            System.out.println("Width: " + rectangle.getWidth());
            System.out.println("Length: " + rectangle.getLength());
            System.out.println("Area: " + rectangle.calculateArea());
            System.out.println("Perimeter: " + rectangle.calculatePerimeter());

            // Problema 5
            Student student = new Student("John Doe", "john.doe@example.com", new int[]{90, 85, 92});
            System.out.println("\nStudent Details:");
            System.out.println("Name: " + student.getName());
            System.out.println("Email: " + student.getEmail());
            System.out.println("Grades: " + Arrays.toString(student.getGrades()));

            // Problema 6
            Profesor profesor = new Profesor("Dr. Smith", "smith@example.com", new String[]{"Math", "Physics"});
            System.out.println("\nProfesor Details:");
            System.out.println("Name: " + profesor.getName());
            System.out.println("Email: " + profesor.getEmail());
            System.out.println("Courses: " + Arrays.toString(profesor.getCourses()));
        }

        // Problema 1 - Metoda pentru a obține caracterele din mijloc
        static String getMiddleChars(String str) {
            int length = str.length();
            int middleIndex = length / 2;

            if (length % 2 == 0) {
                return str.substring(middleIndex - 1, middleIndex + 1);
            } else {
                return String.valueOf(str.charAt(middleIndex));
            }
        }

        // Problema 2 - Metoda pentru a obține suma cifrelor unui număr întreg
        static int getDigitSum(int number) {
            int sum = 0;

            while (number != 0) {
                int digit = number % 10;
                sum += digit;
                number /= 10;
            }

            return sum;
        }

        // Problema 3 - Clasa Dog
        static class Dog {
            private String name;
            private String breed;

            // Constructor
            public Dog(String name, String breed) {
                this.name = name;
                this.breed = breed;
            }

            // Getter și Setter pentru name
            public String getName() {
                return name;
            }

            public void setName(String name) {
                this.name = name;
            }

            // Getter și Setter pentru breed
            public String getBreed() {
                return breed;
            }

            public void setBreed(String breed) {
                this.breed = breed;
            }
        }

        // Problema 3 - Metodă pentru a afișa detaliile câinelui
        static void displayDogDetails(Dog dog) {
            System.out.println("Name: " + dog.getName());
            System.out.println("Breed: " + dog.getBreed());
            System.out.println();
        }

        // Problema 4 - Clasa Rectangle
        static class Rectangle {
            private double width;
            private double length;

            // Constructor
            public Rectangle(double width, double length) {
                this.width = width;
                this.length = length;
            }

            // Getter și Setter pentru width
            public double getWidth() {
                return width;
            }

            public void setWidth(double width) {
                this.width = width;
            }

            // Getter și Setter pentru length
            public double getLength() {
                return length;
            }

            public void setLength(double length) {
                this.length = length;
            }

            // Metode pentru calculul ariei și perimetrului
            public double calculateArea() {
                return width * length;
            }

            public double calculatePerimeter() {
                return 2 * (width + length);
            }
        }

        // Problema 5 - Clasa Person
        static class Person {
            private String name;
            private String email;

            // Constructor
            public Person(String name, String email) {
                this.name = name;
                this.email = email;
            }

            // Getter și Setter pentru name
            public String getName() {
                return name;
            }

            public void setName(String name) {
                this.name = name;
            }

            // Getter și Setter pentru email
            public String getEmail() {
                return email;
            }

            public void setEmail(String email) {
                this.email = email;
            }
        }

        // Problema 6 - Clasa Student care moștenește clasa Person
        static class Student extends Person {
            private int[] grades;

            // Constructor
            public Student(String name, String email, int[] grades) {
                super(name, email);
                this.grades = grades;
            }

            // Getter și Setter pentru grades
            public int[] getGrades() {
                return grades;
            }

            public void setGrades(int[] grades) {
                this.grades = grades;
            }
        }

        // Problema 7 - Clasa Profesor care moștenește clasa Person
        static class Profesor extends Person {
            private String[] courses;

            // Constructor
            public Profesor(String name, String email, String[] courses) {
                super(name, email);
                this.courses = courses;
            }

            // Getter și Setter pentru courses
            public String[] getCourses() {
                return courses;
            }

            public void setCourses(String[] courses) {
                this.courses = courses;
            }
        }
    }






