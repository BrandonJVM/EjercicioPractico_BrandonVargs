package com.Farmacia.service.impl;

import com.Farmacia.domain.Medicamentos; // Cambiado a Medicamentos
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import com.Farmacia.service.MedicamentosService; // Cambiado a MedicamentosService
import com.Farmacia.dao.MedicamentosDao; // Cambiado a MedicamentosDao

@Service
public class MedicamentosServiceImpl implements CategoriaService {

    @Autowired
    private MedicamentosDao medicamentosDao; // Cambiado a MedicamentosDao

    @Override
    @Transactional(readOnly = true)
    public List<Medicamentos> getMedicamentos(boolean activos) { // Cambiado a getMedicamentos
        var lista = medicamentosDao.findAll();
        /*if (activos) {
            lista.removeIf(e -> !e.isActivo()); // Si tienes un atributo activo en Medicamentos, descomenta esto.
        }*/
        return lista;
    }

    @Override
    @Transactional(readOnly = true)
    public Medicamentos getMedicamento(Medicamentos medicamento) { // Cambiado a getMedicamento
        return medicamentosDao.findById(medicamento.getId()).orElse(null); // Cambiado a Medicamentos
    }

    @Override
    @Transactional
    public void save(Medicamentos medicamento) { // Cambiado a Medicamentos
        medicamentosDao.save(medicamento);
    }

    @Override
    @Transactional
    public void delete(Medicamentos medicamento) { // Cambiado a Medicamentos
        medicamentosDao.delete(medicamento);
    }
}
