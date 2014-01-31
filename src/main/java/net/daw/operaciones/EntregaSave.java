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
import net.daw.bean.EntregaBean;
import net.daw.dao.EntregaDao;
import net.daw.helper.Conexion;
import net.daw.helper.EncodingUtil;

/**
 *
 * @author al037805
 */
public class EntregaSave implements GenericOperation {
    
    @Override
    public String execute(HttpServletRequest request, HttpServletResponse response) throws Exception {

        try {
            EntregaDao oEntregaDAO = new EntregaDao(Conexion.getConection());
            EntregaBean oEntrega = new EntregaBean();
            Gson gson=  new GsonBuilder().setDateFormat("dd/MM/yyyy").create();
            String jason = request.getParameter("json");
            jason = EncodingUtil.decodeURIComponent(jason);
            oEntrega = gson.fromJson(jason, oEntrega.getClass());
            Map<String, String> data = new HashMap<>();
            if (oEntrega != null) {
                oEntrega = oEntregaDAO.set(oEntrega);
                data.put("status", "200");
                data.put("message", Integer.toString(oEntrega.getId()));
            } else {
                data.put("status", "error");
                data.put("message", "error");
            }
            String resultado = gson.toJson(data);
            return resultado;
        } catch (Exception e) {
            throw new ServletException("EntregaSaveJson: View Error: " + e.getMessage());
        }
    }
    
}
