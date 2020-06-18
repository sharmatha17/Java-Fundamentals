import java.util.*; 
public class FlowControl13 
{
	public static void main(String args[])
	{
		int i;
		int num=0;
		String prime="";
		for(i=10;i<99;i++)
		{
			int count=0;
			for(num=i;num>=1;num--)
			{
				if(i%num==0)
				{
					count=count+1;
				}
			}
			if(count==2)
			{
				prime=prime+i+" ";
			}
		}
		System.out.print(prime);
	}
}