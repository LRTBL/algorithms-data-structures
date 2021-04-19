package nuevo;

public class Prueba {

	public static void main(String[] args) {
		Persona p1 = new Persona () ; 
		
		
		Persona p2 = new Persona ("FERNANDO", 18, 'H', 63 , 1.67) ; 
		Persona p3 = new Persona ("CIELO", 16, 'M', 30 , 1.64) ;
		Persona p4 = new Persona ("JOSE", 120, 'X', 100 , 1.64) ;
		Persona p5 = new Persona ("MARIA", 69, 'H', 100 , 1.68) ;
		
		imprimir(p2);
		imprimir(p3);
		imprimir(p4);
		imprimir(p5);
		
		Coleccion c1 = new Coleccion(); 
		
		c1.agregarPersona(p2);
		c1.agregarPersona(p3);
		c1.agregarPersona(p4);
		c1.agregarPersona(p5);
		
		
		System.out.println(c1.toString());
		
		System.out.println("\nLa persona "+p3.getNombre()+" esta en la posision "+c1.buscarPersona(p3));
		System.out.println("\nLa persona "+p4.getNombre()+" esta en la posision "+c1.buscarPersona(p4));
		

		
		Persona [] altura = c1.alturaMayor(1.65);
		
		Persona [] edad = c1.mayoresEdad();
		
		imprimir_2(altura);
		imprimir_2(edad);
		
		
		System.out.println("\nEstamos eliminando a la persona "+p2.getNombre());
		
		c1.eliminarPersona_1(p2); // eliminacion por primera estrategia
		
		System.out.println(c1.toString());
		
		System.out.println("\nLa persona "+p2.getNombre()+" esta en la posision "+c1.buscarPersona(p2));
		
		c1.eliminarPersona_2(p3);   // eliminacion por segunda estrategia
		
		System.out.println(c1.toString());

		
	}
	
	public static void imprimir (Persona p) {
		
		System.out.println("----------------");
		System.out.println(p.tostring());
		System.out.println("IMC    : "+ p.calcularMC());
		System.out.println("MAYOR  : "+p.esMayorDeEdad());
		System.out.println("----------------");
		
	}
	
	public static void imprimir_2 (Persona [] p) {
		
		for (int i = 0 ; i < p.length && p[i] != null  ;i++) {
			System.out.print(p[i].getNombre()+"-");
		}
		System.out.print("\n\n\n");
		
		
	}
	
}
