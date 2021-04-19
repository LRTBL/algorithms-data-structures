package nuevo_2;

public class Testeo {

	public static void main(String[] args) {
		PilaArray<Integer> nuevo = new PilaArray<Integer>(5) ;
		nuevo.apilar(5);
		nuevo.apilar(3);
		nuevo.apilar(5);
		nuevo.apilar(7);
		System.out.println(nuevo.toString());
		nuevo.desapilar();
		System.out.println(nuevo.toString());
		nuevo.desapilar();
		System.out.println(nuevo.toString());
		nuevo.apilar(9);
		System.out.println(nuevo.toString());
		ColaLink<Integer> nuevo2 = new ColaLink <Integer>() ;
		nuevo2.encolar(9);
		nuevo2.encolar(2);
		nuevo2.encolar(3);
		nuevo2.encolar(4);
		nuevo2.encolar(5);
		System.out.println(nuevo2.toString());
		nuevo2.descolar();
		System.out.println(nuevo2.toString());
		nuevo2.descolar();
		System.out.println(nuevo2.toString());
		nuevo2.encolar(10);
		System.out.println(nuevo2.toString());
		nuevo2.descolar();
		System.out.println(nuevo2.toString());
	
		
		
	}

}
