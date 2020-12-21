using System;

namespace Task8_FishTank
{
    class Task8_FishTank
    {
        static void Main(string[] args)
        {

            int a = int.Parse(Console.ReadLine());
            int b = int.Parse(Console.ReadLine());
            int h = int.Parse(Console.ReadLine());
            double percent = double.Parse(Console.ReadLine());

            int v = a * b * h; //cm3
            double totalLitres = v * 0.001; // litres 
            double percent2 = percent / 100;

            double total = totalLitres * (1 - percent2);

            Console.WriteLine(total);
               





        }
    }
}
