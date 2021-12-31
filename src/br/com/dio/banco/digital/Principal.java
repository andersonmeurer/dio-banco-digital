package br.com.dio.banco.digital;

import br.com.dio.banco.digital.entity.Cliente;
import br.com.dio.banco.digital.entity.Conta;
import br.com.dio.banco.digital.entity.ContaCorrente;
import br.com.dio.banco.digital.entity.ContaPoupanca;
import br.com.dio.banco.digital.service.ServiceConta;

public class Principal {

	public static void main(String[] args) throws Exception {
		new Principal();
	}

	public Principal() {
		Cliente anderson = new Cliente();
		anderson.setNome("Anderson");

		ServiceConta service = new ServiceConta();
		Conta contaCorrente = new ContaCorrente(anderson);
		Conta contaPoupanca = new ContaPoupanca(anderson);

		try {
			service.depositar(contaCorrente, 1000);
			service.transferir(contaCorrente, contaPoupanca, 500);
		} catch (Exception e) {
			e.printStackTrace();
		}

		contaCorrente.imprimirExtrato();
		contaPoupanca.imprimirExtrato();
	}
}