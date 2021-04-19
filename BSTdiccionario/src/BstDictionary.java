

public class BstDictionary <c extends Comparable<c>, v> implements Dictionary<c, v>{
	private BSTree <EntryDic<c, v>> bst;
	
	BstDictionary() {
		bst = new BSTree<EntryDic<c, v>>();
	}
	
	public void insert (c key , v value) throws ItemDuplicated{
		bst.insert(new EntryDic<c,v>(key , value));
	}
	public void remove (c key ) throws  ItemNoFound{
		bst.remove(new EntryDic<c, v>(key));
	}
	public v search(c key ) throws ItemNoFound{
		return bst.Search(new EntryDic<c, v>(key)).getValue();
		
	}
	public boolean isEmpty() {
		return bst.isEmpty();
	}
	
	public void printAll() {
		bst.inOrden();
	}
}
