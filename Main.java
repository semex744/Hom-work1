public class Main {
    public static void main(String[] args) {
        // Declare variables of different data types
        int number1 = 10;
        int number2=5;
        double decimal1 = 3.14;
        double decimal2=2.5;
        boolean num1 = true;
        boolean num2=false;
        char letter1 = 'A';
        String message = "Hello, World!";
        // Use arithmetic operators
        int sum = number1 + number2;
        int difference = number1 - number2;
        int product = number1 * number2;
        System.out.println("Sum: " + sum);
        System.out.println("Difference: " + difference);
        System.out.println("Product: " + product);
        // Use relational operators to compare variables
        boolean isEqual = number1 == number2;
        boolean isNotEqual = decimal1 != decimal2;
        System.out.println("Is equal?: " + isEqual);
        System.out.println("Is not equal?: " + isNotEqual);
        // Use logical operators
        boolean logicalAnd = num1 && num2;
        boolean logicalOr = num1 || num2;
        boolean logicalNot = !num1;
        System.out.println(logicalAnd);
        System.out.println( logicalOr);
        System.out.println(logicalNot);
        // Use if-else statements
        if (number1 > 0) {
            System.out.println("Number is positive.");
        } else if (number1 < 0) {
            System.out.println("Number is negative.");
        } else {
            System.out.println("Number is zero.");
        }

        // Use switch statement
        char letter = 'A';
        switch (letter) {
            case 'A':
                System.out.println("Letter is A.");
                break;
            case 'B':
                System.out.println("Letter is B.");
                break;
            default:
                System.out.println("Letter is neither A nor B.");
                break;
        }
        // Use for loop
        for (int i = 0; i < 5; i++) {
            System.out.println(i);
        }

        // Use while loop
        int count = 0;
        while (count < 5) {
            System.out.println("count:" + count);
            count++;
        }
    }
}