import java.util.*;
import java.util.Map.Entry;

class MapDemo
{
public static void main(String[]args)
{
Subscriber s1=new Subscriber(101,"Mr.M");
Subscriber s2=new Subscriber(102,"Mr.N");
Subscriber s3=new Subscriber(103,"Mr.O");

Subscriber s4=new Subscriber(104,"Mr.P");
Map<String,Subscriber>m=new HashMap<>();
m.put("1020a",s1);
m.put("1020b",s1);
m.put("1020c",s1);
m.put("1020d",s1);
m.put("2020a",s2);
m.put("2020b",s2);
m.put("2020c",s2);
m.put("3020a",s3);
m.put("3020b",s3);
m.put("4020a",s4);
System.out.println(m);

Map<Subscriber,List> sub= new HashMap<>();
for(Entry<String,Subscriber> entry:m.entrySet())
{

String deviceid=entry.getKey();
Subscriber s= entry.getValue();

if(sub.containsKey(s))
sub.get(s).add(deviceid);

else
{
List<String>deviceList=new ArrayList<>();
deviceList.add(entry.getKey());
sub.put(entry.getValue(),deviceList);
}
}

System.out.println(sub);
}
}
class Subscriber
{
int id;
String name;

Subscriber(int id,String name)
{
this.id=id;
this.name=name;
}

public String toString()

{
return id+ ""+name;
}
String getValue()
{
return name;
}
int getid()
{
return id;
}
}