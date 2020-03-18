/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectoprueba3;

import java.net.URL;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.ResourceBundle;
import java.util.Timer;
import java.util.TimerTask;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
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
    private Button BotonvalidarFecha;
    @FXML
    private TextField FieldFecha;
    @FXML
    private TextField FieldHora;

    @FXML
    private TextField FielNombre;
    
    @FXML
    private Label fechaActual;
    @FXML
    private Label horaActual;

    @FXML
    private void enviarMensaje(ActionEvent event) {
        boolean valido = true;
        String numero = FieldNumero.getText();
        String nombre = FielNombre.getText();
        boolean valido2 = Validaciones.validarNumero(numero, false);
        System.out.println("");
        if (valido2 == false) {
            Alert alert = new Alert(Alert.AlertType.INFORMATION);
            alert.setTitle("Informacion");
            alert.setHeaderText(null);
            alert.setContentText("Numero mal");
            alert.showAndWait();

        } else {
            boolean validonumero = Validaciones.validarNombre(nombre, false);
            if (validonumero == false) {
                Alert alert = new Alert(Alert.AlertType.INFORMATION);
                alert.setTitle("Informacion");
                alert.setHeaderText(null);
                alert.setContentText("Nombre mal");
                alert.showAndWait();
            }
            else{
                String mensaje = FieldMensaje.getText();
                boolean validarMensaje = Validaciones.validarMensaje(mensaje, false);
                if(validarMensaje){
                    ProyectoPrueba3.mensajes.add(AreaTextoRecibido.getText());
                    Alert alert = new Alert(Alert.AlertType.INFORMATION);
                    alert.setTitle("Informacion");
                    alert.setHeaderText(null);
                    alert.setContentText("Mensaje enviado con exito.");
                    alert.showAndWait();
                    
                }
                else{
                    Alert alert = new Alert(Alert.AlertType.INFORMATION);
                    alert.setTitle("Informacion");
                    alert.setHeaderText(null);
                    alert.setContentText("Mensaje Mal");
                    alert.showAndWait();
                }
            }
            

        }
    }

    @FXML
    private void validarFechaHora(ActionEvent event) {
        if (Validaciones.validarFecha(FieldFecha.getText())) {
            Alert alert = new Alert(AlertType.INFORMATION);
            alert.setTitle("Informacion");
            alert.setHeaderText("Fecha validad con exito");
            alert.setContentText(null);

            alert.showAndWait();
        }
    }

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        /*TimerTask timerTask = new TimerTask() {
            @Override
            public void run() {
                fechaActual.setText(LocalDate.now().toString());
                horaActual.setText(LocalTime.now().toString());
            }
        };
        Timer timer = new Timer(true);
        timer.scheduleAtFixedRate(timerTask, 0, 60);*/
    }
        @FXML
    private void verHistorial(){
        ArrayList<String> recibidos = new ArrayList();
        recibidos.add("recibido 1");
        recibidos.add("recibido 2");
        recibidos.add("Recibidos 3");
        recibidos.add("Recibidos 4");
        ArrayList<String> enviado = new ArrayList();
        enviado.add("enviado 1");
        enviado.add("enviado 2");
        enviado.add("enviado 3");
        enviado.add("enviado 4");
        Alert alert = new Alert(AlertType.INFORMATION);
        alert.setTitle("Historial");
        alert.setHeaderText("Mensajes recibidos:\n 1.-"+recibidos.get(0)+"\n 2.-"+recibidos.get(1)+"\n 3.-"+recibidos.get(2)+"\n 4.-"+recibidos.get(3)
        +"\n\nEnviados:\n 1.-"+enviado.get(0)+"\n 2.-"+enviado.get(1)+"\n 3.-"+enviado.get(2)+"\n 4.-"+enviado.get(3));
        alert.setContentText(null);
        alert.showAndWait();
        
    }

}
