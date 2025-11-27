package com.example.prg_fx_userinput;

import javafx.fxml.FXML;
import javafx.scene.control.*;

import java.util.Optional;

public class HelloController {
    @FXML
    private TextField textField1;
    @FXML
    private ListView listView1;


    private void handleAlert() {
        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setTitle("System message");
        alert.setHeaderText("Critical error - Empty field");
        alert.setContentText("Error ID: 54147nOd");
        alert.showAndWait();
    }

    @FXML
    protected void handleListViewAdd() {

        if (textField1.getText().equals("")) {
            handleAlert();
        }else{
            listView1.getItems().add(textField1.getText());
            textField1.clear();
        }
    }


    @FXML
    private void handleGetUserInput(){
        TextInputDialog dialog = new TextInputDialog("Výchozí text");
        dialog.setTitle("Zadani textu");
        dialog.setHeaderText("Zadejte text");
        dialog.setContentText("Text:");

        Optional<String> result = dialog.showAndWait();
        if (result.isPresent()){
            String text = result.get();
            if (text.isEmpty()) {
                handleAlert();
            }else{
                System.out.println("Zadáno" + text);
                listView1.getItems().add(text);
            }
        }




    }



}
