import java.util.Scanner;
class Main{
	public static void main (String[] args){
	   Scanner in=new Scanner(System.in);
      int a;
      a=in.nextInt();
      for(int i=1;i<=a;i++)
      {
        for(int j=1;j<=a;j++)
        {
          System.out.print(i);
      }
        System.out.print("\n");
      }
	}
}