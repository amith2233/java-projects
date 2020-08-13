import java.util.Scanner;
class StringGame
{
	void X(int a,int b)
	{
	int c=a+b;
	System.out.println("sum is:"+c);
	}
	void X(String s1,String s2)
	{
	System.out.println(s1+s2);
	}
	void X(int c,String s3)
	{
	int a=0;
for(int i=0;i<s3.length();i++)
{
a+=s3.charAt(i);
	}
	System.out.println(a+c);
}
}
class TestString
{
	public static void main(String args[])
	{
		StringGame sg=new StringGame();
Scanner sc=new Scanner(System.in);
String s4,s5;
s4=sc.next();
s5=sc.next();
int d=0,d1=0;
int c=sc.nextInt();
switch (c){
case 1:
for(int i=0;i<s4.length();i++)
{
d+=s4.charAt(i);
d1+=s5.charAt(i);
}
sg.X(d,d1);
break;
case 2:
sg.X(s4,s5);
break;
case 3:
sg.X(d,s5);
break;
default :{
	System.out.println("Invalid Operation");
}
}
}
}
