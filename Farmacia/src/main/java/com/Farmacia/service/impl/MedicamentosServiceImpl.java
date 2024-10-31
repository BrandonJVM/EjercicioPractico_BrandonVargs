/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.Farmacia.service.impl;

import com.Farmacia.domain.Medicamentos;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.Farmacia.service.MedicamentosService;
import com.Farmacia.dao.MedicamentosDao;

@Service
public class MedicamentosServiceImpl implements MedicamentosService {

    @Autowired
    private final MedicamentosDao medicamentoDao;

    @Override
    @Transactional(readOnly = true)
    public List<Medicamentos> getMedicamentos(boolean activos) {
        var lista = medicamentoDao.findAll();
        /*if (activos) {
            lista.removeIf(e -> !e.isActivo());
        }*/
        return lista;
    }
    @Override
    @Transactional(readOnly = true)
    public Medicamentos getCategoria(Medicamentos medicamientos) {
        return medicamentoDao.findById(medicamientos.getId()).orElse(null);
    }

    @Override
    @Transactional
    public void save(Medicamentos medicamentos) {
        medicamentoDao.save(medicamentos);
    }

    @Override
    @Transactional
    public void delete(Medicamentos medicamentos) {
        medicamentoDao.delete(medicamentos);
    }
}
