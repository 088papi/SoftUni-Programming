using System;

namespace Task4_VegetableMarket
{
    class Task4_VegetableMarket
    {
        static void Main(string[] args)
        {

            double priceVeggies = double.Parse(Console.ReadLine());
            double priceFruits = double.Parse(Console.ReadLine());
            double veggiesKgs = double.Parse(Console.ReadLine());
            double fruitsKgs = double.Parse(Console.ReadLine());


            Console.WriteLine("{0:F2}", ((priceVeggies * veggiesKgs) / 1.94) + ((priceFruits * fruitsKgs) / 1.94));
        }
    }
}
