package mirea.it.isb1_1_3.Alexandrov.StudentBook;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static Student NewStudent() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ведите ID нового студента");
        int id = scanner.nextInt();
        System.out.println("Введите успеваемость нового студента");
        double rating = scanner.nextDouble();
        System.out.println("Введите имя нового студента");
        String name = scanner.next();
        return new Student(id, rating, name);
    }

    public static void PrintStudent(Student student) {
        System.out.println("------------------------------------------------------------------------------------------------------------");
        System.out.println("Id студетна " + student.getId() + "   Имя студетна " + student.getName() + "  Успеваемость студетна " + student.getRating());
        System.out.println("------------------------------------------------------------------------------------------------------------");
    }

    public static void ChangeName(Student student) {
        System.out.println("Введите Имя");
        Scanner scanner = new Scanner(System.in);
        String name = scanner.next();
        student.setName(name);
    }

    public static void ChangeRating(Student student) {
        System.out.println("Введите ID");
        Scanner scanner = new Scanner(System.in);
        double rating = scanner.nextDouble();
        student.setRating(rating);
    }

    public static void ChangeId(Student student) {
        System.out.println("Введите ID");
        Scanner scanner = new Scanner(System.in);
        int id = scanner.nextInt();
        student.setId(id);
    }

    public static void main(String[] args) {
        ArrayList<Student> groop1 = new ArrayList<Student>();
        Scanner scanner = new Scanner(System.in);
        int ans = 999;
        while (ans != 0) {
            System.out.println("--------------------------------");
            System.out.println("Меню");
            System.out.println("1-новый студент");
            System.out.println("2-вывести список студентов");
            System.out.println("3-удалить студента из списка");
            System.out.println("0-выход из программы");
            ans = scanner.nextInt();
            switch (ans) {
                case 1:
                    groop1.add(NewStudent());
                    break;
                case 2:
                    for (Student student : groop1) {
                        PrintStudent(student);
                    }
                    break;
                case 3:
                    groop1.remove(NewStudent());
                    break;
                case 0:
                    System.out.println("выход из программы");
                    break;
                default:
                    System.out.println("неверный пункт меню");
                    break;

            }
        }
    }
}
