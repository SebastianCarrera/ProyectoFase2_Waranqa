
import java.util.Scanner;

//AUTOR : Diego Quiroz 

public class Trabajador extends Persona implements Cuenta,Comparable<Trabajador>{
	private String oficio;
	private double tarifa;
	private float horas;
	private String celular;
	private double pago;
	
	@Override
	public void ingresarDatos() {
		Scanner ingreso= new Scanner(System.in);
		super.ingresarDatos();
	
		System.out.println(" \t ·········· INGRESE SU OFICIO POR FAVOR ·········· \t ");
		oficio=ingreso.nextLine();
		
		System.out.println(" \t ·········· INGRESE SU TELEFONO POR FAVOR ·········· \t ");
		celular=ingreso.nextLine();
		
		System.out.println(" \t ·········· INGRESE SU TARIFA POR FAVOR ·········· \t ");
		tarifa=ingreso.nextDouble();

		
		System.out.println(" \t ·········· INGRESE SUS HORAS A TRABAJAR POR FAVOR ·········· \t");
		horas=ingreso.nextFloat();
	}
	
	public Trabajador(String nombre, String apellido, String dni, String oficio, double tarifa, float horas,
			String celular, double pago) {
		super(nombre, apellido, dni);
		this.oficio = oficio;
		this.tarifa = tarifa;
		this.horas = horas;
		this.celular = celular;
		this.pago = pago;
	}
	
	public Trabajador() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public Trabajador(String nombre, String apellido, String dni) {
		super(nombre, apellido, dni);
		// TODO Auto-generated constructor stub
	}

	public String getOficio() {
		return oficio;
	}

	public void setOficio(String oficio) {
		this.oficio = oficio;
	}

	public double getTarifa() {
		return tarifa;
	}

	public void setTarifa(double tarifa) {
		this.tarifa = tarifa;
	}

	public float getHoras() {
		return horas;
	}

	public void setHoras(float horas) {
		this.horas = horas;
	}

	public String getCelular() {
		return celular;
	}

	public void setCelular(String celular) {
		this.celular = celular;
	}
	
	public double getPago() {
		return pago;
	}

	public void setPago(double pago) {
		this.pago = pago;
	}

	public double calcularPago() {
		double pago= this.getPago();
		pago = (this.getTarifa()*this.getHoras());
		return pago;
		
	}
	
	public int compareTo(Trabajador x) {
		if(this.getTarifa()> x.getTarifa())
			return 1;
		if(this.getTarifa()< x.getTarifa())
			return -1;
		return 0;
		
	}

	@Override
	public void borrarCuenta() {
		System.out.println("CUENTA BORRADA CON EXITO...");
		
	}

	@Override
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

	@Override
	public int validarTelefono() {
		if(this.getCelular().length() > 9 || this.getCelular().length() < 9) {
			System.out.println("EL NUMERO INGRESADO DE TELEFONO ES INCORRECTO");
			return 0;
		}
		else {
			System.out.println("EL NUMERO INGRESADO DE TELEFONO ES CORRECTO");
			return 1;
		}
	}

	@Override
	public String toString() {
		return "TRABAJADOR :  "+ super.toString() + "  Oficio : " + this.getOficio() + "  , Tarifa : " + "S/."+this.getTarifa() + "  ,  Horas : " + this.getHoras() 
				+ "  ,  Telefono : " + celular ;
	}
	
	public int decidirOperacion() {
		Scanner scan = new Scanner(System.in);
        System.out.println (" PROCEDER CON LA OPERACION ?.. SI/NO");
        String a = scan.nextLine();
        if (a.equals("SI")) 
        {
            return 1;
        } 
        
        else if (a.equals("NO"))
        {
            return 0;  
        }
        return -1;
  
    }
}
