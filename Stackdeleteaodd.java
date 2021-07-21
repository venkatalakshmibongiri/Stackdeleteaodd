import java.util.*;
class Stackdeleteaodd
{
 public static void main(String args[])
 {
  Scanner sc=new Scanner(System.in);
  System.out.println("Enter the Size of Array ");
  int n=sc.nextInt();
  int a[]=new int[n];
  System.out.println("Enter elements in to Array ");
  for(int i=0;i<n;i++)
  {
   a[i]=sc.nextInt();
  }
  Stack<Integer> s =new Stack<Integer>();
  for(int i=0;i<n;i++)
  {   
   s.push(a[i]);
  }
  System.out.println("Stack is "+s);
  for(int i=0;i<s.size();i++)
  {
   if(s.get(i)!=0)
   {
    s.remove(s.get(i));     
   }
  }
  System.out.println("After deleting odd elements Stack is "+s);
 }
}

Output_______________________________________________________________
Enter the Size of Array
5
Enter elements in to Array
12
14
15
16
17
Stack is [12, 14, 15, 16, 17]
After deleting odd elements Stack is [14, 16]