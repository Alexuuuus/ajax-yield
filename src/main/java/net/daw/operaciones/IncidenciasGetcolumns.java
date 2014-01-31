/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package net.daw.operaciones;

import com.google.gson.Gson;
import java.util.ArrayList;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import net.daw.dao.IncidenciasDao;
import net.daw.helper.Conexion;


/**
 *
 * @author rafa
 */
public class IncidenciasGetcolumns implements GenericOperation {

    @Override
    public String execute(HttpServletRequest request, HttpServletResponse response) throws Exception {
        ArrayList<String> alColumns = null;
        try {
            IncidenciasDao oIncidenciasDAO = new IncidenciasDao(Conexion.getConection());
            alColumns = oIncidenciasDAO.getColumnsNames();
            String data = new Gson().toJson(alColumns);
            data = "{\"data\":" + data + "}";
            return data;
        } catch (Exception e) {
            throw new ServletException("IncidenciasGetcolumnsJson: View Error: " + e.getMessage());
        }
    }

}
