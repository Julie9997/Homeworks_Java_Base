package Homework1;
// Вычислить n-ое треугольного число(сумма чисел от 1 до n), а так же n! (произведение чисел от 1 до n)

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Введите число: ");
        int n = sc.nextInt();

        int sum = 0;
        for(int i = 1; i <= n; i++)
            sum += i;
        System.out.println("Треугольное число: " + sum);

        int factorial = 1;
        for(int i = 1; i <= n; i++)
            factorial *= i;
        System.out.println("Факториал: " + factorial);
    }
}
