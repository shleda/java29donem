package com.ecenur;

import java.util.Scanner;

public class odevler2 {
	public void sor1 (){
    //5 ten ba�layarak 3 er artarak 20 ye kadar olan say�lar� yazd�ran program. 
   //5,8,11,14,17,20 yazacak.
		
			for (int j = 5; j<20 ; j=j+3) 
		{
			System.out.println(j);
			 
		}
	}
			public void sor2(){
		  
				 
				//20 den ba�layarak 10 a kadar olan say�lar� ekrana yazd�ran kod
				//for-while-do..while t�m d�ng� yap�lar�nda �al��t�r�n
			
			for(int i= 20 ; i>=10; i--){
				System.out.println(i);
			}
			
				
			int i=20;	
		do {
			System.out.println(i);
		    i--;
		} while (i>=10);
			}
			public void sor3(){
				//Kulan�c�dan iki say� girmesini bekleyen program�n hangi say�n�n b�y�k oldu�unu bulmas� bekleniyor.
			//Yani a>b ise ekrana a say�s�n� yazd�r�n�z.
			
			
			Scanner ilk = new Scanner(System.in);
			int BirinciSayi ;
			System.out.println("birinci say�y� giriniz");
			BirinciSayi = ilk.nextInt();
			
			
			Scanner son = new Scanner(System.in);
			int IkinciSayi ;
			System.out.println("Ikinci say�y� giriniz");
			IkinciSayi= son.nextInt();
			
			if (IkinciSayi >BirinciSayi) {
				System.out.println("b�y�k say�"+IkinciSayi);
				
			} else if (BirinciSayi>IkinciSayi) {
			System.out.println("b�y�k say�"+BirinciSayi);
			}		
			}		

			public void sor4(){
				
	    	//girilen say�n�n nefatif mi pozitif mi oldu�unu bulan program.
			Scanner ilk = new Scanner(System.in);
			int sayi ;
			System.out.println("bir say� giriniz");
			sayi= ilk.nextInt();
			 
			if (sayi<0) {System.out.println("negatif");
				
			} else {

			}if (sayi>0) {System.out.println("pozitif");
				
			}
			}
			
			
			
			
			public void sor5(){
				//girilen 3 say�dan hangisinin b�y�k oldu�unu bulan kod.
				
				Scanner sayi1 =new Scanner(System.in);
				int a;
				System.out.println("bir sayi giriniz");
				a = sayi1.nextInt();
				
				Scanner sayi2 =new Scanner(System.in);
				int b;
				System.out.println("bir sayi giriniz");
				b = sayi2.nextInt();
				
				Scanner sayi3 =new Scanner(System.in);
				int c;
				System.out.println("bir sayi giriniz");
				c = sayi3.nextInt();
				
				if (a>b || a>c   ) {System.out.println("b�y�k"+a);
					
				} else {

				}if (b>a|| b>c) {System.out.println("b�y�k"+b); 
					
				} else {

				}if (c>b || c>a ) {System.out.println("b�y�k"+c);
					
				}
			}
	
}			
			

			
			
				
			
			
			
			
				//girilen 3 say�dan hangisinin b�y�k oldu�unu bulan kod.
				
			
			
			
				
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
	

