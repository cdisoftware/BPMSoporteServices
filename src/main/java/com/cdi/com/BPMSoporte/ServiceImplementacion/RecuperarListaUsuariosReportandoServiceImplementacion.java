/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cdi.com.BPMSoporte.ServiceImplementacion;

import com.cdi.com.BPMSoporte.Entity.RecuperarListaUsuariosReportandoEntity;
import com.cdi.com.BPMSoporte.Service.RecuperarListaUsuariosReportandoService;
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
public class RecuperarListaUsuariosReportandoServiceImplementacion implements RecuperarListaUsuariosReportandoService{
    @PersistenceContext
    private EntityManager repositorio;

    @Override
    public List<RecuperarListaUsuariosReportandoEntity> ConsultaEventoSoporte(String NOM, String CLIENT) {
        try {
            StoredProcedureQuery ConsUsuarioReporta = repositorio.createNamedStoredProcedureQuery("RecuperarListaUsuariosReportando");
            ConsUsuarioReporta.registerStoredProcedureParameter("NOM", String.class, ParameterMode.IN);
            ConsUsuarioReporta.registerStoredProcedureParameter("CLIENT", String.class, ParameterMode.IN);
            
            ConsUsuarioReporta.setParameter("NOM", NOM);
            ConsUsuarioReporta.setParameter("CLIENT", CLIENT);
            return ConsUsuarioReporta.getResultList();
        } catch (Exception e) {
            List list = new ArrayList();
            list.add(0, JSONObject.quote("No fue posible ejecutar los datos, verifique el Log para validar la inconsistencia"));
            return list;
        }
    }
    
    
}
