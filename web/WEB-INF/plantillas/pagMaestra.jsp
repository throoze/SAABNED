<%-- 
    Document   : pagMaestra
    Created on : 03/06/2012, 09:05:45 AM
    Author     : JJ Ramirez Codallo
--%>

<%@ taglib uri="http://struts.apache.org/tags-tiles" prefix="tiles" %>
<%@ taglib uri="http://struts.apache.org/tags-html" prefix="html" %>
<%@ taglib uri="http://struts.apache.org/tags-bean" prefix="bean" %>
<%@ taglib uri="http://struts.apache.org/tags-logic" prefix="logic" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>SAABNED</title>
        <link rel="stylesheet" media="screen" type="text/css" href="css/estiloplantila.css" />
    </head>
    <body>
        <header>
            <tiles:insert attribute="header"/>
        </header>
        <div class="menu">
            <tiles:insert attribute="menu"/>
        </div>
        <div id="cuerpo">
            <tiles:insert attribute="cuerpo"/>
        </div>
        <footer>
            <tiles:insert attribute="footer"/>
        </footer>
    </body>
</html>
