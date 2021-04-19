
public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*
		BSTree <Integer> b = new BSTree <Integer>();
		try {
			
			b.insert(5);
			b.insert(1);
			b.insert(9);
			b.insert(4);
			b.insert(11);
			b.insert(2);
			b.insert(0);
			b.insert(8);


			b.inOrden();
		}catch(ItemDuplicated e) {
			System.out.println(e.getMessage());
		}
		
		
		try {
			System.out.println(b.Search(5));
		} catch (ItemNoFound e) {
			
			System.out.println(e.getMessage());
		}
		
	
		try {
			b.remove(9);
			b.inOrden();
		} catch (ItemNoFound e) {
			
			System.out.println(e.getMessage());
	
		}
		BSTree <EntryDic<String, String>> c = new BSTree <EntryDic<String, String>>();
		
		try {
			
			c.insert(new EntryDic<String, String>("ana","pe�a"));
			c.insert(new EntryDic<String, String>("maria","gonzales"));
			c.insert(new EntryDic<String, String>("jorge","perez"));
			c.insert(new EntryDic<String, String>("lucas","torres"));
			
			c.inOrden();
			
			System.out.print("busqueda :"+c.search(new EntryDic<String, String>("ana")));
		} catch (ItemDuplicated e) {

			System.out.println(e.getMessage());
		} catch (ItemNoFound e) {

			System.out.println(e.getMessage());
		}
		
		
		
		try {
			Dictionary<String , String > b = new BstDictionary<String, String>();
			b.insert("ana", "paula");
			b.insert("ana", "paula");
			b.insert("ana", "paula");
			b.printAll();
			System.out.print("busqueda :"+b.search("ana"));
		
			b.remove("ceci", "pablo");
		} catch (ItemDuplicated e) {
		}catch(ItemNoFound e){
			System.out.print(e.getMessage());
		}catch (ItemDuplicated e) {
			System.out.println(e.getMessage());
		}
		*/
		
		try {
			Dictionary<Producto , Almacen > q = new BstDictionary<Producto , Almacen>();
			
			q.insert(new Producto (12,"pc"), new Almacen ("A.cpp"));
			q.insert(new Producto (13,"monitor"), new Almacen ("A.python"));
			q.insert(new Producto (14,"raton"), new Almacen ("A.ruby"));
			q.insert(new Producto (15,"teclado"), new Almacen ("A.java"));
			q.insert(new Producto (16,"camera"), new Almacen ("A.javascript"));
			
			q.printAll();
			
			System.out.print("busqueda :"+q.search(new Producto (12, "hola")));
			q.remove(new Producto(15,"teclado"));
		} catch (ItemDuplicated e) {
			
		
		}catch(ItemNoFound e){
			System.out.print(e.getMessage());
		}
		
	}
}
