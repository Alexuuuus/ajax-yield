/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package net.daw.operaciones;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import java.util.HashMap;
import java.util.Map;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import net.daw.bean.ComentarioBean;
import net.daw.dao.ComentarioDao;
import net.daw.helper.Conexion;
import net.daw.helper.EncodingUtil;


/**
 *
 * @author al037684
 */
public class ComentarioSave implements GenericOperation {

    @Override
    public String execute(HttpServletRequest request, HttpServletResponse response) throws Exception {

        try {
            ComentarioDao oComentarioDAO = new ComentarioDao(Conexion.getConection());
            ComentarioBean oComentario = new ComentarioBean();            
            Gson gson=  new GsonBuilder().setDateFormat("dd/MM/yyyy").create();
            String jason = request.getParameter("json");
            jason = EncodingUtil.decodeURIComponent(jason);
            oComentario = gson.fromJson(jason, oComentario.getClass());
            Map<String, String> data = new HashMap<>();
            if (oComentario != null) {
                oComentario = oComentarioDAO.set(oComentario);
                data.put("status", "200");
                data.put("message", Integer.toString(oComentario.getId()));
            } else {
                data.put("status", "error");
                data.put("message", "error");
            }
            String resultado = gson.toJson(data);
            return resultado;
        } catch (Exception e) {
            throw new ServletException("ComentarioSaveJson: View Error: " + e.getMessage());
        }
    }
}
