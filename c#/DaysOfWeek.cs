using System;

namespace home
{
	class DaysOfWeek
	{
		public static void Main (string[] args)
		{
			var day = int.Parse(Console.ReadLine ());

			string[] den = {
				"Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"
			               };
			if (day >= 1 && day <= 7) {
				Console.WriteLine (den [day - 1]);
			} else {
				Console.WriteLine ("Invalid day!");
			}
	}
}
}
