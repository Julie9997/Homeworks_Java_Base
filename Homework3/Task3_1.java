package Homework3;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Random;

// Пусть дан произвольный список целых чисел, удалить из него четные числа

public class Task3_1 {
    public static void main(String[] args) {
        ArrayList<Integer> nums = fillList();
        System.out.println(nums.toString());
        System.out.println(delIterator(nums));

    }

    public static ArrayList<Integer> fillList(){
        ArrayList<Integer> arr = new ArrayList<>();
        Random random = new Random();
        int n = new Random().nextInt(20 - 10) + 10;
        for(int i = 0; i < n; i++)
            arr.add(random.nextInt(100));
        return arr;
    }

    public static ArrayList<Integer> del(ArrayList<Integer> arr){
        for(int i = 0; i < arr.size(); i++){
            if(arr.get(i) % 2 == 0){
                arr.remove(i);
                i--;
            }
        }
        return arr;
    }

    public static ArrayList<Integer> delIterator(ArrayList<Integer> arr){
        Iterator<Integer> it = arr.iterator();
        while(it.hasNext()){
            int num = it.next();
            if(num % 2 == 0)
                it.remove();
        }
        return arr;
    }
}
