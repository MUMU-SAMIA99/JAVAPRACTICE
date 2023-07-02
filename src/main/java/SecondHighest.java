//Find out the second largest element of the given array
  //      numbers=[5,3,9,7,4,1,8]
import java.util.Arrays;

public class SecondHighest {
    public static void main(String[] args) {
        int num[]={5,3,9,7,4,1,8};
        int n= num.length;
        Arrays.sort(num);
        System.out.println("second highest number is"+ num[n-2]);
    }
}
