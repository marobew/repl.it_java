/*
  Write a for loop that will print out each letter of the string s, 
  separated by spaces, on the same line.
 */
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        System.out.print("In:");
        String s = inp.nextLine();
        // write your code below
        for (int i = 0; i < s.length(); i++) {
            System.out.print(s.charAt(i) + " ");
        }

    }
}