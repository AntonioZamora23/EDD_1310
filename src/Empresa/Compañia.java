package Empresa;

import java.io.BufferedReader;
import java.io.FileReader;

public class Compañia {

	public static void main(String[] args) {
		try {

			BufferedReader hh = new BufferedReader(new FileReader("D:\\Documentos\\ADT\\junio.dat"));
			BufferedReader rr = new BufferedReader(new FileReader("D:\\Documentos\\ADT\\junio.dat"));
			Object obj, obj2;
			String linea;
			int inicio, filas, mayor, menor;
			mayor = menor = inicio = filas = 0;

			while ((linea = hh.readLine()) != null) {

				filas++;
			}
			Arreglo arr = new Arreglo(filas - 2);
			while ((linea = rr.readLine()) != null) {

				if (inicio > 0 & inicio < 14) {

					String sp1[] = linea.split(",");

					Trabajador trab = new Trabajador(Integer.parseInt(sp1[0]), sp1[1], sp1[2], sp1[3],
							Integer.parseInt(sp1[4]), Float.parseFloat(sp1[5]), Integer.parseInt(sp1[6]));
					arr.setElemento(inicio - 1, trab);
					System.out.println(arr.getElemento(inicio - 1));

				}
				inicio++;
			}

			for (int i = 0; i < arr.getCapacidad() - 1; i++) {
				obj = arr.getElemento(i);
				obj2 = arr.getElemento(i + 1);

				if (i == 0) {
					mayor = menor = ((Trabajador) obj).getAnodeIngreso();

				}
				if (mayor < ((Trabajador) obj2).getAnodeIngreso()) {
					mayor = ((Trabajador) obj2).getAnodeIngreso();

				}

				if (menor > ((Trabajador) obj2).getAnodeIngreso()) {
					menor = ((Trabajador) obj2).getAnodeIngreso();

				}

			}

			System.out.println("Año del trabajador mas actual: " + mayor + "   Año del trabajador con mas antiguedad: " + menor);

		} catch (Exception e) {
			System.out.println();

			System.out.println("...");
			return;
		}

	}
}
