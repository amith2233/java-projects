import java.util.Scanner;
class SavingAmount
{
	int saving;
	void set(int x)
	{
	saving=x;
	}
	int get()
	{
	return saving;
	}
	void incr()
	{
	saving=saving+1000;
	}
	void decr()
	{
	saving=saving-100;
	}
	void checkSavings()
	{
	if(saving>=1000)
	{
	System.out.println("Congratulations! You have a good amount");
	}
	else if(saving>0 &&saving<1000)
	{
System.out.println("Insufficient Saving!");
	}
	else
	{
	System.out.println("You are in debt");
	}
	}
}
class TestSaving
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		SavingAmount sv=new SavingAmount();
		sv.set(n);
		sv.decr();
		System.out.println(sv.get());
		sv.incr();
		System.out.println(sv.get());
		sv.checkSavings();
        System.out.println("Total savings:"+sv.get());
	}
}