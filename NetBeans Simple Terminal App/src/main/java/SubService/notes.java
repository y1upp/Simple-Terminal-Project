
package SubService;

/**
 *
 * @author joshu
 */

/** 
 * Games Access services
 * they want to expand their system to subscription packages
 * packages are purchased monthly
 * packages are bronze gold or silver
 * different duration of months
 * 1 month, 3, 6, 12
 * discount codes
 * first two digits how code was issued
 * third and fourth digit indicate what year code is valid in
 * fifth digit indicates the year the code expires (E = jan - june)( L = july -- dec
 * final digit indicates how much discount (1% - 9%)
 * default payment term is monthly. however customer can chose to pay the full sub as a one off fee for extra 5% discount
 * customers name should also be input
 * summary should be output
 * +===============================================+
   |                                               |
   | Customer: J Smith                             |
   |                                               |
   |     Date: 12 Oct 2022   Discount Code: JF22L5 |
   |  Package: Silver             Duration: Three  |
   |    Terms: One-off                             |
   |                                               |
   |          One-off Subscription: £4.32          |
   |                                               |
   +===============================================+

 *  part one
 *  enter a new sub
 *  display a summary of subs
 *  display a summary of sub for selected month
 *  find and display sub
 *  exit
 * 
 *  ask user to input: customer name, package, duration, discount code, and payment term.
 *  calc one-off/ monthly sub
 *  display subscription summary
 *  save the sub data to text based summary file
 *  
 * 
 *  part two
 *  summary of subs
 *  select current or sample subs and display-
 *  total number of subs
 *  average monthly sub fee 
 *  percentage of each type of sub
 *  total number of subs per month 
 *  sample output
 * 
 *  Total number of subscriptions: 910
 *  Average monthly subscription: 76
 *  Average monthly subscription fee: £6.09
 *  
 *  Percentage of subscriptions:
 *  Bronze: 34.0
 *  Silver: 34.8
 *  Gold: 31.2
 *  Jan Feb Mar Apr May Jun Jul Aug Sep Oct Nov Dec
 *  83  89  74  72  81  84  100  99 62  91  90  75
 * 
 *  part three 
 *  Summary of Subscriptions for a given month
 *  User is asked to select the current (current.txt) or sample (sample.txt) subscriptions, a valid month and a summary of the following is displayed:
 *  total number of subs
 *  average monthly sub fee
 *  Percentage of each type of subscription (bronze, silver and gold)
 *  sample output
 * 
 *  Total number of subscriptions for May: 81
 *  Average subscription fee: £6.09
 *  Percentage of subscriptions:
 *  Bronze: 34.0
 *  Silver: 34.8
 *  Gold: 31.2
 * 
 *  part four
 *  Find and Display Subscription
 *  Prompt the user to select the (current.txt) or sample (sample.txt) subscriptions, then enter text to search. The selected file should be searched for any matches (full orpartial) against the customer’s name. For example, entering NS would match against“F Townsend”. 
 *  
 *  Exit
 *  prompt user and exit
 * 
 * 
 */
public class notes {
        
    }
    

