import java.util.Scanner;

class div{

	public static void main(String [] args)
	{
 int divisor; 
int  dividend[]=new int[5];
int reminder[]=new int[5];

		System.out.println("THE PROGRAM STARTS HERE...");
		

                Scanner sc=new Scanner(System.in);

					System.out.println("enter divisor:");
						divisor=sc.nextInt();
	


				System.out.println("enter the dividends");
		for(int i=0;i<5;i++)
		{
						dividend[i]=sc.nextInt();

		}
for(int i=0;i<5;i++)
{

		try{
			 reminder[i]=dividend[i]/divisor;
			System.out.println(reminder[i]);
			}

		catch(Exception e){
				System.out.println("CANNOT BE DIVIDED BY 0");
					}
}
		System.out.println("THE PROGRAM ENDS HERE.");
	}
		
}
