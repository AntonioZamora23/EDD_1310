package Metodo_colas;

import java.util.ArrayList;

public class ADTcolas<T> {
	ArrayList<T> colas = new ArrayList();
	int primero;
	int ultimo;

	public ADTcolas() {
		primero = 0;
		ultimo = -1;
	}

	public boolean Vacio() {
		return colas.isEmpty();
	}

	public int getlength() {
		return colas.size();
	}

	public void enqueue(T o) {
		colas.add(o);
	}

	public void dequeue() {
		colas.remove(primero);
	}

	@Override
	public String toString() {
		String GG = "";
		for (T dato : colas) {
			GG += dato + "\n";
		}
		return GG;
	}
}
