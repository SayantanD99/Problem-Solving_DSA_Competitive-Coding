import java.util.Scanner;
class Lucky4
{
  public static void main(String args[])
  {
    int t,n,i,c;
    Scanner sc=new Scanner(System.in);
    t=sc.nextInt();
    c=0;
    n=0;
    for(i=0;i<t;i++)
    {
      c=0;
      n=sc.nextInt();
      while(n!=0)
      {
        if(n%10==4)
        c++;
        n/=10;
      }
      System.out.println(c);
    }
  }
}
