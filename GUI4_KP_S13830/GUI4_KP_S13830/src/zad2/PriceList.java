package zad2;

import java.util.ArrayList;

public final class PriceList {
	public PriceList(){
	}
	static ArrayList<Flower> cennik = new ArrayList<>();
	private static class SingletonHolder { 
		    private static final PriceList INSTANCE = new PriceList();
		  }
	public static PriceList getInstance(){
		return SingletonHolder.INSTANCE;
	}
	public ArrayList getCennik(){
		return cennik;
	}
	public static void put(String nazwaKwiatu, double cena) {
		cennik.add(new Flower(nazwaKwiatu, cena));
	}
	
	


}
