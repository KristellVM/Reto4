package retos;

import java.util.Scanner;

public class Funciones1 {
	
	//esta funcion regresa los numeros pares entre el 1 y la edad
	public static void a(int n,int n2) {
		
		if(n!=n2) 
			for(int i = n; i<=n2;i++) {
				System.out.println(i);
			
				if(i%2==0) 
			System.out.println(i);
	}	
	
	
	//esta funcion regresa una edad posible, que no sea negativo
	public static int b(String s, Scanner sc) {
		int num=0;
		do {
			System.out.println("Introduce la edad ");
			num = sc.nextInt();
		}while(!(num<0));
		return num;
	}
	
	
	
	
}
