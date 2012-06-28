/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;

/**
 *
 * @author JJ Ramirez Codallo
 */
public class Director extends Usuario{ 
    
    private String iddirector;
    private String fechaIngreso;

    public String getFechaIngreso() {
        return fechaIngreso;
    }

    public void setFechaIngreso(String fechaIngreso) {
        this.fechaIngreso = fechaIngreso;
    }

    public String getIddirector() {
        return iddirector;
    }

    public void setIddirector(String iddirector) {
        this.iddirector = iddirector;
    }
  
}
