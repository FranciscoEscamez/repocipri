package com.example.demo.service;

import java.util.HashMap;

import org.springframework.stereotype.Service;

import com.example.demo.dto.Usuario;

@Service
public class UserService {

	private HashMap<Long, Usuario> usuarios = new HashMap<>();
	
	public void crearUsuario(Long ID, String firstName, String lastName, Long phone, String mail, String direccion) {
		this.usuarios.put(ID, new Usuario(ID, firstName, lastName, phone, mail, direccion) );
	}
	
	public Usuario buscarUsuario(Long ID) {
		return usuarios.get(ID);
	}
	
	public void borrarUsuario(Long ID) {
		Usuario usuario = buscarUsuario(ID);
		
		usuarios.remove(usuario);
	}
	
}
