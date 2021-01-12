using System;

namespace Task3_Harvest
{
    class Task3_Harvest
    {
        static void Main(string[] args)
        {
            int x = int.Parse(Console.ReadLine());
            double y = double.Parse(Console.ReadLine());
            int z = int.Parse(Console.ReadLine());
            int workers = int.Parse(Console.ReadLine());

            double vineyard = x * y;
            double wine = 0.4 * vineyard / 2.5;

            if(wine < z)
            {
                Console.WriteLine("It will be a tough winter! More {0} liters wine needed.", Math.Floor(z-wine));
            }
            else
            {
                Console.WriteLine("Good harvest this year! Total wine: {0} liters", Math.Floor(wine));
                Console.WriteLine("{0} liters left -> {1} liters per person.", Math.Ceiling(wine-z), Math.Ceiling((wine-z)/workers));
            }
        }
    }
}
