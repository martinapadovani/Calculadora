package clases;

import java.util.Scanner;

public class Calculadora {

	int  operacion;
		
	public Calculadora (int operacion) {
		
		this.operacion = operacion;
	}
		
	 //METODOS
	
	    Scanner scanner = new Scanner(System.in);
	    
	    //Cantidad de valores
	    
	    private int[] pedirValores() {
	    	
	        System.out.print("Ingrese la cantidad de valores: ");
	        
	        int cantidad = scanner.nextInt();
	   
	        int[] valores = new int[cantidad]; //aca creo que arreglo con la cantidad ingresada
	        
	        for (int i = 0; i < cantidad; i++) {
	        	
	            System.out.print("Ingrese el valor " + (i+1) + ": ");
	            valores[i] = scanner.nextInt(); //aca cargo los valores que van a conformar al arreglo
	            
	        }
	        return valores; //Devuelvo el arreglo valores, con los parametros ingresados cargados 
	       }
	    
		
		//Elegir operacion
	
	public void elegirOperacion (int operacion) {
		
		switch (operacion) {
		
		case 1:
			
			sumar ();
			break;
			
		case 2: 
			restar();
			break;
			
		case 3: 
			multiplicar ();
			break;
		case 4:
			dividir ();
			break;
			
		default: 
			
			System.out.println("Opcion invalida, vuelva a intentarlo");
			break;
					
		}
	}
		
		//SUMA
	
	   public void sumar() {
		   
		   System.out.println("Usted eligio la opcion de sumar!");
		   
	        int[] valores = pedirValores(); //creo un arreglo y lo igualo al que se creo por el metodo
	        int resultado = 0;
	        
	        for (int i = 0; i<valores.length; i++) {
	        	
	            resultado += valores [i];
	        }
	        
	      System.out.println("El resultado es: " + resultado);
	    }
	   
	   //RESTA
	   
	   public void restar () {
		   
		   System.out.println("Usted eligio la opcion de restar!");
		   
		   int[] valores = pedirValores();
	        int resultado = valores [0];//que inicie valiendo lo mismo que el primer valor ingresadp
	        
	        for (int i = 1; i<valores.length; i++) { 
	        	// que inicie a partir del 2do valor, ya que el primero ya esta cargaro en resultado
	          
	        	resultado -= valores [i];
	            
	        }
	        
	      System.out.println("El resultado es: " + resultado);
	    
	   }
	   
	   //MULTIPLICACION
	   
        public void multiplicar () {
        	
        	 System.out.println("Usted eligio la opcion de multiplicar!");
		   
		   int[] valores = pedirValores();
	        int resultado = 1; 
	        
	        for (int i = 0; i<valores.length; i++) { 
	        	
	        	
	            resultado *= valores [i];
	        }
	        
	      System.out.println("El resultado es: " + resultado);
        }
        
        //DIVICION
        
        public void dividir () {
        	
        	 System.out.println("Usted eligio la opcion de dividir!");
 		   
 		   int[] valores = pedirValores();
 	        int resultado = valores[0];
 	        
 	        for (int i = 1; i<valores.length; i++) {
 	        	
 	        	if (valores[i] == 0) {
 	                System.out.println("No se puede dividir por cero");
 	            
 	            }
 	        	
 	        	else {
 	            resultado /= valores [i];
 	        	}
 	        }
 	        
 	      System.out.println("El resultado es: " + resultado);
  
        }
 	
}
 
	

