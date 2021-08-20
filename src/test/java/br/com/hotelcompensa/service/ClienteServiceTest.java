package br.com.hotelcompensa.service;

import java.time.LocalDate;

import javax.inject.Inject;

import org.junit.jupiter.api.Test;

import br.com.hotelcompensa.model.Cliente;
import br.com.hotelcompensa.model.Endereco;
import br.com.hotelcompensa.model.Telefone;
import io.quarkus.test.junit.QuarkusTest;

@QuarkusTest
public class ClienteServiceTest {

	@Inject
	ClienteService service;

	@Test
	void deveSalvarClienteSucesso() {

		Cliente cliente = new Cliente();
		cliente.setCpf("123456785-85");
		cliente.setDataNascimento(LocalDate.now());
		cliente.setEmail("teste@teste");
		cliente.setSexo('F');
		cliente.setNome("Teste");
		cliente.setTelefone(preencheTelefone());
		cliente.setEndereco(preencheEndereco());

		service.criarCliente(cliente);
		
	}

	private Endereco preencheEndereco() {
		Endereco endereco = new Endereco();
		endereco.setCep("05489665");
		endereco.setCidade("São Paulo");
		endereco.setEstado("SP");
		endereco.setBairro("Vila Clementino");
		endereco.setLogradouro("R. dos testes");
		endereco.setNumero("123");
		endereco.setComplemento("apartamento 34");
		return endereco;

	}

	private Telefone preencheTelefone() {
		Telefone telefone = new Telefone();
		telefone.setDdd("11");
		telefone.setTelefone("254123654");
		telefone.setTipoTelefone("Residencial");
		telefone.setFlagTelefonePrincipal("S");
		return telefone;
	}

}
