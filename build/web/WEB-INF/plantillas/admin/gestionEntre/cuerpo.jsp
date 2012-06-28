<%-- 
    Document   : cuerpo
    Created on : 28/06/2012, 08:41:39 AM
    Author     : JJ Ramirez Codallo
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>

<%@ page language="java" %>
<%@ page import = "Clases.*"%> 
<%@ page import= "java.util.ArrayList"%>
<%@ page import = "BD.*"%> 

<%
    ArrayList<Entrenador> list= baseDatos.getInstance().getEntrenadores();
%> 
<div id="gestionEntre">
    <a class="boton" href="#">Agregar Entrenador</a>
    <%
        out.println("<table>");
        Entrenador entrenador= new Entrenador();
        out.println("<tr>");
        out.println("<td>Cedula</td>");
        out.println("<td>Nombre</td>");
        out.println("<td>Apellido</td>");
        out.println("<td>Fecha ingreso</td>");
            out.println("</tr>");
        for (int i=0; i<list.size();i++){
            entrenador= list.get(i);
            out.println("<tr>");
            out.println("<td>"+entrenador.getCi()+"</td>");
            out.println("<td>"+entrenador.getNombre()+"</td>");
            out.println("<td>"+entrenador.getApellido()+"</td>");
            out.println("<td>"+entrenador.getFechaIngreso()+"</td>");
            
            String action="/dffdf.do?identrenador="+entrenador.getIdusuario();
            out.println("<td><a href='"+action+"'>Modificar</a></td>");
            out.println("<td><a href='#'>Eliminar</a></td>");
            out.println("<td><a href='#'>Desasociar disciplina</a></td>");
            out.println("<td><a href='#'>Asociar disciplina</a></td>");
            
            out.println("</tr>");
        }
        out.println("</table>");
    %>
</div>
