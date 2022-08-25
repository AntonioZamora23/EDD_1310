package ed.tareas.uno;

import java.util.ArrayList;

public class Arreglo {
	public static void main(String[] args) {
		ArrayList<String> Carros = new ArrayList<String>();
		System.out.println("Tus carros son: ");
		Carros.add("Jetta");
		Carros.add(1, "Ibiza");
		Carros.add("Ranger");
		Carros.add("Blazer");
		Carros.add("MG");
		Carros.add("Jeep");
	
		System.out.println(Carros);
		System.out.println("Tu coleccion es de : " + Carros.size()+" automoviles");
		Carros.clear();
		System.out.println(Carros);
		System.out.println("Tu coleccion es de : " + Carros.size()+" automoviles");

	}

	@Override
	public String toString() {
		return "Arreglo [getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()=" + super.toString()
				+ "]";
	}

	}


