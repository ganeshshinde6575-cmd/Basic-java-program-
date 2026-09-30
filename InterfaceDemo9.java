interface A
{
    int no=11;
    void fun();
    default void gun()
    {
        System.out.println("inside gun");
        Display();
    }
    private void Display()
    {
        System.out.println("inside private Display");

    }
}



class Demo implement A
{
  public void fun()
  {
    System.out.println("inside fun");     }
}
 class InterfaceDemo9
  
public static void main(String A[]) 
{
 Demo dobj = new Demo();   
 dobj.fun();
 dobj.gun();
 dobj.Display();
}
    
