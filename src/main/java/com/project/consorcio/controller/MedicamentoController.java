package com.project.consorcio.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.project.consorcio.services.MedicamentoServices;
import com.project.consorcio.services.TipoMedicamentoServices;

//Controller permite que la viste envie un request y pueda acceder a las direfentes direcciones url
@Controller
//RequestMapping permite crear direcciones url para que el cliente acceda
@RequestMapping("/medicamento")
public class MedicamentoController {
	@Autowired
	private MedicamentoServices servicioMed;
	
	@Autowired
	private TipoMedicamentoServices servicioTipo_;
	
	
	//Crear direccion url para mostrar la pagina medicamento.hmtl
	
	@RequestMapping("/lista")
	public String index(Model model) {
		//crear atributo
		model.addAttribute("medicamentos",servicioMed.listarTodos());
		model.addAttribute("tipos",servicioTipo_.listarTodos());
		return "medicamento";
	}
}
