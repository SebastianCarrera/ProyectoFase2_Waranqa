
public abstract class Persona {
	private String nombre;
	private int edad;
	private int dni;
	private Character sexo;
	public Persona() {
		
	}
	public Persona(String nombre, int edad, int dni, Character sexo) {
		super();
		this.nombre = nombre;
		this.edad = edad;
		this.dni = dni;
		this.sexo = sexo;
	}
	
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}
	
	public int getDni() {
		return dni;
	}

	public void setDni(int dni) {
		this.dni = dni;
	}

	public Character getSexo() {
		return sexo;
	}

	public void setSexo(Character sexo) {
		this.sexo = sexo;
	}

	@Override
	public String toString() {
		return "[nombre: " + this.nombre + ", edad: " + this.edad + ", dni: " + this.dni + ", sexo: " + this.sexo + "]";
	}
	
	
}
