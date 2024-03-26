package model;

public class Pilha {
	No topo;
	
	public Pilha() {
		this.topo = null;
	}
	
	public boolean isEmpty() {
		return (topo == null);
	}
	
	public void push(int numero) {
		No no = new No();
		no.proximo = topo;
		no.num = numero;
		topo = no;
	}
	
	public int pop() throws Exception{
		if (isEmpty())
			throw new Exception("Impossivel remover elemento de uma Pilha vazia!");
		
		int numero = topo.num;
		topo = topo.proximo;
		return numero;
	}
	
	public int size() {
		if (isEmpty())
			return 0;
		
		No noAux = topo;
		int cont = 0;
		while(noAux != null) {
			cont++;
			noAux = noAux.proximo;
		}
		return cont;
	}
	
	public int top() throws Exception{
		if (isEmpty())
			throw new Exception("A Pilha esta Vazia");
		
		int numero = topo.num;
		return numero;
	}
}
