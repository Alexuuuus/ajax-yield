/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package net.daw.operaciones;

import com.google.gson.Gson;
import java.util.ArrayList;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import net.daw.dao.RepositorioDao;
import net.daw.helper.Conexion;

/**
 *
 * @author al037431
 */
public class RepositorioGetcolumns implements GenericOperation {

    @Override
    public String execute(HttpServletRequest request, HttpServletResponse response) throws Exception {
        ArrayList<String> alColumns = null;
        try {
            RepositorioDao oRepositorioDAO = new RepositorioDao(Conexion.getConection());
            alColumns = oRepositorioDAO.getColumnsNames();
            String data = new Gson().toJson(alColumns);
            data = "{\"data\":" + data + "}";
            return data;
        } catch (Exception e) {
            throw new ServletException("RepositorioGetcolumnsJson: View Error: " + e.getMessage());
        }
    }

}

