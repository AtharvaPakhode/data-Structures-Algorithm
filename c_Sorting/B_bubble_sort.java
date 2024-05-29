package c_Sorting;

import java.lang.reflect.Array;
import java.util.Arrays;

public class B_bubble_sort {
    public static void main(String[] args) {
        int[]arr = {23,34,56,67,89};

        int n = arr.length;

        int[]ans=bubble_sort(arr,n);
        System.out.println(Arrays.toString(ans));
    }

    private static int[] bubble_sort(int[] arr, int n) {


        for(int i= n-1;i>=0;i--){
            int swapcount =0;
            for (int j = 0; j <= i-1; j++) {

                if(arr[j]>arr[j+1]){
                    int temp = arr[j+1];
                    arr[j+1]=arr[j];
                    arr[j]=temp;

                    swapcount =1;
                }

            }
            if(swapcount==0){
                break;
            }

        }
        return arr;
    }
}
