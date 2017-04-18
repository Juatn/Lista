package Models;

import java.util.Arrays;

public class Lista<T> {

	/* Atributos */

	private T[] elementos;
	private int index;

	/* Constructor */
	public Lista() {

		this.elementos = (T[]) new Object[0];
		this.index = 0;

	}

	/* Metodos */
	/**
	 * Devuelve -1 o i dependiendo de si admite el indice
	 * 
	 * @param i
	 * @return
	 */
	public int setIndex(int i) {
		if (i > this.elementos.length) {
			return -1;
		}
		index = i;
		return i;

	}

	/**
	 * Devuelve el elemento al que apunte el index
	 * 
	 * @return
	 */
	public T getCurrent() {
		T elemento = this.elementos[index];

		return elemento;
	}

	/**
	 * Devuelve el elemento anterior al que apunte el index
	 * 
	 * @return
	 */
	public T getPrev() {

		if (index == 0) {
			index = this.elementos.length;
		}
		T elemento = this.elementos[index - 1];
		index = index - 1;

		return elemento;
	}

	/**
	 * Devuelve el elemento siguiente al que apunte el index
	 * 
	 * @return
	 */
	public T getNext() {
		if (index == this.elementos.length) {
			index = 0;
		}
		T elemento = this.elementos[index + 1];
		index = index + 1;

		return elemento;
	}

	/**
	 * Elimina elemento de ultima posicion
	 * 
	 * @param element
	 */
	public void remove(T element) {
		@SuppressWarnings("unchecked")
		T[] aux = (T[]) new Object[this.elementos.length - 1];

		int j = 0;
		for (int i = 0; i < this.elementos.length; i++) {
			if (this.elementos[i] != element) {
				aux[j] = this.elementos[i];
				j++;
			}
			if (this.elementos[i] == element) {
				index = i;
			}

		}

		this.elementos = aux;
	}

	/**
	 * Anade elemento a la lista en ultima posicion
	 * 
	 * @param element
	 */
	public void add(T element) {

		@SuppressWarnings("unchecked")
		T[] aux = (T[]) new Object[this.elementos.length + 1];

		for (int i = 0; i < this.elementos.length; i++) {
			aux[i] = this.elementos[i];
		}

		aux[aux.length - 1] = (T) element;

		this.elementos = aux;
		index = this.elementos.length;
	}
/** Metodo para imprimir la lista
 * 
 */
	@Override
	public String toString() {
		return "Lista =" + Arrays.toString(elementos) + ", index=" + index;
	}

}
