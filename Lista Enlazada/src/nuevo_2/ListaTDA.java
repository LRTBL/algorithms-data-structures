package nuevo_2;
public interface ListaTDA <T> {
	
	void initializeList();
	boolean isEmpty();
	int length();
	void destroyList();
	int search(T ele);
	void insertFirst(T ele);
	void insertLast(T ele);
	void deleteNode(T ele);
	
}
