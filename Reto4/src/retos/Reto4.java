package retos;

import java.util.Scanner

import util.Funciones;

public class Reto4 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System);
		/*
		 * Pide por consola un número y una edad Si el número es mayor de 100 y la edad
		 * es 18 escribe: Correcto Sino no, calcula num pares del numero hasta su edad
		 */

		
int num=Funciones.dimeEntero("Introduce un numero", sc); //Pide por consola un número
int edad=Funciones1.b("Introduce una edad", sc);////Pide por consola una edad
if(numero>100 && edad=18) {// si el numero es mayor de 100 
	System.out.println('Correcto'); // y la edad es 18 escribe:Correcto
}

else {//Sino no, calcula num pares del numero hasta su edad
	
	Funciones.a(edad, num)
	

	}

}
}
