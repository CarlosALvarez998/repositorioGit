package com.personas.request;

import java.time.LocalDate;

public class PersonasRequest {

	

    private int personasCol;
    private String nombre;
    private String apellidos;
    private LocalDate fechaNacimiento;
    private int edad;
    private String curp;
    private String lugarNacimiento;
    private int hijos;
	public PersonasRequest() {
		super();
	}
	public PersonasRequest(int personasCol, String nombre, String apellidos, LocalDate fechaNacimiento, int edad,
			String curp, String lugarNacimiento, int hijos) {
		super();
		this.personasCol = personasCol;
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.fechaNacimiento = fechaNacimiento;
		this.edad = edad;
		this.curp = curp;
		this.lugarNacimiento = lugarNacimiento;
		this.hijos = hijos;
	}
	public int getPersonasCol() {
		return personasCol;
	}
	public void setPersonasCol(int personasCol) {
		this.personasCol = personasCol;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getApellidos() {
		return apellidos;
	}
	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}
	public LocalDate getFechaNacimiento() {
		return fechaNacimiento;
	}
	public void setFechaNacimiento(LocalDate fechaNacimiento) {
		this.fechaNacimiento = fechaNacimiento;
	}
	public int getEdad() {
		return edad;
	}
	public void setEdad(int edad) {
		this.edad = edad;
	}
	public String getCurp() {
		return curp;
	}
	public void setCurp(String curp) {
		this.curp = curp;
	}
	public String getLugarNacimiento() {
		return lugarNacimiento;
	}
	public void setLugarNacimiento(String lugarNacimiento) {
		this.lugarNacimiento = lugarNacimiento;
	}
	public int getHijos() {
		return hijos;
	}
	public void setHijos(int hijos) {
		this.hijos = hijos;
	}
	@Override
	public String toString() {
		return "PersonasRequest [personasCol=" + personasCol + ", nombre=" + nombre + ", apellidos=" + apellidos
				+ ", fechaNacimiento=" + fechaNacimiento + ", edad=" + edad + ", curp=" + curp + ", lugarNacimiento="
				+ lugarNacimiento + ", hijos=" + hijos + "]";
	}
    
    
    
}
