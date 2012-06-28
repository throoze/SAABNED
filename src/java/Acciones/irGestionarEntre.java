/**
 *
 * @author JJ Ramirez Codallo
 */
package Acciones;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;
/**
 *
 * @author JJ Ramirez Codallo
 */
public class irGestionarEntre extends org.apache.struts.action.Action{

    private final String EXITO="exito";
    
    
    @Override
     public ActionForward execute(ActionMapping mapping, ActionForm form,
            HttpServletRequest request, HttpServletResponse response)
            throws Exception {
        
        return mapping.findForward(EXITO);
        
     }
    
}