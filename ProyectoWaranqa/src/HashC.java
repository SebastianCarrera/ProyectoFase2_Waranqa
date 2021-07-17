
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
	private int metodoPorPliegue(int ruc) {
		int suma = 0;
		int aux = 0;
		while (true) {
			aux = ruc % 1000;                   //guardamos los 3 últimos dígitos en la variable aux
			ruc = ruc/1000;                     //le quitamos los 3 últimos dígitos a la clave para pasar a los siguientes dígitos
			suma = suma + aux;                  //se van sumando los numeros formados por los 3 últimos dígitos
			if (ruc == 0)
				break;                          //en este while se recorrerá toda la clave y saldrá del buble cuando ya no haya más dígitos
		}
		return suma % m;
	}
	private int linearProbing(int dressHash, int ruc, int llamado) {
		int posInit = dressHash;
		do {
			if (llamado == 1) {                //para el insert
				if (table.get(dressHash).mark == 0)
					return dressHash;         //se encontró posición vacía
				if (table.get(dressHash).mark == 1 && table.get(dressHash).emp.getRuc() == ruc)
					return -2;
				dressHash = (dressHash + 1) % m;
			}
			if (llamado == 2) {                //para el search
				if (table.get(dressHash).mark == 1 && table.get(dressHash).emp.getRuc() == ruc)
					return dressHash;
				dressHash = (dressHash + 1) % m;
			}
		}
		while (dressHash != posInit);
		return -1;
	}
	public void insert(Empresa emp) {
		//int dressHash = functionHash(ruc);
		String nombre = emp.getNombre();
		int ruc = emp.getRuc();		
		String dir = emp.getDir();
		int dressHash = metodoPorPliegue(ruc);
		dressHash = linearProbing(dressHash, ruc, 1);
		if (dressHash == -1) {
			System.out.println("Key table hash is full.... ");
			return;
		}
		else if(dressHash == -2) {
			System.out.println("Key is duplicated");
			return;
		}
		else {
			Element aux = new Element(1, new Empresa (nombre, ruc, dir));
			table.set(dressHash, aux);
		}
	}
}
