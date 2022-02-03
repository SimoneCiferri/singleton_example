module ciferri.singleton_example {
    requires javafx.controls;
    requires javafx.fxml;


    opens ciferri.singleton_example to javafx.fxml;
    exports ciferri.singleton_example;
    exports ciferri.singleton_example.view_controller;
    opens ciferri.singleton_example.view_controller to javafx.fxml;
}