package co.com.bitstack.strings;

public class Palindrome {

    public static void main(String[] args) {
        Palindrome m = new Palindrome();
        String text = "ama";
        char[] arr = text.toCharArray();
        StringBuilder b = new StringBuilder();

        for (int i = arr.length - 1; arr.length > i && i >= 0; i--) {
            b.append(arr[i]);
        }

        System.out.println(((b.toString().equals(text)) ? "yes" : "No"));
    }

}
