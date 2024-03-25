package ies.thiar;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class MillasKmControlador {

    @FXML
    private Label etiquetaKilometros;

    @FXML
    private TextField cantidadMillas;

    private static final double MILLAS_A_KM=1.60934;
    @FXML
    private void CalcularMillas(){
        etiquetaKilometros.setText("Kilometros: "+Integer.parseInt(cantidadMillas.getText())* MILLAS_A_KM);
    }
}
