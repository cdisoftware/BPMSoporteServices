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
            name = "BpmNet_Consultarsoporte",
            procedureName = "BpmNet_Consultarsoporte",
            resultClasses = BpmNet_ConsultarsoporteEntity.class)
})
public class BpmNet_ConsultarsoporteEntity {

    @Id
    @JsonProperty("ID")
    public Integer ID;

    @JsonProperty("Ticket")
    public String Ticket;

    @JsonProperty("Tramite")
    public Integer Tramite;

    @JsonProperty("NOMBRECLIENTE")
    public String NOMBRECLIENTE;

    @JsonProperty("RAZONSOCIAL")
    public String RAZONSOCIAL;

    @JsonProperty("AREA")
    public String AREA;

    @JsonProperty("FuncionarioReporta")
    public String FuncionarioReporta;

    @JsonProperty("INCIDENTE")
    public String INCIDENTE;

    @JsonProperty("CDTPOSOL")
    public Integer CDTPOSOL;

    @JsonProperty("TIPOSOLICITUD")
    public String TIPOSOLICITUD;

    @JsonProperty("CDMODULO")
    public Integer CDMODULO;

    @JsonProperty("MODULO")
    public String MODULO;

    @JsonProperty("CDEVENTO")
    public Integer CDEVENTO;

    @JsonProperty("EVENTO")
    public String EVENTO;

    @JsonProperty("FECHAREGISTRO")
    public String FECHAREGISTRO;

    @JsonProperty("IDFUNCIONARIOSOLUCION")
    public Integer IDFUNCIONARIOSOLUCION;

    @JsonProperty("FUNCIONARIOASIGNADOSOLUCION")
    public String FUNCIONARIOASIGNADOSOLUCION;

    @JsonProperty("ESTADO")
    public String ESTADO;

    @JsonProperty("FLUJO")
    public String FLUJO;

    @JsonProperty("PRIORIDAD")
    public String PRIORIDAD;

    @JsonProperty("IMPUTACION")
    public String IMPUTACION;

    @JsonProperty("FECHAATENCION")
    public String FECHAATENCION;

    @JsonProperty("HORAATENCION")
    public String HORAATENCION;

    @JsonProperty("SOLUCIONINCIDENTEI")
    public String SOLUCIONINCIDENTEI;
}
