package com.espinosa.examen.segmento.usuario.model;

import java.io.Serializable;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotNull;

@Entity
@Table(name = "SEG_PERFIL")
public class SegmentoPerfil implements Serializable{

    @Id
    @NotNull
    @Column(name="COD_PERFIL", length = 8, nullable = false)
    private String codePerfil;

    @NotNull
    @Column(name="NOMBRE", length = 100, nullable = false)
    private String nombre;

    @NotNull
    @Column(name="ESTADO", length = 3, nullable = false)
    private String estado;

    public SegmentoPerfil() {
    }

    public SegmentoPerfil(@NotNull String codePerfil) {
        this.codePerfil = codePerfil;
    }

    public String getCodePerfil() {
        return codePerfil;
    }

    public void setCodePerfil(String codePerfil) {
        this.codePerfil = codePerfil;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((codePerfil == null) ? 0 : codePerfil.hashCode());
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
        SegmentoPerfil other = (SegmentoPerfil) obj;
        if (codePerfil == null) {
            if (other.codePerfil != null)
                return false;
        } else if (!codePerfil.equals(other.codePerfil))
            return false;
        return true;
    }

    @Override
    public String toString() {
        return "segmentoPerfil [codePerfil=" + codePerfil + ", nombre=" + nombre + ", estado=" + estado + "]";
    }

    

    

}
