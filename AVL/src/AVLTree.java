
    
public class AVLTree<E extends Comparable<E>>{
	private Node <E> root ;
	private boolean height ; 
	
	
	public AVLTree () {
		this.root = null ; 
	}
	
	public  void insert (E x) throws ItemDuplicated{
		this.root = insert(x , this.root);
	}
	
	protected Node<E> insert (E x , Node<E> node) throws ItemDuplicated {
		Node<E> res = node ;
		if (node == null) {
			this.height = true ;
			res = new Node <E> (x);
		}else {
			int resC = node.getData().compareTo(x);
			if (resC == 0 ) {
				throw new ItemDuplicated ("ELEMENTO DUPLICADO");
			}else if (resC < 0) {
				res.setRight(insert(x, node.getRight()));
				if (this.height) {
					switch(res.getFe()) {
					case -1:
						res.setFe(0);this.height = false ;
						break ;
					case 0:
						res.setFe(1);this.height = true ;
						break ;
					case 1:
						res = balanceToLeft(res);this.height = false ;
						break ;
					}
				}
			
			}else {
				res.setLeft(insert(x, node.getLeft()));
				
				if (this.height) {
					switch(res.getFe()) {
					case 1:
						res.setFe(0);this.height = false ;
						break ;
					case 0:
						res.setFe(1);this.height = true ;
						break ;
					case -1:
						res = balanceToRight(res);this.height = false ;
						break ;
					}
				}
			}
		}
		return res ; 
	}
	
	protected  Node <E> balanceToLeft( Node<E> res) {
		Node<E> hijo =  res.getRight();
		if (hijo.getFe() == 1) {
			res.setFe(0);
			hijo.setFe(0);
			res = rorateSL(res);
		}else if (hijo.getFe() == -1) {
			Node<E> nieto = hijo.getLeft();
			switch (nieto.getFe()) {
			case -1: res.setFe(1); hijo.setFe(0);break;
			case 0: res.setFe(0); hijo.setFe(0);break;
			case 1: res.setFe(0); hijo.setFe(-1);break;
			}
			nieto.setFe(0);
			
			res.setRight(rorateSR(hijo));
			res  = rorateSL(res);
		}
		return res;
	}
	
	
	protected  Node <E> balanceToRight( Node<E> res) {
		Node<E> hijo =  res.getLeft();
		if (hijo.getFe() == -1) {
			res.setFe(0);
			hijo.setFe(0);
			res = rorateSR(res);
		}else if (hijo.getFe() == 1) {
			Node<E> nieto = hijo.getRight();
			switch (nieto.getFe()) {
			case 1: res.setFe(0); hijo.setFe(-1);break;
			case 0: res.setFe(0); hijo.setFe(0);break;
			case -1: res.setFe(1); hijo.setFe(0);break;
			}
			nieto.setFe(0);
			res.setLeft(rorateSL(hijo));
			res  = rorateSR(res);
		}
		return res;
	}
	
	
	
	protected  Node<E> rorateSL (Node<E> node ) {
			Node<E> hijo = node.getRight();
			node.setRight(hijo.getLeft());
			hijo.setLeft(node);
			node = hijo;
			return node ;	
	}
	protected  Node<E> rorateSR (Node<E> node ) {
		Node<E> hijo = node.getLeft();
		node.setLeft(hijo.getRight());
		hijo.setRight(node);
		node = hijo;
		return node ;		
	}	
	
	public void InOrde() {
		inOrden(this.root);
		System.out.println();
	}
	
	protected void inOrden(Node<E> actual){
		
		if (actual != null) {
			inOrden(actual.getLeft());
			System.out.print(actual+", ");
			inOrden(actual.getRight());
		}
	}
}
