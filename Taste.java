interface Mango
{
 public void mango();
 public void kiwi();
}
 class Taste 
{
 public static void main(String[] args)
{
 Mango a = new Mango()
{
 public void mango()
{ 
 System.out.println("The mangoes is sweet");
}
public void kiwi()
{
 System.out.println("the kiwi is sour");
}
};
a.mango();
a.kiwi();
}
}