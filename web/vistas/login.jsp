<%-- 
    Document   : login
    Created on : 02/06/2012, 08:33:30 PM
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
        <link rel="stylesheet" media="screen" type="text/css" href="css/layout.css" />
        <link rel="stylesheet" media="screen" type="text/css" href="css/spacegallery.css" />
        <link rel="stylesheet" media="screen" type="text/css" href="css/custom.css" />
        <script type="text/javascript" src="javascript/jquery.js"></script>
        <script type="text/javascript" src="javascript/eye.js"></script>
        <script type="text/javascript" src="javascript/utils.js"></script>
        <script type="text/javascript" src="javascript/spacegallery.js"></script>
        <script type="text/javascript" src="javascript/layout.js"></script>
    </head>
    <body>
        <header>
            <h1>
                <img src="imagenes/logo.png" alt="logo" width="120" height="80">
                <label id="name-uni">Universidad Simon Bolivar</label>
                <label id="name-sist">Sistema Automatizado de Administracion de Beneficio de Nutricion para Estudiantes Deportistas (SAABNED)</label>
            </h1>
            
            <html:form action="/autenticar.do" styleId="user" >
                <div>
                    <label>Nombre de usuario:</label> 
                    <html:text property="idusuario"/>
                </div>
                <div>
                    <label>Contrasena:</label> 
                    <html:password property="clave"/>
                </div>
                <a id="boton" href="#">Registrate</a>
                <html:submit value=" Ingresar "></html:submit>
            </html:form> 
        </header>
        <div id="context">
             <div class="wrapper">
                <ul class="navigationTabs">
                    <li><a href="#usb" rel="usb">USB</a></li>
                    <li><a href="#quienessomos" rel="quienessomos">Quienes Somos</a></li>
                    <li><a href="#contactanos" rel="contactanos">Contactanos</a></li>
                </ul>
                <div class="tabsContent">
                    <div class="tab">
                        <div id="myGallery" class="spacegallery">
                            <img src="imagenes/usb1.jpg" alt="" />
                            <img src="imagenes/usb2.jpg" alt="" />
                            <img src="imagenes/usb3.jpg" alt="" />
                            <img src="imagenes/usb4.jpg" alt="" />
                        </div>
                    </div>
                    <div class="tab">
                        <h2>Quienes Somos</h2>
                        <h3>Dirección de Deporte</h3>
                        <p>La Dirección de Deportes es una Unidad de Apoyo Académico, adscrita al Rectorado.  Es la <BR>
                           responsable de promover el deporte y la actividad física de nuestra Comunidad Uesebista, <BR>
                           así como el buen funcionamiento, conservación y mantenimiento de las instalaciones depor-<BR>
                           tivas de la USB. Tiene como objetivo planificar, coordinar, dirigir, evaluar, analizar y <BR>
                           recomendar todas las políticas que en materia deportiva, recreativa y de salud, sean ne- 
                           cesarias para el óptimo funcionamiento de la USB.
                        </p>
                        <h3>Departamento de Nutricion</h3>
                        <p>Educar a los estudiantes de la USB de manera que aprendan a alimentarse correctamente, <BR>
                           conozcan la influencia que tienen los nutrientes en el mantenimiento de un buen estado <BR>
                           de salud, mejoren su calidad de vida y en consecuencia logren el rendimiento académico <BR>
                           y físico deseado para cubrir la misión de la Institución y el país, formando un recurso<BR>
                           humano integral y de alta calidad. 
                        </p>
                   </div>
                   <div class="tab">
                        Aqui va la info de contacto.
                   </div>
                </div>
            </div>                    
        </div>
    </body>
</html>
