import java.util.Scanner;
class Assign5new
{
	public static void main(String[] args) 
	{
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
      for(int i=0;i<=n-1;i++)
		{
		for (int j=0;j<=n-1;j++ )
		{
			if(i+j>=(n-1))
			{
				System.out.print ("*");
			}
			else
				{
					System.out.print(" ");
				}
		}
		for (int j=0;j<=n-1;j++ )
		{
			if(i==n-1)
			{
				System.out.print ("*");
			}
			else
				{
					System.out.print(" ");
				}
		}
		for (int j=0;j<=n-1;j++ )
		{
			if(i>=j)
			{
				System.out.print ("*");
			}
			else
				{
					System.out.print(" ");
				}
		}
		System.out.println();
		}
		for(int i=0;i<=n-1;i++)
		{
		for (int j=0;j<=n-1;j++ ) 
		{
			System.out.print (" ");
		}
		for(int j=0;j<n;j++)
			{
		 if( i+j<=(n-1) && i>=(n-1)/2  ||i>=j && j>=(n-1)/2 ||i<=j && j<=(n-1)/2 ||i+j>=(n-1)&& i<=(n-1)/2 )
				{
					System.out.print("*");
				}
				
			else
				{
					System.out.print(" ");
				}
				
			}
		for (int j=0;j<=n-1;j++ )
		   {
			System.out.print (" ");
		   }
		System.out.println();	
		}
		for(int i=0;i<=n-1;i++)
		{
		   for (int j=0;j<=n-1;j++ )
		   {
			if(i<=j)
			{
				System.out.print ("*");
			}
			else
				{
					System.out.print(" ");
				}
		  }
		  for (int j=0;j<=n-1;j++ )
		{
			if(i==0)
			{
				System.out.print ("*");
			}
			else
				{
					System.out.print(" ");
				}
		}
		for (int j=0;j<=n-1;j++ )
		   {
			if(i+j<=n-1)
			{
				System.out.print ("*");
			}
			else
				{
					System.out.print(" ");
				}
		   }
		   System.out.println();
		}
	} 
}
	