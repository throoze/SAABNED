/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;

import java.io.Serializable;
import org.apache.struts.validator.ValidatorForm;

public class root extends ValidatorForm implements Serializable {

    public String getMensaje() {
        return mensaje;
    }

    public void setMensaje(String mensaje) {
        this.mensaje = mensaje;
    }
    public String mensaje;

    public String mensajeOK;

    public String getMensajeOK() {
        return mensajeOK;
    }

    public void setMensajeOK(String mensajeOK) {
        this.mensajeOK = mensajeOK;
    }


}