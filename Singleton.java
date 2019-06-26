import java.util.*;
class Singleton
{
    String s;
    private static Singleton single=null;
    private Singleton()
    {
        s="String of Singleton class";
    }
    public static Singleton getInstance()
    {
        if(single==null)
            return single=new Singleton();
        return single;
    }
}
class X
{
    public static void main(String args[])
    {
        Singleton x=Singleton.getInstance();
        Singleton y=Singleton.getInstance();
        x.s="Hi";
        System.out.println(x.s);
        System.out.println(y.s);
    }
}