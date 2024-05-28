package b_Hashing;

import java.util.*;

public class Hashing_numbers {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n=sc.nextInt();
        int[] arr = new int[n];
        int max=0;
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
            if(arr[i]>max){
                max=arr[i];
            }
        }

        //precompute:
        int[] hash = new int[max+1];  // defining the array size (max number is array+1)
        for (int i = 0; i < n; i++) {
            hash[arr[i]] += 1;
        }

        int q=sc.nextInt();
        while (q-- != 0) {
            int number;
            number = sc.nextInt();
            // fetching:
            System.out.println(hash[number]);
        }
    }
}
