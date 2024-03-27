/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SubService;

import java.io.File;
import java.io.FileNotFoundException;
import static java.time.LocalDateTime.now;
import java.util.Scanner;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
        
/**
 *
 * @author joshu
 */
public class FindAndDisplaySubSummary {
    
    void FindPrintSummary() throws FileNotFoundException{ // throwing  the file not found exception
        
        
        System.out.println("Please enter your names or characters: "); // asks user to input their way to find their summary sub
        
        Scanner Scanner = new Scanner(System.in);
        String InputInitial = Scanner.nextLine();
        
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd");
        LocalDateTime now = LocalDateTime.now(); // getting the date
        
        File current = new File("current.txt");
        Scanner ScanFile = new Scanner(current);
        
        int MonthlyCost = 0;
        
        while (ScanFile.hasNextLine()) {
            
            String line = ScanFile.next();  // below code is supposed to sort through the text file and  spilt up the data into strings and ints
            String month = line.substring(3, 6);
            String Package = ScanFile.next();
            String Duration = ScanFile.next();
            String Code = ScanFile.next();
            String Monthly = ScanFile.next();
            MonthlyCost = MonthlyCost + ScanFile.nextInt();
            String FirstInitial = ScanFile.next();
            String LastName = ScanFile.next();
            
            if (LastName.contains(InputInitial)){
            
             
              
            System.out.println("+===============================================+"); 
            System.out.println("|" + "\t\t\t\t\t\t" + "|");
            System.out.println("|" + " Customer: "  + FirstInitial +" "+ LastName +"\t\t" + "        "+ "|"); 
            System.out.println("|" + "     " + "Date: " + (dtf.format(now))+"      Code: "+Code+"\t|"); 
            System.out.println("|"+"\t\t\t\t\t\t"+"|");
            System.out.println("|" + "   " + "Package: " +Package+ "\t\t"+"Duration:"+Duration+"           |");
            System.out.println("|" + "     Terms: " + Monthly + "\t\t\t\t\t" + "|");
            System.out.println("|"+"Month bought in: " + month+"\t\t\t\t|");
            System.out.println("|" + "\t\t\t\t\t\t" + "|");
            System.out.println("+===============================================+");
            }
            
            
        
        }
       
        
    } 
}

    
    
    
    
    
    
        
   
            
     
    