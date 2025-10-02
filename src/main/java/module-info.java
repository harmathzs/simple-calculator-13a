module org.example.simplecalculator13a {
    requires javafx.controls;
    requires javafx.fxml;
    requires junit;


    opens org.example.simplecalculator13a to javafx.fxml;
    exports org.example.simplecalculator13a;
}