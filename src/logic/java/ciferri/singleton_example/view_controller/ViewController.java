package ciferri.singleton_example.view_controller;

import ciferri.singleton_example.signleton.SingletonClass;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

import java.util.Objects;

public class ViewController {
    @FXML
    private Label lblToken;

    @FXML
    private TextField tfInput;

    @FXML
    private void generatePersonalToken(){
        if(!Objects.equals(tfInput.getText(), "")){
            SingletonClass singleton = SingletonClass.getSingletonInstance();
            String token = singleton.getMyToken(tfInput.getText());
            lblToken.setText(token);
        }
    }
}