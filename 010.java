/*
  Given a String (already declared for you as str), do the following: 
  - Print out the following: "The first 3 letters of ___ is ___"
  For example, if the input is "banana", your output should be
  "The first 3 letters of banana is ban" 
 */
import java.util.Scanner;

class Main {
  public static void main(String[] args) {
  	Scanner inp = new Scanner(System.in);
  	System.out.print("In:");
  	String str = inp.nextLine();
    // Don't change the code above! Write your code below
    System.out.print("the first 3 letters of"+ str + "is " + str.charAt(0) + str.charAt(1) + str.charAt(2));
  }
}