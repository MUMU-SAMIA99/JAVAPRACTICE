//Write a program that will give following output:
//12345
//2345
// 345
//45
//5
public class OutputPattern {
    public static void main(String[] args) {
        int i = 0,j;
        for (; i<=5; i++){
            for( j=i;j<=5;j++){
                System.out.print(i);
            }
            System.out.println();
        }
    }
}
