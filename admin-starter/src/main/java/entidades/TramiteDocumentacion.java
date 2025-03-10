/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entidades;

import java.sql.Timestamp;
import java.util.Date;

/**
 *
 * @author licciardi
 */
public class TramiteDocumentacion extends Entidad {
    
    
    private String archivoTD; 
    private int codTD;
    private Timestamp fechaEntregaTD;
    private Documentacion documentacion;
    private String nombreTD;

    public TramiteDocumentacion() {
    }

    public String getArchivoTD() {
        return archivoTD;
    }

    public void setArchivoTD(String archivoTD) {
        this.archivoTD = archivoTD;
    }

    public int getCodTD() {
        return codTD;
    }

    public void setCodTD(int codTD) {
        this.codTD = codTD;
    }

    public Timestamp getFechaEntregaTD() {
        return fechaEntregaTD;
    }

    public void setFechaEntregaTD(Timestamp fechaEntregaTD) {
        this.fechaEntregaTD = fechaEntregaTD;
    }

    public Documentacion getDocumentacion() {
        return documentacion;
    }

    public void setDocumentacion(Documentacion documentacion) {
        this.documentacion = documentacion;
    }

    public String getNombreTD() {
        return nombreTD;
    }

    public void setNombreTD(String nombreTD) {
        this.nombreTD = nombreTD;
    }
    
    
    
}
