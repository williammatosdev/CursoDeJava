/* Desenvolva uma aplicação no console(terminal) de 
 * ponto de vendas (PDV),conforme o modelo abaixo: 
 * 
 *    * Valor Total: 200,00
 *    * Desconto(%): 5
 *    * Total com Desconto: 190,00 (valor calculado)
 *    * Valor Pago: 200,00
 *    * Troco: 10,00 (valor calculado)*/
 
package exercicios;

import java.text.DecimalFormat;
import java.util.Scanner;

public class PDV {

	public static void main(String[] args) {
		//Variáveis
		double total,desconto,totalDesconto,valorPago,troco;
		//Objetos
		Scanner leia = new Scanner(System.in);
		DecimalFormat formatador = new DecimalFormat("#0.00");
		//Entrada
		System.out.println("PDV");
		System.out.print("Valor total:");
		total = leia.nextDouble();
		System.out.print("Desconto(%):");
		desconto = leia.nextDouble();
		//Processamento
		totalDesconto = total - (desconto * total) / 100;
		//Saída
		System.out.println("Total com Desconto: R$ " + formatador.format(totalDesconto));
		//Entrada2
		System.out.println("____________________________________________");
		System.out.print("Valor pago em Dinheiro:");
		valorPago = leia.nextDouble();
		//Processamento2
		troco = valorPago - totalDesconto;
		//Saída		
		System.out.println("Troco: R$ " + formatador.format(troco));
		leia.close();
	}

}
