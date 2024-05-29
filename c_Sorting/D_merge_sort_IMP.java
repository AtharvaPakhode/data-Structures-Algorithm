package c_Sorting;

import java.util.ArrayList;
import java.util.Arrays;

public class D_merge_sort_IMP {
    /*
       --> Divide the array into two parts till we get single -single element
          E.g   {283,65,34,56,67,89};
          Step 1:  left side arr-->[283,65,34]                      right side array--> [56,67,89]
          Step 2:                  lsr-->[283,65] rsr--> [34]                   lsr--> [56,67]  rsr-->[89]
          Step 3:                  lsr-->[283]    rsr--> [65]                   lsr--> [56]     rsr-->[67]
     */

    public static void main(String[] args) {
        int[]arr = {283,65,34,56,67,89};

        int n = arr.length;
        int low =0;
        int high =n-1;

        merge_sort(arr,low,high);
        System.out.println(Arrays.toString(arr));
    }
    public static void merge_sort(int[]arr,int low,int high){

        if(low>=high){
            return ;
        }
        int mid = low+(high-low)/2;
        merge_sort(arr,low,mid);    // recursion call for left side array
        merge_sort(arr,mid+1,high);  // recursion call for right side array

        merge(arr,low,mid,high); // merging sorted left and right array

    }
    public static void merge(int[]arr ,int low,int mid,int high){
        ArrayList<Integer> list = new ArrayList<>();

        /*
               [34   , 65,   283]      [56   , 67,   89]
               low           mid       mid+1         high
               ^                       ^
         */

        int left =low;
        int right = mid+1;

        while(left<=mid && right<=high){
            if(arr[left]<arr[right]){
                list.add(arr[left]);
                left++;
            }
            else{
                list.add(arr[right]);
                right++;
            }
        }
        while(left<=mid){
            list.add(arr[left]);
            left++;
        }
        while(right<=high){
            list.add(arr[right]);
            right++;
        }
        for (int i = low; i <= high; i++) {
            arr[i] = list.get(i - low);
        }

    }
}
