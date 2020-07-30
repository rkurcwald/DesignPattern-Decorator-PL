import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Zakupy{
	public static String Wyborzestawu;
	public static int wybordodatku;
	public static String decyzja;
	public static int iloscNap=0;
	public static int iloscMag=0;
	public static int iloscCzek=0;
	public static int licznikMas=3;
	public static int wybor=0;
	public static boolean choose;
	public static boolean rabatWyb=false;
	public static boolean dostawaWyb=false;
	public static boolean maskotkaWyb=false;
	public static void main(String[] args) {	
		
		ProduktAbstract produkt;
		List<ProduktAbstract> wybrane = new ArrayList<>();
		Scanner scanner=new Scanner(System.in);
		
		System.out.println("Kupuj¹cy wpisuje iloœæ produktów, a kasjer automatycznie to podlicza");
		System.out.println("");
		System.out.println("Iloœæ napojów gazowanych:");
		iloscNap=scanner.nextInt();
		System.out.println("Iloœæ magazynów wêdkarskich:");
		iloscMag=scanner.nextInt();
		System.out.println("Iloœæ czekolad:");
		iloscCzek=scanner.nextInt();
		produkt=new Produkt();
		for(int i=0;i<iloscCzek;i++) {
	    	produkt=new Czekolada(produkt);
		}
		for(int i=0;i<iloscMag;i++) {
			produkt=new Magazyn(produkt);
		}
		for(int i=0;i<iloscNap;i++) {
			produkt=new NapojGaz(produkt);
		}
		wybrane.add(produkt);
		System.out.println(wybrane);
		System.out.println();
		System.out.println("---------------------------------------------");
		System.out.println();
		while(choose=true) {
			System.out.println("<<Kasjer>>");
			System.out.println("Dodatek do wyboru:\n1.Maskotka [+0z³ (max 3)] \n2.Smycz do pendrive [+1z³/szt] \n3.Rabat [-10z³] \n4.Transport [+13z³]");
			wybordodatku=scanner.nextInt();
			if(wybordodatku==1) {
				System.out.print("<<K>> Ile sztuk?: ");
				int zakres=scanner.nextInt();
				if(zakres<=licznikMas && !maskotkaWyb)
				{
					for(int j=0;j<zakres;j++){
						produkt=new Maskotka(produkt);
						wybrane.add(produkt);
						licznikMas--;
					}
					
					if(licznikMas==zakres)
					{
						maskotkaWyb=true;
					}
				}
				else if(maskotkaWyb)
				{
					System.out.println("Wykorzysta³eœ ju¿ swoje darmowe maskotki w tym zamówieniu");
				}
				else
				{
					System.out.println("Przekroczy³eœ maksymaln¹ iloœc darmowych maskotek przez co dostaniesz jedn¹");
					produkt=new Maskotka(produkt);
					wybrane.add(produkt);
					maskotkaWyb=true;
				}
				System.out.println(wybrane);
			}
			else if(wybordodatku==2) {
				System.out.print("<<K>> Ile sztuk?: ");
				int zakres=scanner.nextInt();
					for(int j=0;j<zakres;j++){
						produkt=new Smycz(produkt);
						wybrane.add(produkt);
					}
					
				System.out.println(wybrane);
			}
			else if(wybordodatku==3) {
				if(!rabatWyb)
				{
					produkt=new Rabat(10,produkt);
					wybrane.add(produkt);
					System.out.println(wybrane);
					rabatWyb=true;
				}
				else
				{
					System.out.println("<<K>> Rabat ju¿ zosta³ wykorzystany");
				}
			}
			else if(wybordodatku==4) {
				if(!dostawaWyb)
				{
					produkt=new Dostawa(13,produkt);
					wybrane.add(produkt);
					System.out.println(wybrane);
					dostawaWyb=true;
				}
				else
				{
					System.out.println("<<K>> Dostawa zosta³a ju¿ wybrana");
				}
			}
			System.out.println("<<K>> Czy chcesz wybraæ jeszcze jakiœ dodatek? (0-nie, 1-tak)");
			wybor=scanner.nextInt();
			if(wybor==0) {
				System.out.println(wybrane);
				System.out.println("<<K>> Finalnie do zap³aty: "+produkt.cena());
				return;
				
			}
			else{
				choose=false;
			}
		}
	}
}
