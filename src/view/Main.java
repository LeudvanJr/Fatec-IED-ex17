package view;

import java.util.Scanner;

import controller.OperacoesController;
import model.Pilha;

public class Main {

	public static void main(String[] args) {
		OperacoesController opController = new OperacoesController();
		Scanner in = new Scanner(System.in);
		Pilha pilha = new Pilha();
		
		int n;
		do {			
			System.out.print("Digite um numero de 0 a 10: ");
			n = in.nextInt();
		} while (n < 0 || n > 10);
		
		System.out.println(opController.fatorial(pilha, n));
	}

}
