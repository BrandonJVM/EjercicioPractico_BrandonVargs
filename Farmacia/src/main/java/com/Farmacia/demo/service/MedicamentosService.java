
package com.Farmacia.demo.service;

import com.Farmacia.demo.domain.Medicamentos;
import java.util.List;

public interface MedicamentosService {


    public List<Medicamentos> getMedicamentoss();

    // Se obtiene un Categoria, a partir del id de un categoria
    public Medicamentos getMedicamentos(Medicamentos medicamentos);
    
    // Se inserta un nuevo categoria si el id del categoria esta vacío
    // Se actualiza un categoria si el id del categoria NO esta vacío
    public void save(Medicamentos medicamentos);
    
    // Se elimina el categoria que tiene el id pasado por parámetro
    public void delete(Medicamentos medicamentos);
}
