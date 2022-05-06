/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cdi.com.BPMSoporte.Service;

import com.cdi.com.BPMSoporte.Entity.BpmNet_ConsultarsoporteEntity;
import java.util.List;

/**
 *
 * @author Janus
 */
public interface BpmNet_ConsultarsoporteService {
    public List<BpmNet_ConsultarsoporteEntity> ConsultaSoporte(BpmNet_ConsultarsoporteEntity entidad, String TICKET, String NOMBRE, String TRAMITESOPORTE, String FUNCIONARIOREPORTA, String CDESTADO, 
            String EVENTO, String TIPOSOLICITUD, String PRIORIDAD, String CDIMPUTACION,
            String FECHAREGISTROINI, String FECHAREGISTROFIN, String FECHAATENCIONINI, String FECHAATENCIONFIN, String FUNCIONARIOSOLUCIO, String NumeroResultados);
}
