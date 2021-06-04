
public class OrderListLinked<T extends Comparable<T>> extends ListLinked<T> {
	public OrderListLinked(){
		super();	
	}
	public void insercion(T elemento){
		Node<T> nuevo = new Node<T>();
		
		nuevo.setData(elemento);
		if(this.first==null) {
			this.first=nuevo;
		}
		else {
			if(elemento.compareTo(this.first.getData()) < 0) {
				nuevo.next=this.first;
				this.first=nuevo;
			}
			else {
				Node<T> temporal= new Node<T>();
				Node<T> anterior= new Node<T>();
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
	public void remove(T elemento)  { 
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
		 System.out.println("BORRADO EXITOSO DEL ELEMENTO --->"+elemento);
		 this.count--;
	}
	
	public int buscar( T elemento )throws ItemNotFound {
		Node<T> aux=this.first;
		
		while(aux!= null && aux.getData().compareTo(elemento) < 0) {
			aux= aux.getNext();
			
			}
		if(aux!= null) {
			aux.getData().equals(elemento);
			System.out.println("Elemento encontrado : "+elemento);
			return 0;
		}
		throw new ItemNotFound("No se encontro lo que buscaba..");		
	}
}
