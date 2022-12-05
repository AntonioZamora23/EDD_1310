package HashTable;

import HashTable.LSL;
import java.util.ArrayList;
import java.util.Hashtable;

public class HashADT<T> {
	ArrayList<T> Hash;
	int tamanio;
	int indice;
	int Elem = 0;
	Object ATS[];

	public HashADT(int tamanioT) {
		this.tamanio = tamanioT;
		Hash = new ArrayList<>(tamanioT);
		ATS = new Object[tamanioT];
	}

	public void agregar(int llave, T o) {
		if (Elem== tamanio) {
			System.out.println("Ya no hay espacio en la tabla");
		} else {
			indice = (llave & 0x7) % tamanio;

			ATS[indice] = o;

			Elem++;
		}
	}

	public void valor(int llave) {

		indice = (llave & 0x7) % tamanio;

		System.out.println("El elemento con la llave '" + llave + "' es: " + ATS[indice]);
	}

	public void quitar(int llave) {
		indice = (llave & 0x7) % tamanio;

		ATS[indice] = null;
		Elem--;
	}

	public String i() {
		for (Object i : ATS) {
			System.out.print(i + ", ");
		}

		return "";
	}

	@Override
	public String toString() {
		return  i();
	}

}
