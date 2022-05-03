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
            name = "RecuperarListaModuloSoporte",
            procedureName = "RecuperarListaModuloSoporte",
            resultClasses = RecuperarListaModuloSoporteEntity.class)
})
public class RecuperarListaModuloSoporteEntity {
    @Id
    @JsonProperty("CDMODULO")
    public String CDMODULO;
    
    @JsonProperty("MODULO")
    public String MODULO;
}
