package nuevo;

public class Coleccion {
	private Persona [] arrPersona;
	private int ultimo  = 0 ; 
	
	public Coleccion (int n ) {
		this.arrPersona = new Persona [n];
	}
	public Coleccion () {
		this(10);
	}
	public void  agregarPersona(Persona p1 ) {
			if (this.ultimo+1 != this.arrPersona.length ) {
				this.arrPersona[ultimo] = p1 ; 
				this.ultimo+=1;
			}else {
				System.out.println("la coleccion de personas esta llena, con "+this.ultimo+" personas");
			}
	}
	public int  buscarPersona(Persona p1 ) {
		for (int i = 0  ; i < this.ultimo ; i++) {
			if (this.arrPersona[i].getNombre() == p1.getNombre() &&
					this.arrPersona[i].getSexo() == p1.getSexo() && 
							this.arrPersona[i].getEdad()== p1.getEdad()) {
				return i ; 
			}
		}
		return -1;
	}
	
	public void  eliminarPersona_2(Persona p1 ) {
			int num = this.buscarPersona(p1);
			if (num != -1){
				this.arrPersona[num] = this.arrPersona[this.ultimo-1];
				this.arrPersona[this.ultimo] = null ; 
				this.ultimo--; 
			}
	}
	
	public void eliminarPersona_1(Persona p1 ) {
		int num = this.buscarPersona(p1);
		if (num != -1 &&  num  <= this.ultimo ){
			for (int i = num ; i < this.ultimo;i++) {
				this.arrPersona[i] = this.arrPersona[i+1];	
			}
			this.ultimo-=1; 
		}
		else {
			arrPersona[num] = null;
			this.ultimo-=1;
		}
	}
	
	public Persona [] mayoresEdad() {
		Persona [] mayorEdad = new Persona [this.ultimo];
		int conta = 0; 
		
		for (int i = 0 ; i <this.ultimo ; i++) {
			
			if (this.arrPersona[i].getEdad() >= 18 ) { 
				mayorEdad[conta] = this.arrPersona[i];
				conta+=1; 
			}
		}	
		return mayorEdad;
	}
	
	public Persona[] alturaMayor (double a ) {
		
		Persona [] alturaMayor = new Persona [this.ultimo - 1];
		
		int conta = 0; 
		for (int i = 0 ; i <this.ultimo ; i++) {
			if (this.arrPersona[i].getAltura() >= a ) { 
				
				
				alturaMayor[conta] = this.arrPersona[i];
				conta+=1; 
			}
		}	
		return alturaMayor;
		
		
		
	}
	
	
	public Persona[] condicionPeso(int  cond ) {
		Persona [] arrpeso = new Persona [this.ultimo];
		
		int conta = 0 ; 
			for (int i = 0 ; i< this.ultimo; i++) {
				
				if (cond == 1 && this.arrPersona[i].calcularMC() == -1 ) {
					arrpeso[conta] = this.arrPersona[i];
					conta+=1;
				}else if (cond == 2  && this.arrPersona[i].calcularMC() == 0 ) {
					arrpeso[conta] = this.arrPersona[i];
					conta+=1;
				}else if (cond == 3 && this.arrPersona[i].calcularMC() == 1) {
					arrpeso[conta] = this.arrPersona[i];
					conta+=1;
				}
		}
		return arrpeso;

	}
	
	
	public String toString () {
		String a = "\n";
		for (int i = 0 ; i < this.ultimo; i++ ) {
			a+=this.arrPersona[i].getNombre()+"\n";
			
		}
		return "\nLa coleccion tiene "+this.ultimo+" Personas, que se llaman \n"+a;
	}

}