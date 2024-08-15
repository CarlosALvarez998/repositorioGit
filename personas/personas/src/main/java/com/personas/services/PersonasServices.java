package com.personas.services;

import java.util.ArrayList;
import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.personas.entidad.Personas;
import com.personas.interfacesservices.InterfacesServices;
import com.personas.repository.PersonasRepository;
import com.personas.request.PersonasRequest;

@Service
public class PersonasServices implements InterfacesServices{

	 @Autowired
	   PersonasRepository pere;


	    @Override
	    public List<PersonasRequest> mostrar() {
	        List<PersonasRequest>perso=new ArrayList<PersonasRequest>();
	        PersonasRequest out = null;

	        for(Personas temp: pere.findAll()){

	            out= new PersonasRequest(temp.getPersonasCol(),temp.getNombre(), temp.getApellidos(),temp.getFechaNacimiento(),
	                    temp.getEdad(), temp.getCurp(),temp.getLugarNacimiento(), temp.getHijos());

	            perso.add(out);
	    }

	        return perso;
	    }

	    @Override
	    public Personas buscar(String curp) {
	        Personas persona =null;
	        if (pere.findByCurp(curp) != null){

	            persona=pere.findByCurp(curp).get();
	        }
	        return persona;
	    }

		@Override
		public Personas guardar(PersonasRequest request) {
			  Personas persona = new Personas();
			  persona.setPersonasCol(request.getPersonasCol());
		        persona.setNombre(request.getNombre());
		        persona.setApellidos(request.getApellidos());
		        persona.setFechaNacimiento(request.getFechaNacimiento());
		        persona.setEdad(request.getEdad());
		        persona.setCurp(request.getCurp());
		        persona.setLugarNacimiento(request.getLugarNacimiento());
		        persona.setHijos(request.getHijos());

		        pere.save(persona);
		        return persona;
		    }

		@Override
		public Personas actualizar(PersonasRequest request) {
		      Personas persona = null;
		  	if (pere.findByID(request.getPersonasCol()).isPresent()){
		  	    persona.setNombre(request.getNombre());
		  	    persona.setApellidos(request.getApellidos());
		  	    persona.setFechaNacimiento(request.getFechaNacimiento());
		  	    persona.setEdad(request.getEdad());
		  	    persona.setCurp(request.getCurp());
		  	    persona.setLugarNacimiento(request.getLugarNacimiento());
		  	    persona.setHijos(request.getHijos());

		  	    pere.save(persona);
		  	}else {
		  	    System.out.println("no se pudo actualizar");
		  	}
		  	        return persona;
		  	    }
	
}
