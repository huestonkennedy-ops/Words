public class Test {
    public static void main(String[] args) {
        String word = "racecar";
        System.out.println(palindrome(word));
    } 
    public static boolean palindrome(String word) {
        int length = word.length() -1;
        for(int i = 0; i<=length; i++) {
        char first = word.charAt(i);
        char last = word.charAt(length);
        if(first != last) {
            return false;
        }
        length -= 1;
      }
      return true;
    }
}