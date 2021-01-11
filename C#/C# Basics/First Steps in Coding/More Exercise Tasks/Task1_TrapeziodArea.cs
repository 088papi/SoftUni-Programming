using System;

namespace Task1_TrapeziodArea
{
    class Task1_TrapeziodArea
    {
        static void Main(string[] args)
        {
            double a = double.Parse(Console.ReadLine());
            double b = double.Parse(Console.ReadLine());
            double h = double.Parse(Console.ReadLine());

            double S = (a + b) * h / 2;

            Console.WriteLine("{0:F2}", S);
        }
    }
}
