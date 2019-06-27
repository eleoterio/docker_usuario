package com.eleoterio.softplan.resources;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.eleoterio.softplan.domain.Usuario;
@RestController
@RequestMapping(value="/usuarios")
public class UsuarioResource {
	
	@RequestMapping(method = RequestMethod.GET)
	public List<Usuario> listar() {
		Usuario u1 = new Usuario();
		u1.setId(1);
		u1.setNome("Luis");
		u1.setCpf("42089945698");
		Usuario u2 = new Usuario();
		u2.setId(2);
		u2.setNome("felipe");
		u2.setCpf("98748856321");
		
		List<Usuario> lista = new ArrayList<>();
		lista.add(u1);
		lista.add(u2);
		return lista;
	}

}
