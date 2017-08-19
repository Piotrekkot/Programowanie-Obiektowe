package zad2;

import java.util.ArrayList;
import java.util.HashMap;

public class ShoppingCart {
	ArrayList<Flower> listaWozek;
	String imie;
	int a=0;
	
	public ShoppingCart(ArrayList wozek, String imie){
		this.listaWozek=wozek;
		this.imie=imie;
	}
	public void oproznijWozek(){
		this.a=1;
		this.listaWozek=null;
	}
	public String toString(){
		if(a==0){
			return ("Wózek właściciel " + imie + listaWozek).replace("[", "").replace("]", "");
		}
		else{
		return ("Wózek właściciel " + imie + " -- pusto").replace("[", "").replace("]", "");
	}
		
}
}
