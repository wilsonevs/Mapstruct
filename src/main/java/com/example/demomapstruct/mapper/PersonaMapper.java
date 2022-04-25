package com.example.demomapstruct.mapper;

import org.mapstruct.Mapper;

import com.example.demomapstruct.dto.PersonaDTO;
import com.example.demomapstruct.model.Persona;

@Mapper
public interface PersonaMapper {

	Persona personaDTOToPersona(PersonaDTO personaDTO);
	PersonaDTO personaToPersonaDTO(Persona persona);
}
