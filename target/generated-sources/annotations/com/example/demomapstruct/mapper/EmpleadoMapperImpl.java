package com.example.demomapstruct.mapper;

import com.example.demomapstruct.dto.EmpleadoDTO;
import com.example.demomapstruct.dto.SedeDTO;
import com.example.demomapstruct.model.Empleado;
import com.example.demomapstruct.model.Sede;
import java.text.ParseException;
import java.text.SimpleDateFormat;

/*
@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2022-04-25T18:04:35-0500",
    comments = "version: 1.3.1.Final, compiler: javac, environment: Java 11.0.12 (Oracle Corporation)"
)
*/
public class EmpleadoMapperImpl implements EmpleadoMapper {

    @Override
    public Empleado empleadoDTOToEmpleado(EmpleadoDTO empleadoDTO) {
        if ( empleadoDTO == null ) {
            return null;
        }

        Empleado empleado = new Empleado();

        try {
            if ( empleadoDTO.getFechaIngreso() != null ) {
                empleado.setFechaIngreso( new SimpleDateFormat( "dd-MM-yyyy HH:mm:ss" ).parse( empleadoDTO.getFechaIngreso() ) );
            }
        }
        catch ( ParseException e ) {
            throw new RuntimeException( e );
        }
        empleado.setNombre( empleadoDTO.getNombreEmpleado() );
        empleado.setId( empleadoDTO.getId() );
        empleado.setSede( sedeDTOToSede( empleadoDTO.getSede() ) );

        return empleado;
    }

    @Override
    public EmpleadoDTO empleadoToEmpleadoDTO(Empleado empleado) {
        if ( empleado == null ) {
            return null;
        }

        EmpleadoDTO empleadoDTO = new EmpleadoDTO();

        empleadoDTO.setNombreEmpleado( empleado.getNombre() );
        if ( empleado.getFechaIngreso() != null ) {
            empleadoDTO.setFechaIngreso( new SimpleDateFormat( "dd-MM-yyyy HH:mm:ss" ).format( empleado.getFechaIngreso() ) );
        }
        empleadoDTO.setId( empleado.getId() );
        empleadoDTO.setSede( sedeToSedeDTO( empleado.getSede() ) );

        return empleadoDTO;
    }

    @Override
    public Sede sedeDTOToSede(SedeDTO sedeDTO) {
        if ( sedeDTO == null ) {
            return null;
        }

        Sede sede = new Sede();

        sede.setId( sedeDTO.getId() );
        sede.setNombre( sedeDTO.getNombre() );

        return sede;
    }

    @Override
    public SedeDTO sedeToSedeDTO(Sede sede) {
        if ( sede == null ) {
            return null;
        }

        SedeDTO sedeDTO = new SedeDTO();

        sedeDTO.setId( sede.getId() );
        sedeDTO.setNombre( sede.getNombre() );

        return sedeDTO;
    }
}
