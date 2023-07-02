//Write a program that will shuffle (values will randomly change their position) from the given array
 //numbers=[1,2,3,4,5,6,7,8,9,0]
import java.util.Arrays;
import java.util.Random;

public class ShuffleRandomly {
    public static void main(String[] args) {

            int[] array = { 1,2,3,4,5,6,7,8,9,0 };

            Random rand = new Random();

            for (int i = 0; i < array.length; i++) {
                int randomIndexToSwap = rand.nextInt(array.length);
                int temp = array[randomIndexToSwap];
                array[randomIndexToSwap] = array[i];
                array[i] = temp;
            }
            System.out.println(Arrays.toString(array));
        }
}
