/*
  Write a for loop that will print out a series of numbers 
  starting at 0 and ending at the x, exclusive.
 */
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        System.out.print("In:");
        int x = inp.nextInt();
        // write your code below
        for (int i = 0; i < x; i++) {
            System.out.println(i);
        }
    }
}