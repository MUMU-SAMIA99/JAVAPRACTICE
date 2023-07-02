
//Write a program that will find your key is found in the given array using linear search method
  //      numbers=[1,6,9,3,5,4,7]
    //    key=5
public class LinearSearch {
    public static void main(String[] args) {
        int a[] = {1, 6, 9, 3, 5, 4, 7};
        int key = 5;
        int pos = -1;
        for (int i = 0; i < a.length; i++) {
            if (a[i] == key) {
                pos = i;
                break;
            }
        }

        if(pos == -1){
            System.out.println("search unsuccessful");
        } else {
            System.out.println("key found at " + (pos + 1));

        }
    }
}
