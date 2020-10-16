package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.CheckBox;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextField;
import javafx.scene.text.Text;

import java.io.IOException;


public class Controller {

    @FXML
    private TextField fileName;
    @FXML
    private TextField firsName;
    @FXML
    private TextField lastName;
    @FXML
    private TextField patronymic;
    @FXML
    private TextField path;
    @FXML
    private Text success;

    private String course = "";

    private String tag;

    Model model = new Model();

    @FXML
    public void pressCourse(ActionEvent event){
        course += " " + ((CheckBox)event.getSource()).getText();
    }

    @FXML
    public void pressTag (ActionEvent event){
        tag = ((RadioButton)event.getSource()).getText();
    }

    @FXML
    public void pressApplication(ActionEvent event) throws IOException {

        model.createFile(path.getText(),fileName.getText(),firsName.getText(),lastName.getText(),patronymic.getText(),course,tag);
        success.setText("Заявка отправлена!");

    }
}
