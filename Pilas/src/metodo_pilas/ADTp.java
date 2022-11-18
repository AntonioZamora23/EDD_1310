package metodo_pilas;

import java.util.ArrayList;

public class ADTp<T> {
	ArrayList<T> pila = new ArrayList();

	int top = 0;
	int longi=0;


	public ADTp() {
	}
  //Este booleano muestra si nuestra pila tiene elementos o esta vacia
	public boolean Empty() {
		return pila.isEmpty();

	}
 //Muestra la cantidad de elementos que hay dentro de la pila
	public int getLength() {
		return longi;
	}
  //Muestra el ultimo valor y lo elimina
	public T pop() {
		if (!(pila.isEmpty())) {
			T o = pila.get(pila.size() - 1);
			pila.remove(pila.size() - 1);
			return o;
		} else {
			return null;
		}

	}
   //Muestra el ultimo valor pero no lo elimina 
	public T peek() {
		if (!(pila.isEmpty())) {
			return pila.get(pila.size() - 1);
		} else {
			return null;
		}

	}
   //Agrega elementos a la pila
	public void push(T o) {
		pila.add(o);
		longi++;

	}
  //Estado actual de la pila
	@Override
	public String toString() {
		String rof = "";
		for (int i = pila.size() - 1; i >= 0; i--) {

			rof += pila.get(i) + "\n";
		}
		return rof;
	}
}
