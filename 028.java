/*
  Write a for loop that will print out "AP CS A" x number of times, 
  new line per print.
 */
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        System.out.print("In:");
        int x = inp.nextInt();
        // write your code below
        for (int i = 0; i < x; i++) {
            System.out.println("AP CS A");
        }

    }
}