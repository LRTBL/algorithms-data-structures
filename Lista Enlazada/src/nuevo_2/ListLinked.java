package nuevo_2;

import java.util.ArrayList;

public class ListLinked <T extends Comparable<T>> implements ListaTDA <T> {
	
	protected int count;
    protected NodeList<T> first;
	public ListLinked(){
		this.first = null;
		this.count = 0;
	} 

	public void initializeList(){
		destroyList()  ;
	}
	
   	public boolean isEmpty(){
		return this.first == null ; 
	}

	public int length(){ 
		return this.count;
	}

	public void destroyList(){
		while (this.first != null) {
			this.first = this.first.getLink();
		}
		this.count = 0 ; 
	}

	public int search(T searchItem){
		NodeList <T> aux = this.first ; 
		int post = 0 ;
		while (aux != null && !aux.getInfo().equals(searchItem)) {
			aux = aux.getLink();
			post++;
		}
		if (aux != null) {
			return post;
		}
		return -1 ;
	}
	
    public void insertFirst(T newItem){
		
    	this.first = new NodeList<T>(newItem, this.first);
    	this.count++;
    }

	public void insertLast(T newItem){
		if (!isEmpty()) {
			NodeList <T> aux = first ; 
			while (aux.getLink() != null) {
				aux = aux.getLink();
			}
			aux.setLink(new NodeList<T> (newItem) );
			this.count++;
		}else {
			insertFirst(newItem);
		}
		
	}
  
	public void deleteNode(T deleteItem) {
		if (isEmpty()) {
			return;
		}else if (this.first.getInfo().equals(deleteItem)) {
			this.first = this.first.getLink();
			this.count--;
		}else  {
			NodeList <T> aux = first ; 
			while (aux.getLink().getInfo().equals(deleteItem) && aux.getLink() != null ) {
				aux = aux.getLink();
			}
			if (aux.getLink() != null) {
				aux.setLink(aux.getLink().getLink());
				this.count--;
			}
		}
	}
	
	
	
	
	
	
	
	public ArrayList<T> Search (T e)   {
		ArrayList<T> o = new ArrayList<T>();
		NodeList<T>  aux  =  this.first;
		while(aux != null) {
			if (aux.getInfo().compareTo(e) < 0 ) {
				o.add(aux.getInfo());
			}
			aux = aux.getLink();
		}
		return o;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	public String toString () {
		String res = "";
		NodeList <T> aux = first ; 
		while (aux != null) {
			res+=aux.toString()+"\n";
			aux = aux.getLink();
		}
		return res ;
	}
}