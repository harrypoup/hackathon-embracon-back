package com.embracon.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.embracon.model.Cliente;
import com.embracon.model.Usuario;
import com.embracon.repository.ClientesRepository;
import com.embracon.repository.UsuariosRepository;

@Service
public class ClientesService {

	@Autowired
	private ClientesRepository clientRepository;

	@Autowired
	private UsuariosRepository userRepository;

	public ResponseEntity<List<Cliente>> getAllCustomers() {
		return new ResponseEntity<List<Cliente>>(this.clientRepository.findAll(), HttpStatus.OK);
	}

	public ResponseEntity<?> getAllUsuarios() {
		return new ResponseEntity<List<Usuario>>(this.userRepository.findAll(), HttpStatus.OK);
	}

}
