class StringMethod
{
public static void main(String args[])
{
String s1 = new String("hello");
String s2 = new String("World");
String s3 = s1.concat(s2);
String s4 = new String("helloWorld");
if(s3==s4)
System.out.println("s3 and s4 are equal using == operator");
else
System.out.println("s3 and s4 are not equal using == operator");
if(s3.equals(s4))
System.out.println("s3 and s4 are equal using .equals() method");
else
System.out.println("s3 and s4 are not equal using .equals() method");
System.out.println(s3.substring(0,s1.length()));
System.out.println(s3.substring(s1.length()));
}
}