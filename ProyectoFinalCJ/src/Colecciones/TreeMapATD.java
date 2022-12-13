package Colecciones;

import java.util.TreeMap;

public class TreeMapATD {
	public static void main(String[] args) {
		//Creamos el treemap y creamos el constructor para trabajar
		TreeMap<Integer, String> Juegos = new TreeMap<>();
		//Introducimos elementos para los ADT
		Juegos.put(100, "GOW");
		Juegos.put(50, "COD");
		Juegos.put(200, "FIFA");
		Juegos.put(150, "Gears");
		Juegos.put(300, "Lego");
		Juegos.put(250, "Fort");
		System.out.println("------------------------------TreeMap:-----------------------------------------------------");
		//Mostramos todos los datos que le dimos 
		System.out.println(Juegos);
		
		System.out.println(
				"------------------------------Tamañio de la treeMap:---------------------------------------------------");
		//Metodo para saber el tamañio del treemap
		System.out.println(Juegos.size());
		
		System.out.println(
				"-----------------------------¿La llave dada se encuentra dentro de la lista de llaves?:-----------------");
		//Metodo que atraves de la llave dada muestra si esta se encuentra o no dentro de la lista 

		if (Juegos.containsKey(250)) {
			System.out.println("Esta llave si se encuentra dentro de la lista");
		} else {
			System.out.println("Esta llave no se encuentra dentro de la lista");
		}
		
		System.out.println(
				"------------------------------¿El valor dado se encuentra dentro de la lista de valores?-----------------");
		//Metodo que atraves del valor dado muestra si este se encuentra o no dentro de la lista de valores
		if (Juegos.containsValue("GOW")) {
			System.out.println("El valor si se encuentra dentro de la lista de valores");
		} else {
			System.out.println("Este valor no existe dentro de la lista de valores");
		}
		
		System.out.println(
				"------------------------------Lista de llaves: ----------------------------------------------------------");
		//Unicamente se muestran las llaves 
		System.out.println(Juegos.keySet());
		
		System.out.println(
				"------------------------------Lista de valores: ---------------------------------------------------------");
		//Unicamente se muestran los valores
		System.out.println(Juegos.values());
		
		System.out.println(
				"------------------------------Primer conjunto de llave y valor: ------------------------------------------");
		//Metodo que muestra el  primer conjunto de llave con su valor correspondiente
		System.out.println(Juegos.firstEntry());
		
		System.out.println(
				"------------------------------Metodo de remover algun valor atraves de su llave----------------------------");
		//Metodo para eliminar un dato unicamente dando su llave 
		System.out.println("Dato eliminado del TreeMap : " + Juegos.remove(200));
		System.out.println(Juegos);

		System.out.println(
				"------------------------------Limpiar todo el treemap: ----------------------------------------------------");
		//Limpia todo el treemap 
		Juegos.clear();
		System.out.println(Juegos);
	}

}