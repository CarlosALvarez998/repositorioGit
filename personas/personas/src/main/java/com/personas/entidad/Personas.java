package com.personas.entidad;

import java.io.Serializable;
import java.time.LocalDate;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "personas")
public class Personas implements Serializable{
	private static final long serialVersionUID = 1L;

	 @Id
	    @Column(name = "personascol", columnDefinition = "INT")
	    @GeneratedValue(strategy = GenerationType.IDENTITY)
	    private int  personasCol;

	     @Column(name="nombre", columnDefinition = "VARCHAR(45)")
	    private String nombre;

	     @Column(name="apellidos",columnDefinition = "VARCHAR(45)")
	    private String apellidos;

	     @Column(name = "fecha_nacimiento", columnDefinition = "DATE")
	    private LocalDate fechaNacimiento;

	     @Column(name = "edad", columnDefinition = "INT")
	    private int edad;

	     @Column(name = "curp", columnDefinition = "VARCHAR(45)")
	    private String curp;

	     @Column(name="lugar_nacimiento", columnDefinition = "VARCHAR(45)")
	    private String lugarNacimiento;

	     @Column(name ="hijos", columnDefinition = "INT")
	    private int hijos;

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

		public static long getSerialversionuid() {
			return serialVersionUID;
		}
	     
	     
	     
	     
	
}
