package arrenlazado;

public class Nodo <T>{
	
	public T dato; 
	public  Nodo <T> siguiente; 
	
	public Nodo (Nodo sig , T dat ) {
		
		this.dato = dat ; 
		this.siguiente = sig ; 
		
	}
	
	public Nodo (T dat) {
		
		this.dato = dat;
		this.siguiente = null ; 
	}
	
	public Nodo () {
		this.dato = null ; 
		this.siguiente = null ; 
	}
	
	public String toString () {
		return "Dato:"+this.dato+"\n";
	}
	
}
