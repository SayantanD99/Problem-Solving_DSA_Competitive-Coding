import java.util.*;

public class FancyQuotes
{
	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
		int t=sc.nextInt();
		sc.nextLine();
		
		for(int i=0;i<t;i++)
		{
			String str=sc.nextLine();
			
			if(str.indexOf(" not ")!=-1)
			{
				System.out.println("Real Fancy");
			}
			else if(str.indexOf(" not")==str.length()-4)
			{
				System.out.println("Real Fancy");
			}
			else if(str.indexOf("not ")==0)
			{
				System.out.println("Real Fancy");
			}
			else
			{
				System.out.println("regularly fancy");
			}
		}
	}
}
