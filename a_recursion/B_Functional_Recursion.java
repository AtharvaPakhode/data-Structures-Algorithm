package a_recursion;

import java.util.Arrays;
import java.util.Scanner;

public class B_Functional_Recursion {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N  = sc.nextInt();

        int []arr = {2,3,4,5,6};

        String s = "MADAM";

        System.out.println(recursivefun1(N));
        System.out.println("*****************");

        System.out.println(recursivefun2(N));
        System.out.println("*****************");

        int[]ans =recursivefun3(0,arr.length-1,arr);
        System.out.println(Arrays.toString(ans));
        System.out.println("*****************");

        System.out.println(recursivefun4(s,0));
    }

    /*  sum of 1 to  N numbers using recursion */
    public static int recursivefun1(int  N){

        if(N==0){
            return 0;
        }
        else{
            return N + recursivefun1(N-1);
        }

    }

    /* sum of number using recursion */

    public static int recursivefun2(int  N){

        if(N==1){
            return 1;
        }
        else{
            return N * recursivefun2(N-1);
        }

    }

    /* reverse an array using recursion */

    public static int[] recursivefun3(int s,int e,int[]arr){
        if(s>=e){
            return arr;
        }
        else{
            swap(s,e,arr);
            recursivefun3(s+1,e-1,arr);
        }
        return arr;
    }
    public static void swap(int s,int e,int []arr){
        int temp = arr[s];
        arr[s]=arr[e];
        arr[e]=temp;
    }


    /* check String is palindrome or not using recursion */

    public static boolean recursivefun4(String s,int i){
        int M =s.length();
        if(i>=M/2){
            return true;
        }
        else{
            if(s.charAt(i) != s.charAt(M-1-i)){
                return false;
            }
        }
        return recursivefun4(s,i+1);
    }
}
