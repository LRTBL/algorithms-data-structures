
import java.util.*;

public class Test {

	public static void main(String[] args) {
		
		
		//ArrayList<Circulo > hola  = new ArrayList<Figura>();
		
		//ArrayList<Figura > hola1  = new ArrayList<Circulo>();
		
		ArrayList<Figura > hola2 = new ArrayList<Figura>();
		
		// hola2.add(new Figura());
		
		hola2.add(new Circulo());
		
		hola2.add(new Cuadrado(2));
		
		System.out.print(hola2.toString());
		
		Figura f1 = hola2.get(0);
		
		System.out.print(f1.toString());
		
		Circulo f2 =  (Circulo) hola2.get(0);
		
		System.out.print(f2.toString());
	
		
		Comparable<Figura> c2 =  hola2.get(1);
	
		System.out.print(c2.toString());


	}
	
	public  <T> T nuevo (T hola) {
		return hola; 
	}

}
