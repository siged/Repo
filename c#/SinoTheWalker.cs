using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using Microsoft.CSharp;
using System.Globalization;
using System.IO;
using System.Text.RegularExpressions;
namespace spaces
{
    class SinoTheWalker
    {
        public static void Main(string[] args)
        {
       
            var currentTime = Console.ReadLine().Split(':').Select(int.Parse).ToArray();
            var steps = int.Parse(Console.ReadLine());
            var stepTime = int.Parse(Console.ReadLine());

            var timeForSteps = steps * stepTime;
           
                var seconds = currentTime[2];
                var minutes = currentTime[1];
                var hours = currentTime[0];
            seconds += timeForSteps;
            while (seconds >= 60)
            {
       
                if (seconds > 59)
                {
                    seconds -= 60;
                    minutes++;
                }
                 if (minutes > 59)
                {
                    minutes -= 60;
                    hours++;
                }
                 if (hours > 23) 
                {
                    hours -= 24;
                }
            }
            Console.WriteLine($"Time Arrival: {hours:D2}:{minutes:D2}:{seconds:D2}");
        }

    }
}
