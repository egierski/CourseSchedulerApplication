package edu.bsu.nicegierski;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class GUI extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {

        VBox parent = new VBox();
        parent.getChildren().add(new Label("Course Scheduler Application"));

        HBox semesterChoiceArea = new HBox(new Label("Semster"));
        ComboBox<String> semesterComboBox = new ComboBox<>();
        semesterChoiceArea.getChildren().add(semesterComboBox);

        parent.getChildren().add(semesterChoiceArea);

        Scene scene = new Scene(parent);
        primaryStage.setScene(scene);
        primaryStage.show();
    }
}
