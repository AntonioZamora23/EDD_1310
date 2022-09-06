package Empresa;

import java.util.Arrays;

public class Arreglo {
	int capacidad;
	Object arreglo[];

	public Arreglo(int tamanio) {
		capacidad = tamanio;
		arreglo = new Object[tamanio];
	}

	public int getCapacidad() {
		return capacidad;
	}

	public void setElemento(int indice, Object obj) {
		arreglo[indice] = obj;

	}

	public Object getElemento(int indice) {
		return arreglo[indice];
	}

	public void limpiar(Object obj) {
		for (int i = 0; i < arreglo.length; i++) {
			arreglo[i] = obj;

		}
	}

	@Override
	public String toString() {
		return "capacidad=" + capacidad + ", arreglo=" + Arrays.toString(arreglo) + '}';
	}

}
