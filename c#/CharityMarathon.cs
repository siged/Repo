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
	class CharityMarathon
	{
        public static void Main (string[] args)
		{
            var marathonDuration = int.Parse(Console.ReadLine());
            var runners = long.Parse(Console.ReadLine());
            var averageLaps = int.Parse(Console.ReadLine());
            var lapLenght = long.Parse(Console.ReadLine());
            var trackCapacity = int.Parse(Console.ReadLine());
            var moneyPerKilometer = decimal.Parse(Console.ReadLine());

            trackCapacity *= marathonDuration;

            if (runners <= trackCapacity)
            {
                var totalKilometers = (runners * averageLaps * lapLenght) / 1000;
                var moneyRisen = totalKilometers * moneyPerKilometer;
                Console.WriteLine($"Money raised: {moneyRisen:F2}");
            }
            else 
            {
                runners = trackCapacity;
                var totalKilometers = (runners * averageLaps * lapLenght) / 1000;
                var moneyRisen = totalKilometers * moneyPerKilometer;
                Console.WriteLine($"Money raised: {moneyRisen:F2}");
            }
        }    
    }
}
