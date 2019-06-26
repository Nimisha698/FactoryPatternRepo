import java.util.*;
abstract class Plan
{
    protected double rate;
    abstract void getRate();
    public void calculateBill(int units)
    {
        System.out.println(units*rate);
    }
}
class DomesticPlan extends Plan
{
    public void getRate()
    {
        rate=3.50;
    }
}
class CommercialPlan extends Plan
{
    public void getRate()
    {
        rate=6.50;
    }
}
class PlanFactory
{
    public Plan getPlan(String planType)
    {
        if(planType==null)
        {
            return null;
        }
        if(planType.equals("DomesticPlan"))
        {
            return new DomesticPlan();
        }
        else if(planType.equals("CommericalPlan"))
        {
            return new CommercialPlan();
        }
        else
            return null;
    }
}
class FactoryPattern
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the plan type");
        String planType=sc.next();
        System.out.println("Enter the number of units");
        int units=sc.nextInt();
        PlanFactory plan=new PlanFactory();
        Plan p=plan.getPlan(planType);
        p.getRate();
        p.calculateBill(units);
    }
}