//Check if the given string is palindrome or not. Palindrome means after reversing a string, it will be same.
// Input: Civic
// Output: true
//  Input: One
// Output: falseimport java.util.Scanner;

import java.util.Scanner;

public class Palindrom {

        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            String str = sc.next();
            str = str.toLowerCase();
            char ch[]=str.toCharArray();
            String rev="";
            for(int i=ch.length-1;i>=0;i--){
                rev+=ch[i];
            }
            System.out.println(str.equals(rev));
        }
    }




