using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using Microsoft.CSharp;
using System.Globalization;
using System.IO;
using System.Text.RegularExpressions;
namespace home
{
	class MainClass
	{
        public static void Main (string[] args)
		{
            var email = Console.ReadLine().Split('@');
            var rightSide = new List<char>();
            var leftSide = new List<char>();

            foreach (char r in email[1])
            {
                rightSide.Add(r);
            }
            foreach (char l in email[0])
            {
                leftSide.Add(l);
            }
            int rightSum = rightSide.Sum(c => Convert.ToInt32(c));
            int leftSUm = leftSide.Sum(c => Convert.ToInt32(c));

            if (leftSUm - rightSum >= 0)
            {
                Console.WriteLine("Call her!");
            }
            else {
                Console.WriteLine("She is not the one.");
            }
        }    
    }
}
