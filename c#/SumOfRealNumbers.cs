using System;

namespace lec
{
	class SumOfRealNumbers
	{
		public static void Main (string[] args)
		{
			int n = int.Parse (Console.ReadLine ());
			decimal sum = 0;
			for (int i = 0; i < n; i++) {
				decimal a = decimal.Parse (Console.ReadLine ());
				sum += a;

			}
			Console.WriteLine (sum);
		}
	
}
}
