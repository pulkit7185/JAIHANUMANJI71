import java.util.Scanner;
class Ramjikisawari7
{
  int vehicle;
  String brand;
 
  public void car()
 {
  System.out.println("enter vehicle and brand");
  Scanner sc=new Scanner(System.in);
  vehicle=sc.nextInt();
  brand=sc.next();
 System.out.println(vehicle+" "+brand);
   }
  }

class Jaimaasita extends Ramjikisawari7
{
  public void car7()
  {System.out.println("these are the brand and vehicle details");
  
     }
}

class Vijayiram
{
 public static void main(String[] args)
 {
  Jaimaasita r=new Jaimaasita();
  r.car();
  r.car7();
   }
 }
