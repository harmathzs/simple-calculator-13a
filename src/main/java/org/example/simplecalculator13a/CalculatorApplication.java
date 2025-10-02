package org.example.simplecalculator13a;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class CalculatorApplication extends Application {
    public static boolean isRunningTest = false;

    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = null;
        if (!isRunningTest) fxmlLoader = new FXMLLoader(CalculatorApplication.class.getResource("calculator-view.fxml"));
        Scene scene = null;
        if (!isRunningTest) scene = new Scene(fxmlLoader.load(), 500, 150);
        if (!isRunningTest) stage.setTitle("Calculator");
        if (!isRunningTest) stage.setScene(scene);
        if (!isRunningTest) stage.show();
    }

    public static void main(String[] args) {
        if (!isRunningTest) launch();
    }
}