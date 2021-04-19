

public interface Dictionary <c, v> {
	void insert (c key , v value) throws ItemDuplicated;
	void remove (c key ) throws  ItemNoFound;
	v search(c key ) throws ItemNoFound;
	boolean isEmpty();
	void printAll();
}
