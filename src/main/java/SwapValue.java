//2. Suppose, a=10 and b=20. Now swap the value without a temp variable. Output: a=20, b=10
public class SwapValue {
    public static void main(String[] args) {
        int a;
        int b;
        int temp;
        a=10;
        b=20;
        temp=a;
        a=b;
        b=temp;
        System.out.println("a =" + a);
        System.out.println("b =" + b);
    }
}
