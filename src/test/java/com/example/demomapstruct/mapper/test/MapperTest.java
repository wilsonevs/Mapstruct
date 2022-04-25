package com.example.demomapstruct.mapper.test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import java.util.Date;

import org.junit.Test;
import org.mapstruct.factory.Mappers;

import com.example.demomapstruct.dto.EmpleadoDTO;
import com.example.demomapstruct.dto.PersonaDTO;
import com.example.demomapstruct.mapper.EmpleadoMapper;
import com.example.demomapstruct.mapper.PersonaMapper;
import com.example.demomapstruct.model.Empleado;
import com.example.demomapstruct.model.Persona;
import com.example.demomapstruct.model.Sede;

public class MapperTest {
	
	private PersonaMapper personaMapper = Mappers.getMapper(PersonaMapper.class);
	
	private EmpleadoMapper empleadoMapper = Mappers.getMapper(EmpleadoMapper.class);
	
	@Test
	public void personaSimpleMapperTest() {
		Persona persona = new Persona();
		persona.setId(1L);
		persona.setNombre("Jordy");
		persona.setApellido("Rodriguez");
		persona.setDireccion("Cra 1000");
		persona.setTelefono("3121212");
		
		PersonaDTO personaDTO = personaMapper.personaToPersonaDTO(persona);
		System.out.println(persona);
		System.out.println(personaDTO);
		assertEquals(personaDTO.getId(), persona.getId()); 
	}
	
	@Test
	public void empleadoSimpleTest() {
		Empleado empleado = new Empleado();
		empleado.setId(1);
		empleado.setNombre("Carlos");
		empleado.setFechaIngreso(new Date());
		
		Sede sede = new Sede();
		sede.setId(1);
		sede.setNombre("Cali");
		
		empleado.setSede(sede);
		
		EmpleadoDTO empleadoDTO = empleadoMapper.empleadoToEmpleadoDTO(empleado);
		System.out.println(empleado);
		System.out.println(empleadoDTO);
		assertEquals(empleado.getNombre(), empleadoDTO.getNombreEmpleado());
		assertNotNull(empleadoDTO.getSede());
	}

}
