import java.util.*;

class Movie
{
 String name;
Double imdb;
Movie(String name,Double imdb)
{
 this.name=name;
this.imdb=imdb;
}
 public String toString()
{
 return name+" " +imdb;
}

String getName()
{
  return name;
}
 Double getImdb()
{
 return imdb;
}
}
 class SetDemo
{
 public static void main(String[] args)
{
 Movie m1 = new Movie("YJHD",8.2);
Movie m2 = new Movie("DDLJ",9.3);
Movie m3 = new Movie("KKHH",8.5);
Movie m4 = new Movie("RRR",8.9);

TreeSet t1 = new TreeSet(new NameComparator());
t1.add(m1);
t1.add(m2);
t1.add(m3);
t1.add(m4);
System.out.println(t1);


TreeSet t2 = new TreeSet(new RatingComparator());
t2.add(m1);
t2.add(m2);
t2.add(m3);
t2.add(m4);
System.out.println(t2);
}
}

 class NameComparator implements Comparator
{
 public int compare(Object obj1, Object obj2)
{
 Movie n1 = (Movie) obj1;
Movie n2 = (Movie) obj2;

return n1.getName().compareTo(n2.getName());
}
}
class RatingComparator implements Comparator
{
 public int compare(Object obj1, Object obj2)
{
 Movie d1 = (Movie) obj1;
Movie d2 = (Movie) obj2;

return -Double.compare(d1.getImdb(),d2.getImdb());
}
}




