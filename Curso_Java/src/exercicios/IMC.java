/* Desenvolva um aplicativo no console(terminal) para calcular
 * o valor do IMC.O aplicativo deverá exibir além do valor do IMC
 * a classificação de acordo com a tabela abaixo:
 * 
 *         IMC                   Classificação
 *   abaixo de 18,5              Abaixo do peso
 * entre 18,6 e 24,9               Peso Ideal
 * entre 25,0 e 29,9          Levemente acima do peso
 * entre 30,0 e 34,9             Obesidade grau I
 * entre 35,0 3 39,9          Obesidade grau II (severa)
 *    acima de 40            Obesidade grau III (mórbida)*/

package exercicios;

import java.text.DecimalFormat;
import java.util.Scanner;

public class IMC {

	public static void main(String[] args) {
		
		double peso,altura,imc;
		
		Scanner leia = new Scanner(System.in);
		DecimalFormat formatador = new DecimalFormat("#0.00");
		System.out.println("Cálculo do IMC");
		System.out.print("Digite o seu peso:");
		peso = leia.nextDouble();
		System.out.print("Digite sua altura:");
		altura = leia.nextDouble();
		imc = peso/ (altura * altura);
		System.out.println("O seu IMC é: " + formatador.format(imc));		
		//classificação
		if (imc < 18.5) {
			System.out.println("Abaixo do Peso!");
		}else if (imc < 25){
			System.out.println("Peso ideal!");		
		}else if (imc < 30){
		System.out.println("Levemente acima do Peso!");
	    }else if (imc < 35){
			System.out.println("Obesidade grau I!");
	    }else if (imc < 40){
			System.out.println("Obesidade grau II(severa)!");
	    }else if (imc < 40){
			System.out.println("Obesidade grau III(mórbida)!");
	    }
		leia.close();
	}

}
