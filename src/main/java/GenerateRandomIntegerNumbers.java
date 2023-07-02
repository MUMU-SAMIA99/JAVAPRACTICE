//Generate random 10 integer numbers in an array and print out all the numbers from array and also print
// the max and min number from the array
import java.util.Arrays;
import java.util.Random;

public class GenerateRandomIntegerNumbers {
    public static void main(String[] args) {
        Random random = new Random();

        byte[] randomByteArray = new byte[10];

        random.nextBytes(randomByteArray);

        System.out.println(Arrays.toString(randomByteArray));

    }
}
