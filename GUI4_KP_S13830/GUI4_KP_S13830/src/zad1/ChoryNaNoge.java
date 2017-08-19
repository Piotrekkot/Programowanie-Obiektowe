package zad1;

public class ChoryNaNoge extends Pacjent {
String imie;
public ChoryNaNoge(String string){
	this.imie=string;
}
public String nazwisko(){
	return imie;
}
public String choroba(){
	return "noga";
}
public String leczenie(){
	return "gips";
}
}
