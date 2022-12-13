package Colecciones;

import java.util.HashMap;

public class HashMapADT {
	public static void main(String[] args) {
		// Importamos la HashMap y creamos el constructor para empezar a trabajar
		HashMap<Integer, String> cantantes = new HashMap<>();
		// Agregamos llaves y valores al hashmap y al rededor de esos datos creamos los
		// ADT
		cantantes.put(23, "Benito");
		cantantes.put(14, "Mora");
		cantantes.put(30, "Alvaro");
		cantantes.put(90, "Anuel");
		cantantes.put(200, "Blessd");
		cantantes.put(85, "Jhaco");
		cantantes.put(55, "Rauleeto");
		cantantes.put(150, "Ferxxo");

		System.out.println("------------------------------HashMap:------------------------------------- ");
		// Mostramos el hashmap con llaves y valores
		System.out.println(cantantes);

		System.out.println("-------------------------Llaves del hashmap :------------------------------");
		// Metodo que muestras una lista de todas las llaves
		System.out.println(cantantes.keySet());

		System.out.println("------------------------Elementos del hashmap:------------------------------");
		// Metodo que unicamente muestra los valores
		System.out.println(cantantes.values());

		System.out.println("------------------------Eliminamos un elemento del hashmap:------------------");
		// Metodo que elimina un valor dando su llave
		System.out.println("Dato eliminado: " + cantantes.remove(200));
		System.out.println(cantantes);// Lista sin el valor removido

		System.out.println("------------------------Tamanio de la hashmap: -------------------------------");
		// Metodo que muestra el tamañio del hashmap empezando con el indice 0
		System.out.println(cantantes.size());

		System.out
				.println("-----------------------Mostrar si existe algun dato a traves de su llave:------------------");
		// Muestra unicamente el valor que le corresponda a la llave otorgada
		System.out.println(cantantes.get(55));

		System.out.println("----------------------¿Existe un valor que le pertenezca a la llave dada?-------");
		// Metodo donde atraves de la llave dada busca si esta se encuentra o no dentro
		// del hashmap
		if (cantantes.containsKey(150)) {
			System.out.println("La llave ingresada si se encuentra dentro de la hashmap");
		} else {
			System.out.println("La llave no existe dentro de la hashmap");
		}

		System.out.println("---------------------¿Existe una llave que le pertenezca al valor dado?");
		// Metodo donde atraves de valor dado busca si este se encuentra o no dentro del
		// hashmap
		if (cantantes.containsValue("Anuel")) {
			System.out.println("Este dato si tiene una llaver dentro del hashmap");
		} else {
			System.out.println("EL valor no tiene llave dentro del hashmap");
		}

		System.out.println("-----------------------Limpiamos todo el hashmap--------------------------------------");
		// Elimina todos los datos
		cantantes.clear();
		System.out.println(cantantes);

	}
}
