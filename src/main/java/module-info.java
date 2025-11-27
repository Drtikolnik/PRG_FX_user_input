module com.example.prg_fx_userinput {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.prg_fx_userinput to javafx.fxml;
    exports com.example.prg_fx_userinput;
}