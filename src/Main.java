
public class Main {
    public static void main(String[] args) {
        // initialize the integer array
        int[] intArray = {5,2,1,4,3,7};
        // define current number, final result and temporary result variables as integers
        int currentNumber;
        int finalResult = 1, temporaryResult = 1;
        // the first for loop is to get the current number and print the result of the current number
        for(int i = 0; i < intArray.length; i++) {
            currentNumber = intArray[i];
            System.out.println("Current number: " +currentNumber);
            // the second for loop is to find the factorial of the current number
            for(int j = 1; j <= currentNumber; j++) {
                temporaryResult = temporaryResult * j;
                finalResult = temporaryResult;
            }
            System.out.println("Factorial of " +currentNumber + " is " +finalResult);
            finalResult = 1;
            temporaryResult = 1;

        }

    }
}