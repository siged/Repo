using System;

namespace lab5
{
	class WaterOverflow
	{
		public static void Main (string[] args)
		{
			var n = int.Parse (Console.ReadLine ());
			var waterTank = 0;
			for (int i = 0; i < n; i++) {
				var	water = int.Parse (Console.ReadLine ());

				if (waterTank + water <= 255) {

					waterTank += water;
				} else {
					Console.WriteLine ("Insufficient capacity!");
				}
				}
			Console.WriteLine (waterTank);



}
}
}
