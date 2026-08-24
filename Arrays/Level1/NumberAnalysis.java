import java.util.Scanner;


class NumberAnalysis {
    public static void main(String[] args) {

        
        Scanner input = new Scanner(System.in);

       
        int numberCount = 5;

    
        int[] numbers = new int[numberCount];

      
        System.out.println("Enter " + numberCount + " numbers:");

        for (int i = 0; i < numbers.length; i++) {

            
            if (!input.hasNextInt()) {
                System.err.println("Invalid input. Please enter an integer.");
                input.close();
                System.exit(0);
            }

      
            numbers[i] = input.nextInt();
        }

    
        for (int i = 0; i < numbers.length; i++) {

            if (numbers[i] > 0) {

               
                if (numbers[i] % 2 == 0) {
                    System.out.println(
                        numbers[i] + " is positive and even."
                    );
                } else {
                    System.out.println(
                        numbers[i] + " is positive and odd."
                    );
                }
            }

            else if (numbers[i] < 0) {
                System.out.println(numbers[i] + " is negative.");
            }

            else {
                System.out.println(numbers[i] + " is zero.");
            }
        }

       
        int firstNumber = numbers[0];
        int lastNumber = numbers[numbers.length - 1];

        
        if (firstNumber == lastNumber) {
            System.out.println("The first and last elements are equal.");
        } else if (firstNumber > lastNumber) {
            System.out.println("The first element is greater than the last element.");
        } else {
            System.out.println("The first element is less than the last element.");
        }

       
        input.close();
    }
}