<%-- 
    Document   : cuerpoAdmin
    Created on : 03/06/2012, 09:49:24 AM
    Author     : JJ Ramirez Codallo
--%>
<%@ taglib uri="http://struts.apache.org/tags-tiles" prefix="tiles" %>
<%@ taglib uri="http://struts.apache.org/tags-html" prefix="html" %>
<%@ taglib uri="http://struts.apache.org/tags-bean" prefix="bean" %>
<%@ taglib uri="http://struts.apache.org/tags-logic" prefix="logic" %>

<%@ page language="java" %>
<%@ page import = "Clases.*"%> 
<%@ page import= "java.util.Date"%>
<%@ page import= "java.text.SimpleDateFormat"%>
<!DOCTYPE html>
<%
    Director usr= (Director) request.getSession().getAttribute("_usuario");
    String cadenaFecha = new SimpleDateFormat("dd/MM/yyyy").format(new Date());
%>



<div id="cuerpoPerfilAdmin">
    <div id="fechaPer"> 
        <label>Fecha: <%=cadenaFecha%></label> 
    </div>
    <div>
        <label class="dato" id="perfil">Perfil de Usuario de <%= usr.getIdusuario().toUpperCase()%><label>                                   
    </div>
    <table id="tablaPerfil">
    <tr>
        <td>
            <label>Nombre:</label>
            <label class="dato"><%= usr.getNombre()%></label>
        </td>
        <td><label>Apellido:</label>
        <label class="dato"><%= usr.getApellido()%></label></td>
        
    </tr>
    <tr>
        <td><label>Ci:</label>
        <label class="dato"><%= usr.getCi()%></label></td>
        <td><label>Genero:</label>
        <label class="dato"><%= usr.getSexo()%></label></td>
        
    </tr><tr>
        <td><label>Correo:</label>
        <label class="dato"><%= usr.getCorreo()%></label></td>
        <td><label>Fecha de nac.:</label>
        <label class="dato"><%= usr.getFechaNac()%></label></td>
        
    </tr><tr>
        <td><label>Telefono:</label>
        <label class="dato"><%= usr.getTlf()%></label></td>
        <td><label>Direccion:</label>
        <label class="dato"><%= usr.getDireccion()%></label></td>
        
    </tr>
</table>

</div>



