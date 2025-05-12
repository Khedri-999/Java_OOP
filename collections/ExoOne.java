package collections;

import java.util.Arrays;
import java.util.Random;

public class ExoOne {
    public static void main(String[] args) {
        int[] arr = new int[10];
        Random rnd = new Random();
        for(int i=0; i < arr.length; i++){
            arr[i] = rnd.nextInt(1,100);
        }
        System.out.println("");

        
        System.out.println("print array");
        listIt(arr);

        int[] newArr = new int[10];
        System.arraycopy(arr, 0, newArr, 0, 10);
        System.out.println("new copy array");
        listIt(newArr);


        Arrays.sort(arr);
        System.out.println("sorted array");
        listIt(arr);

        search(45, arr);
    }

    public static void listIt(int[] arr) {
        for(int i=0; i < arr.length; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println("");
    }

    public static void search(int val, int[] arr) {
        int index = Arrays.binarySearch(arr, val);
        if (index >= 0) {
            System.out.println(index);
        }else{
            System.out.println("value " + val + " not fond");
        }
    }
}
