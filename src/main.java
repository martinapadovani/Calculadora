import clases.Calculadora;

import java.util.Scanner;

public class guias {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scanner = new Scanner(System.in);
		
		
	//GUIA 1
	    	
	    //Seleccion del tipo de operacion
		
	    System.out.println("Ingrese el numero que corresponda a la operacion que desea realizar, las opciones pueden ser '1. suma', '2. resta', '3. multiplicacion', '4. division'.");
	    
	    int operacion = scanner.nextInt();
	    		
	    Calculadora operaciones = new Calculadora (operacion);
	    
	    operaciones.elegirOperacion(operacion);

	}

}
