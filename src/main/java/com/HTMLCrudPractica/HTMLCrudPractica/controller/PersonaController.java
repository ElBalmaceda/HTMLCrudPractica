package com.HTMLCrudPractica.HTMLCrudPractica.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.*;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import com.HTMLCrudPractica.HTMLCrudPractica.model.Persona;
import com.HTMLCrudPractica.HTMLCrudPractica.service.PersonaService;



@Controller
@RequestMapping("/personas")
public class PersonaController 
{
	@Autowired
	private PersonaService personaService;
	
	@GetMapping
	public String listarPersonas(Model model) 
	{
		model.addAttribute("personas",personaService.findAll());
		return "persona-list";
	}
	
	@GetMapping("/nuevo")
	public String mostrarFormularioNuevaPersona(Model model) 
	{
		model.addAttribute("persona", new Persona());
		return "persona-form";
	}
	
	@PostMapping
	public String guardarPersona(Persona persona) 
	{
		personaService.save(persona);
		return "redirect:/personas";
	}
	
	@GetMapping("/editar/{id}")
	public String mostrarFormularioEditarPersona(@PathVariable Long id, Model model) 
	{
		model.addAttribute("persona", personaService.findById(id));
		return "persona-form";
	}

	@GetMapping("/eliminar/{id}")
	public String eliminarPersona(@PathVariable Long id)
	{
		personaService.delete(id);
		return "redirect:/personas";
	}
	
	
	
	
	
	
}
