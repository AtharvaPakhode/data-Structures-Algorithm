package b_Hashing;

import java.util.HashMap;
import java.util.Scanner;

public class Hashing_Maps {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[]arr = {2,5,6,6,3,4,8,8,6,5,4};

        HashMap<Integer,Integer> map = new HashMap<>();

        for (int i = 0; i < arr.length; i++) {


            int key = arr[i];
            if(map.containsKey(key)){
                map.put(key, map.get(arr[i])+1);
            }
            else{
                map.put(key,1);
            }
        }



        int q = sc.nextInt();

        while(q-->0){
            int number = sc.nextInt();
            if(map.containsKey(number)){
                System.out.println(map.get(number));
            }
            else{
                System.out.println("0");
            }
        }

    }
}
