package c_Sorting;

import java.util.Arrays;

public class C_insertion_sort {

    /*
       i=0 to i=n-1
       pick ith index element place it at right place

     */
    public static void main(String[] args) {
        int[]arr = {283,65,34,56,67,89};

        int n = arr.length;

        int[]ans=insertion_sort(arr,n);
        System.out.println(Arrays.toString(ans));
    }
    public static int[] insertion_sort(int[]arr, int n){
        for (int i = 0; i <=n-1; i++) {
            int j=i;
            while(j>0){
                if(arr[j-1]>arr[j]){
                    int temp = arr[j-1];
                    arr[j-1]=arr[j];
                    arr[j]=temp;

                }
                j--;
            }
        }
        return arr;
    }
}
