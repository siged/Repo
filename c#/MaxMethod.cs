using System;

namespace lab6
{
	class MaxMethod
	{  
		
		public static void Main (string[] args)
		{
			var num1 = int.Parse (Console.ReadLine());
			var num2 = int.Parse (Console.ReadLine());
			var num3 = int.Parse (Console.ReadLine());

			Console.WriteLine (GetMax (num1,num2,num3));
		}
		public static int GetMax(int first, int second,int third)
		{
			if (first > second && first > third) {
				return first;
			} else if (second > first && second > third) {
				return second;
			} else if (third > first && third > second) {
				return third;
			} else {
				return first;
			}
		}
	}
}
