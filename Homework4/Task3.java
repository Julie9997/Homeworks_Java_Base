package Homework4;

import java.util.Scanner;
import java.util.Stack;
import java.util.logging.FileHandler;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;


/* 
В калькулятор добавьте возможность отменить последнюю операцию.
Дополнительно каскадная отмена - отмена нескольких операций
*/

public class Task3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in, "cp866");
        Stack<Double> stack = new Stack<>();
        boolean exit = false; 

        System.out.print("Введите число: ");
        double num1 = sc.nextDouble();
        stack.push(num1);

        while(!exit){
            System.out.print("Введите операцию (+ | - | * | / | отмена): ");
            String operation = sc.next();
            double num2 = 1;
            if(!operation.equals("отмена") && !operation.equals("выход")){
                System.out.print("Введите число: ");
                num2 = sc.nextDouble();
            }

            String result = "";
            switch(operation){
                case "+":
                    result = num1 + " " + operation + " " + num2 + " = " + (num1 + num2);
                    num1 = num1 + num2;
                    System.out.println("Ответ:\n" + num1);
                    break;
                case "-":
                    result = num1 + " " + operation + " " + num2 + " = " + (num1 - num2);
                    num1 = num1 - num2;
                    System.out.println("Ответ:\n" + num1);
                    break;
                case "*":
                    result = num1 + " " + operation + " " + num2 + " = " + (num1 * num2);
                    num1 = Math.round((num1*num2) * 100.0) / 100.0;
                    System.out.println("Ответ:\n" + num1);
                    break;
                case "/":
                    result = num1 + " " + operation + " " + num2 + " = " + (((num1/num2) * 100.0) / 100.0);
                    num1 = Math.round((num1/num2) * 100.0) / 100.0;
                    System.out.println("Ответ:\n" + num1);
                    break;
                case "отмена":
                    if(stack.size()==1){
                        System.out.println("Отмена невозможна. Вернулись к исходному значению " + num1);
                    }else{
                        stack.pop();
                        num1 = stack.pop();
                        System.out.println(num1);
                    }
                    result = "Произведена отмена.";
                    break;
                case "выход":
                    Logs("Серия вычислений завершена.");
                    exit = true;
                    break;
                default:
                    result = "ERROR";
                    System.out.println("Незнакомая операция!");
            }
            stack.push(num1);
            Logs(result);
        }

        sc.close();

    }

    public static void Logs(String str){
        Logger logger = Logger.getLogger(Task1.class.getName());
        logger.setUseParentHandlers(false);
        FileHandler fh;
        try{
            fh = new FileHandler("Homework4/calculations_log.txt", true);
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
