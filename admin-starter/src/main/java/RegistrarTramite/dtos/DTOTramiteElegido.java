package RegistrarTramite.dtos;

import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.List;

public class DTOTramiteElegido {

    private int nroTramite;
    private Timestamp fechaRecepcionTramite;
    private Timestamp fechaAnulacionTramite;
    private Timestamp fechaInicioTramite;
    private Timestamp fechaPresentacionTotalDocumentacion;
    private Timestamp fechaFinTramite;
    private int plazoDocumentacion;
    private int codTipoTramite;
    private String nombreTipoTramite;
    private String nombreEstado;
    private double precioTramite;
    private int dniCliente;
    private String nombreCliente;
    private String apellidoCliente;
    private String mailCliente;
    private int legajoConsultor;
    private String nombreConsultor;
    private List<DTODocumentacion> resumenDoc = new ArrayList<DTODocumentacion>(); //para agregar la documentacion al resumen

    public int getNroTramite() {
        return nroTramite;
    }

    public void setNroTramite(int nroTramite) {
        this.nroTramite = nroTramite;
    }

    public Timestamp getFechaRecepcionTramite() {
        return fechaRecepcionTramite;
    }

    public void setFechaRecepcionTramite(Timestamp fechaRecepcionTramite) {
        this.fechaRecepcionTramite = fechaRecepcionTramite;
    }

    public Timestamp getFechaAnulacionTramite() {
        return fechaAnulacionTramite;
    }

    public void setFechaAnulacionTramite(Timestamp fechaAnulacionTramite) {
        this.fechaAnulacionTramite = fechaAnulacionTramite;
    }

    public Timestamp getFechaPresentacionTotalDocumentacion() {
        return fechaPresentacionTotalDocumentacion;
    }

    public void setFechaPresentacionTotalDocumentacion(Timestamp fechaPresentacionTotalDocumentacion) {
        this.fechaPresentacionTotalDocumentacion = fechaPresentacionTotalDocumentacion;
    }

    public Timestamp getFechaInicioTramite() {
        return fechaInicioTramite;
    }

    public void setFechaInicioTramite(Timestamp fechaInicioTramite) {
        this.fechaInicioTramite = fechaInicioTramite;
    }

    public Timestamp getFechaFinTramite() {
        return fechaFinTramite;
    }

    public void setFechaFinTramite(Timestamp fechaFinTramite) {
        this.fechaFinTramite = fechaFinTramite;
    }

    public int getPlazoDocumentacion() {
        return plazoDocumentacion;
    }

    public void setPlazoDocumentacion(int plazoDocumentacion) {
        this.plazoDocumentacion = plazoDocumentacion;
    }

    public int getCodTipoTramite() {
        return codTipoTramite;
    }

    public void setCodTipoTramite(int codTipoTramite) {
        this.codTipoTramite = codTipoTramite;
    }

    public String getNombreTipoTramite() {
        return nombreTipoTramite;
    }

    public void setNombreTipoTramite(String nombreTipoTramite) {
        this.nombreTipoTramite = nombreTipoTramite;
    }

    public String getNombreEstado() {
        return nombreEstado;
    }

    public void setNombreEstado(String nombreEstado) {
        this.nombreEstado = nombreEstado;
    }

    public double getPrecioTramite() {
        return precioTramite;
    }

    public void setPrecioTramite(double precioTramite) {
        this.precioTramite = precioTramite;
    }

    public int getDniCliente() {
        return dniCliente;
    }

    public void setDniCliente(int dniCliente) {
        this.dniCliente = dniCliente;
    }

    public String getNombreCliente() {
        return nombreCliente;
    }

    public void setNombreCliente(String nombreCliente) {
        this.nombreCliente = nombreCliente;
    }

    public String getApellidoCliente() {
        return apellidoCliente;
    }

    public void setApellidoCliente(String apellidoCliente) {
        this.apellidoCliente = apellidoCliente;
    }

    public String getMailCliente() {
        return mailCliente;
    }

    public int getLegajoConsultor() {
        return legajoConsultor;
    }

    public void setLegajoConsultor(int legajoConsultor) {
        this.legajoConsultor = legajoConsultor;
    }

    public String getNombreConsultor() {
        return nombreConsultor;
    }

    public void setNombreConsultor(String nombreConsultor) {
        this.nombreConsultor = nombreConsultor;
    }

    public void setMailCliente(String mailCliente) {
        this.mailCliente = mailCliente;
    }

    public List<DTODocumentacion> getResumenDoc() {
        return resumenDoc;
    }

    public void setResumenDoc(List<DTODocumentacion> resumenDoc) {
        this.resumenDoc = resumenDoc;
    }

    public void addResumenDoc(DTODocumentacion doc) {
        resumenDoc.add(doc);
    }

}
