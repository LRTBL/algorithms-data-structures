
public class Titular {
	public String nombre;
	public String apellido;
	public String dni;
	
	public Titular(String a , String b , String c) {
		this.nombre = a ;
		this.apellido = b;
		this.dni = c ; 
	}
	
	public String toString() {
		return "\nNombre:"+this.nombre+"\nApellido:"+this.apellido+"\nDni:"+this.dni;
	}
}
