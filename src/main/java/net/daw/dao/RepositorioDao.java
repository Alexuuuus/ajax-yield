/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package net.daw.dao;

import net.daw.bean.RepositorioBean;
import net.daw.helper.Conexion;

/**
 *
 * @author al037431
 */
public class RepositorioDao extends GenericDaoImplementation<RepositorioBean> {
  
    public RepositorioDao(Conexion.Tipo_conexion tipoConexion) throws Exception {
        super(tipoConexion,"repositorio");
    }
    
}
