package com.example.demo;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.example.demo.dto.Usuario;

public class UserService {

private UserService userService;
	
	@BeforeEach
    public void init() {
		userService = new UserService();
	}
	
	@Test
	public void crearUsuarioTest() {
		Usuario usuario = new Usuario(123, "Marica", "altura", 15653, "marida@gmail.es", "Avd. de la");
		
		assertEquals(123, usuario.getID());
		assertEquals("Marica", usuario.getFirstName());
		assertEquals("altura", usuario.getLastName());
		assertEquals(15653, usuario.getPhone());
		assertEquals("marida@gmail.es", usuario.getMail());
		assertEquals("Avd. de la", usuario.getDireccion());
	}
}
