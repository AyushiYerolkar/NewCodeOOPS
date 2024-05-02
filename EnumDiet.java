import java.util.Scanner;
enum Days
{
MON(1,"Monday")
{
public String diet()
{
return "Monday Diet plan is No non-veg food is allowed";
}
},
TUE(2,"Tuesday")
{
public String diet()
{
return "Tuesday Diet plan is Egg,Soup,Fruit juice";
}
},

WED(3,"Wednesday")
{
public String diet()
{
return "Wednesday Diet plan is sprouts,Salad,Fruit juice";
}
},
THU(4,"Thursday")
{
public String diet()
{
return "Thursday Diet plan is Soup,boiled vegetables,rice";
}
},
FRI(5,"Friday")
{
public String diet()
{
return "Friday Diet plan is Milk shake,oats,fruits";
}
},
SAT(6,"Saturday")
{
public String diet()

{
return "Saturday Diet plan is Buttermilk,Cornflakes,Custard";
}
},
SUN(7,"Sunday")
{
public String diet()
{
return "Sunday Diet plan is egg,sandwich,milkshake";
}
};
int number;
String name;
Days(int number,String name)
{
this.number=number;
this.name=name;
}
public abstract String diet();
}

class EnumDiet
{
public static void main(String args[])
{
Days[]d=Days.values();
for(Days d1:d)
{
System.out.println(d1+":"+d1.number+" "+d1.name+"\n"+d1.diet());
}
}
}