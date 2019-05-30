/*
 * For you to do:
  (all output should be one per line)
 
 1. On line 6, write a print statement that prints out a substring of str starting at index 5 and going to the end 
 2. On line 7, write a print statement that prints out a substring of str starting at index 7 and ending at index 10
 3. On line 10, fill in the () in substring so that it prints "harambe" 
 4. On line 11, fill in the () in substring so that it prints "t f"
 */
class Main {
    public static void main(String[] args) {
        String str = "laptops out for harambe";

        // write code below
        System.out.println(str.substring(5));
        System.out.println(str.substring(7, 10));

        // fill in the blanks below:
        System.out.println(str.substring(16)); // fill in substring so it prints "harambe"
        System.out.println(str.substring(10, 13)); // fill in substring so it prints "t f"
    }
}