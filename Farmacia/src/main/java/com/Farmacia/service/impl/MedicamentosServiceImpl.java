/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.Farmacia.service.impl;
import com.Farmacia.domain
import com.Farmacia.domain.Medicamentos;
import com.Farmacia.service.MedicamentosService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class MedicamentosServiceImpl  implements MedicamentoService {

    private final MedicamentoDao medicamentoDao;

    @Autowired
    public MedicamentoServiceImpl(MedicamentoDao medicamentoDao) {
        this.medicamentoDao = medicamentoDao;
    }

    @Override
    public Medicamento save(Medicamento medicamento) {
        return medicamentoDao.save(medicamento);
    }

    @Override
    public Optional<Medicamento> findById(Long id) {
        return medicamentoDao.findById(id);
    }

    @Override
    public List<Medicamento> findAll() {
        return medicamentoDao.findAll();
    }

    @Override
    public Medicamento update(Long id, Medicamento medicamento) {
        if (medicamentoDao.existsById(id)) {
            medicamento.setId(id); // Set the ID of the existing entity
            return medicamentoDao.save(medicamento);
        }
        return null; // Or throw an exception if not found
    }

    @Override
    public void delete(Long id) {
        if (medicamentoDao.existsById(id)) {
            medicamentoDao.deleteById(id);
        }
        // Optionally throw an exception if not found
    }
}