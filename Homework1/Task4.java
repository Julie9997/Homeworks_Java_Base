package Homework1;
/*
*+Задано уравнение вида q + w = e, q, w, e >= 0. Некоторые цифры могут быть заменены знаком вопроса, например 2? + ?5 = 69 (пользователь).
Требуется восстановить выражение до верного равенства. Предложить хотя бы одно решение или сообщить, что его нет.
*/

import java.util.Scanner;

// в данном решении предполагется, что слагаемые в уравнении обязательно двузначные числа
public class Task4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Введите уравнение, например 2? + ?5 = 69: ");
        String[] expression = sc.nextLine().split(" ");
        String num1 = expression[0];
        String num2 = expression[2];
        int result = Integer.parseInt(expression[4]);
        sc.close();
        
        int count = 0;

        int q = toNumber(num1);
        int mul1 = 1;
        if(q < 10)
            mul1 = 10;
        int w = toNumber(num2);
        int mul2 = 1;
        if(w < 10)
            mul2 = 10;

        for(int i = 0; i < 10; i++){
            for(int j = 0; j < 10; j++){
                if(j == 0 && mul2 == 10){
                    j++;
                    continue;
                }
                if(((q + i * mul1) + (w + j * mul2)) == result){
                    System.out.println((q + i * mul1) + " + " + (w + j * mul2) + " = " + result);
                    count++;
                }
            }
        }

        if(count == 0)
            System.out.println("Решения нет");
        
    }

    public static int toNumber(String num){
        int n;
        if(num.charAt(0) == '?')
            n = Character.getNumericValue(num.charAt(1));
        else
            n = Character.getNumericValue(num.charAt(0)) * 10;
        return n;
    }
}
