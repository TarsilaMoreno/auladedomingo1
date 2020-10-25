package util;

import java.time.LocalDateTime;
import java.util.Scanner;

public class Util {
	private Scanner Leitor = new Scanner(System.in);

	public void Imprimir(String texto) {
		System.out.println(texto);
	}

	public double Soma(double valor1, double valor2) {
		double result = valor1 + valor2;
		return result;
	}

	public double Subtracao(double valor1, double valor2) {
		double subtracao = valor1 - valor2;
		return subtracao;
	}

	public double LerDouble(String texto) {
		Imprimir(texto);

		double result = Leitor.nextDouble();
		// leitor.close();
		return result;
	}

	public void Log(String texto) {
		LocalDateTime agora = LocalDateTime.now();
		Imprimir("[" + agora + "] - " + texto);

	}

}
