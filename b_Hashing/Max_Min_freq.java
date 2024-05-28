package b_Hashing;

import java.util.HashMap;
import java.util.Scanner;

public class Max_Min_freq {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[]arr = {10,24,54,24,54,54,10,79,45,45};

        HashMap<Integer,Integer>map = new HashMap<>();

        for(int i=0;i<arr.length;i++){
            int key = arr[i];

            if(map.containsKey(key)){
                map.put(key,map.get(key)+1);
            }
            else{
                map.put(key,1);
            }
        }

        for (int i: map.keySet()) {
            System.out.println( i +" --> "+map.get(i));
        }

        int max=Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for(int i : map.keySet()){
            if(map.get(i)>max){
                max= i;
            }
            else if(map.get(i)<min){
                min =i;
            }
        }
        System.out.println("element with max freq --> "+ max);
        System.out.println("element with max freq --> "+ min);
    }



}
