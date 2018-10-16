using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using Microsoft.CSharp;
using System.Numerics;
using System.Globalization;
using System.IO;
namespace space
{
    class SweetDeset
    {
        public static void Main(string[] args)
        {
            var cash = decimal.Parse(Console.ReadLine());
            var guests = int.Parse(Console.ReadLine());
            var bananaPrice = decimal.Parse(Console.ReadLine());
            var eggPrice = decimal.Parse(Console.ReadLine());
            var beriesPrice = decimal.Parse(Console.ReadLine());

            var portionSet = 2 * bananaPrice + 4 * eggPrice + 0.2m * beriesPrice ;
            var guestCounter = 1;

            for (int i = 0; i <= guests; i++)
            {
                if (guests > 6)
                {
                    guestCounter++;
                    guests -= 6;
                }
            }
            var restOfMoney =  guestCounter * portionSet ;
            if (guestCounter * portionSet <= cash)
            {
                
                Console.WriteLine($"Ivancho has enough money - it would cost {restOfMoney:F2}lv.");
            }
            else
            {
                var moneyNeeded = Math.Abs(restOfMoney - cash);
                Console.WriteLine($"Ivancho will have to withdraw money - he will need {moneyNeeded:F2}lv more.");
            }

        }
            
    }
}
