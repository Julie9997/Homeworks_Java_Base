package Homework1;
// Вывести все простые числа от 1 до 1000

public class Task2 {
    public static void main(String[] args) {
        int n = 1000;
        System.out.print("Простые числа: 1 ");
        for(int i = 3; i < n; i++){
            int count = 0;
            for(int j = 1; j <= i; j++){
                if(i % j == 0)
                    count++;
            }
            if(count == 2)
                System.out.print(i + " ");
        }
    }
}
