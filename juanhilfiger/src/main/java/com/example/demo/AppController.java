package com.example.demo;

import java.time.LocalDate;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.dto.Pedido;
import com.example.demo.dto.Usuario;
import com.example.demo.service.PedidosService;
import com.example.demo.service.UserService;

@RestController
public class AppController {

	@Autowired
	private UserService userService;
	
	@Autowired
	private PedidosService pedidosService;
	
	@PostMapping("/crearPedido")
	public void crearPedido(@RequestParam Long id, @RequestParam double precio, @RequestParam Long idUsuario) {
		pedidosService.crearPedido(id, precio, userService.buscarUsuario(idUsuario));
	}
	
	@GetMapping("/buscarPedido")
	public Pedido buscarPedido(@RequestParam Long id) {
		return pedidosService.buscarPedido(id);
	}
	
	@PatchMapping("/procesarPedido")
	public void procesarPedido(@RequestParam Long id) {
		pedidosService.procesarPedido(id);
	}
	
	@DeleteMapping("/borrarPedido")
	public void borrarPedido(@RequestParam Long id) {
		pedidosService.borrarPedido(id);
	}
	
	@PostMapping("/crearUsuario")
	public void crearUsuario(@RequestParam Long id, @RequestParam String firstName, @RequestParam String lastName,@RequestParam Long phone,@RequestParam String mail,@RequestParam String direccion) {
		userService.crearUsuario(id, firstName, lastName, phone, mail, direccion);
	}
	
	@GetMapping("/buscarUsuario")
	public Usuario buscarUsuario(@RequestParam Long id) {
		return userService.buscarUsuario(id);
	}
	
	@DeleteMapping("/borrarUsuario")
	public void borrarUsuario(@RequestParam Long id) {
		userService.borrarUsuario(id);
	}
	
}
