package ADT;

import ADT.Conjuntos_ADT;
import java.util.HashSet;

public class Prueba_ADT {
	public static void main(String[] args) {
		// TODO code application logic here

		HashSet<Conjuntos_ADT> union, interseccion, diferencia;

		Conjuntos_ADT<Integer> sx = new Conjuntos_ADT<>();
		HashSet<Integer> eo = new HashSet<>();

		sx.agregarDato(10);
		sx.agregarDato(18);
		sx.agregarDato(33);
		sx.agregarDato(200);
		sx.agregarDato(222);

		System.out.println(sx);

		sx.getLongitud();

		System.out.println("---¿Esta dentro del conjunto?---");
		sx.contiene(18);

		sx.eliminarDato(200);
		System.out.println("---Numero 200 eliminado---");
		System.out.println(sx);

		eo.add(1);
		eo.add(10);
		eo.add(69);
		eo.add(220);

		System.out.println("---Es igual---");
		sx.esIgual(eo);

		System.out.println("---SubConjunto---");
		sx.esSubConjunto(eo);

		System.out.println("---Unión---");
		sx.union(eo);

		System.out.println("---Intersección---");
		sx.interseccion(eo);

		System.out.println("---Diferencia---");
		sx.diferencia(eo);

		System.out.println("---Iterador---");
		sx.iterador();

	}

}