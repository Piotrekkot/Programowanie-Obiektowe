package zad2;

import java.util.ArrayList;
import java.util.HashMap;

public class Box {
 ArrayList <Flower> listaKwiatow = new ArrayList <Flower>();
	Flower flower;
	int ilosc;
	Customer customer;
	public Box(Customer cus){
	customer=cus;
	}
	public void pudelkowanie(ArrayList a){
		listaKwiatow=a;
	}
	public String toString(){
		return ("Pudełko właściciel "+customer.imie+listaKwiatow).replace("[", "").replace("]", "");
	}
	
}
