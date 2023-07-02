//Count number of words, number of characters without spaces, number of vowels and consonant from the given string:
//  "I live in Bangladesh"
//  Output:
// Number of words: 4
// Number of chars without spaces: 17
//Number of vowels: 7
//Number of consonant: 10
import java.util.Scanner;

public class Count {
    public static void main(String[] args) {
        String s;
        int i, count = 1;
        System.out.println("I live in Bangladesh");
        s = "I live in Bangladesh";
        for (i = 0; i < s.length(); i++) {
            char d,
                    c = s.charAt(i);
            d = s.charAt(i + 1);
            if (c == ' ' && d != ' ') {
                ;
                count++;
            }
            count = 0;
            for (i = 0; i < s.length(); i++) {
                if (s.charAt(i) != ' ')
                    count++;
            }
            System.out.println("Total number of characters in a string: " + count);
            int vCount = 0, cCount = 0;
            s = s.toLowerCase();

            for (i = 0; i < s.length(); i++) {
                if (s.charAt(i) == 'a' || s.charAt(i) == 'e' || s.charAt(i) == 'i' || s.charAt(i) == 'o' || s.charAt(i) == 'u') {
                    vCount++;
                } else if (s.charAt(i) >= 'a' && s.charAt(i) <= 'z') {
                    cCount++;
                }
            }
            System.out.println("Number of vowels: " + vCount);
            System.out.println("Number of consonants: " + cCount);

        }
    }
}
