import java.util.*;
class complex
{
    float real, img;
    complex()
    {
        real=img=0;
    }
    complex(float rn, float in)
    {
        real=rn; img=in;
    }
    void add(complex f1, complex f2)
    {
        //f1=a+ib f2=c+id -->f3=(a+b)+i(b+d)
        real=(f1.real+f2.real); //i will be in the display part only
        img=(f1.img+f2.img);
    }
    void sub(complex f1, complex f2)
    {
        real=(f1.real-f2.real); 
        img=(f1.img-f2.img);
    }
    void mul(complex f1, complex f2)
    {
        //doing simplification 
        real=(f1.real*f2.real - f1.img*f2.img);
        img=(f1.real*f2.img + f1.img*f2.real);
    }
    void division(complex f1, complex f2)
    {
        //doing simplification 
        real=(f1.real*f2.real + f1.img*f2.img)/((f2.real*f2.real) + (f2.img*f2.img));
        img=(f1.img*f2.real - f1.real*f2.img)/((f2.real*f2.real) + (f2.img*f2.img));
    }
    void display()
    {
        if(img>0)
            System.out.println("-> ("+real+")+i("+img+")");
        else
            System.out.println("-> ("+real+")-i("+-img+")");
    }
}
class Ass2
{
    public static void main(String ars[])
    {
        //taking 1st number
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter real part of the complex number ");
        float rn1=sc.nextFloat();
        System.out.println("Enter imaginary part of the complex number ");
        float in1=sc.nextFloat();
        System.out.println("The 1st Number");
        System.out.println("("+rn1+")+i("+in1+")");

        //taking 2nd number
        System.out.println("Enter real part of the complex number ");
        float rn2=sc.nextFloat();
        System.out.println("Enter imaginary part of the complex number ");
        float in2=sc.nextFloat();
        System.out.println("The 2nd Number");
        System.out.println("("+rn2+")+i("+in2+")");
         
         //calculation
         //add
        complex f1=new complex(rn1, in1);    
        complex f2=new complex(rn2, in2); 
        complex f3=new complex();
        f3.add(f1,f2) ;
        System.out.println("Result after addition:");
        f3.display();
        //sub
        f3.sub(f1,f2);
        System.out.println("Result after substraction:");
        f3.display();
        //multiplication
        f3.mul(f1,f2);
        System.out.println("Result after multiplication:");
        f3.display();
        //division
        f3.division(f1,f2);
        System.out.println("Result after division:");
        f3.display();
    }
}