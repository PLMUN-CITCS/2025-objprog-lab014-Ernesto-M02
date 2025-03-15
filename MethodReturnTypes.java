public class MethodReturnTypes {
    public static void main(String[] args) {
        // Call the displayWelcomeMessage method
        displayWelcomeMessage();

        // Declare Variables
        int value1 = 20;
        int value2 = 30;

        // Call calculateAverage method
        double result = calculateAverage(value1, value2);

        // Print the Result
        System.out.println("The average is: " + result);
    }

    // Create the displayWelcomeMessage Method
    public static void displayWelcomeMessage() {
        System.out.println("Welcome to our program!");
    }

    // Create the calculateAverage Method
    public static double calculateAverage(int num1, int num2) {
        double average = (num1 + num2) / 2.0;
        return average;
    }
}