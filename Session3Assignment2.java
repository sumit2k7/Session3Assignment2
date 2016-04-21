import java.util.Scanner;
public class Session3Assignment2 {

	public static void main(String[] args) {

		int iNumber=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Number to Check wether prime or not");;
		iNumber=sc.nextInt();
		CheckNumber cn=new CheckNumber(); 
			if(	cn.CheckPrime(iNumber))
				System.out.println("Number is Prime");
			else
				System.out.println("Number is Not Prime");
	}

}

class CheckNumber
{
	public boolean CheckPrime(int i)
	{
		boolean bNumber=true;
		for (int j=2;j<=i/2;j++)
		{
			if(i%j==0)
			{
				bNumber=false;
			}
		}
		if(bNumber)
					return true;
		else
			return false;
	}
}
