/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package net.daw.operaciones;

/**
 *
 * @author Javier Bonet
 */

import com.google.gson.Gson;
import java.util.ArrayList;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import net.daw.dao.ActividadofflineDao;
import net.daw.helper.Conexion;






public class ActividadofflineGetcolumns implements GenericOperation{
    
    @Override
    public String execute(HttpServletRequest request, HttpServletResponse response) throws Exception {
        ArrayList<String> alColumns = null;
        try {
            ActividadofflineDao oActividadofflineDAO = new ActividadofflineDao(Conexion.getConection());
            alColumns = oActividadofflineDAO.getColumnsNames();
            String data = new Gson().toJson(alColumns);
            data = "{\"data\":" + data + "}";
            return data;
        } catch (Exception e) {
            throw new ServletException("ActividadofflineGetcolumnsJson: View Error: " + e.getMessage());
        }
    }

    
    
    
}
