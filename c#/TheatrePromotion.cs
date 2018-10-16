using System;

namespace lect
{
	class TheatrePromotion
	{
		public static void Main (string[] args)
		{
			var day = Console.ReadLine ().ToLower();
			var age = int.Parse (Console.ReadLine ());
		
			if (age >= -1000 || age <= 1000) {
				if (day == "weekday") {
					if (age >= 0 && age <= 18 || age > 64 && age <= 122) {
						Console.WriteLine ("12$");
					} else if (age > 18 && age <= 64) {
						Console.WriteLine ("18$");
					}
				}
				if (day == "weekend") {
					if (age >= 0 && age <= 18 || age > 64 && age <= 122) {
						Console.WriteLine ("15$");
					} else if (age > 18 && age <= 64) {
						Console.WriteLine ("20$");
					}
				}
				if (day == "holiday") { 
					if (age >= 0 && age <= 18) {
						Console.WriteLine ("5$");
					} else if (age > 18 && age <= 64) {
						Console.WriteLine ("12$");
					} else if (age > 64 && age <= 122) {
						Console.WriteLine ("10$");
					} 
					else {
						Console.WriteLine ("Error!");
					}

				}
			} 
		}
				

				
		

	}
}
