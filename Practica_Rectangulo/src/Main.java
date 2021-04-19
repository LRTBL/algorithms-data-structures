import java.util.*;

public class Main {
	
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in) ;
		
		int flag  =  1 ; 
		
		while (flag == 1) {
			
			double Rec1x1,Rec1y1,Rec1x2,Rec1y2,Rec2x1,Rec2y1,Rec2x2,Rec2y2; 
			
			System.out.print("\nDigite una esquina del primer rectangulo x:");Rec1x1 = input.nextDouble();
			System.out.print("\nDigite una esquina del primer rectangulo y:");;Rec1y1 = input.nextDouble();
			System.out.print("\nDigite la esquina opuesta del primer rectuangulo x:");Rec1x2 = input.nextDouble();
			System.out.print("\nDigite una esquina del primer rectangulo y :");Rec1y2 = input.nextDouble();
			System.out.print("\nDigite una esquina del segundo rectangulo x :");Rec2x1 = input.nextDouble();
			System.out.print("\nDigite una esquina del primer rectangulo y :");Rec2y1 = input.nextDouble();
			System.out.println("\nDigite la esquina opuesta del segundo rectangulo x:");Rec2x2 = input.nextDouble();
			System.out.print("\nDigite una esquina del primer rectangulo y :");Rec2y2 = input.nextDouble();
			
			Rectangulo primero = new Rectangulo (new Coordenada(Rec1x1,Rec1y1),new Coordenada(Rec1x2,Rec1y2)) ;
			Rectangulo segundo = new Rectangulo (new Coordenada(Rec2x1,Rec2y1),new Coordenada(Rec2x2,Rec2y2)) ;
			
			System.out.println("Rectangulo A : "+primero);
			System.out.println("Rectangulo B : "+segundo);
			
			if(sobrepuesto(primero , segundo )) {
				
				System.out.println("\nRectangulos A  y B se sobreponen.");
				
			}else if (junto (primero , segundo ) ) {
				
				System.out.println("\nRectangulos A  y B se juntan. ");
				
			}else {
				
				System.out.println("\nRectangulos A  y B estan separados.");
				
			}
			
			System.out.print("DESEA CONTINUAR  SI(1)  O   NO(0): ");flag = input.nextInt();
			
			
		}
		
		
	}

	public static boolean sobrepuesto (Rectangulo r1 , Rectangulo r2) {
		
		return true  ; 
		
	}
	
	public static boolean junto (Rectangulo r1 , Rectangulo r2) {
		return true ; 
	}
	
	public static float area (Rectangulo r1 , Rectangulo r2) {
		float area  = 0  ;
		return area ; 
	}
	
	
	
	public static boolean  calcular (Rectangulo primero , Rectangulo segundo ) {
		
		Rectangulo mayor; 
		
		if (primero.getEsquina1().distancia(primero.getEsquina2()) > segundo.getEsquina1().distancia(segundo.getEsquina2()) ) {
			
			mayor = primero; 
			
			Coordenada mayor_cord3 = new Coordenada(mayor.getEsquina1().getX(),mayor.getEsquina2().getY());
			Coordenada mayor_cord4 = new Coordenada(mayor.getEsquina1().getY(),mayor.getEsquina2().getX());
			Coordenada menor_cord3 = new Coordenada(segundo.getEsquina1().getX(),segundo.getEsquina2().getY());
			Coordenada menor_cord4 = new Coordenada(segundo.getEsquina1().getY(),segundo.getEsquina2().getX());
			
			if (mayor_cord3.distancia(mayor.getEsquina1()) == mayor_cord4.distancia(mayor.getEsquina1())) {
				
				double dis = mayor_cord3.distancia(mayor.getEsquina1());
				
				if ((mayor_cord3.distancia(segundo.getEsquina1())<dis && mayor_cord3.distancia(segundo.getEsquina2())<dis && mayor_cord3.distancia(segundo.getEsquina2())<dis 
					&& mayor_cord3.distancia(menor_cord3)<dis  && mayor_cord3.distancia(menor_cord4)<dis ) || 
						(mayor_cord3.distancia(segundo.getEsquina1())<dis && mayor_cord3.distancia(segundo.getEsquina2())<dis && mayor_cord3.distancia(segundo.getEsquina2())<dis 
							&& mayor_cord3.distancia(menor_cord3)<dis  && mayor_cord3.distancia(menor_cord4)<dis ) ){
					
					System.out.println("\nRectangulos A  y B se sobreponen.");
					
				}else if (mayor_cord3.distancia(segundo.getEsquina1())>dis && mayor_cord3.distancia(segundo.getEsquina2())>dis && mayor_cord3.distancia(segundo.getEsquina2())>dis 
						&& mayor_cord3.distancia(menor_cord3)>dis  && mayor_cord3.distancia(menor_cord4)>dis ) {
					
					System.out.println("\nRectangulos A  y B son disjuntos. ");
					
				}else {
					System.out.println("\nRectangulos A  y B se juntan.");
				}
				
			}
			
		}else {
			
			mayor = segundo; 
			
			Coordenada mayor_cord3 = new Coordenada(mayor.getEsquina1().getX(),mayor.getEsquina2().getY());
			Coordenada mayor_cord4 = new Coordenada(mayor.getEsquina1().getY(),mayor.getEsquina2().getX());
			Coordenada menor_cord3 = new Coordenada(primero.getEsquina1().getX(),primero.getEsquina2().getY());
			Coordenada menor_cord4 = new Coordenada(primero.getEsquina1().getY(),primero.getEsquina2().getX());
			
			if (mayor_cord3.distancia(mayor.getEsquina1()) == mayor_cord4.distancia(mayor.getEsquina1())) {
				
				double dis = mayor_cord3.distancia(mayor.getEsquina1());
				
				if (mayor_cord3.distancia(segundo.getEsquina1())<dis && mayor_cord3.distancia(segundo.getEsquina2())<dis && mayor_cord3.distancia(segundo.getEsquina2())<dis 
					&& mayor_cord3.distancia(menor_cord3)<dis  && mayor_cord3.distancia(menor_cord4)<dis ) {
					
					System.out.println("\nRectangulos A  y B se sobreponen.");
					
				}else if (mayor_cord3.distancia(segundo.getEsquina1())>dis && mayor_cord3.distancia(segundo.getEsquina2())>dis && mayor_cord3.distancia(segundo.getEsquina2())>dis 
						&& mayor_cord3.distancia(menor_cord3)>dis  && mayor_cord3.distancia(menor_cord4)>dis ) {
					
					System.out.println("\nRectangulos A  y B son disjuntos. ");
					
				}else {
					System.out.println("\nRectangulos A  y B se juntan.");
				}
			
		}
		
		
	
		
	}
		return true; 

	} 
}

