package a_recursion;
import java.util.Scanner;
public class A_Recursion_Basic {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        recursiveFunction1(1,N);

        recursiveFunction2(1,N);

        recursiveFunction3(1,N);

        recursiveFunction4(N,N);

        recursiveFunction5(N,N);
        System.out.println();
        System.out.println("***************************************");

        recursiveFunction6(1,N);
    }

    /* --> print the "hello world" N times using recursion */
    public static void recursiveFunction1(int i,int N){
        if(i >N){
            System.out.println("***************************************");
            return;
        }
        System.out.println("hello world");

        recursiveFunction1(i+1,N);

    }

    /* --> print the 1 to N numbers linearly using recursion */
    public static void recursiveFunction2(int i,int N){
        if(i >N){
            System.out.println();
            System.out.println("***************************************");
            return;
        }
        System.out.print(i+" ");

        recursiveFunction2(i+1,N);
    }

    /* --> print the N to 1 numbers linearly using recursion */
    public static void recursiveFunction3(int i,int N){
        if(N<i){
            System.out.println();
            System.out.println("***************************************");
            return;
        }
        System.out.print(N+" ");

        recursiveFunction3(i,N-1);
    }

    /* --> print the N to 1 numbers linearly using recursion */
    public static void recursiveFunction4(int i,int N){
        if(i<1){
            System.out.println();
            System.out.println("***************************************");
            return;
        }
        System.out.print(i+" ");

        recursiveFunction4(i-1,N);
    }

    /* --> print the 1 to N numbers linearly using BackTrcaking  i.e dont use (i-1,N)     */
    public static void recursiveFunction5(int i,int N){
        if(i<1){

            return;
        }
        recursiveFunction5(i-1,N);
        System.out.print(i+" ");


    }

    /* --> print the N to 1 numbers linearly using BackTrcaking  i.e dont use (i-1,N)      */
    public static void recursiveFunction6(int i,int N){
        if(i>N){

            return;
        }
        recursiveFunction6(i+1,N);
        System.out.print(i+" ");


    }
}
