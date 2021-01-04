using System;

namespace Task6_GodzillaVsKong
{
    class Task6_GodzillaVsKong
    {
        static void Main(string[] args)
        {
            double budget = double.Parse(Console.ReadLine());
            int statists = int.Parse(Console.ReadLine());
            double priceOneStatist = double.Parse(Console.ReadLine());

            double totalPriceStatists = 0.0;

            if(statists < 150)
            {
                totalPriceStatists = statists * priceOneStatist;
            }
            else
            {
                totalPriceStatists = statists * priceOneStatist - (0.1 * statists * priceOneStatist);
            }

            double decorPrice = budget * 0.1;

            if(decorPrice + totalPriceStatists > budget)
            {
                Console.WriteLine("Not enough money!");
                Console.WriteLine("Wingard needs {0:F2} leva more.", (decorPrice + totalPriceStatists - budget));
            }
            else
            {
                Console.WriteLine("Action!");
                Console.WriteLine("Wingard starts filming with {0:F2} leva left.", (budget - (decorPrice + totalPriceStatists)));
            }
        }
    }
}
