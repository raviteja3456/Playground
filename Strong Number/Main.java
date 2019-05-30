import java.util.Scanner;
class Main{
	public static void main (String[] args){
	Scanner in=new Scanner(System.in);
      int a,b,c=0,d=1,sum=0;
      a=in.nextInt();
      b=a;
      while(b>0)
      {
        c=b%10;
        d=1;
        for(int i=1;i<=c;i++)
        {
          d=i*d;
        }
        b=b/10;
        sum=d+sum;
      }
      if(a==sum)
      {
        System.out.println("Yes");
      }
      else
      {
        System.out.println("No");
      }
      
          
      
	}
}