import java.util.ArrayList;

public class Node <T>{
	protected T data;
	protected Node<T> next;
	
	public Node() {
	}
	public Node(T data) {
		this (data, null);
	}
	public Node(T data, Node<T> next) {
		this.data = data;
		this.next = next;
	}
	public T getData() {
		return this.data;
	}
	public void setData(T data) {
		this.data = data;
	}
	public Node<T> getNext() {
		return this.next;
	}
	public void setNext(Node<T> next) {
		this.next = next;
	}
	public String toString() {
		return this.data.toString();
	}
	
}
