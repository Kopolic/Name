package sample;

import javafx.scene.control.RadioButton;
import javafx.scene.control.TextField;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Model {

    public void createFile(String path, String name, String nameMan, String fam,String otch, String course, String tag) throws IOException {

        File file = new File(path + "/" + name + "." + tag);
        FileWriter fileWriter = new FileWriter(file);
        file.createNewFile();

        fileWriter.write( "Уважаемый " + nameMan + " " + fam + " " + otch + "\n" + "Вы были зачислены на такие курсы как: " + course);
        fileWriter.close();

    }
}
