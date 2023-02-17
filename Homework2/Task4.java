package Homework2;

import java.util.Scanner;
import java.util.logging.FileHandler;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;

// К калькулятору из предыдущего дз добавить логирование.

public class Task4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Введите первое число: ");
        double num1 = sc.nextDouble();
        System.out.print("Выберите действие ( + | - | / | * ): ");
        String operation = sc.next();
        System.out.print("Введите второе число: ");
        double num2 = sc.nextDouble();
        sc.close();

        String result;
        switch(operation){
            case "+":
                result = num1 + " " + operation + " " + num2 + " = " + (num1 + num2);
                System.out.println(result);
                break;
            case "-":
                result = num1 + " " + operation + " " + num2 + " = " + (num1 - num2);
                System.out.println(result);
                break;
            case "*":
                result = num1 + " " + operation + " " + num2 + " = " + (num1 * num2);
                System.out.println(result);
                break;
            case "/":
                result = num1 + " " + operation + " " + num2 + " = " + (num1 / num2);
                System.out.println(result);
                break;
            default:
                result = "ERROR";
                System.out.println("Незнакомая операция!");
        }
        Logs(result);
    }

    public static void Logs(String str){
        Logger logger = Logger.getLogger(Task1.class.getName());
        logger.setUseParentHandlers(false);
        FileHandler fh;
        try{
            fh = new FileHandler("Homework2/calculations_log.txt", true);
            fh.setEncoding("UTF-8");
            logger.addHandler(fh);
            SimpleFormatter format = new SimpleFormatter();
            fh.setFormatter(format);
            logger.info(str);
            fh.close();
        }
        catch (Exception e){
            System.out.println("Что то пошло не так");
        }
    }
}
