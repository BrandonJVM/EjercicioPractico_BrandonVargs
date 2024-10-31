package com.Farmacia.dao;

import com.Farmacia.domain.Medicamentos; // Cambiado a Medicamentos
import org.springframework.data.jpa.repository.JpaRepository;

public interface MedicamentosDao extends JpaRepository<Medicamentos, Long> { // Cambiado a Medicamentos
}
