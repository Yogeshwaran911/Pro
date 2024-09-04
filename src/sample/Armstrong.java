package sample;
public class Armstrong {
	public static void main(String[] args) 
	{
		for(int i=1;i<=1000;i++)
		{
			if(isArmstrong(i))
			{
				System.out.print(i+"\t");
			}
		}
	}
	static boolean isArmstrong(int num)
	{
		int temp=num;
		int count=nod(num);
		int sum=0;
		while(num>0)
		{
			int rem=num%10;
			sum=sum+power(rem,count);
			num=num/10;
		}
		
		return sum==temp;
	}
	static int power(int rem,int count)
	{
		int res=1;
		for(int i=1;i<=count;i++)
		{
			res=res*rem;
		}
	
		return res;
	}
	static int nod(int num)
	{
		int count=0;
		while(num>0)
		{
			count++;
			num=num/10;
		}
		
		return count;
	}

}
