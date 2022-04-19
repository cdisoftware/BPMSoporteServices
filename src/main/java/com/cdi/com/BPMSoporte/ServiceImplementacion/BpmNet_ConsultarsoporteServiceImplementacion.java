/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cdi.com.BPMSoporte.ServiceImplementacion;

import com.cdi.com.BPMSoporte.Entity.BpmNet_ConsultarsoporteEntity;
import com.cdi.com.BPMSoporte.Service.BpmNet_ConsultarsoporteService;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.ParameterMode;
import javax.persistence.PersistenceContext;
import javax.persistence.StoredProcedureQuery;
import org.json.JSONObject;
import org.springframework.stereotype.Service;

/**
 *
 * @author Janus
 */
@Service
public class BpmNet_ConsultarsoporteServiceImplementacion implements BpmNet_ConsultarsoporteService{
    
    @PersistenceContext
    private EntityManager repositorio;

    @Override
    public List<BpmNet_ConsultarsoporteEntity> ConsultaSoporte(String TICKET, String NOMBRE, String TRAMITESOPORTE, String FUNCIONARIOREPORTA, String RAZONSOCIAL,
            String CDESTADO, String EVENTO, String CDMODULO, String TIPOSOLICITUD, String PRIORIDAD, String CDIMPUTACION, String FECHAREGISTROINI, String FECHAREGISTROFIN,
            String FECHAATENCIONINI, String FECHAATENCIONFIN, String FUNCIONARIOSOLUCIO) {
        try {
            StoredProcedureQuery consBpmSoporte = repositorio.createNamedStoredProcedureQuery("BpmNet_Consultarsoporte");
            consBpmSoporte.registerStoredProcedureParameter("TICKET", String.class, ParameterMode.IN);
            consBpmSoporte.registerStoredProcedureParameter("NOMBRE", String.class, ParameterMode.IN);
            consBpmSoporte.registerStoredProcedureParameter("TRAMITESOPORTE", String.class, ParameterMode.IN);
            consBpmSoporte.registerStoredProcedureParameter("FUNCIONARIOREPORTA", String.class, ParameterMode.IN);
            consBpmSoporte.registerStoredProcedureParameter("RAZONSOCIAL", String.class, ParameterMode.IN);
            consBpmSoporte.registerStoredProcedureParameter("CDESTADO", String.class, ParameterMode.IN);
            consBpmSoporte.registerStoredProcedureParameter("EVENTO", String.class, ParameterMode.IN);
            consBpmSoporte.registerStoredProcedureParameter("CDMODULO", String.class, ParameterMode.IN);
            consBpmSoporte.registerStoredProcedureParameter("TIPOSOLICITUD", String.class, ParameterMode.IN);
            consBpmSoporte.registerStoredProcedureParameter("PRIORIDAD", String.class, ParameterMode.IN);
            consBpmSoporte.registerStoredProcedureParameter("CDIMPUTACION", String.class, ParameterMode.IN);
            consBpmSoporte.registerStoredProcedureParameter("FECHAREGISTROINI", String.class, ParameterMode.IN);
            consBpmSoporte.registerStoredProcedureParameter("FECHAREGISTROFIN", String.class, ParameterMode.IN);
            consBpmSoporte.registerStoredProcedureParameter("FECHAATENCIONINI", String.class, ParameterMode.IN);
            consBpmSoporte.registerStoredProcedureParameter("FECHAATENCIONFIN", String.class, ParameterMode.IN);
            consBpmSoporte.registerStoredProcedureParameter("FUNCIONARIOSOLUCIO", String.class, ParameterMode.IN);

            consBpmSoporte.setParameter("TICKET", TICKET);
            consBpmSoporte.setParameter("NOMBRE", NOMBRE);
            consBpmSoporte.setParameter("TRAMITESOPORTE", TRAMITESOPORTE);
            consBpmSoporte.setParameter("FUNCIONARIOREPORTA", FUNCIONARIOREPORTA);
            consBpmSoporte.setParameter("RAZONSOCIAL", RAZONSOCIAL);
            consBpmSoporte.setParameter("CDESTADO", CDESTADO);
            consBpmSoporte.setParameter("EVENTO", EVENTO);
            consBpmSoporte.setParameter("CDMODULO", CDMODULO);
            consBpmSoporte.setParameter("TIPOSOLICITUD", TIPOSOLICITUD);
            consBpmSoporte.setParameter("PRIORIDAD", PRIORIDAD);
            consBpmSoporte.setParameter("CDIMPUTACION", CDIMPUTACION);
            consBpmSoporte.setParameter("FECHAREGISTROINI", FECHAREGISTROINI);
            consBpmSoporte.setParameter("FECHAREGISTROFIN", FECHAREGISTROFIN);
            consBpmSoporte.setParameter("FECHAATENCIONINI", FECHAATENCIONINI);
            consBpmSoporte.setParameter("FECHAATENCIONFIN", FECHAATENCIONFIN);
            consBpmSoporte.setParameter("FUNCIONARIOSOLUCIO", FUNCIONARIOSOLUCIO);
            return consBpmSoporte.getResultList();
        } catch (Exception ex) {
            List list = new ArrayList();
            list.add(0, JSONObject.quote("No fue posible ejecutar los datos, verifique el Log para validar la inconsistencia"));
            return list;
        }
    }
    
}
