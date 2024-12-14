package com.espinosa.examen.segmento.funcionalidad.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.espinosa.examen.segmento.funcionalidad.model.SegmentoModulo;

public interface SegmentoModuloRepository extends JpaRepository<SegmentoModulo, String> {
   
    List<SegmentoModulo> findAll();
    Optional<SegmentoModulo> findById(String codeModulo);
    @SuppressWarnings("unchecked")
    SegmentoModulo save(SegmentoModulo modulo);
    SegmentoModulo update(String codeModulo, SegmentoModulo modulo);

    void deleteById(String codeModulo);
}
