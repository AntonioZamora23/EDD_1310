package mainLSL;

import listsl.Ligada;

public class LsL {
	public static void main(String[] args) {

		Ligada<Integer> xs = new Ligada<>();
		System.out.println("¿Esta vacia?");

		xs.Vacio();

		System.out.println("¿Cual es su tamaño?");

		xs.Tamanio();

		System.out.println("Agregar elemento en la cola");

		xs.agregarEnCola(36);
		xs.Cruzado();
		System.out.println("\n");

		System.out.println("Agregar elemento al principio");

		xs.agregarPrincipio(40);
		xs.Cruzado();
		System.out.println("\n");

		System.out.println("Agregar elemento siguiente de: ");

		xs.Siguiente(36, 7);
		xs.Cruzado();

		xs.agregarPrincipio(100);
		xs.agregarEnCola(10);
		xs.agregarEnCola(50);
		xs.agregarEnCola(20);
		xs.agregarEnCola(40);
		xs.Siguiente(100, 120);
		System.out.println("\n");
		System.out.println("Mas elementos");
		xs.Cruzado();
		System.out.println("\n");

		System.out.println("Eliminamos elementos");

		xs.eliminar(5);
		xs.Cruzado();
		System.out.println("\n");

		System.out.println("Eliminamos la ultima posicion");

		xs.eliminarElFinal();
		xs.Cruzado();
		System.out.println("\n");

		System.out.println("Eliminamos el primer elemento");

		xs.eliminarInicio();
		xs.Cruzado();
		System.out.println("\n");

		System.out.println("Buscar elemento");

		xs.buscar(10);
		System.out.println("\n");

		System.out.println("Actualizamos");

		xs.nueva(111, 10);
		xs.Cruzado();
		System.out.println("\n");

		System.out.println("Nuevo tamaño");

		xs.Tamanio();
		System.out.println("\n");

		System.out.println("Cruzamos");

		xs.Cruzado();
		System.out.println("\n");

		System.out.println("¿Sigue vacia?");

		xs.Vacio();

	}

}
