package nuevo_2;
public class OrderListLinked<T extends Comparable<T>> extends ListLinked<T>{
	
	public int search(T searchItem){
			int posi=0;
			if (this.first.getInfo().equals(searchItem)) {
				return posi ; 
			}
			NodeList<T> aux = this.first.getLink();
			while (aux!=null ) {
				posi++;
				if (aux.getInfo().equals(searchItem)) {
					return posi;
				}
				aux = aux.getLink();
			}
			return -1;
	}
	public void insert(T newItem) {
		if(isEmpty()) {
			insertFirst(newItem);
			this.count++;
		}
		else {
			
			if(this.first.getInfo().compareTo(newItem)>0) {
				insertFirst(newItem);
			}else  {
				NodeList<T> aux = this.first;
				while(aux.getLink()!= null && aux.getLink().getInfo().compareTo(newItem) < 0) {
					aux = aux.getLink();
				}
				aux.setLink(new NodeList<T>(newItem, aux.getLink()));
				this.count ++;
			}
		}
	}
	public void deleteNode(T deleteItem) {
		if(!isEmpty()) {
			int posi = this.search(deleteItem);
			if(posi== 0) {
				this.first = this.first.getLink();
				this.count--;
			}else if (posi>0){
				NodeList<T> aux=this.first;
				while (posi > 1) {
					aux = aux.getLink() ;
					posi--;
				}
				aux.setLink(aux.getLink().getLink());
				this.count--;
			}	
		}
	}
}
