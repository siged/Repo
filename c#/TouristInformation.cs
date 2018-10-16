using System;

namespace lab5
{
	class TouristInformation
	{
		public static void Main (string[] args)
		{
			var unit = Console.ReadLine ().ToLower ();
			var value = double.Parse (Console.ReadLine ());

			switch (unit) {

			case "miles":
				var kilometer = value * 1.6;
				Console.WriteLine ($"{value} miles = {kilometer:F2} kilometers");
				break;
			case "inches":
				var inches = value * 2.54;
				Console.WriteLine($"{value} inches = {inches:F2} centimeters");
				break;
			case "feet":
				var feet = value * 30;
				Console.WriteLine ($"{value} feet = {feet:F2} centimeters");
				break;
			case "yards":
				var yards = value * 0.91;
				Console.WriteLine ($"{value} yards = {yards:F2} meters");
				break;
			case "gallons":
				var gallons = value * 3.8;
				Console.WriteLine ($"{value} gallons = {gallons:F2} liters");
				break;

			}



}
}
}
