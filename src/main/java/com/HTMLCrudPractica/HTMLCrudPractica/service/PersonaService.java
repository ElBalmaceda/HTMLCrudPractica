package com.HTMLCrudPractica.HTMLCrudPractica.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.HTMLCrudPractica.HTMLCrudPractica.model.Persona;
import com.HTMLCrudPractica.HTMLCrudPractica.repository.PersonaRepository;

@Service
public class PersonaService 
{
	
	//Inyecta dependencias
	@Autowired
	private PersonaRepository personaRepository;
	
	//Mostrar todos
	public List<Persona> findAll()
	{
		return personaRepository.findAll();
	}
	
	//Muestra por id
	public Optional<Persona> findById(Long id)
	{
		return personaRepository.findById(id);
	}
	
	//Guarda en el "repositorio"
	public Persona save(Persona persona) 
	{
		return personaRepository.save(persona);
	}
	
	//Elimina segun el id
	public void delete(Long id) 
	{
		personaRepository.deleteById(id);
	}
}
