package metodo_pilas;

public class Princi_1 {
	public static void main(String[] args) {
		ADTp pila=new ADTp();
		pila.Empty();
		pila.push(2003);
		pila.push("Hola");
		pila.push(6543);
		pila.push("Rauw");
		pila.push("ferxxo");
		
		System.out.println("1------Pila: ------");
		System.out.println(pila);
		System.out.println("l------Implementamos el metodo peek: ------");
		System.out.println(pila.peek());
		System.out.println("l------Metodo pop: ------l");
		System.out.println(pila.pop());
		System.out.println(pila.pop());
		System.out.println(pila.pop());
		System.out.println("l------¿Cuantos elementos tiene la pila------l");
		System.out.println(pila.getLength());
		System.out.println("l------¿La pila esta vacia?------");
		System.out.println(pila.Empty());

		
	}

}
