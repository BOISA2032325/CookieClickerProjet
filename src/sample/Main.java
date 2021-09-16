package sample;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;

import java.util.concurrent.atomic.AtomicInteger;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception{

        primaryStage.setTitle("Cookie Clicker");
        Label texte = new Label("Nombre de click : ");
        Label clic = new Label("0");
        Button button = new Button("Button");
        int i = 0;

        //Emplacement des objet

        button.setTranslateY(300);
        button.setTranslateX(450);
        texte.setTranslateX(400);
        texte.setTranslateY(200);
        clic.setTranslateY(200);
        clic.setTranslateX(605);

        //Grosseur des objet

        button.setScaleX(3.15);
        button.setScaleY(3.15);
        texte.setScaleY(3.15);
        texte.setScaleX(3.15);
        clic.setScaleX(3.15);
        clic.setScaleY(3.15);

        //click

        button.setOnMouseClicked((mouseEvent -> {clic.setText(String.valueOf(mouseEvent.getClickCount()));}));




        //Lancement de la fenetre

        Group root = new Group(texte,clic,button);
        primaryStage.setWidth(1000);
        primaryStage.setHeight(700);
        primaryStage.setTitle("Cookie CLicker");
        primaryStage.setScene(new Scene(root));
        primaryStage.show();
    }


    public static void main(String[] args) {
        launch(args);
    }
}
