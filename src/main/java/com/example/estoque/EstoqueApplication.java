package com.example.estoque;

import com.example.estoque.model.*;
import com.example.estoque.service.*;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.time.LocalDateTime;

@SpringBootApplication
public class EstoqueApplication {

	public static void main(String[] args) {
		System.out.println("Projeto iniciado");
		SpringApplication.run(EstoqueApplication.class, args);
		
	}

	@Bean
	public CommandLineRunner demo(
			ClienteService clienteService,
			DistribuidoraService distribuidoraService,
			MercadoriaService mercadoriaService,
			EstoqueService estoqueService,
			FuncionarioService funcionarioService,
			ConsultaService consultaService) {

		return (args) -> {
			// Cadastro de Cliente
			Cliente cliente = new Cliente();
			cliente.setNome("João Silva");
			cliente.setEndereco("Rua das Flores, 123");
			cliente.setCpf("12345678901");
			clienteService.salvarOuAtualizar(cliente);

			// Cadastro de Distribuidora
			Distribuidora distribuidora = new Distribuidora();
			distribuidora.setCnpj("98765432100001");
			distribuidora.setNomeFantasia("Distribuidora Central");
			distribuidoraService.salvarOuAtualizar(distribuidora);

			// Cadastro de Mercadoria
			Mercadoria mercadoria = new Mercadoria();
			mercadoria.setNome("Arroz");
			mercadoria.setPrecoDeCompra(20.0);
			mercadoria.setPrecoDeVenda(25.0);
			mercadoria.setTipo("Alimento");
			mercadoria.setMarca("Marca A");
			mercadoriaService.salvarOuAtualizar(mercadoria);

			// Cadastro de Estoque
			Estoque estoque = new Estoque();
			estoque.setMercadoria(mercadoria);
			estoque.setQuantidade(100);
			estoqueService.salvarOuAtualizar(estoque);

			// Cadastro de Funcionário
			Funcionario funcionario = new Funcionario();
			funcionario.setNome("Maria Oliveira");
			funcionario.setDataAcesso(LocalDateTime.now());
			funcionario.setHoraAcesso("09:00");
			funcionarioService.salvarOuAtualizar(funcionario);

			// Cadastro de Consulta
			Consulta consulta = new Consulta();
			consulta.setConsultarNome("João Silva");
			consulta.setConsultarMarca("Marca A");
			consulta.setConsultarProduto("Arroz");
			consulta.setDataConsulta(LocalDateTime.now());
			consultaService.salvarOuAtualizar(consulta);

			// Exibição dos dados cadastrados
			System.out.println(clienteService.listarTodos());
			System.out.println(distribuidoraService.listarTodas());
			System.out.println(mercadoriaService.listarTodas());
			System.out.println(estoqueService.listarTodos());
			System.out.println(funcionarioService.listarTodos());
			System.out.println(consultaService.listarTodas());
		};
	}
}
