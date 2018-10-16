using System;

namespace lab
{
	class RestaurantDiscount
	{
		public static void Main (string[] args)
		{
			int groupSize = int.Parse (Console.ReadLine ());
			var package = Console.ReadLine ();
			double totalPrice = 0;
			double PricePerPerson = 0;

			if (groupSize <= 50) {
				if (package == "Normal") {
					totalPrice = (2500 + 500) * 0.95;
					PricePerPerson = totalPrice / groupSize;
					Console.WriteLine ("We can offer you the Small Hall");
					Console.WriteLine ($"The price per person is {PricePerPerson:F2}$");
					
				}
				else	if (package == "Gold") {
					totalPrice = (2500 + 750) * 0.9;
					PricePerPerson = totalPrice / groupSize;
					Console.WriteLine ("We can offer you the Small Hall");
					Console.WriteLine ($"The price per person is {PricePerPerson:F2}$");

				}
				else	if (package == "Platinum") {
					totalPrice = (2500 + 1000) * 0.85;
					PricePerPerson = totalPrice / groupSize;
					Console.WriteLine ("We can offer you the Small Hall");
					Console.WriteLine ($"The price per person is {PricePerPerson:F2}$");

				}
			}
			else	if (groupSize > 50 && groupSize <= 100) {
				if (package == "Normal") {
					totalPrice = (5000 + 500) * 0.95;
					PricePerPerson = totalPrice / groupSize;
					Console.WriteLine ("We can offer you the Terrace");
					Console.WriteLine ($"The price per person is {PricePerPerson:F2}$");

				}
				else	if (package == "Gold") {
					totalPrice = (5000 + 750) * 0.9;
					PricePerPerson = totalPrice / groupSize;
					Console.WriteLine ("We can offer you the Terrace");
					Console.WriteLine ($"The price per person is {PricePerPerson:F2}$");

				}
				else	if (package == "Platinum") {
					totalPrice = (5000 + 1000) * 0.85;
					PricePerPerson = totalPrice / groupSize;
					Console.WriteLine ("We can offer you the Terrace");
					Console.WriteLine ($"The price per person is {PricePerPerson:F2}$");

				}
			}
			else	if (groupSize > 100 && groupSize <= 120) {
				if (package == "Normal") {
					totalPrice = (7500 + 500) * 0.95;
					PricePerPerson = totalPrice / groupSize;
					Console.WriteLine ("We can offer the you Great Hall");
					Console.WriteLine ($"The price per person is {PricePerPerson:F2}$");
				}
				else	if (package == "Gold") {
					totalPrice = (7500 + 750) * 0.9;
					PricePerPerson = totalPrice / groupSize;
					Console.WriteLine ("We can offer you the Great Hall");
					Console.WriteLine ($"The price per person is {PricePerPerson:F2}$");


				}
				else	if (package == "Platinum") {
					totalPrice = (7500 + 1000) * 0.85;
					PricePerPerson = totalPrice / groupSize;
					Console.WriteLine ("We can offer you the Great Hall");
					Console.WriteLine ($"The price per person is {PricePerPerson:F2}$");
	
				}
			}
			else if (groupSize > 120){
				Console.WriteLine("We do not have an appropriate hall.");
			}
		}
	}
}
