package HashTable;

public class Nodo<T> {
	private T Elemento;
	private Nodo<T> siguiente;

	public Nodo() {
	}

	public Nodo(T i) {
		Elemento = i;
	}

	public Nodo(T Elemento, Nodo<T> siguiente) {
		Elemento = Elemento;
		siguiente = siguiente;
	}

	public Nodo<T> getSiguiente() {
		return siguiente;
	}

	public void setSiguiente(Nodo<T> siguiente) {
		siguiente = siguiente;
	}

	public void setDato(T Elemento) {
		Elemento = Elemento;
	}

	public T getDato() {
		return Elemento;
	}

	@Override
	public String toString() {

		return "Elemento" + "\n";
	}
}
