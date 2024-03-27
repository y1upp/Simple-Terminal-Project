/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SubService;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 *
 * @author joshu
 */
public class SubForSpecificMonth {
    
    void printMonthSummary ()throws FileNotFoundException{
        System.out.println("Enter 1 for January, 2 for February, 3 for March, 4 for April, 5 for May, 6 for June, 7 for July, 8 for August, 9 for September, 10 for October, 11 for November or 12 for December");
        
        Scanner Scanner = new Scanner(System.in);
        int Month;
        Month = Scanner.nextInt();
        
        float JanSubs = 0; // counter for total subs this month 
        float FebSubs = 0; 
        float MarSubs = 0; 
        float AprSubs = 0; 
        float MaySubs = 0; 
        float JunSubs = 0; 
        float JulSubs = 0; 
        float AugSubs = 0; 
        float SepSubs = 0;
        float OctSubs = 0; 
        float NovSubs = 0; 
        float DecSubs = 0;  
        
        float JanBsubCount = 0; // counter for total Bronze subs in january
        float JanSsubCount = 0; // counter for total silver subs in january
        float JanGsubCount = 0; // counter for total gold subs in january  
        float FebBSubCount = 0; // the same pattern as above
        float FebSSubCount = 0;
        float FebGSubCount = 0;
        float MarBSubCount = 0;
        float MarSSubCount = 0;
        float MarGSubCount = 0;
        float AprBSubCount = 0; 
        float AprSSubCount = 0; 
        float AprGSubCount = 0; 
        float MayBSubCount = 0; 
        float MaySSubCount = 0; 
        float MayGSubCount = 0; 
        float JunBSubCount = 0; 
        float JunSSubCount = 0;
        float JunGSubCount = 0;
        float JulBSubCount = 0;
        float JulSSubCount = 0;
        float JulGSubCount = 0;
        float AugBSubCount = 0; 
        float AugSSubCount = 0; 
        float AugGSubCount = 0; 
        float SepBSubCount = 0;
        float SepSSubCount = 0;
        float SepGSubCount = 0;
        float OctBSubCount = 0;
        float OctSSubCount = 0;
        float OctGSubCount = 0;
        float NovBSubCount = 0; 
        float NovSSubCount = 0;
        float NovGSubCount = 0;
        float DecBSubCount = 0; 
        float DecSSubCount = 0;
        float DecGSubCount = 0;
        
        float JansubCounter = 0; //counter for subs that are monthly in this month
        float FebSubCounter = 0; 
        float MarSubCounter = 0; 
        float AprSubCounter = 0; 
        float MaySubCounter = 0; 
        float JunSubCounter = 0;
        float JulSubCounter = 0; 
        float AugSubCounter = 0; 
        float SepSubCounter = 0; 
        float OctSubCounter = 0; 
        float NovSubCounter = 0; 
        float DecSubCounter = 0; 
         
        int JanBMonthlyCost = 0; // the cost when the month equals its respective "" and when it equals "B" and when it is a monthly sub "B" 
        int JanSMonthlyCost = 0; // the cost when the month equals its respective "" and when it equals "S" and when it is a monthly sub "B" 
        int JanGMonthlyCost = 0; // the cost when the month equals its respective "" and when it equals "G" and when it is a monthly sub "B" 
        int FebBSubCost = 0; // same pattern as above
        int FebSSubCost = 0; 
        int FebGSubCost= 0; 
        int MarBSubCost =0;
        int MarSSubCost = 0;
        int MarGSubCost = 0; 
        int AprSubCost =0; 
        int AprSSubCost = 0;  
        int AprGSubCost = 0; 
        int MaySubCost =0; 
        int MaySSubCost = 0; 
        int MayGSubCost = 0;
        int JunSubCost =0; 
        int JunSSubCost = 0; 
        int JunGSubCost = 0; 
        int JulSubCost =0; 
        int JulSSubCost = 0; 
        int JulGSubCost = 0; 
        int AugSubCost =0; 
        int AugSSubCost = 0; 
        int AugGSubCost = 0; 
        int SepSubCost =0; 
        int SepSSubCost = 0; 
        int SepGSubCost = 0; 
        int OctSubCost=0; 
        int OctSSubCost = 0; 
        int OctGSubCost = 0; 
        int NovSubCost =0; 
        int NovSSubCost = 0;
        int NovGSubCost = 0; 
        int DecSubCost =0; 
        int DecSSubCost = 0; 
        int DecGSubCost = 0; 
        
        File current = new File("current.txt"); // Creating the file in this class
        Scanner ScanFile = new Scanner(current); // Reading and scanning this file
        
        while (ScanFile.hasNextLine()) { // While the file has a next line
            String line = ScanFile.next(); // Line will be the next string in the file, seperates each bit of information 
            String month = line.substring(3, 6); // the month is in the same place on everyline so we use a sbstring and say where its position is in the text  file
            String Package = ScanFile.next(); // Package is the next bit of information in this same line of code
            ScanFile.next(); // skipping to the next bit of information because we dont need to read this
            ScanFile.next(); // skipping to the next bit of information because we dont need to read this
            String Monthly = ScanFile.next(); // The information in the file at this point in our scanfile.next will be saved as string monthly
            
            
            // Below code increments variables above based on positions of data in the current text file
            // One section of code is noted as the following code follows the same pattern
            
            //JANUARY
            if (month.equals("Jan")){ // when the month which is our substring = this we increment the subs related to this variable
                    JanSubs++;} // incrementing this variable base on if the above substring matches
            if (month.equals("Jan")&&(Monthly.equals("M"))){ // inner if statment if the substring is matched and the M is matched in the text file, we increment the associated variable
                JansubCounter++; // incrementing the variable based on the code above if the two matches are made
            }
            if (month.equals("Jan")&&Package.equals("B")) // if jan and if B increment JanBsubCount
            {
            JanBsubCount++; //Increment
            }
            else if (month.equals("Jan")&&Package.equals("S")) // same pattern as above
            {
            JanSsubCount++;
            }
            else if (month.equals("Jan")&&Package.equals("G")) 
            {
            JanGsubCount++;
            }
            
            //FEBRUARY
            else if (month.equals("Feb")){ // same pattern as above
                FebSubs++;}
            if (month.equals("Feb")&&(Monthly.equals("M")))
            {
                FebSubCounter++; 
            }
            if (month.equals("Feb")&&Package.equals("B")) 
            {
                FebBSubCount++;
            }
            else if (month.equals("Feb")&&Package.equals("S")) 
            {
                FebSSubCount++;
            }
            else if (month.equals("Feb")&&Package.equals("G")) 
            {
                FebGSubCount++;
            }
            
            //MARCH
            else  if (month.equals("Mar")){ 
                MarSubs++;} 
            if (month.equals("Mar")&&(Monthly.equals("M")))
            {
                MarSubCounter++; 
            } 
            if (month.equals("Mar")&&Package.equals("B")) 
            {
                MarBSubCount++;
            }
            else if (month.equals("Mar")&&Package.equals("S")) 
            {
                MarSSubCount++;
            }
            else if (month.equals("Mar")&&Package.equals("G")) 
            {
                MarGSubCount++;
            }
            
            //APRIL
            else  if (month.equals("Apr"))
            {
                AprSubs++;
            }
            if (month.equals("Apr")&&(Monthly.equals("M")))
            {
                AprSubCounter++;
            } 
            if (month.equals("Apr")&&Package.equals("B"))
            {
                AprBSubCount++;
            }
            else if (month.equals("Apr")&&Package.equals("S")) 
            {
                AprSSubCount++;
            }
            else if (month.equals("Apr")&&Package.equals("G")) 
            {
                AprGSubCount++;
            }
                
            //MAY
            else if (month.equals("May"))
            { 
                MaySubs++;
            } 
            if (month.equals("May")&&(Monthly.equals("M")))
            {
                MaySubCounter++; 
            } 
            if (month.equals("May")&&Package.equals("B")) 
            {
                MayBSubCount++;
            }
            else if (month.equals("May")&&Package.equals("S")) 
            {
                MaySSubCount++;
            }
            else if (month.equals("May")&&Package.equals("G")) 
            {
                MayGSubCount++;
            }
            
            //JUNE
            else  if (month.equals("Jun"))
            { 
                JunSubs++;
            }
            if (month.equals("Jun")&&(Monthly.equals("M")))
            {
                JunSubCounter++; 
            }
            if (month.equals("Jun")&&Package.equals("B")) 
            {
                JunBSubCount++;
            }
            else if (month.equals("Jun")&&Package.equals("S")) 
            {
                JunSSubCount++;
            }
            else if (month.equals("Jun")&&Package.equals("G")) 
            {
                JunGSubCount++;
            }
            
            //JULY
            else   if (month.equals("Jul"))
            {
                JulSubs++;
            }
            if (month.equals("Jul")&&(Monthly.equals("M")))
            { 
                JulSubCounter++; 
            }
                if (month.equals("Jul")&&Package.equals("B")) 
            {
                JulBSubCount++;
            }
                else if (month.equals("Jul")&&Package.equals("S")) 
            {
                JulSSubCount++;
            }
                else if (month.equals("Jul")&&Package.equals("G")) 
            {
                JulGSubCount++;
            }
            
                //AUGUST
                else if (month.equals("Aug"))
            { 
                AugSubs++;
            }
                if (month.equals("Aug")&&(Monthly.equals("M")))
                {
                    AugSubCounter++; 
                }
                if (month.equals("Aug")&&Package.equals("B")) 
            {
                AugBSubCount++;
            }
                else if (month.equals("Aug")&&Package.equals("S")) 
            {
                AugSSubCount++;
            }
                else if (month.equals("Aug")&&Package.equals("G")) 
            {
                AugGSubCount++;
            }
                
                //SEPTEMBER
                else if (month.equals("Sep"))
                {
                    SepSubs++;
                }
                if (month.equals("Sep")&&(Monthly.equals("M")))
                {
                    SepSubCounter++; 
                }
                if (month.equals("Sep")&&Package.equals("B")) 
                {
                    SepBSubCount++;
                }
                else if (month.equals("Sep")&&Package.equals("S"))
                {
                    SepSSubCount++;
                }
                else if (month.equals("Sep")&&Package.equals("G"))
                {
                    SepGSubCount++;
                }
                
                //OCTOBER
                else if (month.equals("Oct"))
                {
                    OctSubs++;
                }
                if (month.equals("Oct")&&(Monthly.equals("M")))
                {
                    OctSubCounter++; 
                }
                if (month.equals("Oct")&&Package.equals("B"))
                {
                    OctBSubCount++;
                }
                else if (month.equals("Oct")&&Package.equals("S"))
                {
                    OctSSubCount++;
                }
                else if (month.equals("Oct")&&Package.equals("G"))
                {
                    OctGSubCount++;
                }
                
                //NOVEMBER
                else if (month.equals("Nov"))
                {
                    NovSubs++;
                }
                if (month.equals("Nov")&&(Monthly.equals("M")))
                {
                    NovSubCounter++; 
                }
                if (month.equals("Nov")&&Package.equals("B"))
                {
                    NovBSubCount++;
                }
                else if (month.equals("Nov")&&Package.equals("S"))
                {
                    NovSSubCount++;
                }
                else if (month.equals("Nov")&&Package.equals("G"))
                {
                    NovGSubCount++;
                }
                
                //DECEMBER
                else if (month.equals("Dec"))
                {
                    DecSubs++;
                }
                if (month.equals("Dec")&&(Monthly.equals("M")))
                {
                    DecSubCounter++; 
                }
                if (month.equals("Dec")&&Package.equals("B"))
                {
                    DecBSubCount++;
                }
                else if (month.equals("Dec")&&Package.equals("S"))
                {
                    DecSSubCount++;
                }
                else if (month.equals("Dec")&&Package.equals("G"))
                {
                    DecGSubCount++;
                }
                
               
                
                
                // below code gets the cost of a month for each bronze, silver and gold and adds it to a variabe. it also looks at if the payment is one off or monthly
           
                // JANUARY
                if (month.equals("Jan")&&Package.equals("B")&&Monthly.equals("M") ) // if all of these are matched 
                {
                JanBMonthlyCost = JanBMonthlyCost + ScanFile.nextInt(); // the variable created above is changed and the next int is the next set of data at this point in the scanner.next
                }
                else if (month.equals("Jan")&&Package.equals("S")&&Monthly.equals("M") ) // silver variable is added
                {
                JanSMonthlyCost = JanSMonthlyCost + ScanFile.nextInt();
                }
                else if (month.equals("Jan")&&Package.equals("G")&&Monthly.equals("M") ) // gold variable is added
                {
                    JanGMonthlyCost = JanGMonthlyCost + ScanFile.nextInt();
                }
                
                //FEBRUARY
                if (month.equals("Feb")&&Package.equals("B")&&Monthly.equals("M") ) // code follows the same pattern as above
                {
                    FebBSubCost = FebBSubCost + ScanFile.nextInt();
                }
                else if (month.equals("Feb")&&Package.equals("S")&&Monthly.equals("M") )
                {
                    FebSSubCost = FebSSubCost + ScanFile.nextInt();
                }
                else if (month.equals("Feb")&&Package.equals("G")&&Monthly.equals("M") )
                {
                    FebGSubCost = FebGSubCost + ScanFile.nextInt();
                }
                
                //MARCH
                if (month.equals("Mar")&&Package.equals("B")&&Monthly.equals("M") )
                {
                    MarBSubCost = MarBSubCost + ScanFile.nextInt();
                }
                else if (month.equals("Mar")&&Package.equals("S")&&Monthly.equals("M") )
                {
                    MarSSubCost = MarSSubCost + ScanFile.nextInt();
                }
                else if (month.equals("Mar")&&Package.equals("G")&&Monthly.equals("M") )
                {
                    MarGSubCost = MarGSubCost + ScanFile.nextInt();
                }
                
                //APRIL
                if (month.equals("Apr")&&Package.equals("B")&&Monthly.equals("M") )
                {
                    AprSubCost = AprSubCost + ScanFile.nextInt();
                }
                else if (month.equals("Apr")&&Package.equals("S")&&Monthly.equals("M") )
                {
                    AprSSubCost = AprSSubCost + ScanFile.nextInt();
                }
                else if (month.equals("Apr")&&Package.equals("G")&&Monthly.equals("M") )
                {
                    AprGSubCost = AprGSubCost + ScanFile.nextInt();
                }
                
                //MAY
                if (month.equals("May")&&Package.equals("B")&&Monthly.equals("M") )
                {
                    MaySubCost = MaySubCost + ScanFile.nextInt();
                }
                else if (month.equals("May")&&Package.equals("S")&&Monthly.equals("M") )
                {
                    MaySSubCost = MaySSubCost + ScanFile.nextInt();
                }
                else if (month.equals("May")&&Package.equals("G")&&Monthly.equals("M") )
                {
                    MayGSubCost = MayGSubCost + ScanFile.nextInt();
                }
                
                //JUNE
                if (month.equals("Jun")&&Package.equals("B")&&Monthly.equals("M") )
                {
                    JunSubCost = JunSubCost + ScanFile.nextInt();
                }
                else if (month.equals("Jun")&&Package.equals("S")&&Monthly.equals("M") )
                {
                    JunSSubCost = JunSSubCost + ScanFile.nextInt();
                }
                else if (month.equals("Jun")&&Package.equals("G")&&Monthly.equals("M") )
                {
                    JunGSubCost = JunGSubCost + ScanFile.nextInt();
                }
                
                //JUNE
                if (month.equals("Jul")&&Package.equals("B")&&Monthly.equals("M") )
                {
                    JulSubCost = JulSubCost + ScanFile.nextInt();
                }
                else if (month.equals("Jul")&&Package.equals("S")&&Monthly.equals("M") )
                {
                    JulSSubCost = JulSSubCost + ScanFile.nextInt();
                }
                else if (month.equals("Jul")&&Package.equals("G")&&Monthly.equals("M") )
                {
                    JulGSubCost = JulGSubCost + ScanFile.nextInt();
                }
                
                //AUGUST
                if (month.equals("Aug")&&Package.equals("B")&&Monthly.equals("M") )
                {
                    AugSubCost = AugSubCost + ScanFile.nextInt();
                }
                else if (month.equals("Aug")&&Package.equals("S")&&Monthly.equals("M") )
                {
                    AugSSubCost = AugSSubCost + ScanFile.nextInt();
                }
                else if (month.equals("Aug")&&Package.equals("G")&&Monthly.equals("M") )
                {
                    AugGSubCost = AugGSubCost + ScanFile.nextInt();
                }
                
                //SEPTEMBER
                if (month.equals("Sep")&&Package.equals("B")&&Monthly.equals("M") )
                {
                    SepSubCost = SepSubCost + ScanFile.nextInt();
                }
                else if (month.equals("Sep")&&Package.equals("S")&&Monthly.equals("M") ){
                    SepSSubCost = SepSSubCost + ScanFile.nextInt();
                }
                else if (month.equals("Sep")&&Package.equals("G")&&Monthly.equals("M") )
                {
                    SepGSubCost = SepGSubCost + ScanFile.nextInt();
                }
                
                //OCTOBER
                if (month.equals("Oct")&&Package.equals("B")&&Monthly.equals("M") )
                {
                    OctSubCost = OctSubCost + ScanFile.nextInt();
                }
                else if (month.equals("Oct")&&Package.equals("S")&&Monthly.equals("M") )
                {
                    OctSSubCost = OctSSubCost + ScanFile.nextInt();
                }
                else if (month.equals("Oct")&&Package.equals("G")&&Monthly.equals("M") ){
                    OctGSubCost = OctGSubCost + ScanFile.nextInt();
                }
                
                //NOVEMBER
                if (month.equals("Nov")&&Package.equals("B")&&Monthly.equals("M") )
                {
                    NovSubCost = NovSubCost + ScanFile.nextInt();
                }
                else if (month.equals("Nov")&&Package.equals("S")&&Monthly.equals("M") )
                {
                    NovSSubCost = NovSSubCost + ScanFile.nextInt();
                }
                else if (month.equals("Nov")&&Package.equals("G")&&Monthly.equals("M") ){
                    NovGSubCost = NovGSubCost + ScanFile.nextInt();
                }
                
                //DECEMBER
                if (month.equals("Dec")&&Package.equals("B")&&Monthly.equals("M") )
                {
                    DecSubCost = DecSubCost + ScanFile.nextInt();
                }
                else if (month.equals("Dec")&&Package.equals("S")&&Monthly.equals("M") )
                {
                    DecSSubCost = DecSSubCost + ScanFile.nextInt();
                }
                else if (month.equals("Dec")&&Package.equals("G")&&Monthly.equals("M") )
                {
                    DecGSubCost = DecGSubCost + ScanFile.nextInt();
                }
            
            
            
            
            ScanFile.nextLine();
        }
        
        float BJtruetotal = JanBMonthlyCost/JansubCounter; // creating floating data type variables to turn into decimals at the end. also  states that the variable will be either the B,S or G cost divided bye the B, S or G counter
        float SJtruetotal = JanSMonthlyCost/JansubCounter;
        float GJtrueTotal = JanGMonthlyCost/JansubCounter;
        
        float BFtruetotal = FebBSubCost/FebSubCounter; // code follows same pattern as above
        float SFtruetotal = FebSSubCost/FebSubCounter;
        float GFtrueTotal = FebGSubCost/FebSubCounter;
        
        float BMARCAtruetotal = MarBSubCost/MarSubCounter;
        float SMARCtruetotal = MarSSubCost/MarSubCounter;
        float GMARCtrueTotal = MarGSubCost/MarSubCounter;
        
        float BAtruetotal = AprSubCost/AprSubCounter;
        float SAtruetotal = AprSSubCost/AprSubCounter;
        float GAtrueTotal = AprGSubCost/AprSubCounter;
        
        float BMAYtruetotal = MaySubCost/MaySubCounter;
        float SMAYtruetotal = MaySSubCost/MaySubCounter;
        float GMAYtrueTotal = MayGSubCost/MaySubCounter;
        
        float BJUNEtruetotal = JunSubCost/JunSubCounter;
        float SJUNEtruetotal = JunSSubCost/JunSubCounter;
        float GJUNEtrueTotal = JunGSubCost/JunSubCounter;
        
        float BJULtruetotal = JulSubCost/JulSubCounter;
        float SJULtruetotal = JulSSubCost/JulSubCounter;
        float GJULtrueTotal = JulGSubCost/JulSubCounter;
        
        float BAUGtruetotal = AugSubCost/AugSubCounter;
        float SAUGtruetotal = AugSSubCost/AugSubCounter;
        float GAUGtrueTotal = AugGSubCost/AugSubCounter;
        
        float BSEPtruetotal = SepSubCost/SepSubCounter;
        float SSEPtruetotal = SepSSubCost/SepSubCounter;
        float GSEPtrueTotal = SepGSubCost/SepSubCounter;
        
        float BOCTtruetotal = OctSubCost/OctSubCounter;
        float SOCTtruetotal = OctSSubCost/OctSubCounter;
        float GOCTtrueTotal = OctGSubCost/OctSubCounter;
        
        float BNOVtruetotal = NovSubCost/NovSubCounter;
        float SNOVtruetotal = NovSSubCost/NovSubCounter;
        float GNOVtrueTotal = NovGSubCost/NovSubCounter;
        
        float BDECtruetotal = DecSubCost/DecSubCounter;
        float SDECtruetotal = DecSSubCost/DecSubCounter;
        float GDECtrueTotal = DecGSubCost/DecSubCounter;
       
        // floats to help calculate percentages for each month
        
        float BronzSubJanuary = JanBsubCount/JanSubs;
        float SilverSubJanuary = JanSsubCount/JanSubs;
        float GoldSubJanuary = JanGsubCount/JanSubs;
        
        float BronzeSubFebruary = FebBSubCount/FebSubs;
        float SilverSubFebruary = FebSSubCount/FebSubs;
        float GoldSubFebruary = FebGSubCount/FebSubs;
        
        float BronzeSubMarch = MarBSubCount/MarSubs;
        float SilverSubMarch = MarSSubCount/MarSubs;
        float GoldSubMarch = MarGSubCount/MarSubs;
        
        float BronzeSubApril = AprBSubCount/AprSubs;
        float SilverSubApril = AprSSubCount/AprSubs;
        float GoldSubApril = AprGSubCount/AprSubs;
        
        float BronzeSubMay = MayBSubCount/MaySubs;
        float SilverSubMay = MaySSubCount/MaySubs;
        float GoldSubMay = MayGSubCount/MaySubs;
        
        float BronzeSubJune = JunBSubCount/JunSubs;
        float SilverSubJune = JunSSubCount/JunSubs;
        float GoldSubJune = JunGSubCount/JunSubs;
        
        float BronzeSubJuly = JulBSubCount/JulSubs;
        float SilverSubJuly = JulSSubCount/JulSubs;
        float GoldSubJuly = JulGSubCount/JulSubs;
        
        float BronzeSubAugust = AugBSubCount/AugSubs;
        float SilverSubAugust = AugSSubCount/AugSubs;
        float GoldSubAugust = AugGSubCount/AugSubs;
        
        float BronzeSubSep= SepBSubCount/SepSubs;
        float SilverSubSep = SepSSubCount/SepSubs;
        float GoldSubSep = SepGSubCount/SepSubs;
        
        float BronzeSubOct = OctBSubCount/OctSubs;
        float SilverSubOct = OctSSubCount/OctSubs;
        float GoldSubOct = OctGSubCount/OctSubs;
        
        float BronzeSubNov = NovBSubCount/NovSubs;
        float SilverSubNov = NovSSubCount/NovSubs;
        float GoldSubNov = NovGSubCount/NovSubs;
        
        float BronzeSubDec = DecBSubCount/DecSubs;
        float SilverSubDec = DecSSubCount/DecSubs;
        float GoldSubDec = DecGSubCount/DecSubs;
        
        if (Month == 1) { // if the user input = 1 then the following is displayed
            
            System.out.println("Total number of subscriptions for January: "+JanSubs);
            System.out.printf("Average monthly subscription fee: "+  "£%.2f "   , (BJtruetotal+SJtruetotal+GJtrueTotal)/100);
            System.out.println("");
            System.out.println("Percentage of subscriptions: "  );
            System.out.println("");
            System.out.println("Bronze: " + BronzSubJanuary*100); // formating our floating data type variable
            System.out.println("Silver: " + SilverSubJanuary*100);
            System.out.println("Gold: " + GoldSubJanuary*100);
            System.out.println("\n");
        }
       
        else if (Month ==2){
            System.out.println("Total number of subscriptions for February: "+FebSubs);
            System.out.printf("Average monthly subscription fee: "+  "£%.2f "   , (BFtruetotal+SFtruetotal+GFtrueTotal)/100);
            System.out.println("");
            System.out.println("Percentage of subscriptions: ");
            System.out.println("");
            System.out.println("Bronze: " + BronzeSubFebruary*100); 
            System.out.println("Silver: " + SilverSubFebruary*100);
            System.out.println("Gold: " + GoldSubFebruary*100);
            System.out.println("\n");
        }
        else if (Month ==3){
            System.out.println("Total number of subscriptions for March: "+MarSubs);
            System.out.printf("Average monthly subscription fee: "+  "£%.2f "   , (BMARCAtruetotal+SMARCtruetotal+GMARCtrueTotal)/100);
            System.out.println("");
            System.out.println("Percentage of subscriptions: ");
            System.out.println("");
            System.out.println("Bronze: " + BronzeSubMarch*100); 
            System.out.println("Silver: " + SilverSubMarch*100);
            System.out.println("Gold: " + GoldSubMarch*100);
            System.out.println("\n");
        }
        else if (Month ==4){
            System.out.println("Total number of subscriptions for April: "+AprSubs);
            System.out.printf("Average monthly subscription fee: "+  "£%.2f "   , (BAtruetotal+SAtruetotal+GAtrueTotal)/100);
            System.out.println("");
            System.out.println("Percentage of subscriptions: ");
            System.out.println("");
            System.out.println("Bronze: " + BronzeSubApril*100); 
            System.out.println("Silver: " + SilverSubApril*100);
            System.out.println("Gold: " + GoldSubApril*100);
            System.out.println("\n");
        }
        else if (Month ==5){
            System.out.println("Total number of subscriptions for May: "+MaySubs);
            System.out.printf("Average monthly subscription fee: "+  "£%.2f "   , (BMAYtruetotal+SMAYtruetotal+GMAYtrueTotal)/100);
            System.out.println("");
            System.out.println("Percentage of subscriptions: ");
            System.out.println("");
            System.out.println("Bronze: " + BronzeSubMay*100); 
            System.out.println("Silver: " + SilverSubMay*100);
            System.out.println("Gold: " + GoldSubMay*100);
            System.out.println("\n");
        }
        else if (Month ==6){
            System.out.println("Total number of subscriptions for June: "+JunSubs);
            System.out.printf("Average monthly subscription fee: "+  "£%.2f "   , (BJUNEtruetotal+SJUNEtruetotal+GJUNEtrueTotal)/100);
            System.out.println("");
            System.out.println("Percentage of subscriptions: ");
            System.out.println("");
            System.out.println("Bronze: " + BronzeSubJune*100); 
            System.out.println("Silver: " + SilverSubJune*100);
            System.out.println("Gold: " + GoldSubJune*100);
            System.out.println("\n");;
        }
        else if (Month ==7){
            System.out.println("Total number of subscriptions for July: "+JulSubs);
            System.out.printf("Average monthly subscription fee: "+  "£%.2f "   , (BJULtruetotal+SJULtruetotal+GJULtrueTotal)/100);
            System.out.println("");
            System.out.println("Percentage of subscriptions: ");
            System.out.println("");
            System.out.println("Bronze: " + BronzeSubJuly*100); 
            System.out.println("Silver: " + SilverSubJuly*100);
            System.out.println("Gold: " + GoldSubJuly*100);
            System.out.println("\n");
        }
        else if (Month ==8){
            System.out.println("Total number of subscriptions for August: "+AugSubs);
            System.out.printf("Average monthly subscription fee: "+  "£%.2f "   , (BAUGtruetotal+SAUGtruetotal+GAUGtrueTotal)/100);
            System.out.println("");
            System.out.println("Percentage of subscriptions: ");
            System.out.println("");
            System.out.println("Bronze: " + BronzeSubAugust*100); 
            System.out.println("Silver: " + SilverSubAugust*100);
            System.out.println("Gold: " + GoldSubAugust*100);;
            System.out.println("\n");
        }
        else if (Month ==9){
            System.out.println("Total number of subscriptions for September: "+SepSubs);
            System.out.printf("Average monthly subscription fee: "+  "£%.2f "   , (BSEPtruetotal+SSEPtruetotal+GSEPtrueTotal)/100);
            System.out.println("");
            System.out.println("Percentage of subscriptions: ");
            System.out.println("");
            System.out.println("Bronze: " + BronzeSubSep*100); 
            System.out.println("Silver: " + SilverSubSep*100);
            System.out.println("Gold: " + GoldSubSep*100);
            System.out.println("\n");
        }
        else if (Month ==10){
            System.out.println("Total number of subscriptions for October: "+OctSubs);
            System.out.printf("Average monthly subscription fee: "+  "£%.2f "   , (BOCTtruetotal+SOCTtruetotal+GOCTtrueTotal)/100);
            System.out.println("");
            System.out.println("Percentage of subscriptions: ");
            System.out.println("");
            System.out.println("Bronze: " + BronzeSubOct*100); 
            System.out.println("Silver: " + SilverSubOct*100);
            System.out.println("Gold: " + GoldSubOct*100);
            System.out.println("\n");
        }
        else if (Month == 11){
            System.out.println("Total number of subscriptions for November: "+NovSubs);
            System.out.printf("Average monthly subscription fee: "+  "£%.2f "   , (BNOVtruetotal+SNOVtruetotal+GNOVtrueTotal)/100);
            System.out.println("");
            System.out.println("Percentage of subscriptions: ");
            System.out.println("");
            System.out.println("Bronze: " + BronzeSubNov*100); 
            System.out.println("Silver: " + SilverSubNov*100);
            System.out.println("Gold: " + GoldSubNov*100);
            System.out.println("\n");
        }
        else if (Month ==12){
            System.out.println("Total number of subscriptions for December: "+DecSubs);
            System.out.printf("Average monthly subscription fee: "+  "£%.2f "   , (BDECtruetotal+SDECtruetotal+GDECtrueTotal)/100);
            System.out.println("");
            System.out.println("Percentage of subscriptions: ");
            System.out.println("");
            System.out.println("Bronze: " + BronzeSubDec*100); 
            System.out.println("Silver: " + SilverSubDec*100);
            System.out.println("Gold: " + GoldSubDec*100);
            System.out.println("\n");
        }
        
        
            
        
    }
    
    
}
