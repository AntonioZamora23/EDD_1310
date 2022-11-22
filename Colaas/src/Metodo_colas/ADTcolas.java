package Metodo_colas;

import java.util.ArrayList;

public class ADTcolas<T> {
	ArrayList<T> cola = new ArrayList();
	int primero;
	int ultimo;

	public ADTcolas() {
		cola = new ArrayList<>();
		primero = 0;
		ultimo = -1;
	}

	public boolean Empty() {
		return cola.isEmpty();
	}

	public int getlength() {
		return cola.size();
	}

	public void enqueue(T o) {
		cola.add(o);
	}

	public void dequeue() {
		cola.remove(primero);
	}

	@Override
	public String toString() {
		String GG = "";
		for (T dato : cola) {
			GG +=  dato + "\n";
		}
		return GG;
	}
}
