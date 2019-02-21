import assignment.Clerk;
import assignment.Manager;
import assignment.Programmer;
import assignment.Emp; 

public class EmpMain{
	public static void main(String args[]){
		Emp e1=new Clerk();
		Emp e2=new Programmer();
		Emp e3=new Manager();
		Emp.display(e1);
		Emp.display(e2);
		Emp.display(e3);
		e1.raiseSalary();
		e2.raiseSalary();
		e3.raiseSalary();
		System.out.println("------------AFTER RAISING SALARY--------------");
		Emp.display(e1);
		Emp.display(e2);
		Emp.display(e3);
		System.out.println("----------------------------------------------");
		System.out.println("Employee Count------>"+Emp.employeeCount);
	}
}