/**
 *
 *  @author Kotowski Piotr S13830
 *
 */

package zad3;

import zad2.Employee;


public class EmpsList {
EmpElem first;
EmpElem last;
public void add(Employee e){
if(first==null){
	EmpElem elem = new EmpElem(e);
	first=elem;
	last=elem;
}
else{
	EmpElem tmp = new EmpElem(e);
	last.next=tmp;
	tmp.prev=last;
	last=tmp;
}

}
public void showBackward(){
	EmpElem tmp = last;
	do{
		System.out.println(tmp);
		tmp=tmp.prev;
	}while(tmp!=null);
		
	
	}
public void showForward() {
	EmpElem tmp = first;
	do{
		System.out.println(tmp);
		tmp=tmp.next;
	}while(tmp!=null);
	
}
public void changeAllSalaries(double d) {
	EmpElem tmp = first;
	do{
		tmp.e.chgSalary(d);
		tmp=tmp.next;
	}while(tmp!=null);
	
}
}
