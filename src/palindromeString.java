public class palindromeString {
    //check if a string is palindrome
    public static void main(String args[]) {
        String str = "mohammed abdul ghani";
        String rev = "";
        for (int i = 0; i < str.length(); i++) {
            rev = str.charAt(i) + rev;
        }
        if (rev.equals(str)) {
            System.out.println(str +
                    " is a Palindrome");
        } else {
            System.out.println(str +
                    " is not a Palindrome");
        }
    }
}