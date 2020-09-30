package ru.sapteh;

import java.io.*;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) throws IOException {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите имя: ");
        String name = scanner.nextLine();
        System.out.println("Введите возраст: ");
        int age = scanner.nextInt();
        System.out.println("Введите дату: ");
        int date = scanner.nextInt();

        Person person = new Person(name, age, date);

//        if (personIsEmpty(person).equals("")) {
//            System.out.println("Объект " + person.getClass() + " иницилизирован.");
//            System.out.println(person.toString());
//        }
//        else
            System.out.println(personIsEmpty(person));
    }

    public static String personIsEmpty(Person person) {

        String err = "";
        if (person.getName().isEmpty()) err += "Имя не заполнено\n";
        if (person.getAge() == 0) err += "Возраст не заполнен\n";
        if (person.getDate() == 0) err += "Дата не заполнена";
        if (!err.isEmpty()) return err;
        return "Объект " + person.getClass() + "инициализирован.\n" + person.toString();





//        String nameErr = "";
//        String ageErr = "";
//        String dateErr = "";
//        String err;
//        if (person.getName() + person.getAge() + person.getDate() !=null ){
//            if (person.getName().equals("")) {
//                nameErr = "Имя не введено" + "\n";
//            }
//            if (person.getAge() == 0) {
//                ageErr = "Возраст не введен" + "\n";
//            }
//            if (person.getDate() == 0) {
//                dateErr = "Дата не введена";
//            }
//            err = "" + "\n" + nameErr + ageErr + dateErr;
//            return err;
//        }
//        return "";
    }
}

