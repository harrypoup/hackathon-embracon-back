package com.embracon.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.embracon.model.Cliente;
import com.embracon.service.ClientesService;

@CrossOrigin(origins = "*")
@RequestMapping
@RestController
public class ClientesController {

	@Autowired
	private ClientesService service;

	@GetMapping(value = "/clientes")
	public ResponseEntity<List<Cliente>> getAllCustomers() {
		return this.service.getAllCustomers();
	}

	@GetMapping(value = "/usuarios")
	public ResponseEntity<?> getAllUsuarios() {
		return this.service.getAllUsuarios();
	}

	@PostMapping(value = "/auth")
	public ResponseEntity<?> findUser(@ModelAttribute String usuario, @ModelAttribute String senha) {
		return new ResponseEntity<Object>(HttpStatus.OK);
	}

}
