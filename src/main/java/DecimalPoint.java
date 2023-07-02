//3. Suppose a=15.5276. print the value upto 2 decimal point. Output: a=15.52

public class DecimalPoint {
    public static void main(String[] args) {
        double a = 15.5276;
        double n = Math.round(a*100)/100.0;
        System.out.println(n);
    }
}
