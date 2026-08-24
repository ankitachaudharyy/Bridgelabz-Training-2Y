import java.util.Scanner;

class MultiplicationTableSixToNine {
    public static void main(String[] args) {

     
        Scanner input = new Scanner(System.in);

        int startMultiplier = 6;
        int endMultiplier = 9;

       
        System.out.print("Enter a number: ");

     
        if (!input.hasNextInt()) {
            System.err.println("Invalid input. Please enter an integer.");
            input.close();
            System.exit(0);
        }

   
        int number = input.nextInt();

    
        int[] multiplicationResult =
            new int[endMultiplier - startMultiplier + 1];

        for (int i = startMultiplier; i <= endMultiplier; i++) {
            multiplicationResult[i - startMultiplier] = number * i;
        }

        System.out.println("Multiplication results:");

        for (int i = 0; i < multiplicationResult.length; i++) {

            int multiplier = i + startMultiplier;

            System.out.println(
                number + " * " + multiplier + " = " + multiplicationResult[i]
            );
        }

        input.close();
    }
}