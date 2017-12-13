package com.ecenur;

import java.util.Scanner;

public class odevler2 {
	public void sor1 (){
    //5 ten baþlayarak 3 er artarak 20 ye kadar olan sayýlarý yazdýran program. 
   //5,8,11,14,17,20 yazacak.
		
			for (int j = 5; j<20 ; j=j+3) 
		{
			System.out.println(j);
			 
		}
	}
			public void sor2(){
		  
				 
				//20 den baþlayarak 10 a kadar olan sayýlarý ekrana yazdýran kod
				//for-while-do..while tüm döngü yapýlarýnda çalýþtýrýn
			
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
				//Kulanýcýdan iki sayý girmesini bekleyen programýn hangi sayýnýn büyük olduðunu bulmasý bekleniyor.
			//Yani a>b ise ekrana a sayýsýný yazdýrýnýz.
			
			
			Scanner ilk = new Scanner(System.in);
			int BirinciSayi ;
			System.out.println("birinci sayýyý giriniz");
			BirinciSayi = ilk.nextInt();
			
			
			Scanner son = new Scanner(System.in);
			int IkinciSayi ;
			System.out.println("Ikinci sayýyý giriniz");
			IkinciSayi= son.nextInt();
			
			if (IkinciSayi >BirinciSayi) {
				System.out.println("büyük sayý"+IkinciSayi);
				
			} else if (BirinciSayi>IkinciSayi) {
			System.out.println("büyük sayý"+BirinciSayi);
			}		
			}		

			public void sor4(){
				
	    	//girilen sayýnýn nefatif mi pozitif mi olduðunu bulan program.
			Scanner ilk = new Scanner(System.in);
			int sayi ;
			System.out.println("bir sayý giriniz");
			sayi= ilk.nextInt();
			 
			if (sayi<0) {System.out.println("negatif");
				
			} else {

			}if (sayi>0) {System.out.println("pozitif");
				
			}
			}
			
			
			
			
			public void sor5(){
				//girilen 3 sayýdan hangisinin büyük olduðunu bulan kod.
				
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
				
				if (a>b || a>c   ) {System.out.println("büyük"+a);
					
				} else {

				}if (b>a|| b>c) {System.out.println("büyük"+b); 
					
				} else {

				}if (c>b || c>a ) {System.out.println("büyük"+c);
					
				}
			}
	
}			
			

			
			
				
			
			
			
			
				//girilen 3 sayýdan hangisinin büyük olduðunu bulan kod.
				
			
			
			
				
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
	

