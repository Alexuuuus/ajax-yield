/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package net.daw.dao;

import net.daw.bean.ComentarioBean;
import net.daw.helper.Conexion;

/**
 *
 * @author al037684
 */
public class ComentarioDao extends GenericDaoImplementation<ComentarioBean> {   
    
    public ComentarioDao(Conexion.Tipo_conexion tipoConexion) throws Exception {
        super(tipoConexion,"comentario");
    }
    
}
