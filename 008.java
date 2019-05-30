/*
 * For you to do:
    (the output should be one per line)
 1. Print out the position of the first occurrence of "c" 
 2. Print out the position of the first occurrence of " " 
 3. Print out the position of the first occurrence of the variable target1 
 4. Print out the position of the first occurrence of the variable target2
 */
class Main {
  public static void main(String[] args) {
    String str = "abracadabra alakazam";
    String target1 = "dab";
    String target2 = "ABRA";
    
    System.out.println(str.indexOf('c'));
    System.out.println(str.indexOf(' '));
    System.out.println(str.indexOf(target1));
    System.out.println(str.indexOf(target2));
  }