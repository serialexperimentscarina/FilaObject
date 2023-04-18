package br.com.serialexperimentscarina.filaobject;

public class FilaObject {
	
	No inicio;
	No fim;
	
	public FilaObject() {
		inicio = null;
		fim = null;
	}
	
	public boolean isEmpty() {
		return (inicio == null && fim == null);
	}
	
	public void insert(Object obj) {
		No novo = new No();
		novo.dado = obj;
		novo.proximo = null;
		if (isEmpty()) {
			inicio = novo;
			fim = novo;
		} else {
			if (inicio == fim) {
				inicio.proximo = novo;
			} else {
				fim.proximo = novo;
			}
			fim = novo;
		}
	}
	
	public Object remove() throws Exception {
		if (isEmpty()) {
			throw new Exception("Pilha vazia!");
		}
		Object obj = inicio.dado;
		if (inicio == fim) {
			inicio = null;
			fim = null;
		} else {
			inicio = inicio.proximo;
		}
		return obj;
	}
	
	public void list() throws Exception {
		if (isEmpty()) {
			throw new Exception("Pilha vazia!");
		}
		No auxiliar = inicio;
		while (auxiliar != null) {
			System.out.print(auxiliar);
			auxiliar = auxiliar.proximo;
		}
	}
	
	public int size() {
		int cont = 0;
		No auxiliar = inicio;
		while (auxiliar != null) {
			cont++;
			auxiliar = auxiliar.proximo;
		}
		return cont;
	}
	
	

}
