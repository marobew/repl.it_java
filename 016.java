/*
  The variable "num" holds an integer user input
  
  Write a conditional statement starting on line 9 that does the following: 
  If num is even (divisible by 2), print "__ is even" 
  If num is odd, print "__ is odd"
 */
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        System.out.print("In:");
        int num = inp.nextInt();
        // DO NOT CHANGE ABOVE CODE! Write your code below
        if (num % 2 == 0) {
            System.out.println("\n" + num + " is even");
        } else if (num % 2 != 0) {
            System.out.println("\n" + num + " is odd");
        }

    }
}