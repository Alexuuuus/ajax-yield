/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package net.daw.dao;

import net.daw.bean.MetadocumentoBean;
import net.daw.helper.Conexion;
/**
 *
 * @author al037431
 */
public class MetadocumentoDao extends GenericDaoImplementation<MetadocumentoBean> {
  
    public MetadocumentoDao(Conexion.Tipo_conexion tipoConexion) throws Exception {
        super(tipoConexion,"metadocumento");
    }
    
}
