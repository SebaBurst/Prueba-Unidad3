/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectoprueba3;

import java.text.ParseException;
import java.text.SimpleDateFormat;

/**
 *
 * @author Daniel-PC
 */
public class Validaciones {
    
    public static boolean validarFecha(String fecha){
        try {
            SimpleDateFormat formatoFecha = new SimpleDateFormat("dd/MM/yyyy");
            formatoFecha.setLenient(false);
            formatoFecha.parse(fecha);
        } catch (ParseException e) {
            return false;
        }
        return true;
    }
    
    public static boolean validarNumero(String numero, boolean validar){
        if(!numero.startsWith("9")){
            System.out.println("El numero ingresado es incorrecto.");
            return validar;
        }else if(numero.length()!=9){
            System.out.println("El numero ingresado es incorrecto.");
        }else{
            validar = true;
            return validar;
        }
        return validar;
    }
}
