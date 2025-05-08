package com.example.temp_converter;

import javafx.fxml.FXML;
import javafx.scene.control.TextField;

public class ConverterController {

    @FXML private TextField celsiusInput;
    @FXML private TextField fahrenheitOutput;

    private CelsiusChangeListener celsiusListener;

    public void initialize() {
        celsiusListener = new CelsiusChangeListener(fahrenheitOutput);
        celsiusInput.textProperty().addListener(celsiusListener);
    }
}