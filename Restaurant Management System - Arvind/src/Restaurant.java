import java.io.*;

class customerOrder
{
    boolean value=false;
    String str[]=new String[3];

    synchronized void d_takeOrder(Thread t)
    {
        if(value)
        {
            try
            {
                wait();        
            }catch(InterruptedException e)
            {
                System.out.println(e);
            }
        }
        System.out.println("\n"+t);
        try
        {
            BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
            for(int i=0;i<3;i++)
            {
                System.out.print("\n Take an Order "+(i+1)+" :- ");
                str[i]=br.readLine();
            }
        }catch(IOException e)
        {
            System.out.println(e);
        }

        value=true;
        notify();
    }
    synchronized void d_dispOrder(Thread t)
    {
        if(!value)
        {
            try
            {
                wait();        
            }catch(InterruptedException e)
            {
                System.out.println(e);
            }
        }
        System.out.println("\n"+t);
        for(int i=0;i<3;i++)
        {
            System.out.print("\n Issue Order No "+(i+1)+" :- "+str[i]);
        }
        value=false;
        notify();
    }
    
}
class takeOrder implements Runnable
{
    customerOrder d;
    Thread t;
    takeOrder(customerOrder d)
    {
        this.d=d;
        t=new Thread(this,"Take an order");
        t.start();
    }
    public void run()
    {
        for(int i=0;i<2;i++)
        {
            d.d_takeOrder(t);
        }
    }
}
class dispOrder implements Runnable
{
    customerOrder d;
    Thread t;
    dispOrder(customerOrder d)
    {
        this.d=d;
        t=new Thread(this,"Issue order No");
        t.start();
    }
    public void run()
    {
        for(int i=0;i<2;i++)
        {
            d.d_dispOrder(t);
        }
    }
}
class Restaurant
{
    public static void main(String args[])
    {
        customerOrder d=new customerOrder();
        new takeOrder(d);
        new dispOrder(d);
    }
}