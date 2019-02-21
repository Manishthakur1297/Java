package assignment; 

public final class Manager extends Emp{
	public Manager(){
		super("Manager");
		salary=80000;
		designation="Manager";
	}
	public void raiseSalary(){
		salary+=10000;
	}
}
