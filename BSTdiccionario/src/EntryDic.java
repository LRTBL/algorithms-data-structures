
public class EntryDic <c extends Comparable <c>, v> implements Comparable <EntryDic<c, v>>{
	private c key ; 
	
	private v value;
	public EntryDic (c key , v value ) {
		this.key = key; 
		this.value = value ;
	}
	public EntryDic (c key) {
		this(key ,null);
	}
	
	public c getKey() {
		return key;
	}
	public void setKey(c key) {
		this.key = key;
	}
	public v getValue() {
		return value;
	}
	public void setValue(v value) {
		this.value = value;
	}
	
	public boolean equals (Object  o) {
			return ((EntryDic<c, v>)o).key.equals(this.key);
	}
	
	public int compareTo (EntryDic<c, v > e) {
		return this.key.compareTo(e.key);
	}
	public String toString () {
		return "["+this.key+","+this.value+"]";
	}
}
