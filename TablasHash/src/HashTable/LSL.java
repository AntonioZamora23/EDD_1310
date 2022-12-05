package HashTable;

import HashTable.Nodo;

public class LSL<T> {

	Nodo<T> head;
	int tamanio;

	public LSL() {
	}

	public int getTamanio() {
		System.out.println("Elementos de la lista: " + tamanio);
		return this.tamanio;
	}

	public boolean Vacio() {
		System.out.println(this.head == null);
		return head == null;
	}

	public void agregarFinal(T o) {
		if (this.head == null) {
			head = new Nodo<>(o);
		} else {
			Nodo<T> nuevo = new Nodo(o);
			Nodo<T> aux = head;

			while (aux.getSiguiente() != null) {
				aux = aux.getSiguiente();
			}
			aux.setSiguiente(nuevo);

			tamanio++;
		}
	}

	public void agregarDespues(T acceso, T o) {
		if (head == null) {
			System.out.println("No hay nada en la lista , agreguemos algo");
			head = new Nodo<>(o);
		} else {
			Nodo<T> nuevo1 = new Nodo(o);

			Nodo<T> aux = head;
			Nodo<T> newaux = head.getSiguiente();

			while (aux.getDato() != acceso) {
				aux = aux.getSiguiente();
				newaux = newaux.getSiguiente();
			}

			aux.setSiguiente(nuevo1);
			aux.getSiguiente().setSiguiente(newaux);

			tamanio++;
		}
	}

	public void agregaPrincipio(T o) {
		if (this.head == null) {
			head = new Nodo<>(o);
		} else {
			Nodo<T> num1 = new Nodo(o);

			num1.setSiguiente(head);

			head = num1;

			tamanio++;
		}
	}

	public void eliminar(int index) {
		int posicion = 0;

		if (head == null) {
			System.out.println("No hay nada en esta lista");
		} else {
			Nodo<T> auxpast = head;
			Nodo<T> aux = head.getSiguiente();

			while (posicion != index) {
				posicion++;
				aux = aux.getSiguiente();
				auxpast = auxpast.getSiguiente();
			}
			auxpast.setDato(aux.getDato());
			auxpast.setSiguiente(aux.getSiguiente());

			tamanio--;
		}
	}

	public void eliminarinicio() {
		Nodo<T> aux = head;

		aux.setDato(head.getSiguiente().getDato());

		aux.setSiguiente(head.getSiguiente().getSiguiente());

		tamanio--;
	}

	public void eliminarUltimo() {
		Nodo<T> nuevo2 = head.getSiguiente();
		Nodo<T> aux = head;

		while (nuevo2.getSiguiente() != null) {
			aux = aux.getSiguiente();
			nuevo2 = nuevo2.getSiguiente();
		}
		aux.setSiguiente(null);

		tamanio--;
	}

	public void nuevo(T buscar, T o) {
		Nodo<T> aux = head;

		try {
			while (aux.getDato() != buscar) {
				aux = aux.getSiguiente();
			}
			aux.setDato(o);
		} catch (Exception e) {
			System.out.println("El dato '" + buscar + "' no esiste dentro de esta lista");
		}

	}

	public void Recorrido(T o) {
		Nodo<T> aux = head;
		int index = 0;

		try {
			while (aux.getDato() != o && aux.getDato() != null) {
				aux = aux.getSiguiente();
				index++;
			}
			System.out.println("El elemento :'" + aux.getDato() + "' su posicion es:  " + index);
		} catch (Exception e) {
			System.out.println("El dato '" + o + "' no existe dentro de esta lista");
		}
	}

	public void transversal() {
		Nodo<T> aux = head;

		while (aux != null) {
			System.out.print(aux);
			aux = aux.getSiguiente();
		}
		System.out.print("\n");
	}

}
