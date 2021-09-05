package model;

public class Nodo<T> {	
	T nodo;
	Nodo<T> nextNodo;
	
	public Nodo(T nodo) {
		this(nodo, null);
	}
	
	public Nodo(T nodo, Nodo<T> next) {
		this.nodo = nodo;
		nextNodo = next;
	}
	public Nodo<T> getNext() {
		return nextNodo;
	}
	public void setNext(Nodo<T> newT) {
		nextNodo = newT;
	}
}
