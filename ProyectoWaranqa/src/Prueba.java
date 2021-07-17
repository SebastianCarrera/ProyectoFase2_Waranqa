import javax.swing.JOptionPane;
import javax.swing.*;
public class Prueba {

//AUTOR: Diego Quiroz 
	public static void main(String[] args) {
		
		HashC<Empresa> empresas = new HashC<Empresa>(5);   
		Empresa LcMajes = new Empresa ("LC Majes", 123321, "Calle Ricardo Palma");
		Empresa SagaFalabella = new Empresa ("Saga Falabella", 435342, "Av. Porongoche");
		Empresa McDonalds = new Empresa ("McDonalds", 413535, "Av. Ejercito");
		Empresa LcSoftland = new Empresa ("LC Softland", 324324, "Calle Paucarpata");
		Empresa PlazaVea = new Empresa ("Plaza Vea", 413532, "Av. Ejercito");
		empresas.insert(LcMajes);
		empresas.insert(SagaFalabella);
		empresas.insert(McDonalds);
		empresas.insert(LcSoftland);
		empresas.insert(PlazaVea);
		
		
		
		
		//Creacion de tabla Hash de encadenamiento que almacenara anuncios
		HashEncadenamiento<AnuncioLaboral> anuncios = new HashEncadenamiento<AnuncioLaboral>(5);
		AnuncioLaboral a1= new AnuncioLaboral (23);
		AnuncioLaboral a2= new AnuncioLaboral (15);
		AnuncioLaboral a3= new AnuncioLaboral (75);
		
		anuncios.insert(a1);
		anuncios.insert(a2);
		anuncios.insert(a3);
		
	
		//Creacion de una lista enlazada ordenada que almacenara a objetos de la clase Cliente y Trabajador
		OrderListLinked<Cliente> listaClientes = new OrderListLinked<Cliente>();
		Cliente c1=new Cliente();
		Cliente c2=new Cliente();
		
		//Lista enlazada ordenada que almacenara a objetos de la clase Trabajador
		OrderListLinked<Trabajador> listaTrabajador = new OrderListLinked<Trabajador>();
		Trabajador carpintero=new Trabajador();
		Trabajador electricista=new Trabajador();
		Icon logo,check,lupa;
		logo = new ImageIcon("src/imagen/logo5.png");
		check = new ImageIcon("src/imagen/check.jpg");
		lupa = new ImageIcon("src/imagen/lupa.png");

		int opcion=0;
		
		try { //try para poder usar las excepciones
			
			do { //Menu que visualizara el usuario
				
			
			
				JOptionPane.showMessageDialog(null, " BIENVENIDO"," \t WARANQA APP \t ",JOptionPane.INFORMATION_MESSAGE,logo);
				
				opcion=Integer.parseInt(JOptionPane.showInputDialog(null, 							//uso de JOptionPane para poder mostrar informacion mediante ventanas emergentes
						" MENU PRINCIPAL DE WARANQA "+"\n"+
						" \n ESCOJA LA OPCION A REALIZAR \n"+
						" \n 1. Crear cuenta Cliente \n"+
						" 2. Crear cuenta Trabajador \n"+
						" 3. Buscar servicio de un trabajador \n"+
						" 4. Mostrar Lista de Clientes \n"+
						" 5. Mostrar Lista de Trabajadores \n"+
						" 6. Mostrar Empresas \n"+
						" 7. Buscar Empresa \n"+
						" 8. Ingresar Anuncio \n"+
						" 9. Mostrar Anuncios \n"+
						"10. Calcular pago Trabajador \n"+
						"11. Borrar Cuenta \n"+
						"12. SALIR")) ;
				switch (opcion){
			
				//AUTOR: Diego Quiroz, Hector Ramos
		        case 1:
		        	
		        	JOptionPane.showMessageDialog(null, "OPCION 1");
		 
		        	//ingreso de datos del cliente
		            c1.ingresarDatos();
		            JOptionPane.showMessageDialog(null, "Procesando...");
					
					if(c1.validarDNI()==0 || c1.validarTelefono()==0) {
						JOptionPane.showMessageDialog(null, "ERROR");
						break;
					}
					
					
					listaClientes.insercion(c1); 
					JOptionPane.showMessageDialog(null, "CUENTA CREADA EXITOSAMENTE");
		            
					//2do cliente
					System.out.println(" \n \t ····· INGRESAR DATOS PARA CREAR UNA 2DA CUENTA ····· \t ");
		        	c2.ingresarDatos();
		            System.out.println("PROCESANDO.....");
					
					if(c2.validarDNI()==0 || c2.validarTelefono()==0) {
						JOptionPane.showMessageDialog(null, "ERROR");
						break;
					}
					
					listaClientes.insercion(c2);
					JOptionPane.showMessageDialog(null, "CUENTA CREADA EXITOSAMENTE");
		            
		            break;
		            
		        case 2:	
		        	JOptionPane.showMessageDialog(null, "OPCION 2");
		        	
		        	//ingreso de datos del Trabajador
		        	carpintero.ingresarDatos();
		        	System.out.println("PROCESANDO.....");
		        	
		        	if(carpintero.validarDNI()==0 || carpintero.validarTelefono()==0) {
		        		JOptionPane.showMessageDialog(null, "ERROR");
		        		break;
					}
		        	
		        	listaTrabajador.insercion(carpintero);
					JOptionPane.showMessageDialog(null, "CUENTA CREADA EXITOSAMENTE");
					break;
					
				///AUTOR: Sebastian Carrera
		        case 3:
		        	JOptionPane.showMessageDialog(null, "OPCION 3");
		        		        
		        	JOptionPane.showMessageDialog(null, "BUSCANDO EL SERVICIO DE: " + carpintero.getOficio());
		        	System.out.println(" ¿ DESEA BUSCAR ESTE SERVICIO ? " );
		        	 
		        	//uso del metodo decidirOperacion para confirmar o denegar si quiere seguir buscando ese servicio
		        	int decision1 = c1.decidirOperacion();
		        	if(decision1 == 0) {
		        		JOptionPane.showMessageDialog(null, " VOLVIENDO AL MENÚ ");
		        		break;
		        	}
		        	if (decision1 == 1) {
		        		JOptionPane.showMessageDialog(null, "SE PROCEDERA A LA BÚSQUEDA ");
		        		System.out.println(listaTrabajador.buscar(carpintero));
			        	break;
		        	}
		                  
		            
		        case 4:
		        	JOptionPane.showMessageDialog(null, "OPCION 4");
		        	
		        	JOptionPane.showMessageDialog(null, listaClientes);
		            
		            break;
		            
		        case 5:
		        	JOptionPane.showMessageDialog(null, "OPCION 5");
		        	
		        	JOptionPane.showMessageDialog(null, listaTrabajador);
		            	       
		            break;
		           
		        case 6:
		        	JOptionPane.showMessageDialog(null, "OPCION 6");
		        	
		        	System.out.println(empresas);
		            	       
		            break;
		            
		        case 7:
		        	JOptionPane.showMessageDialog(null, "OPCION 7");
    		        
		        	JOptionPane.showMessageDialog(null, "BUSCANDO A LA EMPRESA: " + LcMajes.getNombre(),"BUSQUEDA DE EMPRESAS",JOptionPane.INFORMATION_MESSAGE,lupa);
		        	JOptionPane.showMessageDialog(null," ¿ DESEA BUSCAR ESTA EMPRESA ? " );
		        	 
		        	//uso del metodo decidirOperacion para confirmar o denegar si quiere seguir buscando ese servicio
		        	int decision2 = LcMajes.decidirOperacion();
		        	if(decision2 == 0) {
		        		JOptionPane.showMessageDialog(null, " VOLVIENDO AL MENÚ ");
		        		break;
		        	}
		        	if (decision2 == 1) {
		        		
		        		JOptionPane.showMessageDialog(null, "SE PROCEDERA A LA BÚSQUEDA ");
		        		JOptionPane.showMessageDialog(null, empresas.search(LcMajes));
			        	break;
		        	}
		        	
		        	break;		            
		        
		        case 8:
		        	JOptionPane.showMessageDialog(null, "OPCION 8");
			   		 
		        	//ingreso de datos del anuncio
		        	a1.ingresarAnuncio();
		        	JOptionPane.showMessageDialog(null, "ANUNCIO CREADO EXITOSAMENTE ","Estado Anuncio", JOptionPane.INFORMATION_MESSAGE,check);
		        	a2.ingresarAnuncio();
		        	JOptionPane.showMessageDialog(null, "ANUNCIO CREADO EXITOSAMENTE ","Estado Anuncio", JOptionPane.INFORMATION_MESSAGE,check);
		        	a3.ingresarAnuncio();
		        	JOptionPane.showMessageDialog(null, "ANUNCIO CREADO EXITOSAMENTE ","Estado Anuncio", JOptionPane.INFORMATION_MESSAGE,check);
		            break;
		            
		        case 9:
		        	JOptionPane.showMessageDialog(null, "OPCION 9");
			   		System.out.println(anuncios);
		            break;
		            
		        ///AUTOR: Sebastian Carrera, Adrian Zevallos
		            
		        case 10:
		        	JOptionPane.showMessageDialog(null, "OPCION 10");
		        	double pago = carpintero.calcularPago();
		        	JOptionPane.showMessageDialog(null, "EL PAGO CORRESPONDIENTE AL TRABAJADOR "+ carpintero.getOficio() +" ES : S/. "+ pago);
		        	
		        	break;
		        	
		       
		        case 11:
		        	JOptionPane.showMessageDialog(null, "OPCION 11");
		        	
		        	//uso del metodo decidirOperacion para confirmar o denegar si quiere borrar su Cuenta
		        	int decision3 = c1.decidirOperacion();
		        	 if(decision3 == 0) {			
		        		 JOptionPane.showMessageDialog(null, "NO SE ELIMINARA LA CUENTA...");
							break;
							}
		        	 if(decision3 == 1) {
		        		 JOptionPane.showMessageDialog(null, "SE PROCEDERA A ELIMINAR LA CUENTA...");
		        		 listaClientes.remove(c1);
			        	 c1.borrarCuenta();
			        	 break;
		        	 }
		            
		        case 12:
		        	//si elige la opcion 9 el sistema procede a cerrarse y salir
		        	JOptionPane.showMessageDialog(null, "SALIENDO DEL SISTEMA");	
		            JOptionPane.showMessageDialog(null, "VUELVA PRONTO");
		    		System.exit(0);
		            break;
		            
		            
		        default:
		        	JOptionPane.showMessageDialog(null, "OPCION INVALIDA");
		
		            break;
				}
			}
			while(opcion!=12);
		}
		
		catch(Exception y) {
			System.out.println(y.getMessage());
		}
		
	}
}
