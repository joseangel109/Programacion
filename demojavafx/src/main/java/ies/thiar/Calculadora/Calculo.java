package ies.thiar.Calculadora;

import java.io.IOException;

import javafx.fxml.FXML;
import javafx.scene.control.TextField;

public class Calculo {

    @FXML
    private TextField entrada;

    @FXML
    private void esUno() throws IOException{
        entrada.setText(entrada.getText() + "1"); 
    }

    @FXML
    private void esDos() throws IOException{
        entrada.setText(entrada.getText() + "2"); 
    }

    @FXML
    private void esTres() throws IOException{
        entrada.setText(entrada.getText() + "3"); 
    }

    @FXML
    private void esCuatro() throws IOException{
        entrada.setText(entrada.getText() + "4"); 
    }

    @FXML
    private void esCinco() throws IOException{
        entrada.setText(entrada.getText() + "5"); 
    }

    @FXML
    private void esSeis() throws IOException{
        entrada.setText(entrada.getText() + "6"); 
    }

    @FXML
    private void esSiete() throws IOException{
        entrada.setText(entrada.getText() + "7"); 
    }

    @FXML
    private void esOcho() throws IOException{
        entrada.setText(entrada.getText() + "8"); 
    }

    @FXML
    private void esNueve() throws IOException{
        entrada.setText(entrada.getText() + "9"); 
    }
    
    @FXML
    private void esCero() throws IOException{
        entrada.setText(entrada.getText() + "0"); 
    }
}
