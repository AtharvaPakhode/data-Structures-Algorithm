package c_Sorting;

import java.util.Arrays;

public class E_quick_sort {
    public static void main(String[] args) {
        int[]arr = {283,65,34,56,67,89};

        int n = arr.length;
        int i =0;
        int j =n-1;

        quick_sort(arr,i,j);
        System.out.println(Arrays.toString(arr));
    }
    public static void quick_sort(int[]arr,int i, int j){

        int pivot = arr[i];



        while(i<j){

            while(arr[i]<=pivot && i<=j){
                i++;
            }
            while(arr[j]>=pivot && j>=i){
                j--;
            }

            int temp = arr[i];
            arr[i]=arr[j];
            arr[j]=temp;
        }
        quick_sort(arr,i,j);



    }

}
