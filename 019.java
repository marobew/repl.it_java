/*
  Write a for loop that will print out the numbers starting at 1 and ending at the input inclusive. 
  The numbers printed should all be on the same line separated by a space.
 */
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        System.out.print("In:");
        int end = inp.nextInt();
        // write your code below
        if (end > 0) {
            for (int i = 1; i <= end; i++) {
                System.out.println(i);
            }
        }
    }
}