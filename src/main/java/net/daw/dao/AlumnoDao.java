/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package net.daw.dao;

import net.daw.bean.AlumnoBean;
import net.daw.helper.Conexion;

/**
 *
 * @author José
 */
public class AlumnoDao extends GenericDaoImplementation<AlumnoBean> {

    public AlumnoDao(Conexion.Tipo_conexion tipoConexion) throws Exception {
        super(tipoConexion, "alumno");
    }

}
