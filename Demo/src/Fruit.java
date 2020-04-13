
public class Fruit {
String type;
String clr;
Fruit(String t,String c)
{this.type=t;
this.clr=c;
}
public static void main(String arg[])
{ Fruit F1=new Fruit("banana "," yellow");
Fruit F2=new Fruit("checo "," brown");
System.out.println(F1.type + F1.clr);
System.out.println(F2.type + F2.clr);
}
}
