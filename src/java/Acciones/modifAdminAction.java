package Acciones;
import BD.baseDatos;
import Clases.*;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;

/**
 *
 * @author JJ Ramirez Codallo
 */
public class modifAdminAction extends org.apache.struts.action.Action{
    
    private final  String EXITO="exito";
    
    @Override
     public ActionForward execute(ActionMapping mapping, ActionForm form,
            HttpServletRequest request, HttpServletResponse response)
            throws Exception {
        
        Director dir= (Director) form;
        String retorno= baseDatos.getInstance().modifcarAdmin(dir);
        if (retorno.equals(EXITO)){
            Director usr= (Director) request.getSession().getAttribute("_usuario");
            usr.setNombre(dir.getNombre());
            usr.setApellido(dir.getApellido());
            usr.setCi(dir.getCi());
            usr.setSexo(dir.getSexo());
            usr.setFechaNac(dir.getFechaNac());
            usr.setTlf(dir.getTlf());
            usr.setDireccion(dir.getDireccion());
            usr.setCorreo(dir.getCorreo());
            usr.setFechaIngreso(dir.getFechaIngreso());
            request.getSession().setAttribute("_usuario", usr);
            return mapping.findForward(EXITO);
        }
        else{
            return mapping.findForward(retorno);
        }
     }
}