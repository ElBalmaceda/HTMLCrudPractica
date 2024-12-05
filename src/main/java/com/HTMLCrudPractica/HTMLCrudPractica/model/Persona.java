package com.HTMLCrudPractica.HTMLCrudPractica.model;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
public class Persona 
{
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;
	private String nombre;
	private String apellido;
	private String email;
	private String telefono;
	private String direccion;
}
