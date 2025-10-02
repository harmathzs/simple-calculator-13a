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
    public boolean isRunningTest = false;

    public double testA = 3.0;
    public double testB = 2.0;
    public char testOperation = '+';

    @FXML public TextField firstTextField;
    @FXML public ChoiceBox<String> operationChoiceBox;
    @FXML public TextField secondTextField;
    @FXML public Label resultLabel;
    @FXML
    private Label welcomeText;

    /*
    @FXML
    protected void onHelloButtonClick() {
        welcomeText.setText("Welcome to JavaFX Application!");
    }

     */

    private void debugger() {
        int i=0;
    }

    public void handleCalculate(ActionEvent actionEvent) {
        String result = "";
        double a = isRunningTest ? testA : Double.parseDouble(firstTextField.getText());
        double b = isRunningTest ? testB : Double.parseDouble(secondTextField.getText());
        String operation = isRunningTest ? ""+testOperation : operationChoiceBox.getValue();
        debugger();
        char operationChar = operation.charAt(0);
        double c = 0.0;
        switch (operationChar) {
            case '+': {
                c = a+b;
                result = "= "+c;
                break;
            }
            case '-': {
                c = a-b;
                result = "= "+c;
                break;
            }
            case '*': {
                c = a*b;
                result = "= "+c;
                break;
            }
            case ':': {
                if (b==0.0) {
                    result = "It's unwise to divide by zero.";
                } else {
                    c = a/b;
                    result = "= "+c;
                }
                break;
            }
        }
        if (!isRunningTest) resultLabel.setText(result);
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
        if (!isRunningTest) operationChoiceBox.setItems(oListOfOperations);
        if (!isRunningTest) operationChoiceBox.setValue("+");
    }
}