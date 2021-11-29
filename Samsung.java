public class Samsung extends FactoryDemo
{
static int price=5000;

public static void main(String[]args)
{
Samsung sam =new Samsung();
FactoryDemo demo =new Samsung();
SmartPhone phone =new Samsung();
System.out.println(phone.call());
phone.sendMessage();
phone.receivecall();
demo.verifyFingerPrint();
demo.providePattern();
demo.browse();
}
public void verifyFingerPrint(){System.out.println("FingerPrint");}
public void providePattern(){System.out.println("Pattern");}
public int call(){return 923;}
public void sendMessage(){System.out.println("Message");}
public void receivecall(){System.out.println("receivecall");}
}