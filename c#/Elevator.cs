using System;

namespace lecture
{
	class Elevator
	{
		public static void Main (string[] args)
		{
			int n = int.Parse (Console.ReadLine ());
			int p = int.Parse (Console.ReadLine ());

			int courses = n % p;

			if (courses != 0) {
				n /= p;
				n++;
				Console.WriteLine (n);
			} 
			else {
				n /= p;
				Console.WriteLine (n);
			}
				

		}
	
}
}
