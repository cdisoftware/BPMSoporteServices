/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cdi.com.BPMSoporte.Entity;

import com.fasterxml.jackson.annotation.JsonProperty;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedStoredProcedureQueries;
import javax.persistence.NamedStoredProcedureQuery;
import lombok.Data;

/**
 *
 * @author Janus
 */
@Entity
@Data
@NamedStoredProcedureQueries({
    @NamedStoredProcedureQuery(
            name = "RecuperarEmpresas",
            procedureName = "RecuperarEmpresas",
            resultClasses = RecuperarEmpresasEntity.class)
})
public class RecuperarEmpresasEntity {
    @Id
    @JsonProperty("id")
    public String id;

    @JsonProperty("RAZONSOCIAL")
    public String RAZONSOCIAL;
    
    @JsonProperty("TIPODOC")
    public Integer TIPODOC;
    
    @JsonProperty("DIRECCION")
    public String DIRECCION;
    
    @JsonProperty("TELEFONO")
    public String TELEFONO;
    
    @JsonProperty("EMAIL")
    public String EMAIL;
    
    @JsonProperty("ROL")
    public Integer ROL;
    
    @JsonProperty("TPODCMNTO")
    public Integer TPODCMNTO;
    
    @JsonProperty("DOCUMENTO")
    public String DOCUMENTO;
}
