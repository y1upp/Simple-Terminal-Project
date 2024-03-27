/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SubService;

import java.io.File;
import java.util.Scanner;
import java.util.Calendar;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.InputMismatchException;



public class Display {
    
      

     void display() {
        
        System.out.println("Enter your name:" + "\n" + "Enter your desired Package:" + "\n" + "Enter the duration you want your sub to be:" + "\n" + "Enter your discount code:" + "Enter your payment terms(monthly or one-off)");
        
        Scanner Scanner = new Scanner (System.in); // defing the name of our scanner
        
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd");
        LocalDateTime now = LocalDateTime.now(); // getting the date
        Name Name = new Name(); 
        SUBs SUBs= new SUBs();
        int SubscriptionCost = 0;
        float SubCodeDis = 0;
        
        
        
//*************************************** ENTER NAME CODE
        
System.out.println("please enter your name"); // asks user to enter their name 
String YourNameIn = Name.YourName();
System.out.println("you entered " + YourNameIn);
       
//*************************************** ENTER PACKAGE CODE        
        
char UserPackage = 0;
        
        while (true) 
    {
        System.out.println("Enter Package B,S or G: "); // the only correct input are these three options
        UserPackage = Scanner.nextLine().charAt(0);
        if (UserPackage != 'B' && UserPackage != 'S' && UserPackage != 'G') // if these options are not true then
        {
            System.out.println("Invalid Input, please pick from the 3 options available"); // prints a error message and asks for re try
        }
        else
        {
            break;
        }
    }
      
    
String fullName = null;
if (UserPackage == 'B') { // defining the names of our packages to print in the summary as per request of the specification
    fullName = "Bronze";
    System.out.println("you  entered the " + (fullName) + " Subscription");
}
else if (UserPackage == 'S') {
    fullName = "Silver";
    System.out.println("you  entered the " + (fullName) + " Subscription");
}
else if (UserPackage == 'G') {
    fullName = "Gold";
    System.out.println("you  entered the " + (fullName) + " Subscription");
}
      
//*************************************** ENTER DURATION CODE  
      
int DurIN;
    while (true) { // the only options we want from the user are 1,3,6 and 12
    try {
        System.out.println("Enter duration 1,3, 6 or 12 ");
        DurIN = Scanner.nextInt();
        if (DurIN != 1 && DurIN != 3 && DurIN != 6 && DurIN != 12) // if these options are not picked then it will ask for a re try
            { 
                System.out.println("Invalid Input, please pick from the 4 options available.");
            }
            else
            {
                break;
            }
    }
    catch (InputMismatchException i) {
        System.out.println("invalid input. please enter, 1,3,6 or 12 "); // catches a mismatch input and asks for a re try since the while loop remains true
        Scanner.nextLine();
    }
    }

    String FullDuation = null;
    
    if (DurIN == 1) {
        FullDuation = "One"; // defining the names of our duration to print in the summary as per request of the specification
        System.out.println("your duration will be " + (FullDuation) + " Month");
    }
    else if (DurIN == 3) {
        FullDuation = "Three";
        System.out.println("your duration will be " + (FullDuation) + " Months");
    }
    else if (DurIN == 6) {
        FullDuation = "Six";
        System.out.println("your duration will be " + (FullDuation) + " Months");
    }
    else if (DurIN == 12) {
        FullDuation = "Twelve";
        System.out.println("your duration will be " + (FullDuation) + " Months");
    }

    
//*************************************** ENTER DISCOUNTCODE CODE   
    
String DiscountC = Scanner.nextLine();

try {
        System.out.println("Enter your discount code or if you have no discount code, please press 0");
        DiscountC = Scanner.nextLine(); //the discount code = scanner  next line which is user input, if no code then enter 0
    }
    catch (InputMismatchException i) {
        System.out.println("invalid input. please enter, 1,3,6 or 12"); //input mismatch
        Scanner.nextLine();
    }
    
    System.out.println("Your discount code is " + (DiscountC));
    System.out.println("Your discount code percentage is: " + DiscountC.charAt(DiscountC.length() - 1) + "%");

int dis = DiscountC.charAt(DiscountC.length() - 1) - '0' ; // ASCII table | code looks at the char at the end of the user input, ascii table looks at the distance between the number slected from the number 0 and the char

//***************************************  ENTER TERMS CODE
    
System.out.println("Enter Terms (press 1 for pay in full or press 2 for monthly subscription): ");

// Below code is asking the user for the terms of their payment

    int TermIN;
    while (true) {
    try {
        TermIN = Scanner.nextInt();
        if (TermIN == 1)
            { 
                System.out.println("You want to pay your subscription in full for addition discount");
            break;
            }
         else if (TermIN == 2)
            {
                System.out.println("You are going to pay your subscription monthly");
            break;
            }
        else if (TermIN != 1 && TermIN != 2) // we only want the user to enter 1 or 2, this code will catch the input mismatch and will ask to try again
        {
            System.out.println("please enter either 1 to pay full price or press 2 to pay monthly");
        }
        else break;
    }
    catch (InputMismatchException i) {
        System.out.println("Invalid Input, please press 1 for pay in full or press 2 for monthly subsciption");
        Scanner.nextLine();
    }
    }
    
    Scanner.nextLine();


        
//***************************************  Setting the subscription cost for a bronze package
    
    if (DurIN == 1 && UserPackage == 'B') // if these condtions are true
    {
        SubscriptionCost = 600; // the sub cost will be this much, this same pattern continues down the code to find sub cost for the user
    }
    else if (DurIN == 3 && UserPackage == 'B')
    {
        SubscriptionCost = 500;
    }
    else if (DurIN == 6 && UserPackage == 'B')
    {
        SubscriptionCost = 400;
    }
    else if (DurIN == 12 && UserPackage == 'B')
    {
        SubscriptionCost = 300;
    }
 
//***************************************  Setting the subscription cost for a silver package
    
    else if (DurIN == 1 && UserPackage == 'S')
    {
        SubscriptionCost = 800;
    }
    else if (DurIN == 3 && UserPackage == 'S')
    {
        SubscriptionCost = 700;
    }
    else if (DurIN == 6 && UserPackage == 'S')
    {
        SubscriptionCost = 600;
    }
    else if (DurIN == 12 && UserPackage == 'S')
    {
        SubscriptionCost = 500;
    }

//***************************************  Setting the subscription cost for a gold package 
    
    else if (DurIN == 1 && UserPackage == 'G')
    {
        SubscriptionCost = 999;
    }
    else if (DurIN == 3 && UserPackage == 'G')
    {
        SubscriptionCost = 899;
    }
    else if (DurIN == 6 && UserPackage == 'G')
    {
        SubscriptionCost = 799;
    }
    else if (DurIN == 12 && UserPackage == 'G')
    {
        SubscriptionCost = 699;
    }

//***************************************  calculating the discount from code and from a one off payment

float fullPaymentDis = 5; // 5% discount if the term = 1
float MonthlyTrueDiscount;
float FullTrueCost;
    
    if (TermIN == 1)
    {
        SubCodeDis = ((SubscriptionCost /100) * (dis + fullPaymentDis)); // calculating  discount if they user entered  a full payment at once option
    }
    else if (TermIN == 2) 
    {
        SubCodeDis = ((SubscriptionCost /100) * (dis)); // dis is the discount from the users input if they have a discount code or not
    }
    
    FullTrueCost = ((SubscriptionCost * DurIN) - (SubCodeDis)); // full cost calculation 
    MonthlyTrueDiscount = SubscriptionCost - SubCodeDis; 
    
            
    System.out.println("+===============================================+"); // Summary of sub to the user with formatting such as \t and |
    System.out.println("|" + "\t\t\t\t\t\t" + "|");
    System.out.println("|" + " Customer: "  + YourNameIn +"\t\t\t " + "       "+ "|"); 
    System.out.println("|" + "\t\t\t\t\t\t" + "|");
    System.out.print("|" + "     " + "Date: " + (dtf.format(now))); // getting the time
    System.out.println("\t" + "Discount Code: " + DiscountC + "\t" + "|");
    System.out.print("|" + "  Package: " + fullName); 
    System.out.println("\t" + "     " + "Duration: " + FullDuation + "	" + "|");
    if (TermIN == 1){
        System.out.println("|" + "    Terms: " + "One-off" + "\t\t\t\t" + "|");
    }
    else if(TermIN == 2)
            {
         System.out.println("|" + "    Pay Monthly" + "\t\t\t\t" + "|");
     }
    System.out.println("|" + "\t\t\t\t\t\t" + "|");
    if (TermIN == 1)
    {
        System.out.printf("|" + "          " + "One-off subscription: " + "£%.2f "   + " \t" + "|" , FullTrueCost/100); // if the payment is a one off subscription then this code is executed with extra discount
    }
    else if (TermIN == 2)
    {
        System.out.printf("|" + "          " + "Monthly subscription: " + "£%.2f "   + " \t" + "|" , MonthlyTrueDiscount/100); // if the payment is monthly, this will be displayed to the user
    }
    
    System.out.println("\n" + "|" + "\t\t\t\t\t\t" + "|");
    System.out.println("+===============================================+");
     
    
//***************************************  saving the summary output to a text based file named subscription.txt

         System.out.println("Printing to a text file called Summary");
        try {
            FileWriter writer = new FileWriter("subscription.txt");
            writer.write("Date: " + (dtf.format(now)) + "   " + "Duration: " + FullDuation + "   " + "Package: " + fullName + "   " + "Name: " + YourNameIn + "   " + "Discount Code: " + DiscountC + "   " + "Subcost: " + MonthlyTrueDiscount/100 + 
                    "   " + "Subcost: " + FullTrueCost/100 + "   " +"Payment Term: " + TermIN  + "   " );
            writer.close();
            
            
}       
     catch (IOException e) {
    e.printStackTrace();
}
     
     }
    
      
         
     
}
    