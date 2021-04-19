
public class Rectangulo extends Figura  {
	private double largo ; 
	private double ancho ; 
	
	public Rectangulo (double l , double a  ) {
		super ("Rectangulo");
		largo = l;
		ancho =  a ; 
	}
	
	public double area() {
		return largo*ancho;
	}
	
	
}
