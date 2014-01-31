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
import net.daw.dao.BacklogDao;
import net.daw.helper.Conexion;


/**
 *
 * @author Edu
 */
public class BacklogGetcolumns implements GenericOperation {

    @Override
    public String execute(HttpServletRequest request, HttpServletResponse response) throws Exception {
        ArrayList<String> alColumns = null;
        try {
            BacklogDao oBacklogDAO = new BacklogDao(Conexion.getConection());
            alColumns = oBacklogDAO.getColumnsNames();
            String data = new Gson().toJson(alColumns);
            data = "{\"data\":" + data + "}";
              
            return data;
        } catch (Exception e) {
            throw new ServletException("BacklogGetcolumnsJson: View Error: " + e.getMessage());
        }
    }

}
