/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cdi.com.BPMSoporte.Service;

import com.cdi.com.BPMSoporte.Entity.RecuperarListaUsuariosReportandoEntity;
import java.util.List;

/**
 *
 * @author Janus
 */
public interface RecuperarListaUsuariosReportandoService {
    public List<RecuperarListaUsuariosReportandoEntity> ConsultaEventoSoporte(String NOM, String CLIENT);
}
