package com.example.temp_converter;

import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.scene.control.TextField;

public class CelsiusChangeListener implements ChangeListener<String> {

    private final TextField fahrenheitOutput;
    private boolean enabled = true;

    public CelsiusChangeListener(TextField fahrenheitOutput) {
        this.fahrenheitOutput = fahrenheitOutput;
    }

    public void setEnabled(boolean value) {
        enabled = value;
    }

    @Override
    public void changed(ObservableValue<? extends String> obs, String oldVal, String newVal) {
        if (!enabled) return;

        //You will add conversion logic here later
        try {
            double input = Double.parseDouble(newVal);
            double output = (input - 32)/1.8;

            //System.out.print(output);
            output = ((int)(output*10000))/10000.0;

            fahrenheitOutput.setText(String.valueOf(output));
        }
        catch (NumberFormatException e) {
            fahrenheitOutput.setText("enter valid input");
        }
    }
}
