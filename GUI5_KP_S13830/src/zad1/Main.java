/**
 *
 *  @author Kotowski Piotr S13830
 *
 */

package zad1;


public class Main {
  public static void main(String[] args)
  {
    Spiewak s1 = new Spiewak("Carrey"){

		@Override
		String spiewaj() {
			// TODO Auto-generated method stub
			return "oooooooooooo";
		}

      
    };

    Spiewak s2 = new Spiewak("Houston"){

		@Override
		String spiewaj() {
			// TODO Auto-generated method stub
			return "a4iBBiii";
		}
      
    };

    Spiewak s3 = new Spiewak("Madonna"){

		@Override
		String spiewaj() {
			// TODO Auto-generated method stub
			return "aAa";
		}
      
    };

    Spiewak sp[] = {s1, s2, s3};

    for (Spiewak s : sp)
      System.out.println(s);


    System.out.println("\n" + Spiewak.najglosniej(sp));
  }
}
