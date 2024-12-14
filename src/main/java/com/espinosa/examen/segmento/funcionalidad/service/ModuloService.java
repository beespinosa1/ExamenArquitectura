package com.espinosa.examen.segmento.funcionalidad.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.espinosa.examen.segmento.funcionalidad.model.SegmentoModulo;
import com.espinosa.examen.segmento.funcionalidad.repository.SegmentoModuloRepository;

@Service
public class ModuloService {
    @Autowired
    private SegmentoModuloRepository moduloRepository;

    @Override
    public List<SegmentoModulo> findAll() {
        return moduloRepository.findAll();
    }

    @Override
    public Optional<SegmentoModulo> findById(String codeModulo) {
        return moduloRepository.findById(codeModulo);
    }

    @Override
    public SegmentoModulo save(SegmentoModulo modulo) {
        return moduloRepository.save(modulo);
    }

    @Override
    public SegmentoModulo update(String codeModulo, SegmentoModulo modulo) {
        Optional<SegmentoModulo> existingModulo = moduloRepository.findById(codeModulo);
        if (existingModulo.isPresent()) {
            SegmentoModulo updatedModulo = existingModulo.get();
            updatedModulo.setNombre(modulo.getNombre());
            updatedModulo.setEstado(modulo.getEstado());
            updatedModulo.setVersion(modulo.getVersion());
            return moduloRepository.save(updatedModulo);
        } else {
            throw new RuntimeException("Módulo no encontrado con código: " + codeModulo);
        }
    }

    @Override
    public void deleteById(String codeModulo) {
        if (moduloRepository.existsById(codeModulo)) {
            moduloRepository.deleteById(codeModulo);
        } else {
            throw new RuntimeException("Módulo no encontrado con código: " + codeModulo);
        }
    }
}
