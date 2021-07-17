import java.util.Scanner;
import java.util.*;
import javax.swing.JOptionPane;

public class AnuncioLaboral {
		
	private int nroAnuncio;
	private String cargo;
	private String empresa;
	private String ubicacion;
	
	public AnuncioLaboral(int nroAnuncio) {
		super();
		this.nroAnuncio = nroAnuncio;
	}

	public AnuncioLaboral(int nroAnuncio, String cargo, String emp, String ubicacion) {
		super();
		this.nroAnuncio = nroAnuncio;
		this.cargo = cargo;
		this.empresa = emp;
		this.ubicacion = ubicacion;
	}
	
	public int getNroAnuncio() {
		return nroAnuncio;
	}
	
	public void setNroAnuncio(int nroAnuncio) {
		this.nroAnuncio = nroAnuncio;
	}

	public String getCargo() {
		return cargo;
	}

	public void setCargo(String cargo) {
		this.cargo = cargo;
	}

	public String getEmp() {
		return empresa;
	}

	public void setEmp(String emp) {
		this.empresa = emp;
	}

	public String getUbicacion() {
		return ubicacion;
	}

	public void setUbicacion(String ubicacion) {
		this.ubicacion = ubicacion;
	}

	public AnuncioLaboral() {
		super();
	}
	
	public void ingresarAnuncio() {
		
		empresa = JOptionPane.showInputDialog("Ingrese el nombre de la empresa :");
		cargo = JOptionPane.showInputDialog("Ingrese el cargo :");
		ubicacion = JOptionPane.showInputDialog("Ingrese el ubicacion :");
		 
	}
	
	public void mostrarAnuncio() {
		JOptionPane.showMessageDialog(null, "\t Anuncio Laboral : \n" 
				+"Nro Anuncio :"+this.getNroAnuncio()+"\n"
				+"Empresa: "+ this.getEmp() + "\n"
				+"Cargo : " + this.getCargo()+ "\n"
				+"Ubicacion :" +this.getUbicacion()+"\n");
		
	}
		
	@Override
	public String toString() {
		return + this.getNroAnuncio() + "\t" + this.getEmp() + "\t" +this.getCargo() +"\t"+ this.getUbicacion();
	}

	public void borrarAnuncio() {
		System.out.println("ANUNCIO LABORAL ELIMINADO CON EXITO...");
	}
	
}
