using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using Microsoft.CSharp;
using System.Numerics;
using System.Globalization;
using System.IO;
using System.Text.RegularExpressions;

namespace train
{
    class Trainers
    {
        public static void Main(string[] args)
        {
            var participants = int.Parse(Console.ReadLine());

            var teamData = new Dictionary<string,decimal>();
            decimal teamPractical = 0;
            decimal teamTechnical = 0;
            decimal teamTheoretical = 0;
            for (int i = 0; i < participants; i++)
            {
                var miles = int.Parse(Console.ReadLine());
                var cargo = double.Parse(Console.ReadLine());
                var team = Console.ReadLine();

                var  distanceInMeters = miles * 1600;
                var  cargoInKilograms = cargo * 1000;
                decimal participantsEarnedMoney = (decimal)((cargoInKilograms * 1.5) - (0.7 * distanceInMeters * 2.5));

                switch (team)
                {
                    case "Practical":
                        teamPractical = participantsEarnedMoney;
                            break;
                    case "Technical":
                        teamTechnical = participantsEarnedMoney;
                        break;
                    case "Theoretical":
                        teamTheoretical = participantsEarnedMoney;
                        break;
                    default:
                        break;

                }

            }
            if (teamPractical >= teamTechnical && teamPractical >= teamTheoretical)
            {
                Console.WriteLine($"The Practical Trainers win with ${teamPractical:F3}.");
            }
            else if (teamTechnical >= teamPractical && teamTechnical >= teamTheoretical)
            {
                Console.WriteLine($"The Technical Trainers win with ${teamTechnical:F3}.");
            }
            if (teamTheoretical >= teamTechnical && teamTheoretical >= teamPractical)
            {
                Console.WriteLine($"The Theoretical Trainers win with ${teamTheoretical:F3}.");
            }



                


    }
}
}
