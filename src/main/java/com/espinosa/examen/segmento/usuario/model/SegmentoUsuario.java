package com.espinosa.examen.segmento.usuario.model;

import java.io.Serializable;
import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;
import jakarta.validation.constraints.NotNull;

@Entity
@Table(name = "SEG_USUARIO")
public class SegmentoUsuario implements Serializable{

    @Id
    @NotNull
    @Column(name="COD_USUARIO", length = 30, nullable = false)
    private String codeUsuario;

    @NotNull
    @Column(name="COD_PERFIL", length = 8, nullable = false)
    private String codePerfil;

    @NotNull
    @Column(name="MAIL", length = 128, nullable = false)
    private String mail;

    @NotNull
    @Column(name="NOMBRE", length = 128, nullable = false)
    private String nombre;

    @NotNull
    @Column(name="TELEFONO", length = 10, nullable = false)
    private String telefono;

    @NotNull
    @Column(name="CLAVE", length = 64, nullable = false)
    private String clave;

    @NotNull
    @Column(name="ESTADO", length = 3, nullable = false)
    private String estado;

    @NotNull
    @Temporal(TemporalType.TIMESTAMP)
    @Column(name="FECHA_CREACION", nullable = false)
    private LocalDateTime fechaCreacion;

    @NotNull
    @Temporal(TemporalType.DATE)
    @Column(name="FECHA_CAMBIO_CLAVE", nullable = false)
    private LocalDate fechaCambioClave;

    @NotNull
    @Column(name="NRO_INTENTOS_FALLIDOS", length = 3, nullable = false)
    private Integer numIntentosFallidos;

    @NotNull
    @Temporal(TemporalType.TIMESTAMP)
    @Column(name="FECHA_ULTIMA_SESION", nullable = false)
    private LocalDateTime fechaUltimaSesion;

    @NotNull
    @Column(name="SUELDO", precision = 10, scale = 2, nullable = false)
    private BigDecimal sueldo;

    @ManyToOne
    @JoinColumn(name = "COD_PERFIL", referencedColumnName = "COD_PERFIL", insertable = false, updatable = false)
    private SegmentoPerfil segmentoperfil;

    public SegmentoUsuario() {
    }

    public SegmentoUsuario(@NotNull String codeUsuario) {
        this.codeUsuario = codeUsuario;
    }

    public String getCodeUsuario() {
        return codeUsuario;
    }

    public void setCodeUsuario(String codeUsuario) {
        this.codeUsuario = codeUsuario;
    }

    public String getCodePerfil() {
        return codePerfil;
    }

    public void setCodePerfil(String codePerfil) {
        this.codePerfil = codePerfil;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getClave() {
        return clave;
    }

    public void setClave(String clave) {
        this.clave = clave;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public LocalDateTime getFechaCreacion() {
        return fechaCreacion;
    }

    public void setFechaCreacion(LocalDateTime fechaCreacion) {
        this.fechaCreacion = fechaCreacion;
    }

    public LocalDate getFechaCambioClave() {
        return fechaCambioClave;
    }

    public void setFechaCambioClave(LocalDate fechaCambioClave) {
        this.fechaCambioClave = fechaCambioClave;
    }

    public Integer getNumIntentosFallidos() {
        return numIntentosFallidos;
    }

    public void setNumIntentosFallidos(Integer numIntentosFallidos) {
        this.numIntentosFallidos = numIntentosFallidos;
    }

    public LocalDateTime getFechaUltimaSesion() {
        return fechaUltimaSesion;
    }

    public void setFechaUltimaSesion(LocalDateTime fechaUltimaSesion) {
        this.fechaUltimaSesion = fechaUltimaSesion;
    }

    public BigDecimal getSueldo() {
        return sueldo;
    }

    public void setSueldo(BigDecimal sueldo) {
        this.sueldo = sueldo;
    }

    public SegmentoPerfil getSegmentoperfil() {
        return segmentoperfil;
    }

    public void setSegmentoperfil(SegmentoPerfil segmentoperfil) {
        this.segmentoperfil = segmentoperfil;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((codeUsuario == null) ? 0 : codeUsuario.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        SegmentoUsuario other = (SegmentoUsuario) obj;
        if (codeUsuario == null) {
            if (other.codeUsuario != null)
                return false;
        } else if (!codeUsuario.equals(other.codeUsuario))
            return false;
        return true;
    }

    @Override
    public String toString() {
        return "SegmentoUsuario [codeUsuario=" + codeUsuario + ", codePerfil=" + codePerfil + ", mail=" + mail
                + ", nombre=" + nombre + ", telefono=" + telefono + ", clave=" + clave + ", estado=" + estado
                + ", fechaCreacion=" + fechaCreacion + ", fechaCambioClave=" + fechaCambioClave
                + ", numIntentosFallidos=" + numIntentosFallidos + ", fechaUltimaSesion=" + fechaUltimaSesion
                + ", sueldo=" + sueldo + ", segmentoperfil=" + segmentoperfil + "]";
    }

    
}
