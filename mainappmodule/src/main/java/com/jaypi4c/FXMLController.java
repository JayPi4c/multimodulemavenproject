package com.jaypi4c;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;

public class FXMLController {
    @FXML
    private Label label;

    @FXML
    private void handleButtonAction(ActionEvent event) {
        System.out.println("You clicked me!");
        String output = MainApp.userDao.findAll().stream().reduce("" ,(message, user) -> message + user.name() + "\n", (m1, m2) -> m1 + m2);
        label.setText(output);
    }

    public void initialize() {
        System.out.println("initialize");
    }
}
