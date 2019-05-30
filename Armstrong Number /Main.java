import java.util.Scanner;
class Main{
	public static void main (String[] args){
	Scanner in=new Scanner(System.in);
      int a,b=0,c=0,d=1,sum=0,count=0;
      a=in.nextInt();
      int f=a;
      int g=a;
     while(g>0)
     {
       b=g%10;
       ++count;
       g=g/10;
     }
      while(f>0)
      {
        c=f%10;
        d=1;
        for(int i=1;i<=count;i++)
        {
          d=d*c;
        }
      sum=sum+d;
        f=f/10;
      }
   if(a==sum)
   {
     System.out.println("Armstrong Number");
   }
      else
      {
        System.out.println("Not a Armstrong Number");
      }
        
     
   
	}}