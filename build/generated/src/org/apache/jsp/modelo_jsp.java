package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.*;
import ve.usb.dii.lys.taiproject.model.TImpresionbm;

public final class modelo_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.Vector _jspx_dependants;

  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_html_base_nobody;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public Object getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _jspx_tagPool_html_base_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
    _jspx_tagPool_html_base_nobody.release();
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("\n");
      out.write("\n");

String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
 TImpresionbm usuario = (TImpresionbm)session.getAttribute("usuario"); 
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE HTML PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\" \"http://www.w3.org/TR/xhtml1/DTD/xhtml1-strict.dtd\" />\n");
      out.write("<html>\n");
      out.write("  <head>\n");
      out.write("    ");
      if (_jspx_meth_html_base_0(_jspx_page_context))
        return;
      out.write("\n");
      out.write("    \n");
      out.write("    <title>TAI-Online</title>\n");
      out.write("    \n");
      out.write("    <meta http-equiv=\"pragma\" content=\"no-cache\">\n");
      out.write("    <meta http-equiv=\"cache-control\" content=\"no-cache\">\n");
      out.write("    <meta http-equiv=\"expires\" content=\"0\">    \n");
      out.write("    <meta http-equiv=\"keywords\" content=\"keyword1,keyword2,keyword3\">\n");
      out.write("    <meta http-equiv=\"description\" content=\"This is my page\">\n");
      out.write("    <link href=\"Estilos/estilos.css\" rel=\"stylesheet\" type=\"text/css\">\n");
      out.write("    \n");
      out.write("\n");
      out.write("  </head>\n");
      out.write("  \n");
      out.write("  <body>\n");
      out.write("    <table width=\"800\" align=\"center\" cellspacing=\"0\" cellpadding=\"0\">\n");
      out.write("    <tr>\n");
      out.write("        <td height=\"150\" colspan=\"2\"><img src=\"images/header.jpg\"></td>\n");
      out.write("    </tr>\n");
      out.write("    <tr>\n");
      out.write("        <td>");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "/menu/menu.jsp", out, false);
      out.write("</td>\n");
      out.write("    </tr>\n");
      out.write("    \n");
      out.write("    <tr>\n");
      out.write("        <td>\n");
      out.write("            <TABLE cellspacing=\"0\" cellpadding=\"0\">\n");
      out.write("                <tr>\n");
      out.write("                    <td width=\"740\" align=\"center\" class=\"tituloAzul\" colspan=\"5\">Principal</td>\n");
      out.write("                     \n");
      out.write("                   </tr>\n");
      out.write("                   <tr><td height=\"10\"></td></tr>\n");
      out.write("                   <tr>\n");
      out.write("                       <td align=\"justify\" class=\"texto2\">\n");
      out.write("                       <marquee width=\"115\" direction=\"up\" scrollamount=\"2\" scrolldelay=\"100\" vspace=\"1\">\n");
      out.write("                       <strong>Atenci&oacute;n especial de emisi&oacute;n / reposici&oacute;n de TAI en oficina Banco  Mercantil USB\n");
      out.write("                       Sartenejas:</strong> Desde el 28/09/09 hasta el 16/10/09 (semanas  2, 3, y 4 trimestre actual) s&oacute;lo se\n");
      out.write("                       atender&aacute; en horas de la ma&ntilde;ana de  lunes a viernes de 8:30 a.m a 12m. <strong><em>Se entregar&aacute;n\n");
      out.write("                       20 tickets diarios.</em></strong>\n");
      out.write("                       </marquee>\n");
      out.write("                       </td>\n");
      out.write("                       <td width=\"10\"></td>\n");
      out.write("                       <td align=\"justify\" class=\"texto\">\n");
      out.write("                           La Universidad Sim&oacute;n Bol&iacute;var cuenta con un renovado sistema de identificaci&oacute;n basado en la tecnolog&iacute;a de \n");
      out.write("                    Tarjeta Inteligente (Smart Card), que sustituir&aacute; al tradicional carnet universitario. La nueva tarjeta , \n");
      out.write("                    del tama&ntilde;o de una tarjeta bancaria, tiene los elementos usuales de un carnet tales como la imagen aleg&oacute;rica \n");
      out.write("                    de los Jardines de la Universidad, la foto y datos del portador , pero tambi&eacute;n contiene un microprocesador \n");
      out.write("                    (del tipo sin contacto) que guarda los datos importantes del portador en forma segura y que permitir&aacute; en \n");
      out.write("                    el futuro el acceso a una variedad de servicios.<br><br>\n");
      out.write("                    Adicionalmente incluye una banda magn&eacute;tica que hace de \n");
      out.write("                    este instrumento una tarjeta Maestro con todas las caracter&iacute;sticas de una tarjeta de d&eacute;bito Llave Mercantil. \n");
      out.write("                    La nueva Tarjeta Acad&eacute;mica Inteligente ser&aacute; el mecanismo &uacute;nico de identificaci&oacute;n oficial de los miembros de \n");
      out.write("                    la Comunidad universitaria y afines, incluyendo estudiantes, profesores, personal administrativo y trabajadores, \n");
      out.write("                    adem&aacute;s del personal de contratistas y otros que tienen acceso autorizado al campus o servicios universitarios. \n");
      out.write("                    Los servicios que paulatinamente se ir&aacute;n implantando utilizando como instrumento la TAI ser&aacute;n, entre otros:\n");
      out.write("                    <ul>\n");
      out.write("                        <li>Control de acceso a instalaciones y &aacute;reas f&iacute;sicas (comedores, laboratorios, canchas, transporte,\n");
      out.write("                    estacionamientos, etc.).</li>\n");
      out.write("                        <li>Pr&eacute;stamos bibliotecarios.</li>\n");
      out.write("                        <li>Puestos de consulta estilo quiosco para obtener \n");
      out.write("                    informaci&oacute;n de notas e inscripciones.</li>\n");
      out.write("                        <li>Aranceles.</li>\n");
      out.write("                    </ul>\n");
      out.write("                    Adem&aacute;s de lo anteriormente dicho, el Banco Mercantil ofrece incluir en la tarjeta Acad&eacute;mica Inteligente,\n");
      out.write("                    la tecnolog&iacute;a necesaria, que permitir&aacute; en la Universidad, cancelar aranceles y acceder a los servicios \n");
      out.write("                    asociados.\n");
      out.write("                    </td>\n");
      out.write("                    <td width=\"10\"></td>\n");
      out.write("                    <td width=\"30\"></td>\n");
      out.write("                </tr>\n");
      out.write("            </TABLE>\n");
      out.write("        </td>\n");
      out.write("    </tr>\n");
      out.write("    <tr>\n");
      out.write("    <td height=\"75\"><img src=\"images/footer.jpg\"></img></td>\n");
      out.write("      </tr>         \n");
      out.write("    </table> \n");
      out.write("  </body>\n");
      out.write("</html>");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }

  private boolean _jspx_meth_html_base_0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  html:base
    org.apache.struts.taglib.html.BaseTag _jspx_th_html_base_0 = (org.apache.struts.taglib.html.BaseTag) _jspx_tagPool_html_base_nobody.get(org.apache.struts.taglib.html.BaseTag.class);
    _jspx_th_html_base_0.setPageContext(_jspx_page_context);
    _jspx_th_html_base_0.setParent(null);
    int _jspx_eval_html_base_0 = _jspx_th_html_base_0.doStartTag();
    if (_jspx_th_html_base_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_html_base_nobody.reuse(_jspx_th_html_base_0);
      return true;
    }
    _jspx_tagPool_html_base_nobody.reuse(_jspx_th_html_base_0);
    return false;
  }
}
