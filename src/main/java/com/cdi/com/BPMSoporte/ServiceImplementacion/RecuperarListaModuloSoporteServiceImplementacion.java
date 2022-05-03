/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cdi.com.BPMSoporte.ServiceImplementacion;

import com.cdi.com.BPMSoporte.Entity.RecuperarListaModuloSoporteEntity;
import com.cdi.com.BPMSoporte.Service.RecuperarListaModuloSoporteService;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.StoredProcedureQuery;
import org.json.JSONObject;
import org.springframework.stereotype.Service;

/**
 *
 * @author Janus
 */
@Service
public class RecuperarListaModuloSoporteServiceImplementacion implements RecuperarListaModuloSoporteService{
    @PersistenceContext
    private EntityManager repositorio;

    @Override
    public List<RecuperarListaModuloSoporteEntity> ConsultaModuloSoporte() {
        try {
            StoredProcedureQuery consBpmSoporte = repositorio.createNamedStoredProcedureQuery("RecuperarListaModuloSoporte");
            return consBpmSoporte.getResultList();
        } catch (Exception e) {
            List list = new ArrayList();
            list.add(0, JSONObject.quote("No fue posible ejecutar los datos, verifique el Log para validar la inconsistencia"));
            return list;
        }
    }
}
