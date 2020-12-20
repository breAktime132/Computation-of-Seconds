/* Peter Abdulmasih
*
* Mr. Drass
* 
* October 11, 2018 
*
* This program will get an input from user in seconds greater than 10,000. It will then put this into hours and minutes, and seconds. It will explain how many minutes or hours is equal to.
* 
* Original Version: October 5, 2018
*/

   import java.util.Scanner;
      public class ComputeSeconds{                                                                                                                        // Declares class definition in which the file is named, ComputeSeconds.
         public static void main (String[] args) {
         Scanner input = new Scanner (System.in);                                                                                             
         System.out.println ("Hello! Please enter a number of seconds above 10,000 to convert into your total time in hours, minutes, and seconds!");     // Prints instructions for what the user should input.
         int seconds = input.nextInt();                                                                                                                   // Get user input*
         int minutes = seconds / 60;                                                                                                                      // Since the number of seconds in a minute is 60, the variable 'minutes' displays the minute unit by taking seconds / 60.* NOTE: This line and the preceding line are not used to display the code in the console. These numbers are simply a foundation. If the console were to display all three units, they would be equivalent to each other, just multiplied by 60 as you move to the right.
         int hours = minutes / 60;                                                                                                                        // Since the number of minutes in an hour is 60, the variable 'hours' displays the hour unit by taking minutes / 60.
         int remainingminutes = minutes % 60;                                                                                                             // Contrary to the variables 'minutes' and 'seconds', these next two variables are used. However, they use a modulus, using % as the symbol. Although the module divides, it takes the remainder. This solves the problem by allowing the program to display a combined time in the console, rather than just equivalent time units.
         int remainingseconds = seconds % 60;                                                                                                             // (see preceding comment)
         System.out.println (" Your time is " + hours + " hours, " + remainingminutes + " minutes, " + remainingseconds + " seconds!");                   // Outprints the combined time in the console, with the 'remainingminutes' and 'remainingseconds' as the variables of minutes and seconds.
   }
}     