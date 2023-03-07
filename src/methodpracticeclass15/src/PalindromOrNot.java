package methodpracticeclass15.src;

public class PalindromOrNot {
    //3) Create a method that will print whether given String is palindrome or not.

    public static boolean isPalindrome(String str) {

        StringBuilder stringbuilder = new StringBuilder(str);
        stringbuilder.reverse();
        String rev = stringbuilder.toString();
        if (str.equals(rev)) {
            return true;
        } else {
            return false;
        }
    }


    public static void main(String[] args) {
        System.out.println(PalindromOrNot.isPalindrome("madam"));
        System.out.println(PalindromOrNot.isPalindrome("random"));

    }

}