import java.util.ArrayList;

public class HashEncadenamiento <E>{
	protected class Elemento{
		int mark;
		AnuncioLaboral anuncio;
		ListLinked <AnuncioLaboral> lista = new ListLinked<AnuncioLaboral>();
		public Elemento(int mark, AnuncioLaboral anuncio) {
			this.mark = mark;
			this.anuncio = anuncio;
		}
	}
	protected ArrayList<Elemento> table;
	protected int m;
	
	public HashEncadenamiento(int n) {
		this.m = n;
		this.table = new ArrayList<Elemento>(m);
		for (int i = 0; i < m; i++)
			this.table.add(new Elemento(0, null));
	}
	private int functionHash(int nroAnuncio) {
		return nroAnuncio % m;
	}
	public void insert(AnuncioLaboral anuncio) {
		int nroAnuncio = anuncio.getNroAnuncio();
		int dressHash = functionHash(nroAnuncio);
		table.get(dressHash).mark = 1;                                 //la marca cambia a 1 para que ese espacio no esté vacío
		table.get(dressHash).lista.insertLast(anuncio);
	}
	public String toString() {
		String s = "D.Real\tAnuncios:\n";
		int i = 0;
		for (Elemento item : table) {
			s+= (i++) + " -->\t";
			if (item.mark == 1)
				s += item.lista + "\n";
			else
				s += "empty\n";
		}
		return s;
	}
}
