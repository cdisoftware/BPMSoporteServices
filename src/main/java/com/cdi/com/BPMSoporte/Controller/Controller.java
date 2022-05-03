package com.cdi.com.BPMSoporte.Controller;

import com.cdi.com.BPMSoporte.Entity.BpmNet_ConsultarsoporteEntity;
import com.cdi.com.BPMSoporte.Entity.RecuperarListaClienteSoporteEntity;
import com.cdi.com.BPMSoporte.Entity.RecuperarListaEVENTOSSoporteEntity;
import com.cdi.com.BPMSoporte.Entity.RecuperarListaEstadoSoporteEntity;
import com.cdi.com.BPMSoporte.Entity.RecuperarListaImputacionSoporteEntity;
import com.cdi.com.BPMSoporte.Entity.RecuperarListaModuloSoporteEntity;
import com.cdi.com.BPMSoporte.Entity.RecuperarListaPrioridadEntity;
import com.cdi.com.BPMSoporte.Entity.RecuperarListaSolicitudEntity;
import com.cdi.com.BPMSoporte.Entity.RecuperarListaUsuariosReportandoEntity;
import com.cdi.com.BPMSoporte.Service.BpmNet_ConsultarsoporteService;
import com.cdi.com.BPMSoporte.Service.RecuperarListaClienteSoporteService;
import com.cdi.com.BPMSoporte.Service.RecuperarListaEVENTOSSoporteService;
import com.cdi.com.BPMSoporte.Service.RecuperarListaEstadoSoporteService;
import com.cdi.com.BPMSoporte.Service.RecuperarListaImputacionSoporteService;
import com.cdi.com.BPMSoporte.Service.RecuperarListaModuloSoporteService;
import com.cdi.com.BPMSoporte.Service.RecuperarListaPrioridadService;
import com.cdi.com.BPMSoporte.Service.RecuperarListaSolicitudService;
import com.cdi.com.BPMSoporte.Service.RecuperarListaUsuariosReportandoService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/", produces = "application/json", method = {RequestMethod.DELETE, RequestMethod.POST, RequestMethod.PUT, RequestMethod.PATCH})
@CrossOrigin(origins = "*", methods = {RequestMethod.GET, RequestMethod.POST, RequestMethod.PUT, RequestMethod.PATCH, RequestMethod.DELETE})

public class Controller {

    @Autowired
    BpmNet_ConsultarsoporteService serviceBpmNet_ConsultarsoporteService;

    @Autowired
    RecuperarListaClienteSoporteService serviceRecuperarListaClienteSoporteService;

    @Autowired
    RecuperarListaEstadoSoporteService serviceRecuperarListaEstadoSoporteService;

    @Autowired
    RecuperarListaEVENTOSSoporteService serviceRecuperarListaEVENTOSSoporteService;

    @Autowired
    RecuperarListaImputacionSoporteService serviceRecuperarListaImputacionSoporteService;

    @Autowired
    RecuperarListaModuloSoporteService serviceRecuperarListaModuloSoporteService;

    @Autowired
    RecuperarListaPrioridadService serviceRecuperarListaPrioridadService;

    @Autowired
    RecuperarListaSolicitudService serviceRecuperarListaSolicitudService;

    @Autowired
    RecuperarListaUsuariosReportandoService serviceRecuperarListaUsuariosReportandoService;

    @GetMapping("/consultaSoporteBpm/{TICKET}/{NOMBRE}/{TRAMITESOPORTE}/{FUNCIONARIOREPORTA}/{RAZONSOCIAL}/{CDESTADO}/{EVENTO}/{CDMODULO}/{TIPOSOLICITUD}/{PRIORIDAD}/{CDIMPUTACION}/{FECHAREGISTROINI}/{FECHAREGISTROFIN}/{FECHAATENCIONINI}/{FECHAATENCIONFIN}/{FUNCIONARIOSOLUCIO}")
    public List<BpmNet_ConsultarsoporteEntity> ConsultaBackup(
            @PathVariable String TICKET,
            @PathVariable String NOMBRE,
            @PathVariable String TRAMITESOPORTE,
            @PathVariable String FUNCIONARIOREPORTA,
            @PathVariable String RAZONSOCIAL,
            @PathVariable String CDESTADO,
            @PathVariable String EVENTO,
            @PathVariable String CDMODULO,
            @PathVariable String TIPOSOLICITUD,
            @PathVariable String PRIORIDAD,
            @PathVariable String CDIMPUTACION,
            @PathVariable String FECHAREGISTROINI,
            @PathVariable String FECHAREGISTROFIN,
            @PathVariable String FECHAATENCIONINI,
            @PathVariable String FECHAATENCIONFIN,
            @PathVariable String FUNCIONARIOSOLUCIO) {
        return serviceBpmNet_ConsultarsoporteService.ConsultaSoporte(TICKET, NOMBRE, TRAMITESOPORTE, FUNCIONARIOREPORTA, RAZONSOCIAL, CDESTADO, EVENTO, CDMODULO, TIPOSOLICITUD, PRIORIDAD, CDIMPUTACION, FECHAREGISTROINI, FECHAREGISTROFIN, FECHAATENCIONINI, FECHAATENCIONFIN, FUNCIONARIOSOLUCIO);
    }

    @GetMapping("/RecuperaClientes")
    public List<RecuperarListaClienteSoporteEntity> ConsultaSoporte() {
        return serviceRecuperarListaClienteSoporteService.ConsultaSoporte();
    }

    @GetMapping("/RecuperaEstado")
    public List<RecuperarListaEstadoSoporteEntity> ConsultaEstadoSoporte() {
        return serviceRecuperarListaEstadoSoporteService.ConsultaEstadoSoporte();
    }

    @GetMapping("/RecuperaEventos")
    public List<RecuperarListaEVENTOSSoporteEntity> ConsultaEventoSoporte() {
        return serviceRecuperarListaEVENTOSSoporteService.ConsultaEventoSoporte();
    }

    @GetMapping("/RecuperaImputacion")
    public List<RecuperarListaImputacionSoporteEntity> Imputacion() {
        return serviceRecuperarListaImputacionSoporteService.ConsultaImputacionSoporte();
    }

    @GetMapping("/RecuperaModulo")
    public List<RecuperarListaModuloSoporteEntity> Modulo() {
        return serviceRecuperarListaModuloSoporteService.ConsultaModuloSoporte();
    }

    @GetMapping("/RecuperaPrioridad")
    public List<RecuperarListaPrioridadEntity> Prioridad() {
        return serviceRecuperarListaPrioridadService.ConsultaPrioridadSoporte();
    }

    @GetMapping("/RecuperaSolicitud")
    public List<RecuperarListaSolicitudEntity> Solicitud() {
        return serviceRecuperarListaSolicitudService.ConsultaSolicitudSoporte();
    }

    @GetMapping("/RecuperaUsuariosReportado/{NOM}/{CLIENT}")
    public List<RecuperarListaUsuariosReportandoEntity> UsuarioReporta(
            @PathVariable String NOM,
            @PathVariable String CLIENT) {
        return serviceRecuperarListaUsuariosReportandoService.ConsultaEventoSoporte(NOM, CLIENT);
    }
}
