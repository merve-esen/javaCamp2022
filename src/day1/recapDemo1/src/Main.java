package day1.recapDemo1.src;

public class Main {

	public static void main(String[] args) {
		int sayi1 = 23, sayi2 = 24, sayi3 = 25;
		int enBuyuk = sayi1;
		
		if(enBuyuk < sayi2)
			enBuyuk = sayi2;
		
		if(enBuyuk < sayi3)
			enBuyuk = sayi3;
		
		System.out.println("En büyük sayı: " + enBuyuk);
	}

}
