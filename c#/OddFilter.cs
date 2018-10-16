using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
namespace lab11
{
	class OddFilter
	{
		public static void Main (string[] args)
		{
			var num = Console.ReadLine ().Split ().Select (int.Parse).ToArray ();
			var list = new List<int> ();
			for (int i = 0; i < num.Length; i++) {
				
				if (num [i] % 2 == 0) {
					list.Add (num [i]);
				}

			}
			var averageNum = list.Average ();

			for (int i = 0; i < list.Count; i++) {

				if (list [i] > averageNum) {
					list [i] += 1;
				} else if (list [i] <= averageNum) {
					list [i] -= 1;
			}

			}
			Console.Write(String.Join(" ",list));
		}
	}  
}

