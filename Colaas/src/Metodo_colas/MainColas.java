package Metodo_colas;

public class MainColas {
	public static void main(String[] args) {
		ADTcolas colas=new ADTcolas();
		colas.enqueue("AA");
		colas.enqueue("BadBo");
		colas.enqueue("Zorro");
		colas.enqueue("Feid");
		colas.enqueue("Mora");
		System.out.println("------Cola: ------");
		System.out.println(colas);
		System.out.println("------¿Cuantos elementos hay en la cola?------");
		System.out.println(colas.getlength());
		System.out.println("------Metodo enqueue: (Juancho)------");
		colas.enqueue("Juancho");
		System.out.println("------Nueva cola: ------");
		System.out.println(colas);
		System.out.println("------Metodo dequeue:------");
		colas.dequeue();
		System.out.println("------Nueva cola: ------");
		System.out.println(colas);
		System.out.println("------ toString------");
		System.out.println(colas.toString());
		
	}

}
