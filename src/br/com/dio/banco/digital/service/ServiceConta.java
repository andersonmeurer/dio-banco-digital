package br.com.dio.banco.digital.service;

import br.com.dio.banco.digital.entity.Conta;

public class ServiceConta {

	public void depositar(Conta conta, double valor) throws Exception {
		if (null == conta) {
			throw new Exception("Conta de destino não pode ser null!");
		}
		if (valor <= 0) {
			throw new Exception("O valor do depósito deve ser maior que 0.0!");
		}
		conta.depositar(valor);
	}

	public void transferir(Conta origem, Conta destino, int valor) throws Exception {
		if (null == origem) {
			throw new Exception("Conta de origem não pode ser null!");
		}
		if (null == destino) {
			throw new Exception("Conta de destino não pode ser null!");
		}
		if (valor <= 0) {
			throw new Exception("O valor da transferência deve ser maior que 0.0!");
		}
		origem.transferir(valor, destino);
	}
}