package org.example.simplecalculator13a;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.ResourceBundle;

public class CalculatorController implements Initializable {
    @FXML public TextField firstTextField;
    @FXML public ChoiceBox<String> operationChoiceBox;
    @FXML public TextField secondTextField;
    @FXML public Label resultLabel;
    @FXML
    private Label welcomeText;

    @FXML
    protected void onHelloButtonClick() {
        welcomeText.setText("Welcome to JavaFX Application!");
    }

    private void debugger() {
        int i=0;
    }

    public void handleCalculate(ActionEvent actionEvent) {
        double a = Double.parseDouble(firstTextField.getText());
        double b = Double.parseDouble(secondTextField.getText());
        String operation = operationChoiceBox.getValue();
        debugger();
    }

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        // init operationChoiceBox
        List<String> operations = new ArrayList<>();
        operations.add("+");
        operations.add("-");
        operations.add("*");
        operations.add(":");
        ObservableList<String> oListOfOperations = FXCollections.observableList(operations);
        operationChoiceBox.setItems(oListOfOperations);
        operationChoiceBox.setValue("+");
    }
}