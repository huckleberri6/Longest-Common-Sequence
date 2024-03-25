import java.util.*;

public class LongestCommonSequence {

    public LongestCommonSequence() {
    }

    public int LCS(String a, String b) {
        int count = 0;

        for (int i = 0; i < a.length(); i++) {
            if (b.contains(a.substring(i, i + 1)))
                count++;
        }

        return count;
    }

    public int main() {
        String a = "abc";
        String b = "ac";
        System.out.println(LCS(a, b));
        return LCS(a, b);
    }
}