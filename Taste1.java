class Fruits
{
 void mango()
{
 System.out.println("Sweet mangoes");
}
void kiwi()
{
 System.out.println("Sweet kiwi");
}
};
class Taste1
{
 public static void main(String[] args)
{
 Fruits f = new Fruits();
 Fruits f1 = new Fruits()
{
 void mango()
{
 System.out.println("Sour mango");
}
void kiwi()
{
System.out.println("Sour kiwi");
}
};
f.mango();
f1.mango();
f.kiwi();
f1.kiwi();
}
}