package com.example.demomapstruct.dto;

public class EmpleadoDTO {

	private Integer id;
	private String nombreEmpleado;
	private SedeDTO sede;
	private String fechaIngreso;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getNombreEmpleado() {
		return nombreEmpleado;
	}

	public void setNombreEmpleado(String nombreEmpleado) {
		this.nombreEmpleado = nombreEmpleado;
	}

	public SedeDTO getSede() {
		return sede;
	}

	public void setSede(SedeDTO sede) {
		this.sede = sede;
	}

	public String getFechaIngreso() {
		return fechaIngreso;
	}

	public void setFechaIngreso(String fechaIngreso) {
		this.fechaIngreso = fechaIngreso;
	}

	@Override
	public String toString() {
		return "EmpleadoDTO [id=" + id + ", nombreEmpleado=" + nombreEmpleado + ", sede=" + sede + ", fechaIngreso="
				+ fechaIngreso + "]";
	}

}
