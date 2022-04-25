package com.example.demomapstruct.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;

import com.example.demomapstruct.dto.EmpleadoDTO;
import com.example.demomapstruct.dto.SedeDTO;
import com.example.demomapstruct.model.Empleado;
import com.example.demomapstruct.model.Sede;

@Mapper
public interface EmpleadoMapper {
	
	@Mappings({
		@Mapping(target = "nombre", source = "empleadoDTO.nombreEmpleado"),
		@Mapping(target = "fechaIngreso", source = "empleadoDTO.fechaIngreso", dateFormat = "dd-MM-yyyy HH:mm:ss")
	})
	Empleado empleadoDTOToEmpleado(EmpleadoDTO empleadoDTO);
	
	@Mappings({
		@Mapping(target = "nombreEmpleado", source = "empleado.nombre"),
		@Mapping(target = "fechaIngreso", source = "empleado.fechaIngreso", dateFormat = "dd-MM-yyyy HH:mm:ss")
	})
	EmpleadoDTO empleadoToEmpleadoDTO(Empleado empleado);
	
	Sede sedeDTOToSede(SedeDTO sedeDTO);
	
	SedeDTO sedeToSedeDTO(Sede sede);

}
