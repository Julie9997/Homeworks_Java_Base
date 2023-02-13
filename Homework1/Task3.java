package Homework1;

import java.util.Scanner;

// Реализовать простой калькулятор (+ - / *)

public class Task3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Введите первое чсло: ");
        double num1 = sc.nextDouble();
        System.out.print("Выберите действие ( + | - | / | * ): ");
        String operation = sc.next();
        System.out.print("Введите второе чсло: ");
        double num2 = sc.nextDouble();
        sc.close();

        switch(operation){
            case "+":
                System.out.println(num1 + " " + operation + " " + num2 + " = " + (num1 + num2));
                break;
            case "-":
                System.out.println(num1 + " " + operation + " " + num2 + " = " + (num1 - num2));
                break;
            case "*":
                System.out.println(num1 + " " + operation + " " + num2 + " = " + (num1 * num2));
                break;
            case "/":
                System.out.println(num1 + " " + operation + " " + num2 + " = " + (num1 / num2));
                break;
            default:
                System.out.println("Незнакомая операция!");
        }
    }
    
}
