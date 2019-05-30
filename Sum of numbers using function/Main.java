import java.util.Scanner;
class Main{
  public static int all(int n)
  {
    int a=0;
    for(int i=1;i<=n;i++)
    {
      a=i+a;
     
    }
    return a;
  }
	public static void main (String[] args){
Scanner in=new Scanner(System.in);
      int c,f;
      c=in.nextInt();
      f=all(c);
      System.out.println(f);
      
      
	}
}