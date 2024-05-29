package c_Sorting;

import java.util.Arrays;

public class A_selection_sort {     // select minimum and swap.
    public static void main(String[] args) {
        int arr[]={34,56,67,89,23};

        int N = arr.length;

        int[]ans = selection_sort(arr,N);

        System.out.println(Arrays.toString(ans));
    }
    public static int[] selection_sort(int[]arr, int N){
        for (int i = 0; i <= N-2 ; i++) {
            /*
              this outer for loop goes till second last element because no need to sort last element
             */


            int min = i;
            for (int j = i; j <= N-1 ; j++) {
                /*
                   this for loop find minimum value in range i to last element
                 */
                if(arr[j]<arr[min]){
                    min= j;
                }
            }

           // get the minimum value and swap it with ith index element
            int temp = arr[min];
            arr[min]=arr[i];
            arr[i]=temp;
        }
        return arr;
    }

}
