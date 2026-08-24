import java.util.Scanner;

class FizzBuzz {
    public static void main(String[] args) {

    
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a positive integer: ");

     
        if (!input.hasNextInt()) {
            System.err.println("Invalid input. Please enter an integer.");
            input.close();
            System.exit(0);
        }

        int number = input.nextInt();

    
        if (number <= 0) {
            System.err.println(
                "Invalid number. Please enter a positive integer."
            );
            input.close();
            System.exit(0);
        }
        String[] results = new String[number];

        
        for (int i = 1; i <= number; i++) {

       
            if (i % 3 == 0 && i % 5 == 0) {
                results[i - 1] = "FizzBuzz";
            }

            
            else if (i % 3 == 0) {
                results[i - 1] = "Fizz";
            }

          
            else if (i % 5 == 0) {
                results[i - 1] = "Buzz";
            }

            else {
                results[i - 1] = String.valueOf(i);
            }
        }

        for (int i = 0; i < results.length; i++) {

            int position = i + 1;

            System.out.println(
                "Position " + position + " = " + results[i]
            );
        }

        input.close();
    }
}