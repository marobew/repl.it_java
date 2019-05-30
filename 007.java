/*
 * For you to do:
 
 * ALL print statements in this exercise should be on one line, no newlines.
    
    1. Print out the character in the 5th index of the String str Print out the
    2. character in the 8th index of the String str Print out the character in the
    3. 1st index of the String str Print out the index in the i-th index of the
    4. String str (i is a variable already declared for you)
 */
class Main {
    public static void main(String[] args) {
        String str = "boopity bop";
        int i = 10;

        System.out.print(str.charAt(5));
        System.out.print(str.charAt(8));
        System.out.print(str.charAt(1));
        System.out.print(str.charAt(i));

    }
}