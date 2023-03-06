package Homework6;

import java.util.HashSet;
import java.util.Scanner;

// Подумать над структурой класса Ноутбук для магазина техники - выделить поля и методы. Реализовать в java.
// Создать множество ноутбуков.
// Написать метод, который будет запрашивать у пользователя критерий фильтрации и выведет ноутбуки, отвечающие фильтру. Критерии фильтрации можно хранить в Map.

public class Main {
    public static void main(String[] args) {
        HashSet<Laptop> laptops = new HashSet<>();
        Laptop laptop1 = new Laptop("Zenbook", "Asus", 16, 512, "Windows 11", "blue");
        laptops.add(laptop1);
        Laptop laptop2 = new Laptop("Macbook", "Apple", 8, 256, "MacOC", "space grey");
        laptops.add(laptop2);
        Laptop laptop3 = new Laptop("Macbook", "Apple", 16, 512, "MacOC", "space grey");
        laptops.add(laptop3);
        Laptop laptop4 = new Laptop("Vivobook", "Asus", 8, 128, "Linux", "black");
        laptops.add(laptop4);
        Laptop laptop5 = new Laptop("IdeaPad", "Lenovo", 16, 512, "Windows 11", "black");
        laptops.add(laptop5);
        Laptop laptop6 = new Laptop("Sword", "MSI", 16, 512, "MacOC", "grey");
        laptops.add(laptop6);
        
        Scanner sc = new Scanner(System.in, "cp866");

        boolean exit = false;

        System.out.println();
        System.out.println("Добро пожаловать! Приступим к выбору нутбука\n");
        while (!exit) {
            System.out.println("Выберите по какому критерию будем смотреть:\n" + 
                    "1 - ОЗУ\n" +
                    "2 - Объем жесткого диска\n" +
                    "3 - Операционаая система\n" +
                    "4 - Цвет\n" +
                    "5 - Показать все модели\n" +
                    "6 - Выход");
       
            int choice = sc.nextInt();
            switch (choice) {
                case 1:
                    selectRAM(laptops, sc);
                    break;
                case 2:
                    selectROM(laptops, sc);
                    break;
                case 3:
                    selectOS(laptops, sc);
                    break;
                case 4:
                    selectColor(laptops, sc);
                    break;
                case 5:
                    showAll(laptops);
                    break;
                case 6:
                    exit = true;
                    break;
                default:
                    System.out.println("Некорректный выбор");
            }
        }
        sc.close();
    }
    
    public static void selectRAM(HashSet<Laptop> laptops, Scanner sc) {
        HashSet<Integer> ram = new HashSet<>();
        for (Laptop l : laptops) {
            ram.add(l.getRAM());
        }
        System.out.println("Выберите объем памяти:  " + ram + " Гб\n" +
                "Выбор: ");
        int filter = sc.nextInt();
        if (ram.contains(filter)) {
            for (Laptop l : laptops) {
                if (l.getRAM() == filter) {
                    l.getInfo();
                    System.out.println("-------------------------------------");
                }
            }
        } else {
            System.out.println("По вашему запросу ничего не найдено");
        }

    }
    
    public static void selectROM(HashSet<Laptop> laptops, Scanner sc) {
        HashSet<Integer> rom = new HashSet<>();
        for (Laptop l : laptops) {
            rom.add(l.getROM());
        }
        System.out.println("Выберите объем памяти: " + rom + " Гб\n" + "Выбор: ");

        int filter = sc.nextInt();
        if (rom.contains(filter)) {
            for (Laptop l : laptops) {
                if (l.getROM() == filter) {
                    l.getInfo();
                    System.out.println("-------------------------------------\n");
                }
            }
        } else {
            System.out.println("По вашему запросу ничего не найдено");
        }
    }

    public static void selectOS(HashSet<Laptop> laptops, Scanner sc) {
        HashSet<String> osSet = new HashSet<>();
        for (Laptop l : laptops) {
            osSet.add(l.getOS());
        }
        System.out.println("Выберите объем памяти: " + osSet + "\n" + "Выбор: ");

        String filter = sc.next();
        if (osSet.contains(filter)) {
            for (Laptop l : laptops) {
                if (l.getOS().equals(filter)) {
                    l.getInfo();
                    System.out.println("-------------------------------------\n");
                }
            }
        } else {
            System.out.println("По вашему запросу ничего не найдено");
        }
    }
    
    public static void selectColor(HashSet<Laptop> laptops, Scanner sc) {
        HashSet<String> colors = new HashSet<>();
        for (Laptop l : laptops) {
            colors.add(l.getColor());
        }
        System.out.println("Выберите объем памяти: " + colors + "\n" + "Выбор: ");

        String filter = sc.next();
        if (colors.contains(filter)) {
            for (Laptop l : laptops) {
                if (l.getColor().equals(filter)) {
                    l.getInfo();
                    System.out.println("-------------------------------------\n");
                }
            }
        } else {
            System.out.println("По вашему запросу ничего не найдено");
        }
    }


    public static void showAll(HashSet<Laptop> laptops){
        for (Laptop l : laptops) {
            l.getInfo();
            System.out.println("-------------------------------------\n");
        }
    }
}
