import java.util.Scanner;
import java.lang.*;
import java.util.ArrayList;
class Secret1
{

String Asia(String s1)
	{
	int count=1;
for(int k=0;k<s1.length();k++)
	{
		
	char x=s1.charAt(k);
if ((!(x>='A' && x<='Z')) &&(!(x>='a' && x<='z')))
{
	
	count=0;
}
	}

	if(count==1)
	{
StringBuilder str=new StringBuilder(s1);
for(int i=0;i<str.length();i++)
{

	int x=str.charAt(i)+2;
str.setCharAt(i,(char)x);
}
return str.toString();

}
else
	{
		String s4="Invalid String";
	return s4;
	}
	}
String Dubai(String s1)
{
	StringBuilder str3=new StringBuilder(s1);
	return str3.reverse().toString();
}
String unitedStates(String s1)
{
StringBuilder str6=new StringBuilder(s1);
	String s7=" ";
for(int i=0;i<str6.length();i++)
{
	int b=str6.charAt(i);
	if(i==0)
	{
		s7=s7+b;
	}
	else
	{
		s7=s7+"."+b;
	}	
}
return s7;
}
}
class StringGame extends Secret1
  {
  public static void main(String args[])
  {
Scanner sc=new Scanner(System.in);
int f=sc.nextInt();
Secret1 sd=new Secret1();
String str[]=new String[f];
int loc[]=new int[f];
for(int i=0;i<f;i++)
{
	str[i]=sc.next();
	loc[i]=sc.nextInt();
}
for(int i=0;i<f;i++)
{
	if(loc[i]==0)
	{
		System.out.println(sd.Asia(str[i]));
	}
	else if(loc[i]==1)
		{
			System.out.println(sd.unitedStates(str[i]));
		}
	else if(loc[i]==2)
	{
		System.out.println(sd.Dubai(str[i]));
	}
	else
	{
		System.out.println("invalid locale");
	}
}

  }
  }
