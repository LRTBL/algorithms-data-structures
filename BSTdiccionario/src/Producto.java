
public class Producto implements Comparable<Producto> {
	int codigo; 
	String descripcion;
	public Producto ( int c ,  String b) {
		this.codigo = c;
		this.descripcion = b;
	}
	
	public Producto (int c) {
		this(c, null);
	}
	public int compareTo(Producto a) {
		if (this.codigo > a.codigo) {
			return 1;
		}else if (this.codigo == a.codigo){
			return 0;
		}
		return -1 ;
	}
	public String toString() {
		return ""+ this.codigo+" "+this.descripcion;
	}
}
