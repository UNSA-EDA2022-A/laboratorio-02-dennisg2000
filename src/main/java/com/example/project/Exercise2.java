package com.example.project;

import java.util.Scanner;

public class Exercise2 {

	public static void main(final String[] args) {

		Exercise2 obj = new Exercise2();
		Scanner sc = new Scanner(System.in);
		while (true) {
			int n;
			int p = sc.nextInt(), suma;
			int a[] = new int[p];

			for (int i = 0; i < p; i++) {
				n = sc.nextInt();
				a[i] = n;
			}

			suma = sc.nextInt();
			System.out.println(obj.esSubconjuntoSumaExt(a,suma));
		}
	}

	public boolean esSubconjuntoSumaExt(int a[],int suma) {
		
		return esSubconjuntoSumaExt(a, 0, suma ); 
	}
	
	public static boolean esSubconjuntoSumaExt(int a[], int n,int suma) {
		if (suma == 0 )
			return true;
		if (n == a.length)
			return false;
		if(a[n]%7!=0) {
			
				
			 return esSubconjuntoSumaExt(a, n + 1, suma - a[n])
				|| esSubconjuntoSumaExt(a, n+ 1, suma );
		}
		else {
			if(a[n+1]==1) {
				
				return esSubconjuntoSumaExt(a, n + 1, suma);
			}else return esSubconjuntoSumaExt(a, n + 1, suma - a[n]);
			
		}
	}
}
