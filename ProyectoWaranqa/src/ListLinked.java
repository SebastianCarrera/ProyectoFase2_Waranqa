

public class ListLinked<T extends Comparable<T>> {
	protected Node first;
	
	protected int count;
	
	
	public ListLinked() {
		super();
	}
	
	
	public ListLinked(ListLinked<T>.Node first, int count) {
		super();
		this.first = first;
		this.count = count;
	}

	public int length() {
		return this.count;
	}
	
	
	
	
	public void insercion(T elemento){
		Node nuevo = new Node();
		
		nuevo.setData(elemento);
		if(this.first==null) {
			this.first=nuevo;
		}
		else {
			if(elemento.compareTo(this.first.getData()) > 0) {
				nuevo.next=this.first;
				this.first=nuevo;
			}
			else {
				Node temporal= new Node();
				Node anterior= new Node();
				temporal=this.first;
				anterior=this.first;
				while(elemento.compareTo(temporal.getData()) >= 0 && temporal.getNext()!= null ) {
					anterior=temporal;
					temporal=temporal.getNext();
				}
				if(elemento.compareTo(temporal.getData()) >= 0) {
					temporal.next=nuevo;
				}
				else {
					nuevo.next=temporal;
					anterior.next=nuevo;
	
				}
			}
		}
	}
	
	public void remove(T elemento) {
		Node  aux=this.first;
		Node  anterior=null;
		
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
		 System.out.println("BORRADO EXITOSO DEL ELEMENTO --->"+elemento);
		 this.count--;
	}
	
	public int search( T elemento) {
		Node aux=this.first;
		
		while(aux!= null && aux.getData().compareTo(elemento) < 0) {
			aux= aux.getNext();
			
			}
		if(aux!= null) {
			aux.getData().equals(elemento);
			System.out.println("Elemento encontrado : "+elemento);
			return 0;
			
		}
		System.out.println("Elemento no encontrado...");
		return -1;
	}

	public String toString() {
		String str="";
		Node aux = this.first;
		for(int i =0; aux!=null; aux= aux.getNext(), i++ )
			str +="["+i+"]="+"\t"+aux.getData()+"\n";
		return str; 
	}
	
	public class Node  {
		 protected T data;// informacion 
		 protected Node next; //puntero enlace
		
		public Node(T data) {
			this (data,null);
		}

		public Node() {
		}

		public Node(T data, Node next) {
			super();
			this.data = data;
			this.next = next;
		}

		public T getData() {
			return data;
		}

		public void setData(T data) {
			this.data = data;
		}

		public Node getNext() {
			return next;
		}

		public void setNext(Node next) {
			this.next = next;
		}
	}

}
