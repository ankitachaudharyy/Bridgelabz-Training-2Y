import java.util.Scanner;


class MultiplicationTable {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

       
        int start = 1;
        int end = 10;

        
        System.out.print("Enter a number: ");

       
        if (!input.hasNextInt()) {
            System.err.println("Invalid input. Please enter an integer.");
            input.close();
            System.exit(0);
        }

       
        int number = input.nextInt();

       
        int[] multiplicationTable = new int[end - start + 1];

     
        for (int i = start; i <= end; i++) {
            multiplicationTable[i - start] = number * i;
        }

       
        System.out.println("Multiplication table of " + number + ":");

        for (int i = 0; i < multiplicationTable.length; i++) {

           
            int multiplier = i + start;

          
            System.out.println(
                number + " * " + multiplier + " = " + multiplicationTable[i]
            );
        }

       
        input.close();
    }
}