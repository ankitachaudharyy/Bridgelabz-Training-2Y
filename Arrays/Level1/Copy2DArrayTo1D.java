import java.util.Scanner;


class Copy2DArrayTo1D {
    public static void main(String[] args) {


        Scanner input = new Scanner(System.in);

     
        System.out.print("Enter number of rows: ");

        
        if (!input.hasNextInt()) {
            System.err.println("Invalid input. Please enter an integer.");
            input.close();
            System.exit(0);
        }

        int rows = input.nextInt();

      
        if (rows <= 0) {
            System.err.println("Invalid number of rows.");
            input.close();
            System.exit(0);
        }

        System.out.print("Enter number of columns: ");

       
        if (!input.hasNextInt()) {
            System.err.println("Invalid input. Please enter an integer.");
            input.close();
            System.exit(0);
        }

        int columns = input.nextInt();

        if (columns <= 0) {
            System.err.println("Invalid number of columns.");
            input.close();
            System.exit(0);
        }

        int[][] matrix = new int[rows][columns];

   
        System.out.println("Enter the elements of the matrix:");

        for (int i = 0; i < matrix.length; i++) {

            for (int j = 0; j < matrix[i].length; j++) {

       
                if (!input.hasNextInt()) {
                    System.err.println(
                        "Invalid input. Please enter integers only."
                    );
                    input.close();
                    System.exit(0);
                }

              
                matrix[i][j] = input.nextInt();
            }
        }

       
        int[] array = new int[rows * columns];

        int index = 0;

       
        for (int i = 0; i < matrix.length; i++) {

            for (int j = 0; j < matrix[i].length; j++) {

               
                array[index] = matrix[i][j];

              
                index++;
            }
        }

       
        System.out.println("\n2D Array:");

        for (int i = 0; i < matrix.length; i++) {

            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }

            System.out.println();
        }

        System.out.println("\n1D Array:");

        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }

        System.out.println();

        input.close();
    }
}