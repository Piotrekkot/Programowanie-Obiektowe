package zad3;

import zad2.Employee;

public class EmpElem {
	Employee e;
	EmpElem next;
	EmpElem prev;
	public EmpElem(Employee e){
		this.e=e;
	}
	public String toString(){
		return e.ToString();
	}
}
