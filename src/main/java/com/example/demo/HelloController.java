package com.example.demo;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TextField;

public class HelloController {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private TextField STRC;

    @FXML
    private TextField STRA;

    @FXML
    private TextField STRB;

    @FXML
    void Delenie(ActionEvent event) {
        float n1 = Float.parseFloat(STRA.getText());
        float n2 = Float.parseFloat(STRB.getText());
        float result = n1 / n2;
        STRC.setText(String.valueOf(result));
    }

    @FXML
    void Otnimanie(ActionEvent event) {
        float n1 = Float.parseFloat(STRA.getText());
        float n2 = Float.parseFloat(STRB.getText());
        float result = n1 - n2;
        STRC.setText(String.valueOf(result));
    }

    @FXML
    void Pribavlenie(ActionEvent event) {
        float n1 = Float.parseFloat(STRA.getText());
        float n2 = Float.parseFloat(STRB.getText());
        float result = n1 + n2;
        STRC.setText(String.valueOf(result));
    }

    @FXML
    void Ymnojenie(ActionEvent event) {
        float n1 = Float.parseFloat(STRA.getText());
        float n2 = Float.parseFloat(STRB.getText());
        float result = n1 * n2;
        STRC.setText(String.valueOf(result));
    }
    @FXML
    void EXIT(ActionEvent event) {
System.exit(1);
    }

    @FXML
    void initialize() {
        assert STRC != null : "fx:id=\"STRC\" was not injected: check your FXML file 'hello-view.fxml'.";
        assert STRA != null : "fx:id=\"STRA\" was not injected: check your FXML file 'hello-view.fxml'.";
        assert STRB != null : "fx:id=\"STRB\" was not injected: check your FXML file 'hello-view.fxml'.";

    }
}
