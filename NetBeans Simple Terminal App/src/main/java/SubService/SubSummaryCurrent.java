/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SubService;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

/**
 *
 * @author joshu
 */
public class SubSummaryCurrent {
    
    void PrintSummary()throws FileNotFoundException{
    
    System.out.println("");
        System.out.println("The following is a summary of subscriptions based on the text file current:");
        System.out.println("");
        
        int TotalSubs = 0; // counter
        int MSubCounter = 0; // counter
        
            
        float Bronze = 0; // counter
        float Silver = 0; // counter
        float Gold = 0; // counter
    
        int JanSubs = 0; // counter
        int FebSubs = 0; // counter
        int MarSubs = 0; // counter
        int AprSubs = 0; // counter
        int MaySubs = 0; // counter
        int JunSubs = 0; // counter
        int JulSubs = 0; // counter
        int AugSubs = 0; // counter
        int SepSubs = 0; // counter
        int OctSubs = 0; // counter
        int NovSubs = 0; // counter
        int DecSubs = 0; // counter
        
        File current = new File("current.txt"); // creating new file which is our file we want to read
        Scanner ScanFile = new Scanner(current); // we want to scan this file to read it
        int MonthlyCost = 0;
        
        while (ScanFile.hasNextLine()) { // where this file has a next line, the code below will be executed
            String line = ScanFile.next(); // line is go to file next piece of data
            TotalSubs++; // the total subs is incremented for everysingle line there is
            String month = line.substring(3, 6); // substring to find the month of each sub, located the month between the characters 3 and 6. substring cant be used for other attributes because the lines do not have equal characters
            String Package = ScanFile.next(); // the package is the files next piece of data
            ScanFile.next(); // skipping the next piece of data in this file
            ScanFile.next(); // skipping the next piece of data in this file
            String Monthly = ScanFile.next(); // the monthly string is the text files piece of data after the the skipping steps
// here we were using scanner to basically search and spilt up each line and each string in the current text file
            
            if (month.equals("Jan")){ // if the month equals, this piece of text ("Jan") in the sub string in the text file then it increments our JanSubs variable.
                JanSubs++;
            }
            else if (month.equals("Feb")){ // the same pattern as above, searches and increments 
                FebSubs++;
            }
            else if (month.equals("Mar")){
                MarSubs++;
            }
            else if (month.equals("Apr")){
                AprSubs++;
            }
            else if (month.equals("May")){
                MaySubs++;
            }
            else if (month.equals("Jun")){
                JunSubs++;
            }
            else if (month.equals("Jul")){
                JulSubs++;
            }
            else if (month.equals("Aug")){
                AugSubs++;
            }
            else if (month.equals("Sep")){
                SepSubs++;
            }
            else if (month.equals("Oct")){
                OctSubs++;
            }
            else if (month.equals("Nov")){
                NovSubs++;
            }
            else if (month.equals("Dec")){
                DecSubs++;
            }
            else{}
            
            if (Package.equals("B")){ // searching for the B in each line and incrementing our Bronze variable, the same pattern is followed in the code below for silver and bronze
                Bronze++;
            }
            else if (Package.equals("S")){
                Silver++;
            }
            else if (Package.equals("G")){
                Gold++;
            }
            
            if (Monthly.equals("M")){ // because we only want to find the average monthly subs, here we're searching the the M in the text file, and we count this as MSubCounter and incrementing. 
                MSubCounter++;
                MonthlyCost = MonthlyCost + ScanFile.nextInt(); // here, we are loacating the M and saying the next piece of data, is the data we want to keep and add. if it was only MonthlyCost = ScanFile.nextInt(); the variable MonthlyCost would have just  been overwritten, so i  did monthly cost = monthly cost ScanFile.nextInt();  
            }
               
           ScanFile.nextLine();
           
        }
          
        float truetotal = MonthlyCost/MSubCounter; // saved as a float to format later, true total is the total the total of monthly cost subs divided by the total of monthly subs there are. 
        
        ScanFile.close(); // closing the file scanner
        
        int AverageMonthlySubCounter = (JanSubs + FebSubs + MarSubs + AprSubs + MaySubs + JunSubs + JulSubs + AugSubs + SepSubs + OctSubs + NovSubs + DecSubs)/12; // the following are the print statements to the user 
        System.out.println("Total number of subscriptions: "+TotalSubs);
        System.out.println("Average monthly subscriptions: "+AverageMonthlySubCounter);
        System.out.printf("Average monthly subscription fee: "+  "£%.2f "   , (truetotal)/100);
        System.out.println("\n");
        System.out.println("Percentage of subscriptions:");
        System.out.println("Bronze:" + (Bronze/TotalSubs)*100);
        System.out.println("Silver:" + (Silver/TotalSubs)*100);
        System.out.println("Gold:" + (Gold/TotalSubs)*100);
        System.out.println("");
        System.out.println("Jan   Feb   Mar   Apr   May   Jun   Jul   Aug   Sep   Oct   Nov   Dec");
        System.out.print(JanSubs);
        System.out.print("    "+FebSubs);
        System.out.print("    "+MarSubs);
        System.out.print("    "+AprSubs);
        System.out.print("     "+MaySubs);
        System.out.print("    "+JunSubs);
        System.out.print("    "+JulSubs);
        System.out.print("   "+AugSubs);
        System.out.print("    "+SepSubs);
        System.out.print("    "+OctSubs);
        System.out.print("    "+NovSubs);
        System.out.print("    "+DecSubs);
        System.out.println("\n");
}
}