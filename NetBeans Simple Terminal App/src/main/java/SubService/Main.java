
package SubService;

import java.io.FileNotFoundException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
   
    public static void main(String[] args) throws FileNotFoundException  {
        while (true) { // While this is true the following code is executed
            Scanner Scanner = new Scanner(System.in); //Defining scanner
            System.out.println("press 1 to enter a new subscription:" );
            System.out.println("press 2 to view a summary subscription of current:" );
            System.out.println("press 3 to view Summary of Subscriptions for a given month:" );
            System.out.println("Press 4 to find a summary based on your last name:" );
            System.out.println("press 0 to exit:" );
            
            try { // trys code
                int Yes = Scanner.nextInt(); //defining an int variable as yes
                if (Yes == 1){ //if user input = 1 
                    Display Display = new Display(); //creating a new instance of the display class
                    Display.display(); //this code is executed
                }
                else if (Yes == 2){ //else if statment if the above is not true and yes =2
                    SubSummaryCurrent SubSummaryCurrent = new SubSummaryCurrent(); // creating a new instance of the Sub Summary class
                    SubSummaryCurrent.PrintSummary(); //this code is executed
                }
                else if (Yes == 3){ // if the user input is 3
                    SubForSpecificMonth SubForSpecificMonth = new SubForSpecificMonth(); // creating new instance of the sub for specific  month class
                    SubForSpecificMonth.printMonthSummary(); // executes code in this class
                }
                else if (Yes==4){ // if user input is 4
                    FindAndDisplaySubSummary FindAndDisplaySubSummary = new FindAndDisplaySubSummary(); // creates new instance of the find and display summary class
                    FindAndDisplaySubSummary.FindPrintSummary(); // executes the code in this class
                }
                else if (Yes==0){ //else if statment if the above code is not true and yes = 0
                    System.out.println("Exiting..."); //prompts the user the programme is exiting
                    System.exit(Yes); //exits programme
                }
            }
            catch (InputMismatchException i) { //catching any user mismatch for example if the user enters a string or char
                System.out.println("Invalid input!!"); //prompts the user invalid input
                Scanner.nextLine(); //in a while loop that is set to true, so it loops back and asks user each possible interaction
            }
        }
    } 
}
