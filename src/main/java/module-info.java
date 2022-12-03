module familytree {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.logging;


    opens familytree to javafx.fxml;
    exports familytree;
}