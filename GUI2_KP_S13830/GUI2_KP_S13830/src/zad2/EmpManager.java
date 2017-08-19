/**
 *
 *  @author Kotowski Piotr S13830
 *
 */

package zad2;

import java.util.Scanner;

import javax.swing.JOptionPane;

public class EmpManager {

	public static Employee defEmp(String string) {
		String in = JOptionPane.showInputDialog(string);
		try(Scanner scan = new Scanner(in)){
			return new Employee(scan.next(), scan.next(), scan.nextDouble(), scan.nextDouble());
		} catch(Exception exc){
			System.out.println("Blad, nieprawidlowe dane");
		}
	}

	public static void showInfo(Employee e) {
		String a=JOptionPane.showMessageDialog();
		System.out.println(a);
		
	}

	public static void changeSalary(Employee e) {
		
	}

}    
