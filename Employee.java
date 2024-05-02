class Employee1
{
String fname;
String lname;
Employee1(String fname,String lname)
{
this.fname=fname;
this.lname=lname;
}
public String toString()
{
return fname+" "+lname;
}
//overriding equals method of object class for content comparison rather than

public boolean equals(Object obj)
{
try
{

Employee1 e=(Employee1)obj;
if(fname.equals(e.fname) && lname.equals(e.lname)){
return true;
}
else{
return false;
}
}
catch(ClassCastException e1)
{
return false;
}
catch(NullPointerException e2)
{
return false;
}

}
}
public class Employee {
public static void main(String []args){
Employee1 e1=new Employee1("ABC","XYZ");
Employee1 e2=new Employee1("PQR","MNP");
Employee1 e3=new Employee1("ABC","XYZ");
Employee1 e4=e1;
//System.out.println(e1);
//System.out.println(e2);
//System.out.println(e3);
System.out.println(e1.equals(e2));
System.out.println(e1.equals(e3));
System.out.println(e1.equals(e4));
System.out.println(e1.equals("ABC"));
System.out.println(e1.equals(null));

}
}
