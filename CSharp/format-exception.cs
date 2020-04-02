using System;

					
public class Program
{
	public static void Main()
	{
		int a = 10;
		int b = 5;
		try{
		int res = Int32.Parse(div(a,b));
		}catch(FormatException fx){
			Console.Write("expection occured : " + fx);
		}
	}
	public static string div(int a , int b){
		int res = a/b;
		return "two";
		
	}
}