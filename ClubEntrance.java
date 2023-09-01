

/**
*  Title:  ClubEntrance
*  Semester:       COP3337 RVC  Fall 2023  
*  @author          Leland Johnson

*  I affirm that this program is entirely my own work and none of it is the work of any other person.

* The goal of this program is to control the number of attendees at a club. In a way, it acts as a virtual bouncer. 
* It takes in groups of attendees (or takes away) as a parameter and if that group is too large or too small it rejects 
* them from entering the club. When the club is full the program ends, and the virtual bouncer announces that the 
* club will not take in any more groups.

*Club Entrance utilizes a while loop to establish an exit condition (value) for the program. Within its body are if/else 
* statements which control the output of the program. It also uses the Java utility scanner to take in user input 
* (in this case the group amount).
*/

import java.util.Scanner;

public class ClubEntrance {
    
                            /* 
                            
                            @param:   none
                             @return:    none
                             @throws : none
                           
                            Description: This method sets an initial groupAmount and clubCapacity which increases or decreases 
                            based upon a while loop. The while loop will continue to run until the full capacity of the club is reached 
                            (100 people). A user can add or subtract groups from the club, but doing so must be within the boundaries 
                            of the club’s capacity and be a non-negative number. If a negative amount is assigned to the clubCapacity 
                            (based on the groupAmount) the if statement will capture that value and set clubCapacity back to 0. If clubCapcity 
                            is greater than 100. then clubCapacity will not increase and be set back to the initial value it was before the increase 
                            occurred. The program ends when 100 attendees are in the club and the system prints the exiting statement.

                             */

                public static void main(String[] args) {

                                Scanner scnr=new Scanner(System.in);
                                
                                // The size of the groups
                                int groupAmount=0;              
                                //The initial capacity of the club
                                int clubCapacity=0;                 

                                System.out.println("java ClubEntrance");

                               //The while loop will go on foerver until the clubcapcity is reached.
                                while (clubCapacity!=100) {                 

                                                // The clubCapacity is based on the groupAmount which increases or decreases base on the user input.
                                                System.out.println("Enter how many people you want to enter or leave the club:  ");
                                                
                                                groupAmount=scnr.nextInt();
                                                clubCapacity+=groupAmount;

                                                //  If the clubCapacity is negative set it back to zero to avoid a negative clubCapacity number . 
                                                if (clubCapacity<0) { 

                                                                clubCapacity=0;
                                                                System.out.println("Everyone has left the club.");
                                                }

                                                //  If the clubCapacity is greater than 100 subtract that amount from the groupAmount number that put it over 100 attendees. 
                                                // This will set clubCapacity back to it's original amount before the excess occured. Everyone in that group is turned away.
                                                else if (clubCapacity>100) {
                                                    
                                                                clubCapacity-=groupAmount;
                                                                System.out.println("The group is too large to enter the club.");
                                                }

                                                //This is a format specifying print statment which allows me to output variable data into a string based upon the clubCapacity that changes.
                                                System.out.printf("Currently there are %d people in the club.\n",clubCapacity);                                     
                                }

                                //This print statment is out of the while loop flow so it always runs once the while loop exit condition has been met. 
                                System.out.println("The club is at capacity. Program will end.");
                                
                }
}

