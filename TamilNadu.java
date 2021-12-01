public  class TamilNadu extends SouthIndia 
{
static String capital="chennai";
String primeMinister;
String prime;
public TamilNadu(String primeMinister)
{
super(primeMinister);
}
public TamilNadu()
{}
public static void main(String[]args)
{
TamilNadu tamil=new TamilNadu();
SouthIndia   si =new TamilNadu("modi");
  si .speaklanguage();
  si .eat();
  si .dress();
  tamil.cultivate();
  tamil.livingstyle();
}
public void speaklanguage(){System.out.println("Tamil");}
public void eat(){System.out.println("eat");}
public void dress(){System.out.println("dress");}

}
/*Output:
   our prime minister is modi
   Tamil
   eat
   dress
   Rice and wheat cultivation
   Average development*/


