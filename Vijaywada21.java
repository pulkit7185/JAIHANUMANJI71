class Vijaywada1
{
 private String value;
 
 void setValue(String a)
 {
 value=a;
  }

 String getValue()
 {
  return value;
   }
}
class Vijaywada21
{
 public static void main(String[] args)
 {
  Vijaywada1 v=new Vijaywada1();
  v.setValue("havefaith@always");
  System.out.println(v.getValue());
  }
}