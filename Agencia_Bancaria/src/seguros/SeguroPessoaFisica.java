package seguros;

import contas.Conta;

public class SeguroPessoaFisica extends Conta{

	public static void main(String[] args) {
		SeguroPessoaFisica cc3 = new SeguroPessoaFisica();
		cc3.cliente = "Victor Carvalho";
		cc3.saldo = 80000;
		System.out.println("Cliente: " + cc3.cliente);
		cc3.exibirSaldo();

	}

}
