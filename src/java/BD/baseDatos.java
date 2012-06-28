/**
 *
 * @author JJ Ramirez Codallo
 */
package BD;

import Clases.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.LinkedList;
import java.util.Date;
import java.text.SimpleDateFormat;

public class baseDatos{
    
    private static baseDatos instance = null;
    private static Connection conexion;
    private static String driver = "org.postgresql.Driver";
    private static String url = "jdbc:postgresql://localhost:5432/SAABNED";
    private static String user = "root";
    private static String pass = "root";
    private final  String FALLO="fallo";
    private final  String EXITO="exito";
    private final  String DIRECTOR= "director";
    private final  String ENTRENADOR= "entrenador";
    

    /**
     * Constructor clase DataBaseManager.
     */
    private baseDatos() {
        while (!baseDatos.conectar()) {
        }
    }

    /**
     * Obtiene una instancia del objeto DataBaseManager.
     *
     * @return instancia de DataBaseManager.
     */
    static public baseDatos getInstance() {
        if (null == baseDatos.instance) {
            baseDatos.instance = new baseDatos();
        }
        return baseDatos.instance;
    }

    /**
     ****************************************************************
     * CONEXION - DESCONEXION A LA BASE DE DATOS
     * ***************************************************************
     */
    /**
     * Establece la conexi?n a la base de datos.
     *
     * @return booleano indicando si fue exitosa o no la conexi?n.
     */
    private static boolean conectar() {
        try {
            Class.forName(driver);
            conexion = DriverManager.getConnection(url, user, pass);
            return true;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }

    /**
     * Se desconecta de la base de datos
     */
    private void desconectar() {
        try {
            baseDatos.conexion.close();
            conexion = null;
        } catch (Exception e) {
            System.err.println(e.getMessage());
        }
    }
    
    public Object autenticarUsuario(Usuario usr){
        Connection c = baseDatos.conexion;
        try {
            Statement statement = c.createStatement();
            String sql = "SELECT * FROM usuario WHERE idusuario='" + usr.getIdusuario() + "' and clave='" + usr.getClave() + "';";
            ResultSet rs = statement.executeQuery(sql);
            String strFecha;
            Date fecha=null;
            SimpleDateFormat formatoBD = new SimpleDateFormat("yyyy-MM-dd");
            SimpleDateFormat formatoUsr = new SimpleDateFormat("dd/MM/yyyy");
            if (rs.next()) {
                if (rs.getString("tipousuario").equals(DIRECTOR)){
                    Director retorno= new Director();
                    retorno.setIdusuario(rs.getString("idusuario"));
                    retorno.setClave(rs.getString("clave"));
                    retorno.setNombre(rs.getString("nombre"));
                    retorno.setApellido(rs.getString("apellido"));
                    retorno.setCi(rs.getString("ci"));
                    retorno.setSexo(rs.getString("sexo"));
                    
                    // Se cambia el formato de fecha a dd/MM/yyyy
                    strFecha=rs.getString("fechaNac");
                    try {
                        fecha = formatoBD.parse(strFecha);
                        retorno.setFechaNac(formatoUsr.format(fecha));
                    } catch (Exception ex) {
                        ex.printStackTrace();
                    }
                    retorno.setTlf(rs.getString("tlf"));
                    retorno.setDireccion(rs.getString("direccion"));
                    retorno.setCorreo(rs.getString("correo"));
                    retorno.setTipousuario(rs.getString("tipousuario"));
                    sql= "SELECT * FROM director WHERE iddirector='" + usr.getIdusuario() + "';";
                    rs = statement.executeQuery(sql);
                    if (rs.next()){
                        
                        // Se cambia el formato de fecha a dd/MM/yyyy
                        strFecha=rs.getString("fechIngreso");
                        try {
                            fecha = formatoBD.parse(strFecha);
                            retorno.setFechaIngreso(formatoUsr.format(fecha));
                        } catch (Exception ex) {
                            ex.printStackTrace();
                        } 
                        return retorno;
                    }  
                }
                else if (rs.getString("tipousuario").equals(ENTRENADOR)){
                    Entrenador retorno= new Entrenador();
                    retorno.setIdusuario(rs.getString("idusuario"));
                    retorno.setClave(rs.getString("clave"));
                    retorno.setNombre(rs.getString("nombre"));
                    retorno.setApellido(rs.getString("apellido"));
                    retorno.setCi(rs.getString("ci"));
                    retorno.setSexo(rs.getString("sexo"));
                    
                    // Se cambia el formato de fecha a dd/MM/yyyy
                    strFecha=rs.getString("fechaNac");
                    try {
                        fecha = formatoBD.parse(strFecha);
                        retorno.setFechaNac(formatoUsr.format(fecha));
                    } catch (Exception ex) {
                        ex.printStackTrace();
                    }
                    retorno.setTlf(rs.getString("tlf"));
                    retorno.setDireccion(rs.getString("direccion"));
                    retorno.setCorreo(rs.getString("correo"));
                    retorno.setTipousuario(rs.getString("tipousuario"));
                    sql= "SELECT * FROM entrenador WHERE identrenador='" + usr.getIdusuario() + "';";
                    rs = statement.executeQuery(sql);
                    if (rs.next()){
                        
                        // Se cambia el formato de fecha a dd/MM/yyyy
                        strFecha=rs.getString("fechIngreso");
                        try {
                            fecha = formatoBD.parse(strFecha);
                            retorno.setFechaIngreso(formatoUsr.format(fecha)); 
                        } catch (Exception ex) {
                            ex.printStackTrace();
                        }
                        return retorno;
                    }  
                }   
            }
        } catch (Exception e) {
            System.err.println(e.getMessage());
        }
        return null;    
    }
    
    public String modifcarAdmin(Director dir){
        Connection c = baseDatos.conexion;
        try {
            Statement statement = c.createStatement();
            String sql = "UPDATE usuario SET nombre='" + dir.getNombre()+"', apellido='"+
                         dir.getApellido()+"', ci='"+dir.getCi()+"', sexo='"+dir.getSexo()+
                         "', fechanac='"+dir.getFechaNac()+"', tlf='"+dir.getTlf()+
                         "', direccion='"+dir.getDireccion()+"', correo='"+dir.getCorreo()+
                         "' WHERE idusuario='"+dir.getIdusuario()+"';";
            int update = statement.executeUpdate(sql);
            if (update==1){
                sql = "UPDATE director SET fechingreso='" +dir.getFechaIngreso()+
                       "' WHERE iddirector='"+dir.getIdusuario()+"';";
                update = statement.executeUpdate(sql);
                if (update==1){
                    return EXITO;
                }
                else{
                    return FALLO;
                }
            }
            else{
                return FALLO;
            }
        } catch (Exception e) {
            System.err.println(e.getMessage());
        }
        return FALLO; 
    }
    
    public ArrayList<Entrenador> getEntrenadores(){
      Connection c = baseDatos.conexion;
        try {
            Statement statement = c.createStatement();
            String sql = "SELECT * FROM USUARIO, ENTRENADOR WHERE idusuario=identrenador";
            ResultSet rs = statement.executeQuery(sql);
            ArrayList<Entrenador> retorno= new ArrayList();
            while (rs.next()){
                Entrenador aux= new Entrenador();
                aux.setIdusuario(rs.getString("idusuario"));
                aux.setNombre(rs.getString("nombre"));
                aux.setApellido(rs.getString("apellido"));
                aux.setFechaIngreso(rs.getString("fechingreso"));
                aux.setCi(rs.getString("ci"));
                retorno.add(aux);
            }
            return retorno;
        } catch (Exception e) {
            System.err.println(e.getMessage());
            return null;
        }
    }
    
    
}
