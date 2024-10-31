package com.Farmacia.demo.controller;

import com.Farmacia.demo.service.impl.FirebaseStorageServiceImpl;
import com.Farmacia.demo.domain.Medicamentos; // Cambiado a Medicamentos
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;
import com.Farmacia.demo.service.MedicamentosService; // Cambiado a MedicamentosService

@Controller
@RequestMapping("/medicamentos") // Cambiado a /medicamentos
public class MedicamentosController {
  
    @Autowired
    private MedicamentosService medicamentosService; // Cambiado a medicamentosService
    
    @GetMapping("/listado")
    private String listado(Model model) {
        var medicamentos = medicamentosService.getMedicamentoss(); // Cambiado a getMedicamentos
        model.addAttribute("medicamentos", medicamentos); // Cambiado a medicamentos
        model.addAttribute("totalMedicamentos", medicamentos.size()); // Cambiado a totalMedicamentos
        return "/medicamentos/listado"; // Cambiado a /medicamentos/listado
    }
    
    @GetMapping("/nuevo")
    public String medicamentosNuevo(Medicamentos medicamentos) { // Cambiado a medicamentos
        return "/medicamentos/modifica"; // Cambiado a /medicamentos/modifica
    }

    @Autowired
    private FirebaseStorageServiceImpl firebaseStorageService;

    @PostMapping("/guardar")
    public String medicamentosGuardar(Medicamentos medicamentos, // Cambiado a medicamentos
            @RequestParam("imagenFile") MultipartFile imagenFile) {
        medicamentosService.save(medicamentos); // Cambiado a medicamentosService.save
        return "redirect:/medicamentos/listado"; // Cambiado a /medicamentos/listado
    }

    @GetMapping("/eliminar/{idMedicamento}") // Cambiado a idMedicamento
    public String medicamentosEliminar(Medicamentos medicamentos) { // Cambiado a medicamentos
        medicamentosService.delete(medicamentos); // Cambiado a medicamentosService.delete
        return "redirect:/medicamentos/listado"; // Cambiado a /medicamentos/listado
    }

    @GetMapping("/modificar/{idMedicamento}") // Cambiado a idMedicamento
    public String medicamentosModificar(Medicamentos medicamentos, Model model) { // Cambiado a medicamentos
        medicamentos = medicamentosService.getMedicamentos(medicamentos); // Cambiado a getMedicamento
        model.addAttribute("medicamento", medicamentos); // Cambiado a medicamento
        return "/medicamentos/modifica"; // Cambiado a /medicamentos/modifica
    }   
}
