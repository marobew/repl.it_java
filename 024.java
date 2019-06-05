/*
Using a for loop, determine whether the integer variable max is prime or not.  If the number is prime, print out "prime".  If it's not, print out "not prime".  Keep in mind that 1 is NOT a prime number.
*/

import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    Scanner inp = new Scanner(System.in);
    System.out.print("In:");
    double max = inp.nextDouble();
    //write your code below
    boolean prime= false;
    for (int i = 2; i<max;i++){
      
      prime = true;
      if (max%i == 0) {
        
        prime = false;
        break;
    }
    
    
  }
  if (prime) System.out.println("prime");
  else System.out.println("not prime");
}
}