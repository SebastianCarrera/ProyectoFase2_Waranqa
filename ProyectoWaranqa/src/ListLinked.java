
public class ListLinked<T> {
	protected Node<T> first;
	protected int count;
	
	public ListLinked() {
		this.first=null;
		this.count=0;
	}
	public boolean isEmptyList() {
		return (this.first==null);
	}
	public int length() {
		return this.count;
	}
	
	public void destroyList() {
		while (this.first !=null)
			this.first = this.first.getNext();
		this.count=0;
	}
	
	public int search(T x) throws ItemNotFound  {
		Node<T> aux = this.first;
		
		for(int i =0; aux!=null; aux= aux.getNext(), i++ )
			if(aux.getData().equals(x))
				return i;
		throw new ItemNotFound("El dato "+ x +" no se encuentra...");
		
	}
	
	public void insertLast(T x) {
		if (this.isEmptyList())
			this.insertFirst(x);
		else {
			Node<T> lastNode = getLastNode();
			lastNode.setNext(new Node<T>(x));
			this.count++;
		}
	}
	
	//Precondicion: Lista no este vacia
	private Node<T> getLastNode(){
		Node<T> aux = this.first;
		while (aux.getNext()!=null)
			aux=aux.getNext();
		return aux;
	}
	
	public void insertFirst(T x) {
		this.first= new Node<T> (x,this.first);
		this.count++;
	}
	
	public void remove(T elemento) {
		Node <T> aux=this.first;
		Node <T> anterior=null;
		
		if (aux != null && aux.getData() == elemento) {
			this.first = aux.getNext(); 
            return;
        }
		 while (aux != null && aux.getData() != elemento) {
			 anterior = aux;
			 aux = aux.getNext();
	        }
		 if (aux == null)
			 return;
		 anterior.setNext(aux.getNext());
		 System.out.println("SE BORRÓ EXITOSAMENTE....");
		 this.count--;
	
	}
	public String toString() {
		String str="";
		Node<T> aux = this.first;
		for(int i =0; aux!=null; aux= aux.getNext(), i++ )
			str +="["+(i+1)+"] = "+ "  "+aux.getData()+ "\t ";
		return str; 
	}
}
