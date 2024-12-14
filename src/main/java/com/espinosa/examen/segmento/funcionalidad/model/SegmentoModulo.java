package com.espinosa.examen.segmento.funcionalidad.model;

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
    private String vesion;



}
