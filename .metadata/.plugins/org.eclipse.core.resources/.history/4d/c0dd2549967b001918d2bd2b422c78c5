package nuevo_2;

public class PilaArray<E> implements Pila <E> {
	
	
	private int tope ; 
	
	private E [] array ;
	
	public PilaArray (int cont) {
		this.array = (E[]) new Object [cont];
		this.tope = -1; 
	}
	
	public  void apilar (E var) {
		
		if (esVacia()) {
			this.array [0] = var ;
			this.tope = 0 ; 
		}else {
			this.array[this.tope+1] = var ; 
			this.tope +=1 ; 
		}
	}
	
	
	public E desapilar () {
		
		E aux = this.array[this.tope];
		this.array[this.tope] = null ; 
		this.tope--;
		return aux ;
		
	}
	
	public E tope () {
		
		return this.array[this.tope] ; 
	}
	
	public boolean esVacia() {
		
		if (array[0] == null) {
			return true ; 
		}
		return false;
	}

	public int getTope() {
		return tope;
	}

	public void setTope(int tope) {
		this.tope = tope;
	}

	public E[] getArray() {
		return array;
	}

	public void setArray(E[] array) {
		this.array = array;
	}
	
	public String toString () {
		String hola  = "";
		for (E i : this.array) {
			if (i != null) {
				hola+=i ;
			}
		}
		return hola ; 
		
	}

	

}
