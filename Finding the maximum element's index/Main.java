import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
   Scanner in=new Scanner(System.in);
    int a=in.nextInt();
    int s[]=new int[a];
    int b[]=new int[a];
    for(int i=0;i<=a-1;i++)
    {
      s[i]=in.nextInt();
    }
    b[0]=s[0];
    int c=0;
for(int j=0;j<=a-1;j++)
{
 
  if(b[0]<s[j])
  {
    b[0]=s[j];
    c=j;
  }
    
  }
    System.out.println(c);
      
  }
}