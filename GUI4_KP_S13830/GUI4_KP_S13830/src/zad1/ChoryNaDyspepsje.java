package zad1;

public class ChoryNaDyspepsje extends Pacjent {
String imie;
public ChoryNaDyspepsje(String string){
	this.imie=string;
}
public String nazwisko(){
	return imie;
}
public String choroba(){
	return "dyspepsja";
}
public String leczenie(){
	return "węgiel";
}
}
