using System;

namespace lecture2
{
	class CircleArea
	{
		public static void Main (string[] args)
		{
			double r = double.Parse (Console.ReadLine ());
			Console.WriteLine ("{0:f12}", Math.PI * r * r);
		}
	
}
}
