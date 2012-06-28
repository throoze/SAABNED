<%-- 
    Document   : modifAdmin
    Created on : 09/06/2012, 10:37:14 AM
    Author     : JJ Ramirez Codallo
--%>
<%@ taglib uri="http://struts.apache.org/tags-tiles" prefix="tiles" %>
<%@ taglib uri="http://struts.apache.org/tags-html" prefix="html" %>
<%@ taglib uri="http://struts.apache.org/tags-bean" prefix="bean" %>
<%@ taglib uri="http://struts.apache.org/tags-logic" prefix="logic" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>

<%@ page language="java" %>
<%@ page import = "Clases.*"%> 
<!DOCTYPE html>

<%
    Director usr= (Director) request.getSession().getAttribute("_usuario");
%> 

<link rel='stylesheet' href='css/jquery-ui-1.8.21.custom.css'>
<script charset="utf-8" type="text/javascript" src="https://ajax.googleapis.com/ajax/libs/jquery/1.7.2/jquery.min.js"></script>
<script charset="utf-8" type="text/javascript" src="https://ajax.googleapis.com/ajax/libs/jqueryui/1.8.18/jquery-ui.min.js"></script>
<script src='javascript/funciones.js'></script>

<div id="cuerpoModperfil">
<html:form action="/modifPerfilAdmin.do" >
    <div class="izq">
        <label>Nombre:</label> 
        <html:text value= "<%= usr.getNombre()%>" property="nombre" styleClass="nombre"/>
    </div>
    <div class="izq">
        <label>Apellido:</label> 
        <html:text value= "<%= usr.getApellido()%>" property="apellido" styleClass="apellido"/>
    </div>
    <div class="izq">
        <label>Ci:</label> 
        <html:text value= "<%= usr.getCi()%>" property="ci" styleClass="ci"/>
    </div>
    <div class="izq">
        <label>Genero:</label> 
        <html:select property="sexo" styleClass="sexo">
            <html:option value="0">Seleccione su genero</html:option>
            <html:option value="masculino">Masculino</html:option>
            <html:option value="femenino">Femenino</html:option>
        </html:select>      
    </div>
    <div class="izq">
        <label>Fecha de nacimiento:</label> 
        <html:text value= "<%= usr.getFechaNac()%>" property="fechaNac" styleId="date2" readonly="readonly" size="12" styleClass="fechanac"/>
    </div>
    <div class="izq"> 
        <label>Fecha de ingreso:</label> 
        <html:text value= "<%= usr.getFechaIngreso()%>" property="fechaIngreso" styleId="date1" readonly="readonly" size="12" styleClass="fechaingreso"/>
    </div>
    <div class="izq">
        <label>Telefono</label> 
        <html:text value= "<%= usr.getTlf()%>" property="tlf" styleClass="tlf"/>
    </div>
    <div class="izq">
        <label>Correo</label> 
        <html:text value= "<%= usr.getCorreo()%>" property="correo" styleClass="correo"/>
    </div>
    <div class="izq">
        <label>Direccion</label> 
        <html:text value= "<%= usr.getDireccion()%>" property="direccion" styleClass="direccion"/>
    </div>
    <div class="izq">
        <label>Contrasena actual</label> 
        <html:password value= "" property="clave" styleClass="clave"/>
    </div>
    <html:hidden property="idusuario" value="<%= usr.getIdusuario()%>"/>
    <html:hidden property= "clave2" value="<%= usr.getClave()%>" styleClass="clave2"/>
    <html:submit value=" Modificar datos " styleClass="boton"></html:submit>
</html:form>
</div>
