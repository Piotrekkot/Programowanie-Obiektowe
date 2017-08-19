/**
 *
 *  @author Kotowski Piotr S13830
 *
 */

package zad1;


public abstract class Spiewak {
	String nazwisko;
	int numer;
	String tekst;

	public Spiewak(String nazwisko) {
		this.nazwisko = nazwisko;
	}
	abstract String spiewaj();
	 public String toString(){
		 return nazwisko + ": " + spiewaj();
		 
	 }
	public static String najglosniej(Spiewak[] sp) {
		
		return null;
	}
}
