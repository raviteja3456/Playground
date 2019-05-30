import java.util.Scanner;
class Main
{
  public static int sqr(int n)
  {
    int a;
 a=n*n;
  return a;
  }
      
	public static void main (String[] args)
    {
	int f;
      Scanner in=new Scanner(System.in);
      f=in.nextInt();
      int sol=sqr(f);
      System.out.println(sol);
	} 
}