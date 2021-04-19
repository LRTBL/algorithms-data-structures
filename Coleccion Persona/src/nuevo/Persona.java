package nuevo;

import java.math.*;

public class Persona {
	
	private String nombre ; 
	private int edad ; 
	private char sexo;
	private double  peso ; 
	private double  altura;
	
	public Persona (String nombre , int edad , char sex, double peso, double altura ) {
		this.nombre = nombre;
		this.edad = edad ; 
		this.sexo = comprobarSexo(sex);
		this.peso = peso;
		this.altura = altura ;
	}
	public Persona () {
		this("",0,'H',0,0);
	}
	public Persona (String nombre , int edad , char sex) {
		
		this(nombre, edad , sex, 0  , 0  );
		
	}

	public int calcularMC() {

		if (this.peso / Math.pow(this.altura, 2) < 18.5) {
			return -1 ;
		}
		else if (this.peso / Math.pow(this.altura, 2) > 25.0) {
			return 1 ;
		}
		else {
			return 0; 
		}
		
	}
	
	public boolean esMayorDeEdad () {
		if (this.edad >= 18 ) {
			return true ; 
		}else {
			return false ; 
		}
	}
	
	private char comprobarSexo (char sexo ) {
	
		if (!(sexo == 'H' || sexo =='M')) {
			return  'H';
		}else {
			return sexo ;  
		}
	}
	
	public String tostring () {
		return "NOMBRE : "+this.nombre+"\n\nEDAD   : "+this.edad+"\nSEXO   : "+this.sexo+"\nPESO   : "+this.peso+"\nALTURA : "+this.altura;
	}
	
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public char getSexo() {
		return sexo;
	}

	public void setSexo(char sexo) {
		this.sexo = sexo;
	}

	public double getPeso() {
		return peso;
	}

	public void setPeso(double peso) {
		this.peso = peso;
	}

	public double getAltura() {
		return altura;
	}

	public void setAltura(double altura) {
		this.altura = altura;
	}

}