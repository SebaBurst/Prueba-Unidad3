/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectoprueba3;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.MenuButton;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

/**
 *
 * @author sebar
 */
public class FXMLDocumentController implements Initializable {
    
    @FXML
    private Label label;
    @FXML
    private TextField FieldNumero;
    @FXML
    private TextField FieldCompania;
    @FXML
    private MenuButton SeleccionarCompania;
    @FXML
    private TextField FieldMensaje;
    @FXML
    private Button BotonEnviar;
    @FXML
    private Label LabelHora;
    @FXML
    private TextField FieldCaptcha;
    @FXML
    private Button BotonValidar;
    @FXML
    private Button BotonHistorial;
    @FXML
    private TextArea AreaTextoRecibido;
    @FXML
    private TextField FieldResponder;
    @FXML
    private Button BotonResponder;
    @FXML
    private TextField FieldFecha;
    @FXML
    private TextField FieldHora;
    
    private void handleButtonAction(ActionEvent event) {
        System.out.println("You clicked me!");
        label.setText("Hello World!");
    }
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
}
