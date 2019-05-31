/*
  Write a for loop that will print out the numbers starting at 1 and ending at twice the end number exclusive. 
  Each number should be on the same line, separated by a space.
 */
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        System.out.print("In:");
        int end = inp.nextInt();
        // write your code below
        for (int i = 0; i < 2 * end; i++)
            System.out.print(i);

    }
}