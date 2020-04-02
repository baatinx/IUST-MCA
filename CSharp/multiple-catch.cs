using System;
				
public class Program
{
	public static void Main()
	{
		int a = 10;
		int b = 5;
		try{
			try{
			int res = Int32.Parse(div(a,b));
			}catch(DivideByZeroException de){
				Console.Write("Exception Occured : " + de);
			}catch(ArithmeticException ae){
				Console.Write("Expection Occured : " + ae);
			}
		}catch{
			Console.Write("Unknown exception Occured, Program execution terminated");
		}
	}

	public static string div(int a , int b){
		int res = a/b;
		return "two";
		
	}
}
multiple-catch.cs
Displaying multiple-catch.cs.