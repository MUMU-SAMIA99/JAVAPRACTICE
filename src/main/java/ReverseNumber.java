import java.util.Scanner;

//Take any number as input and print the reverse of the number
//input: 12345

import java.util.Scanner;
public class ReverseNumber {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n,rev=0;
        System.out.println("enter your number:");
        n=sc.nextInt();
        while(n>0){
            rev=(rev*10)+n%10;
            n=n/10;
        }
        System.out.println("reverse number="+rev);
    }
}
