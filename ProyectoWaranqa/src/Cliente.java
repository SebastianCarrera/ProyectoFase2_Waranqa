import java.util.Scanner;

public class Cliente extends Persona implements Cuenta,Comparable<Cliente>{
	
	private String correo;
	private String telefono;
	
	public Cliente() {
		super();
	}
	
	public Cliente(String nombre, String apellido, String dni, String correo, String telefono) {
		super(nombre, apellido, dni);
		this.correo = correo;
		this.telefono = telefono;
	}

	public void ingresarDatos() {
		 Scanner entrada= new Scanner(System.in);
		 System.out.println("INGRESE SU NOMBRE POR FAVOR");
		 setNombre(entrada.nextLine());
		
		 System.out.println("INGRESE SU APELLIDO POR FAVOR");
		 setApellido(entrada.nextLine());
		
		 System.out.println("INGRESE SU DNI POR FAVOR");
		 setDNI(entrada.nextLine());
		 
		 System.out.println("INGRESE SU TELEFONO POR FAVOR");
		 setTelefono(entrada.nextLine());
		 
		 System.out.println("INGRESE SU CORREO ELECTRONICO POR FAVOR");
		 setCorreo(entrada.nextLine());
		 
	}
	
	public String toString() {
		return "CLIENTE : "+super.toString() + " , Telefono = "+this.getTelefono()+ " , Correo ="+this.getCorreo()+"]";
	}

	public void borrarCuenta() {
		
	}

	public String getTelefono() {
		return telefono;
	}

	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}
	
	public String getCorreo() {
		return correo;
	}
	
	public void setCorreo(String correo) {
		this.correo = correo;
	}
	
	public int compareTo(Cliente o) {
		return this.getApellido().compareTo(getApellido());
	}
	
	public int validarTelefono() {
		return 0;
	}
	
	public int validarDNI() {
		return 0;
	}
}
