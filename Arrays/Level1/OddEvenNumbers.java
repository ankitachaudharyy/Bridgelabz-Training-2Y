import java.util.Scanner;

class OddEvenNumbers {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter a natural number: ");

        if (!input.hasNextInt()) {
            System.err.println("Invalid input. Please enter an integer.");
            input.close();
            System.exit(0);
        }

        int number = input.nextInt();

        if (number <= 0) {
            System.err.println("Invalid number. Please enter a natural number.");
            input.close();
            System.exit(0);
        }

        int arraySize = number / 2 + 1;

        int[] oddNumbers = new int[arraySize];
        int[] evenNumbers = new int[arraySize];

    
        int oddIndex = 0;
        int evenIndex = 0;

        for (int i = 1; i <= number; i++) {

            
            if (i % 2 == 0) {
                evenNumbers[evenIndex] = i;
                evenIndex++;
            }  
            else {
                oddNumbers[oddIndex] = i;
                oddIndex++;
            }
        }

       
        System.out.println("Odd numbers:");

        for (int i = 0; i < oddIndex; i++) {
            System.out.print(oddNumbers[i] + " ");
        }

        System.out.println();

    
        System.out.println("Even numbers:");

        for (int i = 0; i < evenIndex; i++) {
            System.out.print(evenNumbers[i] + " ");
        }

   
        System.out.println();

  
        input.close();
    }
}