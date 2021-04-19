
public class Circulo extends Figura {
	static final private double PI = 3.14192653;
	private double radio; 
	
	
	public Circulo (double r ) {
		super("Circulo") ; 
		radio = r ; 
	}
	
	public Circulo ()  {
		this(0.0);
	}
	
	public double area () {
		return PI*radio*radio;
	}

}
