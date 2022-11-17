package fundamentos;

public class Fundamentos {

	public static void main(String[] args) {
		 String nome = "William Matos Machado";
		 int idade = 34;
		 char sexo = 'M';
		 double temperatura = 28.4;
		 boolean arCondicionado = false;
		 
		 System.out.println("Uso de Variáveis na Línguagem Java");
		 System.out.println("Exemplo:");
		 System.out.println("Nome: " + nome);
		 System.out.println("Idade: " + idade);
		 System.out.println("Sexo: " + sexo);
		 System.out.println("Temperatura: " + temperatura);
		 System.out.println("Ar Condicionado: " + arCondicionado);
		 System.out.println("_____________________________________");
		 System.out.println("");
		 double i = 10;
		 System.out.println("Operadores Aritiméticos e Atribuições ");
		 System.out.println("Exemplos: ");
		 System.out.println("i = " + i);
		 System.out.println("i = " + i + " + 5 | i = " + (i + 5));
		 System.out.println("i = " + i + " - 5 | i = " + (i - 5));
		 System.out.println("i = " + i + " * 5 | i = " + (i * 5));
		 System.out.println("i = " + i + " / 5 | i = " + (i / 5));
		 System.out.println("i = " + i + " + 5 | i = " + (i + 5));
		 System.out.println("i = " + i + " % 5 | i = " + (i % 5));
		 System.out.println("i += 5       | i = " + (i += 5));
		 System.out.println("i -= 5       | i = " + (i -= 5));
		 System.out.println("i *= 5       | i = " + (i *= 5));
		 System.out.println("i /= 5       | i = " + (i /= 5));
		 i++;
		 System.out.println("i++          | i = " + i);
		 i--;
		 System.out.println("i--          | i = " + i);
		 System.out.println("_____________________________________");
		 System.out.println("");
		 System.out.println("ESTRUTURAS DE CONTROLE");
		 System.out.println("");
		 System.out.println("Estruturas de Controle Condicional");
		 System.out.println("");
		 System.out.println("Exemplo 1 - Uso do 'if'");
		 if (sexo == 'M') {
		 System.out.println("Alistamento Mílitar Obrigatório!");
		 }
		 System.out.println("");
		 System.out.println("Exemplo 2 - Uso do 'if - else'");
		 if (idade < 18) {
		 System.out.println("Menor de idade!");
		 }else {
			 System.out.println("Maior de Idade!");
		 }
		 System.out.println("");
		 System.out.println("Exemplo 3 - Uso do 'else - if'");
		 if (idade < 16) {
		 System.out.println("Proíbido Votar!");
		 }else if(idade >= 18 && idade <= 70) {
			 System.out.println("Voto Obrigatório!");
		 }else if (idade == 16 || idade == 17 || idade > 70) {
			 System.out.println("Voto Facultativo!");			 
		 }
		 System.out.println("");
		 System.out.println("Exemplo 3 - Uso do 'Switch case'");
		 System.out.println("1. Cadastro de Clientes");
		 System.out.println("2. Cadastro de Usuários");
		 System.out.println(" 3. Relatórios");
		 int opcao = 1;
		 switch (opcao) {
		 	case 1:
		 		System.out.println("Clientes");
		 		break;
			case 2:
		 		System.out.println("Usuários");
		 		break;
			case 3:
		 		System.out.println("Relatórios");
		 		break;
			default:
		 		System.out.println("Opção Inválida!");
		 		break;	 			
		 }
		 System.out.println("");
		 System.out.println("Estruturas de Repetições");
		 System.out.println("");
		 System.out.println("Exemplo 5 - Uso do 'For'");
		 for(int j = 10; j > 0; j-- ) {
			 System.out.println("Hello");
		 }
			 System.out.println("");
			 for(int y = 10;y > 0; y-- ) {
				 System.out.println(y);
		 }
		 System.out.println("");
		 System.out.println("Exemplo 6 - Tabuada");
		 for (int tabuada = 0; tabuada <= 10; tabuada++) {
			 System.out.println("");
			    for (int valor = 0; valor <= 10; valor++) {
			    	 System.out.println(tabuada + " x " + valor + " = " + (tabuada * valor));
			    }	     
		 }
		 System.out.println("");
		 System.out.println("Exemplo 7 - Uso da Estrutrura 'While'");
		 int contador = 1;
		 while (contador <= 10) {
			 System.out.println(contador);
			 contador++;
		 }
		 System.out.println("");
		 System.out.println("Exemplo 8 - Uso da Estrutrura 'Do While'");
		 char novoJogo;
		 do {
			 System.out.println("Deseja jogar novamente(s/n)?");
			 novoJogo = 'n';
		 }while (novoJogo == 's');
		 System.out.println("GAME OVER");
	}

}
