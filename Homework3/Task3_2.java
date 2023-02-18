package Homework3;

import java.util.ArrayList;
import java.util.Random;

// Задан целочисленный список ArrayList. Найти минимальное, максимальное и среднее ариф. из этого списка

public class Task3_2 {
    public static void main(String[] args) {
        ArrayList<Integer> nums = fillList();
        System.out.println(nums.toString());
        System.out.println("Минимальное число: " + minSearch(nums));
        System.out.println("Максимальное число: " + maxSearch(nums));
        System.out.println("Среднее ариифметическое: " + avg(nums));
    }

    public static int minSearch(ArrayList<Integer> list){
        int min = list.get(0);
        for(int i = 1; i < list.size(); i++){
            if(list.get(i) < min)
                min = list.get(i);
        }
        return min;
    }

    public static int maxSearch(ArrayList<Integer> list){
        int max = list.get(0);
        for(int i = 1; i < list.size(); i++){
            if(list.get(i) > max)
                max = list.get(i);
        }
        return max;
    }

    public static double avg(ArrayList<Integer> list){
        double sum = 0;
        for(int i = 0; i < list.size(); i++)
            sum += list.get(i);
        return Math.round((sum/list.size()) * 100.0) / 100.0; 
    }

    public static ArrayList<Integer> fillList(){
        ArrayList<Integer> arr = new ArrayList<>();
        Random random = new Random();
        int n = new Random().nextInt(10 - 5) + 5;
        for(int i = 0; i < n; i++)
            arr.add(random.nextInt(16));
        return arr;
    }
}
