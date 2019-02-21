package assignment; 
public final class Clerk extends Emp{
	public Clerk(){
		super("Clerk");
		salary=8000;
		designation="Clerk";
	}
	public void raiseSalary(){
		salary+=2000;
	}
}
