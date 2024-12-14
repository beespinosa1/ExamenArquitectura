package com.espinosa.examen.segmento.funcionalidad.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.espinosa.examen.segmento.funcionalidad.model.SegmentoFuncionalidad;
import com.espinosa.examen.segmento.funcionalidad.model.SegmentoFuncionalidadPK;

public interface SegmentoFuncionalidadRepository extends JpaRepository<SegmentoFuncionalidad, SegmentoFuncionalidadPK> {

}
