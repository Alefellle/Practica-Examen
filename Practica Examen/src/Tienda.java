import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Tienda {
	static BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
	static ArrayList<Lavadora> lavadoras= new ArrayList<>();
	
	 public static void main(String[] args) throws NumberFormatException, IOException {
	        menu();
	    }

	 private static void menu() throws NumberFormatException, IOException {
	        int eleccion = 0;
	        
	        do {
	            System.out.print("\n---Acciones---\n" +
	                    "[1] Agregar lavadora/n" +
	                    "[2] Buscar lavadora por el modelo si existe/n" +
	                    "[3] Modificar el precio de una lavadora por el modelo si existe/n" +
	                    "[4] Eliminar  una lavadora /n" +
	                    "[5] Mostrar todas las lavadoras \n" +
	                    "[6] Mostrar el numero de lavadoras \n" +
	                    "[7] Salir\n" +
	                    "Introduzca acción (1-6): " + "\n" 
	            ); // esto para que cree toda las opciones para elegir
	            
	            try {
	                eleccion = Integer.parseInt(entrada.readLine()); //esto para guardar el numero que te den en la eleccion  
	            } catch (Exception e) {
	                System.out.println("Por favor, introduzca un número entero válido.");
	                eleccion = 0;
	                continue; // Vuelve al inicio del bucle
	            }
	            
	            switch (eleccion) {
	                case 1:
	                    System.out.println("Dime el nombre  de la lavadora que quieres agregar");
	                    Agregarlavadora(); // esto llama al metodo  idice que una vez lo llame se haga break porque sino se hara infinitamente
	                    
	                    break; 
	                    
	                case 2:
	                    System.out.println("Dime la lavadora que quieres buscar ");
	                    BuscarLavadora();// esto llama al metodo  idice que una vez lo llame se haga break porque sino se hara infinitamente
	                    break;
	                    
	                case 3:
	                    System.out.println("Dime la lavadora o que quieres modificar");
	                    ModificarLavadora();// esto llama al metodo  idice que una vez lo llame se haga break porque sino se hara infinitamente
	                    
	                    break;
	                    
	                case 4:
	                    System.out.println("Dime la lavadora que quieres eliminar");
	                    EliminarLavadora();// esto llama al metodo  idice que una vez lo llame se haga break porque sino se hara infinitamente
	                    
	                    break; 
	                    
	                case 5:
	                    System.out.println("Aqui tienes todas las lavaroas"); 
	                    MostrarLavadoras();// esto llama al metodo  idice que una vez lo llame se haga break porque sino se hara infinitamente
	                    
	                    break;
	                case 6:
	                    System.out.println("Aqui tienes el numero de todas las lavadoras que hay"); 
	                    MostrarLavadoras();// esto llama al metodo  idice que una vez lo llame se haga break porque sino se hara infinitamente
	                    
	                    break; 
	                                  
	                case 7:
	                    System.out.println("Saliendo del programa..."); // este es el ultimo i es para salir del programa 
	                    MostrarNLavadoras();
	                    break; 
	                    
	                default:
	                    System.out.println("Opción no válida. Debes elegir entre 1 y 9." + "\n");
	                    break;
	            }
	        } while (eleccion != 7);
		
	 }
	 
	 private static boolean ComprobarLista() {
		boolean estavacia = lavadoras.isEmpty();
		 
		 if (estavacia) {
			 System.out.println("La lista esta vacia");
		}
		 return estavacia;
	 }

	

	 private static void Agregarlavadora() {
		try {
			String lavadora= entrada.readLine();
			lavadoras.add(lavadora);
			System.out.println("Lavadora añadida correctamente");
		} catch (Exception e) {
			System.out.println("Debes poner un numero del 1 al 7");
		}
		
	}
	 
	 

	 private static void BuscarLavadora() throws IOException {
		String lavadoraBus = entrada.readLine();
		
		
		
	}

	 private static void ModificarLavadora() {
		// TODO Auto-generated method stub
		
	}

	 private static void EliminarLavadora() {
		// TODO Auto-generated method stub
		
	}

	 private static void MostrarLavadoras() {
		// TODO Auto-generated method stub
		
	 }
	 private static void MostrarNLavadoras() {
			// TODO Auto-generated method stub
			
		}
	 
	 
	
	
}
