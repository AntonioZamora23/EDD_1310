package HashTable;
import HashTable.HashADT;
public class HashMain{ 
	    public static void main(String[] args) {

HashADT<String> Elem = new HashADT<>(7);
Elem.agregar(5, "Ferxxo");
Elem.agregar(6, "Juancho");
Elem.agregar(10, "Moooooor");
Elem.agregar(41, "Rauleto");
Elem.agregar(4, "Mora");
Elem.agregar(35, "BAKI");
Elem.agregar(7, "Zorro");

System.out.println(Elem);
	    	        
Elem.valor(41);
	    	        
Elem.quitar(7);
	    	        
System.out.println(Elem);
	    	    }
	    	    
	    	}
	    
