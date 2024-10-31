
package com.Farmacia.demo.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.Farmacia.demo.service.MedicamentosService;
import com.Farmacia.demo.dao.MedicamentosDao;
import com.Farmacia.demo.domain.Medicamentos;

@Service
public class MedicamentosServiceImpl implements MedicamentosService {

    @Autowired
    private MedicamentosDao medicamentoDao;

    @Override
    @Transactional(readOnly = true)
    public List<Medicamentos> getMedicamentoss() {
        var lista = medicamentoDao.findAll();
        /*if (activos) {
            lista.removeIf(e -> !e.isActivo());
        }*/
        return lista;
    }

    @Override
    @Transactional(readOnly = true)
    public Medicamentos getMedicamentos(Medicamentos medicamientos) {
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
