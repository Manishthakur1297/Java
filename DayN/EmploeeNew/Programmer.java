package assignment; 
public final class Programmer extends Emp{
	public Programmer(){
		super("Programmer");
		salary=50000;
		designation="Programmer";
	}
	public void raiseSalary(){
		salary+=5000;
	}
}
