package a_recursion;

import java.util.Scanner;

public class C_MultipleCalls {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N= sc.nextInt();
        int ans =recursion(N);
        System.out.println(ans);
    }
    public static int recursion(int N){
        if(N<=1){
            return N;        // as 0th and 1st term of fibo series is 0 and 1.
        }
        return recursion(N-1)+recursion(N-2);

       /*   term no --> 0  1  2  3  4  5  6  7
            fibo no --> 0  1  1  2  3  5  8  13
        */
    }
}
