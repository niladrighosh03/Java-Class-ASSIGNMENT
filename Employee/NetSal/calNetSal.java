package NetSal;
public class calNetSal
{
    double NS;
    public void Net(double bs, double hra, double da)
    {
        NS=(bs+hra+da);
        System.out.println("Total Salary of Employee is:- "+NS);
    }
}