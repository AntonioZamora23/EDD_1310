package ADT;

import java.util.HashSet;
import java.util.Iterator;

public class Conjuntos_ADT<T> {
	int tamanio;
	HashSet<T> Conjunto2;
	HashSet<T> Conjunto = new HashSet<>();

	public Conjuntos_ADT() {
	}

	public int getLongitud() {
		tamanio = Conjunto.size();

		return (int) this.tamanio;
	}

	public void contiene(T dato) {
		boolean posicion = Conjunto.contains(dato);

		if (posicion == true) {
			System.out.println("El numero  " + dato + " Se encuentra en la lista");
		} else {
			System.out.println("El numero  " + dato + " No esta dentro de la lista");
		}
	}

	public void agregarDato(T dato) {
		boolean posicion = Conjunto.contains(dato);

		if (posicion == true) {
			System.out.println("El numero   " + dato + "Ya esta dentro de la lista");
		} else {
			Conjunto.add(dato);
		}
	}

	public void eliminarDato(T dato) {
		Conjunto.remove(dato);
	}

	public boolean esIgual(HashSet<T> cv) {
		if (Conjunto.equals(cv)) {
			System.out.println("Son iguales los conjuntos");
		} else {
			System.out.println("Los conjuntos son desiguales");
		}
		return Conjunto.equals(cv);
	}

	public boolean esSubConjunto(HashSet<T> cv) {
		if (Conjunto.containsAll(cv)) {
			System.out.println(cv + " Es subconjunto de: " + Conjunto);
		} else {
			System.out.println(cv + " No es subconjunto de: " + Conjunto);
		}
		boolean isSubset = Conjunto.containsAll(cv);

		return isSubset;
	}

	public void union(HashSet<T> cv) {
		HashSet<T> union = new HashSet();
		T dato1;
		T dato2;
		Iterator<T> i = Conjunto.iterator();
		Iterator<T> j = cv.iterator();

		while (i.hasNext()) {
			dato1 = i.next();

			if (!union.contains(dato1)) {
				union.add(dato1);
			}
			while (j.hasNext()) {
				dato2 = j.next();

				if (!union.contains(dato2)) {
					union.add(dato2);
				}
			}

		}

		System.out.println("La unión de los conjuntos es: " + union);
	}

	public void interseccion(HashSet<T> cv) {
		HashSet<T> inter = new HashSet();
		T dato1;
		T dato2;
		Iterator<T> i = Conjunto.iterator();
		Iterator<T> j = cv.iterator();

		while (i.hasNext()) {
			dato1 = i.next();

			while (j.hasNext()) {
				dato2 = j.next();

				if (dato1.equals(dato2)) {
					inter.add(dato1);
				}
			}
			j = cv.iterator();
		}

		System.out.println("Interseccion: " + inter);
	}

	public void diferencia(HashSet<T> cv) {
		HashSet<T> ofc = new HashSet();
		T dato;
		Iterator<T> i = Conjunto.iterator();

		while (i.hasNext()) {
			dato = i.next();
			if (!cv.contains(dato)) {
				ofc.add(dato);
			}
		}

		System.out.println("La diferencia: " + ofc);
	}

	public void iterador() {
		Iterator can = Conjunto.iterator();

		System.out.println("Iterador:");
		while (can.hasNext()) {
			System.out.println(can.next());
		}
	}

	@Override
	public String toString() {
		return "Conjuntos_ADT{" + Conjunto + '}';
	}

}