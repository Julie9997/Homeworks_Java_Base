package Homework4;

import java.util.LinkedList;

// Пусть дан LinkedList с несколькими элементами. Реализуйте метод(не void), который вернет “перевернутый” список.

public class Task1 {
    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<>();
        list.add(7);
        list.add(8);
        list.add(4);
        list.add(1);

        System.out.println((reverser(list)).toString());
    }

    public static LinkedList<Integer> reverser(LinkedList<Integer> list) {
        LinkedList<Integer> reversedList = new LinkedList<Integer>();
        for (int i = list.size() - 1; i >= 0; i--) {
            reversedList.add(list.get(i));
        }
        return reversedList;
    }

}
