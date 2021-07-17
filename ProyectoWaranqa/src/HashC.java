
import java.util.ArrayList;

public class HashC <E>{
	protected class Element{
		int mark;
		Empresa emp;
		public Element(int mark, Empresa emp) {
			this.mark = mark;
			this.emp = emp;
		}
	}
	protected ArrayList<Element> table;
	protected int m;
	
	public HashC(int n) {
		this.m = n;
		this.table = new ArrayList<Element>(m);
		for (int i = 0; i < m; i++)
			this.table.add(new Element(0, null));
	}
	private int functionHash(int ruc) {
		return ruc % m;
	}
	
}
