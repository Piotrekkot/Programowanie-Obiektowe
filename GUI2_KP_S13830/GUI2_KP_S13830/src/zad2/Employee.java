/**
 *
 *  @author Kotowski Piotr S13830
 *
 */

package zad2;


public class Employee {
	String a;
	String b;
	double aa;
	double bb;
public Employee(String a, String b, double d, double e){
	this.a=a;
	this.b=b;
	this.aa=d;
	this.bb=e;
}
public String ToString(){
	return a + b + aa + bb;
}
public String getLastName() {
	return b;
}
public String getFirstName(){
	return a;
}
public double getAge() {
	
	return aa;
}
public double getSalary(){
	return bb;
}
public void chgSalary(double d) {
	bb=(1+d/100)*bb;
}
}
