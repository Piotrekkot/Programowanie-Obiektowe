package zad2;

public class Flower {
	String nazwaKwiatu;
	int ilosc;
	double cena=-1;
	String kolor;
	public Flower(String nazwaKwiatu, double cena){
		this.nazwaKwiatu=nazwaKwiatu;
		this.cena=cena;
	}
	public Flower(int ilosc, String nazwaKwiatu, String kolor){
		this.nazwaKwiatu=nazwaKwiatu;
		this.ilosc=ilosc;
		this.kolor=kolor;
		for(int i=0;i<PriceList.cennik.size();i++){
			if(nazwaKwiatu==PriceList.cennik.get(i).getNazwaKwiatu()){
			cena=PriceList.cennik.get(i).getCena();
			}
		}
	}
	public String getNazwaKwiatu(){
		return nazwaKwiatu;
	}
	public String getKolor(){
		return kolor;
	}
	public double getCena(){
		return cena;
	}
	public int getIlosc(){
		return ilosc;
	}
	public String toString(){
		return ("\n"+nazwaKwiatu+" kolor: "+kolor+", ilość "+ilosc+", cena " + cena).replace("[", "").replace("]", "").replace("^,","");
	}
	
}
