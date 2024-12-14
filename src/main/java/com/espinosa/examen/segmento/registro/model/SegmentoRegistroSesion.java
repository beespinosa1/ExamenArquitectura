package com.espinosa.examen.segmento.registro.model;

import java.io.Serializable;
import java.time.LocalDateTime;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;
import jakarta.validation.constraints.NotNull;

@Entity
@Table(name = "SEG_REGISTRO_SESION")
public class SegmentoRegistroSesion implements Serializable{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "SECUENCIA", nullable = false)
    private Long secuencia;
 
    @NotNull
    @Column(name="COD_USUARIO", length = 32, nullable = false)
    private String codeUsuario;

    @NotNull
    @Temporal(TemporalType.TIMESTAMP)
    @Column(name="FECHA_CONEXION", nullable = false)
    private LocalDateTime nombre;

    @NotNull
    @Column(name="IP_CONEXION", length = 24, nullable = false)
    private String ipConexion;

    @NotNull
    @Column(name="RESULTADO", length = 3, nullable = false)
    private String resultado;

    @NotNull
    @Column(name="COD_ERROR", length = 5, nullable = false)
    private String codeError;

    public SegmentoRegistroSesion() {
    }

    public SegmentoRegistroSesion(Long secuencia) {
        this.secuencia = secuencia;
    }

    public Long getSecuencia() {
        return secuencia;
    }

    public void setSecuencia(Long secuencia) {
        this.secuencia = secuencia;
    }

    public String getCodeUsuario() {
        return codeUsuario;
    }

    public void setCodeUsuario(String codeUsuario) {
        this.codeUsuario = codeUsuario;
    }

    public LocalDateTime getNombre() {
        return nombre;
    }

    public void setNombre(LocalDateTime nombre) {
        this.nombre = nombre;
    }

    public String getIpConexion() {
        return ipConexion;
    }

    public void setIpConexion(String ipConexion) {
        this.ipConexion = ipConexion;
    }

    public String getResultado() {
        return resultado;
    }

    public void setResultado(String resultado) {
        this.resultado = resultado;
    }

    public String getCodeError() {
        return codeError;
    }

    public void setCodeError(String codeError) {
        this.codeError = codeError;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((secuencia == null) ? 0 : secuencia.hashCode());
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
        SegmentoRegistroSesion other = (SegmentoRegistroSesion) obj;
        if (secuencia == null) {
            if (other.secuencia != null)
                return false;
        } else if (!secuencia.equals(other.secuencia))
            return false;
        return true;
    }

    @Override
    public String toString() {
        return "SegmentoRegistroSesion [secuencia=" + secuencia + ", codeUsuario=" + codeUsuario + ", nombre=" + nombre
                + ", ipConexion=" + ipConexion + ", resultado=" + resultado + ", codeError=" + codeError + "]";
    }

}
