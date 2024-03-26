package controller;

import model.Pilha;

public class OperacoesController {
	
	public OperacoesController() {
		
	}
	
	public int fatorial(Pilha pilha, int num) {
		if(num==0 || num==1)
			return num;
		
		if(pilha.isEmpty())
			preencherPilha(pilha, num);
		
		int res;
		int retorno=0;
		try {
			for (int i = 0; i < num-1; i++) {
				res = pilha.pop() * pilha.pop();
				pilha.push(res);
			}
			retorno = pilha.top();
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return retorno;
		
	}

	private void preencherPilha(Pilha pilha, int num) {
		for (int i = num; i >= 1; i--) {
			pilha.push(i);
		}
	}
}
