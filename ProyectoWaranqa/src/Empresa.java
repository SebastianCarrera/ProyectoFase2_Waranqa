import java.util.Scanner;

import javax.swing.JOptionPane;

public class Empresa {
	private String nombre;
	private int ruc;
	private String dir;
	public Empresa(String nombre, int ruc, String dir) {
		this.nombre = nombre;
		this.ruc = ruc;
		this.dir = dir;
	}
	
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getRuc() {
		return ruc;
	}

	public void setRuc(int ruc) {
		this.ruc = ruc;
	}

	public String getDir() {
		return dir;
	}

	public void setDir(String dir) {
		this.dir = dir;
	}

	@Override
	public String toString() {
		return "Nombre: " + this.getNombre() + ", Ruc: " + this.getRuc() + ", Direccion: " + this.getDir();
	}
	
	
	public int decidirOperacion() {
		
		
		String x = JOptionPane.showInputDialog(null," PROCEDER CON LA OPERACION ?.. SI/NO");
  
        if (x.equals("SI") || x.equals("si")) 
        {
            return 1;
        }
        else if (x.equals("NO") || x.equals("no"))
        {
            return 0;  
        }
        return -1;
    }
}
	

