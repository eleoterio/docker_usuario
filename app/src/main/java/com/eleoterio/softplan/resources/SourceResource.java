package com.eleoterio.softplan.resources;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value="/source")
public class SourceResource {

	@RequestMapping(method = RequestMethod.GET)
	public String listar() {
		String retorno = "<a href='https://github.com/eleoterio/usuario'>Projeto GIHUT</a>";
		retorno += "<br>";
		retorno += "<a href='https://www.linkedin.com/in/felipeeleoterio/'>Perfil Linkedin</a>";
		return retorno;
	}
}
