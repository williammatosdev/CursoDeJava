/* Desenvolva um aplicativo no console(terminal)para calcular o valor da tabuada.
 * O aplicativo deverá perguntar qual é o valor da tabuada a ser calculada.*/

package exercicios;

import java.util.Scanner;

public class Tabuada {

	public static void main(String[] args) {
		
		int numero;
		
	  Scanner leia = new Scanner(System.in);
	  System.out.print("Digite o Número da Tabuada:");
	  numero = leia.nextInt();
	  
	  for(int i = 1;i <= 10; i++) {
		  System.out.println(numero + " x " + i + " = " + (numero * i));
	  }
	  
		leia.close();

	}

}
