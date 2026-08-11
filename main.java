package project02;

import java.util.Scanner;

public class main {

	
		public static void main(String[] args) {
			int n1,n2,n3;
			Scanner entrada = new Scanner (System.in);
			
		  System.out.print("Digite seu numero:" );
		  System.out.println();
		  n1 = entrada.nextInt();
		  System.out.println("digite outro numero:");
		  n2 = entrada.nextInt();
		  System.out.println("digite mais um numero:");
		  n3 = entrada.nextInt();
		  
		  if ((n1<n3) && (n2<n3)) {
	            System.out.println("o numero-" + n3 + "-é maior");
	        } else if (n1<n2){
	            System.out.println("o numero-" + n2 + "-é maior");
	        } else
	        	System.out.println("o numero-" + n1 + "-é maior");
		       
	      				  
		  entrada.close();

	}

}

