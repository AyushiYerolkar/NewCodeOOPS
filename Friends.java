import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;
import java.util.LinkedList;

class Friends 
{
 public static void main(String[] args)
{
 List<String>Friend = new ArrayList<String>();
System.out.println("\n Size of List before adding is:"+Friend.size());
Friend.add("Ayushi");
Friend.add("Sayali");
Friend.add("Sonam");
Friend.add("Priya");
Friend.add("Devika");
System.out.println(Friend);

Friend.add("Neha");
System.out.println(Friend);

Friend.add(2,"Lavanya");
System.out.println(Friend);

Friend.add(3,"Rohini");
System.out.println(Friend);

Friend.remove(3);
System.out.println(Friend);

Friend.remove("Lavanya");
System.out.println(Friend);

System.out.println("\ndoes list contain Gauravi\n"+Friend.contains("Gauravi"));
System.out.println("\ndoes list contain Ayushi\n"+Friend.contains("Ayushi"));

System.out.println(Friend.size());

LinkedList ll = new LinkedList();
ll.add(1);
ll.add(2);
ll.add(3);

Friend.addAll(ll);
System.out.println(Friend);

Friend.clear();
System.out.println(Friend.isEmpty());
}
}