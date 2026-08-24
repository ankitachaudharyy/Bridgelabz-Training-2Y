import java.util.Scanner;

class FactorsOfNumber {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter a positive number: ");

       
        if (!input.hasNextInt()) {
            System.err.println("Invalid input. Please enter an integer.");
            input.close();
            System.exit(0);
        }

        int number = input.nextInt();

       
        if (number <= 0) {
            System.err.println("Invalid number. Please enter a positive number.");
            input.close();
            System.exit(0);
        }

        int maxFactor = 10;

     
        int[] factors = new int[maxFactor];

        int index = 0;

        for (int i = 1; i <= number; i++) {

            if (number % i == 0) {

                if (index == factors.length) {

                  
                    int newSize = factors.length * 2;

                
                    int[] temp = new int[newSize];

                   
                    for (int j = 0; j < factors.length; j++) {
                        temp[j] = factors[j];
                    }

                    
                    factors = temp;
                }

                factors[index] = i;

                index++;
            }
        }

    
        System.out.println("Factors of " + number + ":");

        for (int i = 0; i < index; i++) {
            System.out.print(factors[i] + " ");
        }

     
        System.out.println();

        input.close();
    }
}