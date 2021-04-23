package ejercicio1;

import java.util.ArrayList;

public class Stack {

	private ArrayList<Object> elements = new ArrayList<Object>();

	public Stack() {
		elements = new ArrayList<Object>();
	}

	/**
	 * Agrega un elemento a la pila
	 * 
	 * @param element
	 */
	public void push(Object element) {
		elements.add(element);
	}

	/**
	 * Elimina el ultimo elemento de la pila
	 * 
	 * @return el elemento eliminado
	 */
	public Object pop() {
		if (top() != null) {
			Object object = top();
			elements.remove(object);
			return object;
		}
		return null;
	}

	/**
	 * @return ultimo elemento de la pila
	 */
	public Object top() {
		if (size() > 0) {
			return elements.get(size()-1);
		} else
			return null;
	}

	/**
	 * @return tamaño de la pila
	 */
	public int size() {
		return elements.size();
	}

	/**
	 * @return copia de la pila
	 */
	public Stack copy() {
		Stack stackCopy = new Stack();
		for (Object element : elements) {
			stackCopy.push(element);
		}
		return stackCopy;
	}
	
	/**
	 * @return copia de la pila invertida
	 */
	
	public Stack reverse() {
		Stack stackCopy = new Stack();
		for (int i = size()-1; i >= 0; i--) {
			stackCopy.push(elements.get(i));
		}
		return stackCopy;
	}
	
}
