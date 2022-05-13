package com.example.project;

import java.util.Scanner;

public class Exercise1 {

	public static int sum=1; // este numero aumentara de 2 en 2 y sera el que se sume a ind para la verificación
	public static int ind=1; //se incrementara con el valor sum
	public static void main(final String[] args) {
		
		Exercise1 obj = new Exercise1();
		Scanner sc = new Scanner(System.in);
		while (true) {
			sum=1;
			ind=1;
			int n = sc.nextInt();
			System.out.println(obj.esCuadradoPerfecto(n));			
		}
	}

	public boolean esCuadradoPerfecto(int numero) {
		sum+=2;
		ind+=sum;			//los cuadrados perfectos cumplen el siguiente patron
		if(ind==numero || numero==1) {  //  2 2 2
			return true;		// 3 5 7  9 
		}				//1 4 9 16 25
		if(ind>numero) {		//dependiendo de si ind llega a tomar al valor del numero a verificar
			return false;		//entonces sera un cuadrado perfecto
		}
		return esCuadradoPerfecto(numero);
	}
}
