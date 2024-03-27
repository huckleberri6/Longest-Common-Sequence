import java.util.*;

public class LongestCommonSequence {
    private static String lcs = "";

    public LongestCommonSequence() {
    }

    public static int LCS(String a, String b) {
        lcs = ""; // just re-initializing the longest common sequence
        int count = 0; // variable to keep track of number of shared letters
        String[] bLetters = new String[b.length()]; // this array stores all the letters in string b

        // storing all the letters in string b into an array that
        // will be used as a lookup
        for (int i = 0; i < b.length(); i++)
            bLetters[i] = b.substring(i, i + 1);

        // finding the letters in string a that are also in string b
        for (int i = 0; i < a.length(); i++) {
            for (int j = 0; j < b.length(); j++)
                if (bLetters[j].equals(a.substring(i, i + 1))) // the letter in a is also a letter in b
                {
                    count++;
                    lcs = lcs + a.substring(i, i + 1);
                }
        }

        return count; // number of common letters between string a and string b
    }

    public static void main(String args[]) {
        // the following test cases are the examples shown in class

        String a = "abcde";
        String b = "ace";
        System.out.print(LCS(a, b)); // prints 3
        System.out.println("  " + lcs); // prints 'ace'

        a = "BD";
        b = "AE";
        System.out.print(LCS(a, b)); // prints 0
        System.out.println("  " + lcs); // prints ''

        a = "abc";
        b = "abc";
        System.out.print(LCS(a, b)); // prints 3
        System.out.println("  " + lcs); // prints 'abc'

        a = "abc";
        b = "ABC";
        System.out.print(LCS(a, b)); // prints 0
        System.out.println("  " + lcs); // prints ''

        a = "123";
        b = "12345";
        System.out.print(LCS(a, b)); // prints 3
        System.out.println("  " + lcs); // prints '123'

        a = ";/%-";
        b = ";%";
        System.out.print(LCS(a, b)); // prints 2
        System.out.println("  " + lcs); // ';%'
    }
}