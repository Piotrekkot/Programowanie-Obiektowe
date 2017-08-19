package zad2;

import java.util.ArrayList;
import java.util.HashMap;

public class Customer {
	String imie;
	ShoppingCart wozek;
	double dostepneSrodki;
	
	ArrayList <Flower> kwiatyWReku = new ArrayList<>();
	Box box;
	public Customer(String imie, double dostepneSrodki){
		this.imie=imie;
		this.dostepneSrodki=dostepneSrodki;
	}
	public void get(Flower flower) {
		kwiatyWReku.add(flower);
	}
	
	public ShoppingCart getShoppingCart(){
		if(box!=null){
			wozek.oproznijWozek();
			return wozek;
		}
		else{
		wozek = new ShoppingCart(kwiatyWReku, imie);
		return wozek;
		}
	}
	
	public void pay() {
		wozek.oproznijWozek();
		for(int i=0;i<kwiatyWReku.size();i++){
			if(kwiatyWReku.get(i).getCena()==-1){
				kwiatyWReku.remove(kwiatyWReku.get(i));
			}
		}
		for(int i=0;i<kwiatyWReku.size();i++){
			if((dostepneSrodki-(kwiatyWReku.get(i).getCena())*(kwiatyWReku.get(i).getIlosc()))>0){
				if((kwiatyWReku.get(i).getCena())!=-1){
					dostepneSrodki=dostepneSrodki-((kwiatyWReku.get(i).getCena())*(kwiatyWReku.get(i).getIlosc()));
					if((dostepneSrodki-(kwiatyWReku.get(i).getCena())*(kwiatyWReku.get(i).getIlosc()))<0){
						kwiatyWReku.remove(i+1);
					}
					
				}
		}
		}
	}
	public void pack(Box pudelko){
		wozek.oproznijWozek();
		pudelko.pudelkowanie(kwiatyWReku);
		box=pudelko;
	}
	public double getCash() {
		return dostepneSrodki;
	}
	public ArrayList getKwiaty(){
		return kwiatyWReku;
	}
	
}
