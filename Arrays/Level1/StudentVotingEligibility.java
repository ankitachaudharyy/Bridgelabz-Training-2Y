import java.util.Scanner;


class StudentVotingEligibility {
    public static void main(String[] args) {

       
        Scanner input = new Scanner(System.in);

        
        int studentCount = 10;
        int votingAge = 18;

        int[] ages = new int[studentCount];

        System.out.println("Enter the age of " + studentCount + " students:");

        for (int i = 0; i < ages.length; i++) {

            
            if (!input.hasNextInt()) {
                System.err.println("Invalid input. Please enter an integer age.");
                input.close();
                System.exit(0);
            }

           
            ages[i] = input.nextInt();
        }

      
        for (int i = 0; i < ages.length; i++) {

            
            if (ages[i] < 0) {
                System.out.println("Invalid age: " + ages[i]);
            }
           
            else if (ages[i] >= votingAge) {
                System.out.println(
                    "The student with the age " + ages[i] + " can vote."
                );
            }
          
            else {
                System.out.println(
                    "The student with the age " + ages[i] + " cannot vote."
                );
            }
        }

       
        input.close();
    }
}