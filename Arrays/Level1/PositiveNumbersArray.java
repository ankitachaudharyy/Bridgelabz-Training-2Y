import java.util.Scanner;

class PositiveNumbersArray {
    public static void main(String[] args) {

    
        Scanner input = new Scanner(System.in);

   
        int maximumSize = 10;

        
        double[] numbers = new double[maximumSize];

        int index = 0;
        double total = 0.0;

       
        while (true) {

         
            if (index == numbers.length) {
                break;
            }

            
            System.out.print("Enter a positive number: ");

          
            if (!input.hasNextDouble()) {
                System.err.println("Invalid input. Please enter a number.");
                input.close();
                System.exit(0);
            }

            
            double number = input.nextDouble();

            if (number <= 0) {
                break;
            }

            numbers[index] = number;

            
            index++;
        }

        
        for (int i = 0; i < index; i++) {
            total += numbers[i];
        }

       
        System.out.println("\nNumbers entered:");

        for (int i = 0; i < index; i++) {
            System.out.println(numbers[i]);
        }

        
        System.out.println("Total = " + total);

       
        input.close();
    }
}