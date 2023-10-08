import java.util.Scanner;
class Vishnuji
{
 public static void main(String[] args)
 {
  int i,size;

  System.out.println("enter size of an array");
  Scanner sc=new Scanner(System.in);
  size=sc.nextInt();

  int a[]=new int[size];
  
  for(i=0;i<size;i++)
  {
  a[i]=sc.nextInt();
   }

  System.out.println("printed arrays");

  for(i=0;i<size;i++)
  {
   System.out.println(a[i]+" ");
   }

  }
}  

     