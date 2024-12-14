package com.espinosa.examen.segmento.funcionalidad.model;

import java.io.Serializable;

import com.espinosa.examen.segmento.usuario.model.SegmentoPerfil;

import jakarta.persistence.Column;
import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotNull;

@Entity
@Table(name = "SEG_PERFIL_FUNCIONALIDAD")
public class SegmentoPerfilFuncionalidad implements Serializable{

    @EmbeddedId
    private SegmentoPerfilFuncionalidadPK pk;

    @NotNull
    @Column(name="ORDEN", length = 2, nullable = false)
    private Integer orden;

    @NotNull
    @Column(name="ESTADO", length = 3, nullable = false)
    private String estado;

    @NotNull
    @Column(name="ADMITE_CREACION", nullable = false)
    private String admiteCreacion;

    @NotNull
    @Column(name="ADMITE_MODIFICACION",  nullable = false)
    private boolean admiteModificacion;

    //Relación que existe dentro de la PK compuesta
    @ManyToOne
    @JoinColumn(name = "COD_PERFIL", referencedColumnName = "COD_PERFIL", insertable = false, updatable = false)
    private SegmentoPerfil segmentoPerfil;

    @ManyToOne
    @JoinColumn(name = "COD_FUNCIONALIDAD", referencedColumnName = "COD_FUNCIONALIDAD", insertable = false, updatable = false)
    private SegmentoFuncionalidad segmentoFuncionalidad;

    @ManyToOne
    @JoinColumn(name = "COD_MODULO", referencedColumnName = "COD_MODULO", insertable = false, updatable = false)
    private SegmentoModulo segmentoModulo;

    public SegmentoPerfilFuncionalidad() {
    }

    public SegmentoPerfilFuncionalidad(SegmentoPerfilFuncionalidadPK pk) {
        this.pk = pk;
    }

    public SegmentoPerfilFuncionalidadPK getPk() {
        return pk;
    }

    public void setPk(SegmentoPerfilFuncionalidadPK pk) {
        this.pk = pk;
    }

    public Integer getOrden() {
        return orden;
    }

    public void setOrden(Integer orden) {
        this.orden = orden;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getAdmiteCreacion() {
        return admiteCreacion;
    }

    public void setAdmiteCreacion(String admiteCreacion) {
        this.admiteCreacion = admiteCreacion;
    }

    public boolean isAdmiteModificacion() {
        return admiteModificacion;
    }

    public void setAdmiteModificacion(boolean admiteModificacion) {
        this.admiteModificacion = admiteModificacion;
    }

    public SegmentoPerfil getSegmentoPerfil() {
        return segmentoPerfil;
    }

    public void setSegmentoPerfil(SegmentoPerfil segmentoPerfil) {
        this.segmentoPerfil = segmentoPerfil;
    }

    public SegmentoFuncionalidad getSegmentoFuncionalidad() {
        return segmentoFuncionalidad;
    }

    public void setSegmentoFuncionalidad(SegmentoFuncionalidad segmentoFuncionalidad) {
        this.segmentoFuncionalidad = segmentoFuncionalidad;
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
        SegmentoPerfilFuncionalidad other = (SegmentoPerfilFuncionalidad) obj;
        if (pk == null) {
            if (other.pk != null)
                return false;
        } else if (!pk.equals(other.pk))
            return false;
        return true;
    }

    @Override
    public String toString() {
        return "SegmentoPerfilFuncionalidad [pk=" + pk + ", orden=" + orden + ", estado=" + estado + ", admiteCreacion="
                + admiteCreacion + ", admiteModificacion=" + admiteModificacion + ", segmentoPerfil=" + segmentoPerfil
                + ", segmentoFuncionalidad=" + segmentoFuncionalidad + ", segmentoModulo=" + segmentoModulo + "]";
    }

    
}
