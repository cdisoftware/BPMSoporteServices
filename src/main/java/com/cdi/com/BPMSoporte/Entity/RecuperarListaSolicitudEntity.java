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
            name = "RecuperarListaSolicitud",
            procedureName = "RecuperarListaSolicitud",
            resultClasses = RecuperarListaSolicitudEntity.class)
})
public class RecuperarListaSolicitudEntity {
    @Id
    @JsonProperty("CDTPOSOL")
    public String CDTPOSOL;
    
    @JsonProperty("TIPOSOLICITUD")
    public String TIPOSOLICITUD;
}
