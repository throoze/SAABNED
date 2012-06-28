<%-- 
    Document   : menu
    Created on : 03/06/2012, 09:29:01 AM
    Author     : JJ Ramirez Codallo
--%>
<%@ taglib uri="http://struts.apache.org/tags-tiles" prefix="tiles" %>
<%@ taglib uri="http://struts.apache.org/tags-html" prefix="html" %>
<%@ taglib uri="http://struts.apache.org/tags-bean" prefix="bean" %>
<%@ taglib uri="http://struts.apache.org/tags-logic" prefix="logic" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<ul class="nav">
    <li>
        <html:link action="/gestionarEntre.do">Gestionar Entrenadores</html:link>
    </li>
    <li>
        <a href="#">Gestionar Disciplinas</a>
    </li>
    <li>
        <a href="#">Gestionar Solicitudes de Horario</a>
    </li>
</ul>

