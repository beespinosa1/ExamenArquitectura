package com.espinosa.examen.segmento.funcionalidad.model;

import java.io.Serializable;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.validation.constraints.NotNull;
import jakarta.persistence.Id;
import jakarta.persistence.Table;


@Entity
@Table(name = "SEG_MODULO")
public class SegmentoModulo implements Serializable{

    @Id
    @NotNull
    @Column(name="COD_MODULO", length = 15, nullable = false)
    private String codeModulo;

    @NotNull
    @Column(name="NOMBRE", length = 50, nullable = false)
    private String nombre;

    @NotNull
    @Column(name="ESTADO", length = 3, nullable = false)
    private String estado;

    @NotNull
    @Column(name="VERSION", length = 4, nullable = false)
    private String version;

    public SegmentoModulo() {
    }

    public SegmentoModulo(@NotNull String codeModulo) {
        this.codeModulo = codeModulo;
    }

    public String getCodeModulo() {
        return codeModulo;
    }

    public void setCodeModulo(String codeModulo) {
        this.codeModulo = codeModulo;
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

    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((codeModulo == null) ? 0 : codeModulo.hashCode());
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
        SegmentoModulo other = (SegmentoModulo) obj;
        if (codeModulo == null) {
            if (other.codeModulo != null)
                return false;
        } else if (!codeModulo.equals(other.codeModulo))
            return false;
        return true;
    }

    @Override
    public String toString() {
        return "SegmentoModulo [codeModulo=" + codeModulo + ", nombre=" + nombre + ", estado=" + estado + ", version="
                + version + "]";
    };
   

}
