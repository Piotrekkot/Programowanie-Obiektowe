package zad1;

public class ChoryNaGlowe extends Pacjent {

	String imie;
	
	public ChoryNaGlowe(String string) {
		this.imie=string;
	}
	public String nazwisko(){
		return imie;
	}
	public String choroba(){
		return "głowa";
	}
	public String leczenie(){
		return "aspiryna";
	}



}
