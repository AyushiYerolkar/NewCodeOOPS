import java.util.*;
import java.util.Arrays;
import java.util.stream.Collectors;

class StreamDemo
{
 public static void main(String[] args)
{
 List<Double>amplitudes=Arrays.asList(new Double[]{0.45,1.0,2.2,3.5,4.7,5.0,0.21,1.2});
System.out.println("Amplitudes of signal:"+amplitudes);
double ut = 4.5;
double lt = 0.5;
int mul = 2;
List<Double>filteredAmplitudes= amplitudes.stream().filter(a->(a<=ut&&a>=lt)).map(a->a*2).collect(Collectors.toList());
System.out.println("filteredAmplitudes of signal: "+filteredAmplitudes);

if(filteredAmplitudes.isEmpty())
System.out.println("No value in given range!");
else 
 
 {
 double min = filteredAmplitudes.stream().min(Double::compare).get();
double max = filteredAmplitudes.stream().max(Double::compare).get();
System.out.println("Max value is : " +max);
System.out.println("Min value is : " +min);
}
}
}