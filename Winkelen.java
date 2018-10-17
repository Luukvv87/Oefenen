package Dinsdag1610;

import java.util.ArrayList;

public class Winkelen {
	
	public static void main(String[] args) {
		Supermarkt sm = new Supermarkt();
		sm.schapVullen();
		Klant klant = new Klant();
		klant.boodschappenDoen();
	}

}

class Supermarkt{
	String[] naam = {"Brood", "Kaas", "Melk", "Kruidnoten"};
	int[] prijs = {1, 5, 2, 3};
	static ArrayList<Boodschap> assortiment = new ArrayList<Boodschap>();
	void schapVullen() {
		for(int x = 0; x<4; x++) {
				Boodschap boodschap = new Boodschap();
				boodschap.naam = naam[x];
				boodschap.prijs = prijs[x];
				assortiment.add(boodschap);
				
		}
		System.out.println("Schap gevuld:");
		System.out.println(assortiment);
		System.out.println();
	}
}
class Boodschap{
	String naam;
	int prijs;
	
	@Override
	public String toString() {
		return naam + " " + prijs;
	}
}
class Klant{
	int geld = 15;
	void boodschappenDoen() {
		ArrayList<Boodschap> mandje = new ArrayList<Boodschap>();
		System.out.println("Welkom in de winkel. Je hebt nog " + geld + " euro te besteden.");
		System.out.println();
		for(int y = 0; y<4; y++) {
			Boodschap boodschap = Supermarkt.assortiment.get(0);
			System.out.println("Je pakt " + boodschap.naam + ", dit kost " + boodschap.prijs + " euro.");
			mandje.add(boodschap);
			geld -= boodschap.prijs;
			Supermarkt.assortiment.remove(0);
			System.out.println("Je mandje bevat: " + mandje);
			System.out.println("Je hebt nog " + geld + " euro over.");
			System.out.println();
		}
		
		
	}
}
