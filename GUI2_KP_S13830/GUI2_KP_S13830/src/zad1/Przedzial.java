/**
 *
 *  @author Kotowski Piotr S13830
 *
 */

package zad1;


public class Przedzial {

  private int pocz, koniec;

  public Przedzial(int a, int b)
  {
    if(a<=b){
    	this.pocz=a;
    	this.koniec=b;
    }
    else{
    	this.pocz=b;
    	this.koniec=a;
    }
  }

  Przedzial przeciecie(Przedzial p)
  {if(this.pocz<p.pocz && this.koniec>p.koniec){
    	return p;
  }
  if((this.pocz<p.pocz && this.koniec<p.pocz)||
		 (this.pocz>p.pocz && this.pocz>p.koniec)){
	  return null;
  }
  if(this.pocz>p.pocz && this.koniec>p.koniec){
	  return new Przedzial(this.pocz, p.koniec);
  }
  if(this.pocz>p.pocz && this.koniec<p.koniec){
	  return this;
  }
  else{
	   return new Przedzial(this.koniec, p.pocz);
  }
  }

 public int poczatek(){
	 return pocz;
 }
 public int koniec(){
	 return koniec;
 }
 public String toString(){
	 return "[" + pocz + "," + koniec + "]";
 }
}
