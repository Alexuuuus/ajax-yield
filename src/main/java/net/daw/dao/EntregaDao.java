/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package net.daw.dao;

import net.daw.bean.EntregaBean;
import net.daw.helper.Conexion;
/**
 *
 * @author al037805
 */
public class EntregaDao extends GenericDaoImplementation<EntregaBean>{
    
    public EntregaDao(Conexion.Tipo_conexion tipo_conexion) throws Exception {
        super(tipo_conexion, "entrega");
    }
    
}
