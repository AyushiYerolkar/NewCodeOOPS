class Person
{
String fname;
String lname;
Person(String fname,String lname)
{
this.fname=fname;
this.lname=lname;
}
public String toString()
{
return fname+" "+lname;
}
public String get_fname()
{
return fname;
}
public String get_lname()
{
return lname;
}
public void set_fname(String fname)
{
this.fname=fname;
}
public void set_lname(String fname)
{
this.lname=lname;
}
}
class GetSet
{
public static void main(String[] args)
{
Person p1=new Person("ABC","XYZ");
System.out.println(p1);
System.out.println(p1.get_fname());
p1.set_fname("AYUSHI");
System.out.println(p1);
}
}