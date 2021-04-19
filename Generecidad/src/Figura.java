
public abstract  class Figura implements Comparable <Figura> {
	private String nombre ; 
	
	abstract public double area () ; 
	
	public Figura (String n ) {
		nombre = n ; 
	}
	
	final public double compArea  (Figura b ) {
		return area() - b.area();
	}
	final public String toString() {
		return nombre+" de area "+ area();
		
	}
	
	public int comparateTo(Figura x) {
		if (this.area() < x.area()) {
			return -1 ; 
		}
		else if (this.area() > x.area()) {
			return 1 ; 
		}
		else {
			return 0 ;
		}
		
	}
}
