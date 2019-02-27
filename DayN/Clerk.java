package assignment; 
public final class Clerk extends Emp{
	public Clerk(){
		super(8000,"Clerk");
	}
	public void raiseSalary(){
		salary+=2000;
	}
}
