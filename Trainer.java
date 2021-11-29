 public class Trainer
{
String dep="Java",institute="Payilagam";
private int salary=1000;
	
public static void main(String[]args)	
{
	Trainer trainerKumar =new Trainer("CSE","payilagam");
	
}
	
	public Trainer(String dept, String centre)
	{
	    System.out.println(dept);
		System.out.println( centre);
	}
	public Trainer()
	{
		System.out.println("Trainer");
		
	}
	
public int getsalary()
	{
		return this.salary;
	}
public void training()
   {
	
	System.out.println("training");
   }
}