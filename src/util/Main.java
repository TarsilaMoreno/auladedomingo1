package util;

public class Main {

	public static void main(String[] args) {

		Util u = new Util();

		//u.Imprimir("Aula de domingo");
		
		// u.Imprimir("Digite um numero que deseja somar: ");
		// u.Imprimir("Digite o segundo numero que deseja somar");;
		double valor1 = u.LerDouble("Digite o primeiro numero: ");
		double valor2 = u.LerDouble("Digite segundo numero a somar: ");
		
	    // u.Log("O valor lido foi:" +leitura);
			

		double resultado = u.Soma(valor1, valor2);

		u.Log("O resultado da soma é " + resultado);

		// double subtracao = u.Subtracao(1, 2);
		// u.Imprimir("O resultado da subtração é" +subtracao);

	}

}
