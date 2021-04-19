public class Rectangulo {
	private Coordenada esquina1 ;
	private Coordenada esquina2  ;
	public Rectangulo () {}
	public Rectangulo (Coordenada a , Coordenada b ) {
		this.esquina1 = a ; 
		this.esquina2 = b ; 
	}
	void setEsquina1 (Coordenada a) {
		this.esquina1 = a; 
	}
	void setEsquina2 (Coordenada b) {
		this.esquina2 = b ; 
	}
	Coordenada getEsquina1 () {
		return this.esquina1;
	}
	Coordenada getEsquina2 () {
		return this.esquina2;
	}
	public String toString() {
		return "("+this.esquina1+","+this.esquina2+")"; 
		
	}
}