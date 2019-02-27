package assignment; 

public final class Manager extends Emp{
	public Manager(){
		super(80000,"Manager");
	}
	public void raiseSalary(){
		salary+=10000;
	}
}
