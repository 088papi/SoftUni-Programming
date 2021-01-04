using System;

namespace Task1_SumSeconds
{
    class Program
    {
        static void Main(string[] args)
        {
            int firstLine = int.Parse(Console.ReadLine());
            int secondLine = int.Parse(Console.ReadLine());
            int thirdLine = int.Parse(Console.ReadLine());

            int sum = firstLine + secondLine + thirdLine;
            int seconds = sum % 60;
            int minutes = sum / 60;

           if (seconds < 10)
            {
                Console.WriteLine($"{minutes}:0{seconds}");
            }
           else
            {
                Console.WriteLine($"{minutes}:{seconds}");
            }

        }
    }
}
