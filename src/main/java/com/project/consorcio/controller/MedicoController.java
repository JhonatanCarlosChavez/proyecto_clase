package com.project.consorcio.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.project.consorcio.services.DistritoServices;
import com.project.consorcio.services.EspecialidadServices;
import com.project.consorcio.services.MedicoServices;
import com.project.consorcio.services.SedeServices;

@Controller
@RequestMapping("/medico")
public class MedicoController {
	@Autowired
	private EspecialidadServices especialidadMed;
	
	@Autowired
	private DistritoServices distritoMed;
	
	@Autowired
	private SedeServices sedeMed;
	
	@Autowired
	private MedicoServices medicoMed;
	
	@RequestMapping("/lista")
	
	public String index(Model model) {
		model.addAttribute("medicos",medicoMed.listarTodos());
		model.addAttribute("distritos",distritoMed.listarTodos());
		model.addAttribute("especialidades",especialidadMed.listarTodos());
		model.addAttribute("sedes",sedeMed.listarTodos());
		return "medico";
	}
}
