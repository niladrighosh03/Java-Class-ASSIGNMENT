package Empinfo;
import java.util.Scanner;
class Designation_Exception extends Exception{}
class Basic_Salary_Exception extends Exception{}

public class Details
{
    public String Eid, Name, Deg;
    public double BS;
    Scanner sc=new Scanner(System.in);
    public void inputdata()
    {
        System.out.print("Enter the name of Employee ");
        Name=sc.next();
        sc.nextLine(); //clear buffer
        System.out.print("Enter the id of Employee ");
        Eid=sc.next();
        sc.nextLine();
        System.out.print("Enter the designation of Employee ");
        Deg=sc.next();
        sc.nextLine();
        System.out.print("Enter the Basic Salary of Employee ");
        BS=sc.nextDouble();

        //Exception check for Designation
        try
        {
            String c="clerk", m="manager", s="salesman", p="peon";
            if(Deg.compareToIgnorecase(c) && Deg.compareToIgnorecase(m) && Deg.compareToIgnorecase(s) && Deg.compareToIgnorecase(s) && Deg.compareToIgnorecase(p))

            {
                throw new Designation_Exception();
            }
        }
        catch(Designation_Exception e)
        {
            System.out.println("Designation is not valid");
            return;
        }

        //Exception check for Designation
        try
        {
            if(BS<0)
                throw new Basic_Salary_Exception();
        }
        catch(Basic_Salary_Exception e)
        {
            System.out.println("Basic Salary can not be negetive");
            return;
        }

        //return the basic salary
        public double basic()
        {
            return BS;
        }
    }


    //display the data
    public void display()
    {
        System.out.println("*_*_*_*DETAILS OF THE EMPLOYEE*_*_*_*");
        System.out.println("Name of Employee is:- "+Name);
        System.out.println("Id Number of Employee is:- "+Eid);
        System.out.println("Basic Salary of Employee is:- "+BS);
        
    }
}