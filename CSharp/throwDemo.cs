
static void Main(string[] args)
{
    try
    {
        Method1();
    }
    catch(Exception ex)
    {
        Console.WriteLine(ex.StackTrace);
    }                      
}

static void Method1()
{
    try
    {
        Method2();
    }
    catch(Exception ex)
    {
        throw;
    } 
}

static void Method2()
{
    string str = null;
    try
    {
        Console.WriteLine(str[0]);
    }
    catch(Exception ex)
    {
        throw;
    } 
}
