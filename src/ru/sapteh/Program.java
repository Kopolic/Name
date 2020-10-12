package ru.sapteh;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class Program {
    public static void main(String[] args) {

        Dog dog = new Dog("Ball",6,20, "Sharik");
        Cat cat = new Cat("Black", 2, 17,"Barsik");
        Bird bird = new Bird("Feathery", 4, 8, "Kesha");
//        System.out.println("\n" + bird.toString() + "\n" + "\n" + dog.toString() + "\n" + "\n" + cat.toString());


        try{
            FileOutputStream file = new FileOutputStream("Person.bin");

            ObjectOutputStream oos = new ObjectOutputStream(file);

            oos.writeObject(dog);


        }catch (IOException e){
            e.getStackTrace();
        }
    }
}
