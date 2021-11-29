public class ActorSivaKumar implements Actor
{
static String address="Coimbatore";
String name;
int no;
public ActorSivaKumar(int no ,String name )
     {
      System.out.println("car no : "+ no);
	  System.out.println("car name : "+ name);
     } 
public ActorSivaKumar()
     {
      System.out.println("Instance created using Dynamic binding approach constructor");
     } 	 
public static void main(String[]args)

{ 
     ActorSivaKumar kumar = new ActorSivaKumar(65,"Audi car");
	 Actor ac= new ActorSivaKumar();
	 ac.act();
	 ac.dance();
	 ac.sing();
	 System.out.println("Value of address of the interface: "+Actor.address);
     System.out.println("Value of address of the class: "+kumar.address);	 
	 System.out.println(kumar.speaking());
	 
}    
    
	 public String speaking()
    {
     return "speak";
    }
	public void act()
	{
	System.out.println("act");
	}	
	public void dance()
	{
	System.out.println("dance");
	}	
	public void sing()
	{
	System.out.println("sing");
	}

	  
}