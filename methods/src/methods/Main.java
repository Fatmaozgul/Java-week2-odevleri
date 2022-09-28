package methods;

public class Main {

	public static void main(String[] args) {
      sayiBulmaca(); //sayiBulmacayı çağır demektir.
      //Bir metodu çağırmak için o metodun ismini mainin içinde yazmalıyız
    //mainin altına bir şey yazmazsak çalışmaz. javada direct olarak mainden çalışır ve dallanır.
      sayiBulmaca();
      sayiBulmaca();
      sayiBulmaca();
	}

	public static void sayiBulmaca() { 

		int[] sayilar = { 1, 2, 5, 7, 9, 0 };
		int aranacak = 5;
		boolean varMi = false; 
		for (int sayi : sayilar) {
			if (sayi == aranacak) {
				varMi = true;
				break;
			}
		}
		String mesaj = "";
				
		if (varMi) {
			mesaj = "Sayı mevcuttur"+aranacak;
			mesajVer("Sayı mevcuttur:" +aranacak);
		} else {
			mesajVer("Sayı mevcut değildir:" +aranacak);	
		}
	}
	public static void mesajVer(String mesaj) { //parametreli metod
		System.out.println(mesaj); //parantez içi değişken
	}
}
