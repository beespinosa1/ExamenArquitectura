package com.espinosa.examen.segmento.funcionalidad.model;

import java.io.Serializable;
import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.validation.constraints.NotNull;

@Embeddable
public class SegmentoFuncionalidadPK implements Serializable{

    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "COD_FUNCIONALIDAD", nullable = false)
    private Long codeFuncionalidad;

    //Es pk compuesto pero este campo es FK de la tabla SEG_MODULO
    @NotNull
    @Column(name="COD_MODULO", length = 16, nullable = false)
    private String codeModulo;

    public SegmentoFuncionalidadPK() {
    }

    public SegmentoFuncionalidadPK(Long codeFuncionalidad, @NotNull String codeModulo) {
        this.codeFuncionalidad = codeFuncionalidad;
        this.codeModulo = codeModulo;
    }

    public Long getCodeFuncionalidad() {
        return codeFuncionalidad;
    }

    public void setCodeFuncionalidad(Long codeFuncionalidad) {
        this.codeFuncionalidad = codeFuncionalidad;
    }

    public String getCodeModulo() {
        return codeModulo;
    }

    public void setCodeModulo(String codeModulo) {
        this.codeModulo = codeModulo;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((codeFuncionalidad == null) ? 0 : codeFuncionalidad.hashCode());
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
        SegmentoFuncionalidadPK other = (SegmentoFuncionalidadPK) obj;
        if (codeFuncionalidad == null) {
            if (other.codeFuncionalidad != null)
                return false;
        } else if (!codeFuncionalidad.equals(other.codeFuncionalidad))
            return false;
        if (codeModulo == null) {
            if (other.codeModulo != null)
                return false;
        } else if (!codeModulo.equals(other.codeModulo))
            return false;
        return true;
    }

    @Override
    public String toString() {
        return "SegmentoFuncionalidadPK [codeFuncionalidad=" + codeFuncionalidad + ", codeModulo=" + codeModulo + "]";
    }



}
