package com.espinosa.examen.segmento.funcionalidad.model;

import java.io.Serializable;
import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;
import jakarta.validation.constraints.NotNull;

@Embeddable
public class SegmentoPerfilFuncionalidadPK implements Serializable{

    @NotNull
    @Column(name="COD_PERFIL", length = 8, nullable = false)
    private String codePerfil;

    @NotNull
    @Column(name="COD_FUNCIONALIDAD", length = 4, nullable = false)
    private Integer codeFuncionalidad;

    @NotNull
    @Column(name="COD_MODULO", length = 16, nullable = false)
    private String codeModulo;

    public SegmentoPerfilFuncionalidadPK() {
    }

    public SegmentoPerfilFuncionalidadPK(@NotNull String codePerfil, @NotNull Integer codeFuncionalidad,
            @NotNull String codeModulo) {
        this.codePerfil = codePerfil;
        this.codeFuncionalidad = codeFuncionalidad;
        this.codeModulo = codeModulo;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((codePerfil == null) ? 0 : codePerfil.hashCode());
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
        SegmentoPerfilFuncionalidadPK other = (SegmentoPerfilFuncionalidadPK) obj;
        if (codePerfil == null) {
            if (other.codePerfil != null)
                return false;
        } else if (!codePerfil.equals(other.codePerfil))
            return false;
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
        return "SegmentoPerfilFuncionalidadPK [codePerfil=" + codePerfil + ", codeFuncionalidad=" + codeFuncionalidad
                + ", codeModulo=" + codeModulo + "]";
    }

}
