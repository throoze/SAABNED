/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;

/**
 *
 * @author JJ Ramirez Codallo
 */
public class Entrenador extends Usuario{ 
    
    private String identrenador;
    private String fechaIngreso;

    public String getFechaIngreso() {
        return fechaIngreso;
    }

    public void setFechaIngreso(String fechaIngreso) {
        this.fechaIngreso = fechaIngreso;
    }

    public String getIdentrenador() {
        return identrenador;
    }

    public void setIdentrenador(String identrenador) {
        this.identrenador = identrenador;
    }
  
}