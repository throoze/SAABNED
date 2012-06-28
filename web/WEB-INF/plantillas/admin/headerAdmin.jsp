<%-- 
    Document   : headerAdmin
    Created on : 03/06/2012, 09:17:44 AM
    Author     : JJ Ramirez Codallo
--%>
<%@ taglib uri="http://struts.apache.org/tags-tiles" prefix="tiles" %>
<%@ taglib uri="http://struts.apache.org/tags-html" prefix="html" %>
<%@ taglib uri="http://struts.apache.org/tags-bean" prefix="bean" %>
<%@ taglib uri="http://struts.apache.org/tags-logic" prefix="logic" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>

<h1>
    <img src="imagenes/logo.png" alt="logo" width="120" height="80">
    <label id="name-uni">Universidad Simon Bolivar</label>
    <label id="name-sist">Sistema Automatizado de Administracion de Beneficio de Nutricion para Estudiantes Deportistas (SAABNED)</label>
</h1>

<div>
    <ul id="botonera">
      <li id="principal"><a href="#">Opciones</a>
         <ul>
             <li><html:link action="/regresarPerAdmin.do">Ir al Perfil</html:link></li>
             <li><html:link action="/formulModifAdmin.do">Modificar Perfil</html:link></li>
             <li><html:link action="/cerrarSesion.do">Cerrar Sesion</html:link></li>
         </ul>
     </li>
    </ul>
</div>
