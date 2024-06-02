package com.example.demo.service;

import java.time.LocalDate;
import java.util.HashMap;

import org.springframework.stereotype.Service;

import com.example.demo.dto.Estado;
import com.example.demo.dto.Pedido;
import com.example.demo.dto.Usuario;

@Service
public class PedidosService {

	private HashMap<Long, Pedido> pedidos = new HashMap<>();
	
	public void crearPedido(Long ID, double precio, Usuario usuario) {
		this.pedidos.put(ID, new Pedido(precio, Estado.CREADO, LocalDate.now(), usuario));
	}
	
	public Pedido buscarPedido(Long ID) {
		return pedidos.get(ID);
	}
	
	public void procesarPedido(Long ID) {
		buscarPedido(ID).setEstado(Estado.PROCESADO);
	}
	
	public void borrarPedido(Long ID) {
		Pedido pedido = buscarPedido(ID);
		
		if (pedido.getEstado() != Estado.PROCESADO) {
			pedido.setEstado(Estado.BORRADO);
		}
	}
	
}