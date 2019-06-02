package com.embracon.repository;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.embracon.model.Cliente;
import com.embracon.model.Consorcio;
import com.embracon.model.EnumTipoConsorcio;
import com.embracon.model.EnumTipoUsuario;
import com.embracon.model.Parcela;
import com.embracon.model.Usuario;

@Repository
public class ClientesRepository {

	public List<Cliente> getAllCustomers() {
		
		List<Parcela> parcelas = new ArrayList<>();
		parcelas.add(new Parcela(1L, true));
		parcelas.add(new Parcela(2L, true));
		parcelas.add(new Parcela(3L, true));
		parcelas.add(new Parcela(4L, true));
		parcelas.add(new Parcela(5L, true));
		parcelas.add(new Parcela(6L, false));
		
		List<Consorcio> consorcios = new ArrayList<>();
		Consorcio consorcio = new Consorcio(1L, "Consórcio para a compra de uma moto", EnumTipoConsorcio.CARRO, parcelas);
		consorcios.add(consorcio);
		
		
		ArrayList<Cliente> customers = new ArrayList<>();
		customers.add(new Cliente(100L, "Enoque Leal", "791.415.356-77", "enoque@gmail.com", "25", "11984550000", consorcios));
		customers.add(new Cliente(100L, "Rafael Ribeiro", "252.085.570-37", "rafael@gmail.com", "25", "11552050000", consorcios));
		return customers;
	}

	public List<Usuario> getAllUsuarios() {
		
		List<Parcela> parcelas = new ArrayList<>();
		parcelas.add(new Parcela(1L, true));
		parcelas.add(new Parcela(2L, true));
		parcelas.add(new Parcela(3L, true));
		parcelas.add(new Parcela(4L, true));
		parcelas.add(new Parcela(5L, true));
		parcelas.add(new Parcela(6L, false));
		
		List<Consorcio> consorcios = new ArrayList<>();
		Consorcio consorcio = new Consorcio(1L, "Consórcio para a compra de uma moto", EnumTipoConsorcio.CARRO, parcelas);
		consorcios.add(consorcio);
		
		ArrayList<Cliente> customers = new ArrayList<>();
		customers.add(new Cliente(100L, "Enoque Leal", "791.415.356-77", "enoque@gmail.com", "25", "11984550000", consorcios));
		
		List<Usuario> usuarios = new ArrayList<>();
		usuarios.add(new Usuario(100L, "Enoque", "123456", EnumTipoUsuario.CONSORCIADO, new Cliente(100L, "Enoque Leal", "791.415.356-77", "enoque@gmail.com", "25", "11984550000", consorcios)));
		return usuarios;
		
	}

}
