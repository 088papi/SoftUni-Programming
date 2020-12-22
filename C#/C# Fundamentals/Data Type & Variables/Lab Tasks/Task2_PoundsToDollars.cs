using System;

namespace Task2_PoundsToDollars
{
    class Task2_PoundsToDollars
    {
        static void Main(string[] args)
        {
            double pounds  = double.Parse(Console.ReadLine());
            double dollars = pounds * 1.31;

            Console.WriteLine($"{dollars:f3}");
        }
    }
}
