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
    private Label lblToken2;

    @FXML
    private TextField tfInput;

    @FXML
    private TextField tfInput2;

    @FXML
    private void generatePersonalToken(){
        if(!Objects.equals(tfInput.getText(), "")){
            SingletonClass singleton = SingletonClass.getSingletonInstance();
            String token = singleton.getMyToken(tfInput.getText());
            lblToken.setText(token);
        }
    }

    @FXML
    private void generatePersonalToken2(){
        if(!Objects.equals(tfInput2.getText(), "")){
            SingletonClass singleton2 = SingletonClass.getSingletonInstance();
            String token2 = singleton2.getMyToken(tfInput2.getText());
            lblToken2.setText(token2);
        }
    }
}