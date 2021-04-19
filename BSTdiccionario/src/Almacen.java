
public class Almacen implements Comparable<Almacen>{
	String nombre ;
	public Almacen (String a ) {
		this.nombre = a;
	}
	
	public int  compareTo () {
		return 0 ; 
	}


	public int compareTo(Almacen o) {
		if (this.nombre.compareTo(o.nombre)> 0 ) {
			return 1 ; 
		}else if (this.nombre.equals(o.nombre)) {
			return 0 ;
		}
		return -1;
	}
	
	public String toString() {
		return ""+this.nombre;
	}
}
