import java.util.Scanner;
class Main{
  public static int abc(int n1,int n2)
  {
   
    int a=n1,sum=0,b=n1;
    for(int i=2;i<=n2;i++)
    {
      
      a=a*b;
      sum=a;
    }
    return sum;
  }
    
	public static void main (String[] args){
      Scanner in=new Scanner(System.in);
      int a,b,c;
      a=in.nextInt();
      b=in.nextInt();
      c=abc(a,b);
      System.out.println(c);
      
	 
	}
}