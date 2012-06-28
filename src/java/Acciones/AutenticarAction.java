package Acciones;
import BD.baseDatos;
import Clases.Usuario;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;

/**
 *
 * @author JJ Ramirez Codallo
 */
public class AutenticarAction extends org.apache.struts.action.Action{

    private final String FALLO="fallo";
    
    
    @Override
     public ActionForward execute(ActionMapping mapping, ActionForm form,
            HttpServletRequest request, HttpServletResponse response)
            throws Exception {
        
        request.getSession().invalidate();
        Usuario usuario= (Usuario) form;
        Object retorno= baseDatos.getInstance().autenticarUsuario(usuario);
        if (retorno==null){
            return mapping.findForward(FALLO);
        }
        else{
            usuario= (Usuario) retorno;
            request.getSession().setAttribute("_usuario", retorno);
            return mapping.findForward(usuario.getTipousuario());
        }
     }
}
