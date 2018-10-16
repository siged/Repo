using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using Microsoft.CSharp;
using System.Globalization;
using System.IO;
using System.Text.RegularExpressions;
namespace 1k
{
    class CoffeeOrders
    {
        public static void Main(string[] args)
        {
            var orders = int.Parse(Console.ReadLine());
            decimal priceOfCapsules = 0;
            decimal totalPrice = 0;
                for (int i = 0; i < orders; i++) 
                {
                var price = decimal.Parse(Console.ReadLine());
                var date = Console.ReadLine().Split('/').Select(int.Parse).ToArray();
                var capsules = int.Parse(Console.ReadLine());

                var month = DateTime.DaysInMonth(date[2], date[1]);
                priceOfCapsules = price * (month * (decimal)capsules);

                Console.WriteLine($"The price for the coffee is: ${priceOfCapsules:F2}");
                totalPrice += priceOfCapsules;
                }


            Console.WriteLine($"Total: ${totalPrice:F2}");
        }
    }
}
