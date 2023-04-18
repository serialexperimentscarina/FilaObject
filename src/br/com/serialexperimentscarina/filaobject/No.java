package br.com.serialexperimentscarina.filaobject;

public class No {

	Object dado;
	No proximo;
	
	@Override
	public String toString() {
		return ("[Object = " + dado + "]");
	}
}
