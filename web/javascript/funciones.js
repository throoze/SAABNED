/* 
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

// Funciones de JQuery...

// Funciones para validar formularios

$(document).ready(function () {
    var correoreg = /^[a-zA-Z0-9_\.\-]+@[a-zA-Z0-9\-]+\.[a-zA-Z0-9\-\.]+$/;
    var tlfreg = /[0-9]{4,4}\-[0-9]{7,7}/;
    var cireg = /(V-|E-)[0-9]{6,8}/
    
    $(".boton").click(function (){
        $(".error").remove();
        if( $(".nombre").val() == "" ){
            $(".nombre").focus().after("<span class='errorNombre'>Ingrese su nombre</span>");
            return false;
        }else if( $(".apellido").val() == "" ){
            $(".apellido").focus().after("<span class='errorApellido'>Ingrese su apellido</span>");
            return false;
        }else if( $(".ci").val() == "" || !cireg.test($(".ci").val()) ){
            $(".ci").focus().after("<span class='errorCi'>Ingrese una cedula correcta</span>");
            return false;
        }else if( $(".sexo").val() != "masculino" &&  $(".sexo").val() != "femenino"){
            $(".sexo").focus().after("<span class='errorSexo'>Ingrese su genero</span>");
            return false;
        }else if( $(".tlf").val() == "" || !tlfreg.test($(".tlf").val()) ){
            $(".tlf").focus().after("<span class='errorTlf'>Ingrese un telefono correcto</span>");
            return false;
        }else if( $(".correo").val() == "" || !correoreg.test($(".correo").val()) ){
            $(".correo").focus().after("<span class='errorCorreo'>Ingrese un correo correcto</span>");
            return false;
        }else if( $(".direccion").val() == ""){
            $(".direccion").focus().after("<span class='errorDireccion'>Ingrese una direccion</span>");
            return false;
        }else if( $(".clave").val() == "" ){
            $(".clave").focus().after("<span class='errorClave'>Ingrese su clave actual</span>");
            return false;
        }else if( $(".clave").val() != $(".clave2").val()){
            $(".clave").focus().after("<span class='errorClave'>La clave introducida es incorrecta</span>");
            return false;
        }
    });
    $(".nombre" ).keyup(function(){
        if( $(this).val() != "" ){
            $(".errorNombre").fadeOut();
            return false;
        }
    });
    $(".apellido" ).keyup(function(){
        if( $(this).val() != "" ){
            $(".errorApellido").fadeOut();
            return false;
        }
    });
    $(".direccion" ).keyup(function(){
        if( $(this).val() != "" ){
            $(".errorDireccion").fadeOut();
            return false;
        }
    });
    $(".clave" ).keyup(function(){
        if( $(this).val() != "" ){
            $(".errorClave").fadeOut();
            return false;
        }
    });
    $(".correo").keyup(function(){
        if( $(this).val() != "" || correoreg.test($(this).val())){
            $(".errorCorreo").fadeOut();
            return false;
        }
    });
    $(".ci").keyup(function(){
        if( $(this).val() != "" || cireg.test($(this).val())){
            $(".errorCi").fadeOut();
            return false;
        }
    });
    $(".tlf").keyup(function(){
        if( $(this).val() != "" || tlfreg.test($(this).val())){
            $(".errorTlf").fadeOut();
            return false;
        }
    });
    $(".sexo").keyup(function(){
        if( $(this).val() == "masculino" || $(this).val() == "femenino" ){
            $(".errorSexo").fadeOut();
            return false;
        }
    });
});

// Funciones del calendario.

// <![CDATA[
$(document).ready(function(){ $('#date2').datepicker(); });
// ]]>

// <![CDATA[
$(document).ready(function(){ $('#date1').datepicker(); });
// ]]>

jQuery(function($){
    $.datepicker.regional['es'] = {
        closeText: 'Cerrar',
        prevText: '&#x3c;Ant',
        nextText: 'Sig&#x3e;',
        currentText: 'Hoy',
        monthNames: ['Enero','Febrero','Marzo','Abril','Mayo','Junio',
        'Julio','Agosto','Septiembre','Octubre','Noviembre','Diciembre'],
        monthNamesShort: ['Ene','Feb','Mar','Abr','May','Jun',
        'Jul','Ago','Sep','Oct','Nov','Dic'],
        dayNames: ['Domingo','Lunes','Martes','Mi&eacute;rcoles','Jueves','Viernes','S&aacute;bado'],
        dayNamesShort: ['Dom','Lun','Mar','Mi&eacute;','Juv','Vie','S&aacute;b'],
        dayNamesMin: ['Do','Lu','Ma','Mi','Ju','Vi','S&aacute;'],
        weekHeader: 'Sm',
        dateFormat: 'dd/mm/yy',
        firstDay: 1,
        isRTL: false,
        showMonthAfterYear: false,
        yearSuffix: ''};
    $.datepicker.setDefaults($.datepicker.regional['es']);
});    

