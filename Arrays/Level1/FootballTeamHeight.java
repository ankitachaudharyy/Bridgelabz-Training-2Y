import java.util.Scanner;

class FootballTeamHeight {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);


        int playerCount = 11;

  
        double[] heights = new double[playerCount];

        System.out.println(
            "Enter the heights of " + playerCount + " players:"
        );

        for (int i = 0; i < heights.length; i++) {

            if (!input.hasNextDouble()) {
                System.err.println("Invalid height. Please enter a number.");
                input.close();
                System.exit(0);
            }

            heights[i] = input.nextDouble();

            if (heights[i] <= 0) {
                System.err.println("Invalid height. Height must be positive.");
                input.close();
                System.exit(0);
            }
        }

        double sum = 0.0;

        for (int i = 0; i < heights.length; i++) {
            sum += heights[i];
        }

        double mean = sum / heights.length;

        System.out.println("Mean height of the football team = " + mean);

        input.close();
    }
}