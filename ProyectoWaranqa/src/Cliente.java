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

	@Override
	public void ingresarDatos() {
		 Scanner entrada= new Scanner(System.in);
		 System.out.println("INGRESE SU NOMBRE PORFAVOR");
		 setNombre(entrada.nextLine());
		
		 System.out.println("INGRESE SU APELLIDO PORFAVOR");
		 setApellido(entrada.nextLine());
		
		 System.out.println("INGRESE SU DNI PORFAVOR");
		 setDNI(entrada.nextLine());
		 
		 System.out.println("INGRESE SU TELEFONO PORFAVOR");
		 setTelefono(entrada.nextLine());
		 
		 System.out.println("INGRESE SU CORREO ELECTRONICO PORFAVOR");
		 setCorreo(entrada.nextLine());
		 
	}
	
	@Override
	public String toString() {
		return "CLIENTE : "+super.toString() + " , Telefono = "+this.getTelefono()+ " , Correo ="+this.getCorreo()+"]";
	}

	@Override
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
	
	@Override
	public int compareTo(Cliente o) {
		return this.getApellido().compareTo(getApellido());
	}
	
	public int validarTelefono() {
		if(this.getTelefono().length() > 9 || this.getTelefono().length() < 9) {
			System.out.println("El numero ingresado de telefono es incorrecto");
			return 0;
		}
		else {
			System.out.println("El numero ingresado de telefono es correcto");
			return 1;
		}
	}
	
	public int validarDNI() {

		int i, j = 0;
		String numero = ""; // Es el número que se comprueba uno a uno por si hay alguna letra entre los 8 primeros dígitos
		String miDNI = ""; // Guardamos en una cadena los números para después calcular la letra
		String[] unoNueve = {"0","1","2","3","4","5","6","7","8","9"};

		for(i = 0; i < this.getDNI().length() - 1; i++) {
			numero = this.getDNI().substring(i, i+1);

			for(j = 0; j < unoNueve.length; j++) {
				if(numero.equals(unoNueve[j])) {
					miDNI += unoNueve[j];
				}
			}
		}

		if(this.getDNI().length() > 8 || this.getDNI().length() < 8 ) {
			
			System.out.println("EL DNI INGRESADO NO ES VALIDO");
			return 0;
			
		}
		else {
			System.out.println("EL DNI INGRESADO SI ES VALIDO");
			return 1;
			
			
		}
	}
}
