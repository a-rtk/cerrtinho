package test12;

import java.util.Scanner;

public class vava {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite um numero: ");
        int par = 0, imp = 0; 
        int num;
        
            
        
        do {	
        	num = sc.nextInt();
    	 if (num != -1) {
    		 if (num%2==0) {
    	       		par++;
    	       	} else {
    	       		imp++;
    	       	}
    	       	  
    		 
    	 }        	      	          	       	
        } while (num != -1);
        
        System.out.println("você digitou " + par + " numeros pares " + " e " + imp + " numeros impares.");
        

sc.close();

    }
}