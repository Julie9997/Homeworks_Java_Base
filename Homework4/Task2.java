package Homework4;

import java.util.LinkedList;
import java.util.Scanner;

/* 
Реализуйте очередь с помощью LinkedList со следующими методами:
enqueue() - помещает элемент в конец очереди,
dequeue() - возвращает первый элемент из очереди и удаляет его,
first() - возвращает первый элемент из очереди, не удаляя.
*/

public class Task2 {
    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<>();
        Scanner sc = new Scanner(System.in);

        while(true){
            System.out.println("Выберите действие: \n1 - enqueue() - помещает элемент в конец очереди");
            System.out.println("2 - dequeue() - возвращает первый элемент из очереди и удаляет его");
            System.out.println("3 - first() - возвращает первый элемент из очереди, не удаляя.\n4 - выйти\n");
            int choice = sc.nextInt();
            switch(choice){
                case 1:
                    System.out.print("Введите число: ");
                    int n = sc.nextInt();
                    enqueue(list, n);
                    break;
                case 2:
                    dequeue(list);
                    break;
                case 3:
                    first(list);
                    break;
                case 4:
                    sc.close();
                    System.exit(0);
                default:
                    System.out.println("error\n");
            }
            System.out.println(list.toString() + "\n");
        }
    }

    public static void enqueue(LinkedList<Integer> list, int n){
        list.add(n);
    }

    public static void dequeue(LinkedList<Integer> list){
        System.out.println("Первый элемент " + list.remove(0) + "\n");
    }

    private static void first(LinkedList<Integer> list){
        System.out.println("Первый элемент " + list.get(0) + "\n");
    }
}
