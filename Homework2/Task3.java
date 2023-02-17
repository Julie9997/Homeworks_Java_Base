package Homework2;

import java.util.Scanner;

// Напишите метод, который принимает на вход строку (String) и определяет является ли строка палиндромом (возвращает boolean значение).

public class Task3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in, "cp866");
        String text = sc.nextLine();
        System.out.println(isPalindrom(text));
        sc.close();
    }

    public static boolean isPalindrom(String str){
        str.toLowerCase().replace(" ", "");
        boolean isPal = true;
        for(int i = 0; i < str.length()/2; i++){
            if(str.charAt(i) != str.charAt(str.length() - i - 1))
                isPal = false;
        }
        return isPal;
    }
}
