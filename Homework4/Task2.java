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
            System.out.println("Выберите действие: \n1 - enqueue() - помещает элемент в конец очереди \n2 - dequeue() - возвращает первый элемент из очереди и удаляет его\n3 - first() - возвращает первый элемент из очереди, не удаляя.");
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
                default:
                    System.out.println("error");
            }
            System.out.println(list.toString());
        }
    }

    public static void enqueue(LinkedList<Integer> list, int n){
        list.add(n);
    }

    public static void dequeue(LinkedList<Integer> list){
        System.out.println(list.remove(0));
    }

    private static void first(LinkedList<Integer> list){
        System.out.println(list.get(0));
    }
}
