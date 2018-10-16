using System;

namespace lect
{
	class BackIn30Minutes
	{
		public static void Main (string[] args)
		{
			var hours = int.Parse (Console.ReadLine ());
			var minutes =  int.Parse (Console.ReadLine ());
			minutes += 30;
			if (minutes > 59) {
				
				minutes %= 60;
				hours++;
			}
			if (hours > 23){
				hours %= 24;
				Console.WriteLine ($"{hours}:{minutes:D2}");

			}
			else
			{
				Console.WriteLine ($"{hours}:{minutes:D2}");
		}
		
				
		}

	}
}
