package com.espinosa.examen.segmento.funcionalidad.model;

import java.io.Serializable;
import jakarta.persistence.Column;
import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotNull;

@Entity
@Table(name = "SEG_FUNCIONALIDAD")
public class SegmentoFuncionalidad implements Serializable{

    @EmbeddedId
    private SegmentoFuncionalidadPK pk;

    @NotNull
    @Column(name="URL_PRINCIPAL", length = 200, nullable = false)
    private String urlPrincipal;

    @NotNull
    @Column(name="NOMBRE", length = 200, nullable = false)
    private String nombre;

    @NotNull
    @Column(name="DESCRIPCION", length = 500, nullable = false)
    private String descripcion;

    @NotNull
    @Column(name="ESTADO", length = 3, nullable = false)
    private String estado;

    //Relación que existe dentro de la PK compuesta
    @ManyToOne
    @JoinColumn(name = "COD_MODULO", referencedColumnName = "COD_MODULO", insertable = false, updatable = false)
    private SegmentoModulo segmentoModulo;

    public SegmentoFuncionalidad() {
    }

    public SegmentoFuncionalidad(SegmentoFuncionalidadPK pk) {
        this.pk = pk;
    }

    public SegmentoFuncionalidadPK getPk() {
        return pk;
    }

    public void setPk(SegmentoFuncionalidadPK pk) {
        this.pk = pk;
    }

    public String getUrlPrincipal() {
        return urlPrincipal;
    }

    public void setUrlPrincipal(String urlPrincipal) {
        this.urlPrincipal = urlPrincipal;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public SegmentoModulo getSegmentoModulo() {
        return segmentoModulo;
    }

    public void setSegmentoModulo(SegmentoModulo segmentoModulo) {
        this.segmentoModulo = segmentoModulo;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((pk == null) ? 0 : pk.hashCode());
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
        SegmentoFuncionalidad other = (SegmentoFuncionalidad) obj;
        if (pk == null) {
            if (other.pk != null)
                return false;
        } else if (!pk.equals(other.pk))
            return false;
        return true;
    }

    @Override
    public String toString() {
        return "SegmentoFuncionalidad [pk=" + pk + ", urlPrincipal=" + urlPrincipal + ", nombre=" + nombre
                + ", descripcion=" + descripcion + ", estado=" + estado + ", segmentoModulo=" + segmentoModulo + "]";
    }


}
