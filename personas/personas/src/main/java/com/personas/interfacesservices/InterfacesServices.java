package com.personas.interfacesservices;

import java.util.List;

import com.personas.entidad.Personas;
import com.personas.request.PersonasRequest;

public interface InterfacesServices {

	
	Personas guardar (PersonasRequest request);
    Personas actualizar (PersonasRequest request);
    List mostrar();
    Personas buscar (String curp);
}
