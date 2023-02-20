package Homework2;

import java.util.Arrays;
//import java.util.Scanner;
import java.util.logging.FileHandler;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;


// Реализуйте алгоритм сортировки пузырьком числового массива (введён вами), результат после каждой итерации запишите в лог-файл.

public class Task1 {
    public static void main(String[] args) {
        int[] nums = {4, 5, 3, 7, 1, 9};
        /* 
        Scanner sc = new Scanner(System.in);
        System.out.print("Введите через пробел числа для сортировки: ");
        String strArr[] = sc.nextLine().split(" ");
        
        int nums[] = new int[strArr.length];
        for (int i = 0; i < strArr.length; i++)
            nums[i] = Integer.parseInt(strArr[i]);
        sc.close();
        */
        BubbleSort(nums);
        System.out.print("Отсортированный массив: ");
        for(int i = 0; i < nums.length; i++)
            System.out.print(nums[i] + " ");
        
    }

    public static int[] BubbleSort(int[] arr){
        for(int i = 0; i < arr.length - 1; i++){
            for(int j = 0; j < arr.length - i - 1; j++){
                if(arr[j] > arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
                Logs(arr);
            }
            
        }
        return arr;
    }

    public static void Logs(int[] arr){
        Logger logger = Logger.getLogger(Task1.class.getName());
        logger.setUseParentHandlers(false);
        FileHandler fh;
        try{
            fh = new FileHandler("Homework2/log1.txt", true);
            fh.setEncoding("UTF-8");
            logger.addHandler(fh);
            SimpleFormatter format = new SimpleFormatter();
            fh.setFormatter(format);
            logger.info(Arrays.toString(arr));
            fh.close();
        }
        catch (Exception e){
            System.out.println("Что то пошло не так");
        }
    }

}
