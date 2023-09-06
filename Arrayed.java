import java.util.*;
class ArrayL
{
public static void main(String[]  args)
{
ArrayList<String> obj =new ArrayList<>();
{
obj.add("one");
obj.add("two");
obj.add("three");
obj.add("four");
obj.add("five");
}
System.out.println("array after addition is ");
for(String str: obj)
{
System.out.println(str);
}
obj.remove("two");
System.out.println("array after deletion is ");
System.out.println(obj);

System.out.println("\n final array is ");
for(String str: obj)
{
System.out.println(str);
}
Collections.sort(obj);
System.out.println("array after sorting is ");
for(String str: obj)
{
System.out.println(str);
}
System.out.println("object at index 2 :"+obj.get(2));
System.out.println("\n three in array list : "+obj.contains("three"));
System.out.println("\n size of array is :" + obj.size());
}
}
