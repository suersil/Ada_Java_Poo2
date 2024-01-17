package br.com.ada.pooii.Aula5.Exercicio_Pilha;

// Interface genérica para a estrutura Stack
public  interface  Stack<E> {
	void push(E elemento);

	E pop();

	E peek();

	boolean isEmpty();
}