using System;
using System.Linq;
namespace lab8
{
	class Array
	{
		public static void Main (string[] args)
		{
			var num = Console.ReadLine ().Split (' ').Select(int.Parse).ToArray();
			var sum = 0;
			var minNum = num.Min ();
			var maxNum = num.Max ();
			for (int i = 0; i < num.Length; i++) {
				sum += num [i];
			}
			double averageNum = (double)sum / (double)num.Length;

			Console.WriteLine ($"Min = {minNum}\nMax = {maxNum}\nSum = {sum}\nAverage = {averageNum}");
		}
	}
}
