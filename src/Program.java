import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.Pane;
import javafx.scene.text.Font;
import javafx.stage.Stage;



public class Program extends Application {

    String name;

    @Override
    public void start(Stage stage){


        TextField txt = new TextField();
        txt.setLayoutY(40);
        txt.setPrefSize(431, 20);

        Label label = new Label("Name");
        label.setLayoutY(10);
        label.setLayoutX(150);

        Button button1 = new Button("Копировать");
        button1.setLayoutY(80);
        button1.setPrefSize(100,50);
        button1.setFont(new Font(15));

        button1.setOnAction(event ->
                name = txt.getText()
        );

        Button button2 = new Button("Вырезать");
        button2.setLayoutY(80);
        button2.setLayoutX(105);
        button2.setPrefSize(100,50);

        button2.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {

                name = txt.getText();
                txt.clear();

            }
        });

        Button button3 = new Button("Вставить");
        button3.setLayoutY(80);
        button3.setLayoutX(210);
        button3.setPrefSize(100,50);

        button3.setOnAction(event ->
                txt.appendText(name)
        );

        Button button4 = new Button("Очистить");
        button4.setLayoutY(80);
        button4.setLayoutX(315);
        button4.setPrefSize(100,50);

        button4.setOnAction(event ->
                txt.clear()
        );

        Pane pane = new Pane();

        Scene scene = new Scene(pane);

        pane.getChildren().addAll(button1, label, txt, button2, button3, button4);

        stage.setScene(scene);
        stage.setTitle("Окно");
        stage.setHeight(180);
        stage.setWidth(431);
        stage.show();



    }

    public static void main(String[] args) {
        Application.launch(args);
    }
}
