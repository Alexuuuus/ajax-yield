/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package net.daw.dao;

import net.daw.bean.ActividadofflineBean;
import net.daw.helper.Conexion;

/**
 *
 * @author Javier Bonet
 */
public class ActividadofflineDao extends GenericDaoImplementation<ActividadofflineBean>{
    
    public ActividadofflineDao(Conexion.Tipo_conexion tipoConexion) throws Exception {
        super(tipoConexion, "actividadoffline");
    }
   
    
}
