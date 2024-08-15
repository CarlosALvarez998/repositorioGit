package com.personas.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.personas.entidad.Personas;
import com.personas.request.PersonasRequest;
import com.personas.services.PersonasServices;

@RestController
@RequestMapping("api/v1/personas")
public class PersonasController {

	 @Autowired
	  PersonasServices services;

	@GetMapping
	    public ResponseEntity<List<PersonasRequest>>mostrar(){
	  List<PersonasRequest> persona = services.mostrar();
	    return new ResponseEntity<>(persona, HttpStatus.OK);
	}


	@PostMapping
	    public ResponseEntity<Personas>guardar(@RequestBody PersonasRequest request){
	    Personas persona =services.actualizar(request);
	    return new ResponseEntity<Personas>(persona, HttpStatus.OK);

	}

	@PutMapping
	    public ResponseEntity<Personas> actualizar (@RequestBody  PersonasRequest requets){
	    Personas persona = services.actualizar(requets);
	    return new ResponseEntity<Personas>(persona, HttpStatus.OK);

	}
	@GetMapping("/buscar/{curp}")
	    public ResponseEntity<Personas> buscar (@PathVariable String curp){
	    Personas persona = services.buscar(curp);
	    return new ResponseEntity<Personas>(persona, HttpStatus.OK);
	}

}
