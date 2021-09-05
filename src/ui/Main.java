package ui;

import java.time.LocalDateTime;

import model.Lista;
import model.Person;

public class Main {

	public static void main(String[] args) {
		Person newP = new Person("Gilmar", "1564897", true, LocalDateTime.now());
		Person newP2 = new Person("Jhan", "6546897", true, LocalDateTime.now());
		Lista<Person> list = new Lista<Person>();
		list.addPerson(newP);
		list.addPerson(newP2);
		
		System.out.println(list.toString());
		list.removePerson(newP);
		System.out.println(list.toString());
	}

}
