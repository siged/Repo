using System;

namespace the
{
	class WeatherForecast
	{
		public static void Main (string[] args)
		{
			var number = decimal.Parse (Console.ReadLine ());

			if (number % 1 == 0) {
				if (number <= sbyte.MaxValue && number >= sbyte.MinValue)
					Console.WriteLine ("Sunny");
				else if (number <= int.MaxValue && number >= int.MinValue)
					Console.WriteLine ("Cloudy");
				else if (number <= long.MaxValue && number >= long.MinValue)
					Console.WriteLine ("Windy");
			} else {
				Console.WriteLine ("Rainy");
			}
		}
    }
}
