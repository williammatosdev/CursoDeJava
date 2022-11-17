/* Desenvolva um aplicativo no console(terminal)para fazer o lançamento
 * de um dado de 6 faces.O aplicativo deverá executar um sorteio usando
 * a função Math.random(),exibindo a face do dado sorteada.Após a exibição
 * da face sorteada o aplicativo deverá perguntar se o jogador deseja
 * lançar o dado novamente.Se o jogador responder que sim um novo lançamento 
 * do dado será executado. */


package exercicios;

import java.util.Scanner;

public class JogoDoDado {

	public static void main(String[] args) {
		
       char opcao = 's';
       
       Scanner leia = new Scanner (System.in);             
    	  
       while (opcao == 's' ) {
       System.out.println("Lançamento do Dado............");
        int dado =(int)( Math.random() * 6 + 1);
        System.out.println("Face: " + dado);
        System.out.println("Deseja Lançar o Dado Novamente(s/n)?");
        opcao = leia.next().charAt(0);
       }
       leia.close();
	}

}
