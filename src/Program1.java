import ru.sapteh.Dog;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class Program1 {
    public static void main(String[] args) {

        try {

            FileInputStream file = new FileInputStream("Person.bin");
            ObjectInputStream ois = new ObjectInputStream(file);

            Dog dog = (Dog) ois.readObject();

            System.out.println(dog.toString());

        }catch (IOException e){
            e.getStackTrace();
        }catch (ClassNotFoundException e){
            e.printStackTrace();
        }
    }
}
