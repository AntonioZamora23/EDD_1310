package HashTable;

import java.util.ArrayList;

public class Array<T> {
	private T tamanio;
	ArrayList<T> Arr = new ArrayList<>();

	public Array() {
	}

	public int tamanio1() {
		return (int) tamanio;
	}
	public int getElemento(int index) {
		return (int) index;
	}

	
	public void setElemento(int index, String o) {
		Arr.add((int) index, (T) o);
	}

	
	public void clear(int o) {
		Arr.clear();
	}

	@Override
	public String toString() {
		return "ArrayList: " + "ArrayList: " + Arr.toString() ;
	}

}
