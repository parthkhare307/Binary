import java.util.*;
class Binary
{
public static void main(String args[])
   {
String s1="";
int n,r,q=0;
Scanner sc=new Scanner(System.in);
System.out.println("Enter the Number");
n=sc.nextInt();
for(int i=n;i>0;i=i/2)
	{
          r=i%2;
          if(r== 0 || r==1)
	     {
               
              s1=s1+Integer.toString(r);
              }
}
System.out.print(s1);
}
}
