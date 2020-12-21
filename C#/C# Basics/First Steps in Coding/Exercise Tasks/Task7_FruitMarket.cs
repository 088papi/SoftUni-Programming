using System;

namespace Task7_FruitMarket
{
    class Task7_FruitMarket
    {
        static void Main(string[] args)
        {
            double strawberryPrice = double.Parse(Console.ReadLine());
            double bananas = double.Parse(Console.ReadLine());
            double oranges = double.Parse(Console.ReadLine());
            double raspberries = double.Parse(Console.ReadLine());
            double strawberries = double.Parse(Console.ReadLine());


            double raspberryPrice = strawberryPrice * 0.5;
            double orangePrice = raspberryPrice - (0.40 * raspberryPrice);
            double bananaPrice = raspberryPrice - (0.80 * raspberryPrice);



            Console.WriteLine("{0:F2}",bananas * bananaPrice + strawberries * strawberryPrice + oranges * orangePrice + raspberries * raspberryPrice);
        }
    }
}
