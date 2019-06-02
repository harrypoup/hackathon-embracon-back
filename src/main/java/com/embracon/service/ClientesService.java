package com.embracon.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.embracon.model.Cliente;
import com.embracon.model.Usuario;
import com.embracon.repository.ClientesRepository;

@Service
public class ClientesService {

	@Autowired
	private ClientesRepository repository;

	public ResponseEntity<List<Cliente>> getAllCustomers() {
		return new ResponseEntity<List<Cliente>>(this.repository.getAllCustomers(), HttpStatus.OK);
	}

	public ResponseEntity<?> getAllUsuarios() {
		return new ResponseEntity<List<Usuario>>(this.repository.getAllUsuarios(), HttpStatus.OK);
	}

}
