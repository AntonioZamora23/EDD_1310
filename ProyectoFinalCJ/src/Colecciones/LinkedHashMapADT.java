package Colecciones;

import java.util.LinkedHashMap;

public class LinkedHashMapADT {
	public static void main(String[] args) {
		//Creamos el linkedHashMap y el constructor para empezar
		LinkedHashMap<Integer, String> Animales = new LinkedHashMap<>();
		//Añadimos llaves y valores para dar funcion a los ADT
		Animales.put(1, "Aguila");
		Animales.put(2, "Leon");
		Animales.put(3, "Perro");
		Animales.put(4, "Gato");
		Animales.put(5, "Puma");
		Animales.put(6, "Tigre");
		Animales.put(7, "Tiburon");
		Animales.put(8, "Conejo");
		Animales.put(9, "Zorro");

		System.out.println(
				"------------------------------LinkedHashMap:------------------------------------------------ ");
		//Mostramos las llaves junto a sus valores 
		System.out.println(Animales);
		
		System.out.println(
				"------------------------------Tamañio de la LikendHashMap------------------------------------");
		//Metodo para conocer el tamañio del linkedHashmap
		System.out.println(Animales.size());
		
		System.out.println(
				"------------------------------¿La llave dada se encuentra dentro de la lista de llaves?------");
		//Metodo que dando una llave busca si esta se encuentra dentro de la lista 
		if (Animales.containsKey(3)) {
			System.out.println("Esta llave si se encuentra dentro de la lista de claves");
		} else {
			System.out.println("La llave dada no existe dentro de la lista");
		}
		
		System.out.println(
				"------------------------------¿El valor dado se encuentra dentro de la lista de valores?-----");
		//Metodo que atraves del valor dado muestra si este se encuentra dentro de la lista
		if (Animales.containsValue("Perro")) {
			System.out.println("El dato si se encuentra dentro de la lista de valores");
		} else {
			System.out.println("El valor dado no se encuentra en la lista");
		}
		
		System.out.println(
				"------------------------------Mostrar el valor que coincide con la llave dada----------------");
		//Metodo que muestra el valor que le corresponde a la llave dada
		System.out.println(Animales.get(8));
		
		System.out.println(
				"------------------------------Lista de llaves o claves:--------------------------------------");
		//Metodo que muestra unicamente las llaves 
		System.out.println(Animales.keySet());
		
		System.out.println(
				"------------------------------Lista de valores: ---------------------------------------------");
		//Metodo que unicamente muestra los valores
		System.out.println(Animales.values());
		
		System.out.println(
				"------------------------------Remover algun valor atraves de su llave: ----------------------");
		//Metodo que remueve llave y valor
		System.out.println("Dato eliminado: "+ Animales.remove(5));
		System.out.println(Animales);
		
		System.out.println(
				"------------------------------Eliminar todo el linkedHashMap---------------------------------");
		//Limpia todo el linkedHashmap
		Animales.clear();
		System.out.println(Animales);

	}

}
