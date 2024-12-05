package com.HTMLCrudPractica.HTMLCrudPractica.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.HTMLCrudPractica.HTMLCrudPractica.model.Persona;

public interface PersonaRepository extends JpaRepository<Persona,Long>
{

}
