package listsl;

import clase_nodo.Nodo;

public class Ligada<T> {
	Nodo<T> head;
	int tamanio;

	public Ligada() {
	}

	public boolean Vacio() {
		System.out.println(this.head == null);
		return this.head == null;
	}

	public int Tamanio() {
		System.out.println("El tamaño de la lista es: " + this.tamanio);
		return this.tamanio;
	}

	public void agregarEnCola(T elemento1) {
		if (this.head == null) {
			head = new Nodo<>(elemento1);
		} else {
			Nodo<T> nuevo1 = new Nodo(elemento1);
			Nodo<T> aux1 = this.head;

			while (aux1.getSiguiente() != null) {
				aux1 = aux1.getSiguiente();
			}
			aux1.setSiguiente(nuevo1);

			tamanio++;
		}
	}

	public void agregarPrincipio(T Elemento2) {
		if (this.head == null) {
			head = new Nodo<>(Elemento2);
		} else {
			Nodo<T> nuevo2 = new Nodo(Elemento2);

			nuevo2.setSiguiente(head);

			head = nuevo2;

			tamanio++;
		}
	}

	public void Siguiente(T acceso, T valor) {
		if (this.head == null) {
			System.out.println("Esta lista esta vacia, se agregara el valor");
			head = new Nodo<>(valor);
		} else {
			Nodo<T> rtx = new Nodo(valor);

			Nodo<T> aux2 = this.head;
			Nodo<T> aux3 = this.head.getSiguiente();

			while (aux2.getDato() != acceso) {
				aux2 = aux2.getSiguiente();
				aux3 = aux3.getSiguiente();
			}

			aux2.setSiguiente(rtx);
			aux2.getSiguiente().setSiguiente(aux3);

			tamanio++;
		}
	}

	public void eliminar(int lugar) {
		int rng = 0;

		if (head == null) {
			System.out.println("La lista no tiene nada, agregue algun valor");
		} else {
			Nodo<T> aux4 = this.head;
			Nodo<T> aux5 = this.head.getSiguiente();

			while (rng != lugar) {
				rng++;
				aux5 = aux5.getSiguiente();
				aux4 = aux4.getSiguiente();
			}
			aux4.setDato(aux5.getDato());
			aux4.setSiguiente(aux5.getSiguiente());

			tamanio--;
		}
	}

	public void eliminarInicio() {
		Nodo<T> aux6 = this.head;

		aux6.setDato(head.getSiguiente().getDato());
		aux6.setSiguiente(head.getSiguiente().getSiguiente());

		tamanio--;
	}

	public void eliminarElFinal() {
		Nodo<T> lgj = this.head.getSiguiente();
		Nodo<T> aux7 = this.head;

		while (lgj.getSiguiente() != null) {
			aux7 = aux7.getSiguiente();
			lgj = lgj.getSiguiente();
		}
		aux7.setSiguiente(null);

		tamanio--;
	}

	public void buscar(T asig) {
		Nodo<T> aux8 = this.head;
		int Posicion = 0;

		try {
			while (aux8.getDato() != asig && aux8.getDato() != null) {
				aux8 = aux8.getSiguiente();
				Posicion++;
			}
			System.out.println("Este valor'" + aux8.getDato() + "' esta en la posicion: " + Posicion);
		} catch (Exception e) {
			System.out.println("Este valor'" + asig + "'no existe en la lista");
		}
	}

	public void nueva(T encontrar, T valor) {
		Nodo<T> aux9 = this.head;

		try {
			while (aux9.getDato() != encontrar) {
				aux9 = aux9.getSiguiente();
			}
			aux9.setDato(valor);
		} catch (Exception e) {
			System.out.println("Este dato '" + encontrar + "'no existe en esta lista, no se puede volver a intentar");
		}
	}

	public void Cruzado() {
		Nodo<T> aux10 = this.head;

		while (aux10 != null) {
			System.out.print(aux10);
			aux10 = aux10.getSiguiente();
		}
	}

}
