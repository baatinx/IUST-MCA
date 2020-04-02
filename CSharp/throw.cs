using System;

class Program
{
    static void Main()
    {
        try
        {
            A();
            B();
            C(null);
        }
        catch (Exception ex)
        {
            Console.WriteLine(ex);
        }
    }

    static void A()
    {
        try
        {
            int value = 1 / int.Parse("0");
        }
        catch
        {
            throw;
        }
    }

    static void B()
    {
        try
        {
            int value = 1 / int.Parse("0");
        }
        catch (DivideByZeroException ex)
        {
            throw ex;
        }
    }

    static void C(string value)
    {
        if (value == null)
        {
            throw new ArgumentNullException("value");
        }
    }
}
