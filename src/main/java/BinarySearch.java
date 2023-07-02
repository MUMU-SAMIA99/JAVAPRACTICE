//Write a program that will find your key is found in the given array using binary search method
  //      numbers=[1,6,9,3,5,4,7]
    //    key=5
public class BinarySearch {
    public static void main(String[] args) {
        int[] numbers = {1, 6, 9, 3, 5, 4, 7};
        int number = 5;
        boolean found = false;
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] == number) {
                found = true;
                break;
            }
        }
        if (found) {
            System.out.println(number + " is found.");
        } else {
            System.out.println(number + " is not found.");
        }

    }
}
