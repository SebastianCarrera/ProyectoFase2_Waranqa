import javax.swing.JOptionPane;

public class Prueba {
	
	public static void main(String[] args) {
		
		ListLinked<Cliente> listaClientes = new ListLinked<Cliente>();
		Cliente c1=new Cliente();
		Cliente c2=new Cliente();
		
		
		Integer opcion=0;
		
		do {
			opcion=Integer.parseInt(JOptionPane.showInputDialog(null, 
					" MENU PRINICIPAL DE WARANQA APP \n"+
					" ESCOJA LA OPCION A REALIZAR \n"+
					" 1. Crear cuenta Cliente \n"+
					" 2. Crear cuenta Trabajador \n"+
					" 3. Buscar servicio de un trabajador \n"+
					" 4. Mostrar Lista de Clientes \n"+
					" 5. Mostrar Lista de Trabajadores \n"+
					" 6. Borrar Cuenta \n"+
					" 7. SALIR"));
			switch (opcion){
	        case 1:
	        	
	        	JOptionPane.showMessageDialog(null, "OPCION 1");
	            c1.ingresarDatos();
	            System.out.println("PROCESANDO.....");
				
				if(c1.validarDNI()==0 && c1.validarTelefono()==0) {
					JOptionPane.showMessageDialog(null, "ERROR");
					break;
				}
				
				JOptionPane.showMessageDialog(null, "CUENTA CREADA EXITOSAMENTE");
	            
	         
	        	c2.ingresarDatos();
	            System.out.println("PROCESANDO.....");
				
				if(c2.validarDNI()==0 && c2.validarTelefono()==0) {
					JOptionPane.showMessageDialog(null, "ERROR");
					break;
				}
				listaClientes.insercion(c2);
				JOptionPane.showMessageDialog(null, "CUENTA CREADA EXITOSAMENTE");
	            
	            break;
	            
	        case 2:
	        	JOptionPane.showMessageDialog(null, "OPCION 2");
	        	listaClientes.search(listaClientes);
	            
	            break;
	        case 3:
	        	JOptionPane.showMessageDialog(null, "OPCION 3");
	            break;
	        case 4:
	        	JOptionPane.showMessageDialog(null, "OPCION 4");
	        	JOptionPane.showMessageDialog(null, listaClientes);
	            
	            break;
	        case 5:
	        	JOptionPane.showMessageDialog(null, "OPCION 5");
	            
	            
	            break;
	        case 6:
	        	JOptionPane.showMessageDialog(null, "OPCION 6");
	        case 7:
	        	JOptionPane.showMessageDialog(null, "SALIENDO DEL SISTEMA");
	            JOptionPane.showMessageDialog(null, "VUELVA PRONTO");
	    		System.exit(0);
	            break;
	        default:
	        	JOptionPane.showMessageDialog(null, "OPCION INVALIDA");
	
	            break;
			}
		}
		while(opcion!=7);
		
		}
	}


	
		
