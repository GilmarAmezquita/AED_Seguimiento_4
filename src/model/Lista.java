package model;

public class Lista<T> {
	private Nodo<T> firstPerson;
	
	public Lista() {
		firstPerson = null;
	}
	public void addPerson(T pNodo) {
		Nodo<T> newPerson = new Nodo<T>(pNodo);
		if(firstPerson == null) {
			firstPerson = newPerson;
		}else {
			Nodo<T> aux = firstPerson;
			while(aux.getNext() != null) {
				aux = aux.getNext();
			}
			aux.setNext(newPerson);
		}
	}
	public boolean removePerson(T pNodo) {
		boolean removed = false;
		Nodo<T> aux = firstPerson;
		Nodo<T> prev = null;
		while(aux != null && !aux.nodo.equals(pNodo)) {
			prev = aux;
			aux = aux.getNext();
		}
		if(aux != null) {
			removed = true;
			if(prev == null) {
				firstPerson = aux.getNext();
			}else {
				prev.setNext(aux.getNext());
			}
		}
		return removed;
	}
	public T searchPerson(T pNodo) {
		if(firstPerson == null) {
			return null;
		}else {
			Nodo<T> aux = firstPerson;
			while(aux.getNext() != null && !aux.nodo.equals(pNodo)) {
				aux = aux.getNext();
			}
			return aux.nodo;
		}
	}
	public String toString() {
		String info = "";
		for(Nodo<T> aux = firstPerson; aux != null; aux = aux.getNext()) {
			info += aux.nodo.toString()+"\n";
		}
		return info;
	}
}
