package Test;

import Models.Lista;

public class Test {

	public static void main(String[] args) {

		int num1 = 8;
		int num2 = 16;
		int num3 = 56;
		int num4 = 33;

		@SuppressWarnings("rawtypes")
		Lista prueba = new Lista();

		// agrego 4 numeros a la lista

		System.out.println("Agrego 4 elementos");
		prueba.add(num1);
		prueba.add(num2);
		prueba.add(num3);
		prueba.add(num4);
		// compruebo que se hayan anadido
		System.out.println(prueba);
		System.out.println(
				"Borro el elemento que se encuentra en la posicion 1(seria la 2 literal, pero es un array) y el index en la anterior");

		prueba.remove(num2);
		System.out.println(prueba);
		System.out.println("Devuelvo el elemento siguiente al que apunte el index");
		System.out.println(prueba.getNext());
		System.out.println("Devuelvo el anterior al que apunte el index");
		System.out.println(prueba.getPrev());
		System.out.println("El anterior del anterior...");
		System.out.println(prueba.getPrev());
		System.out.println("El anterior nuevamente(seria el ultimo de la lista(33).");
		System.out.println(prueba.getPrev());
		System.out.println("El actual");
		System.out.println(prueba.getCurrent());
		System.out.println("pongo indice a 0");
		prueba.setIndex(0);
		System.out.println(prueba);

	}

}
