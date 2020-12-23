using System;

namespace Task4_SumOfChars
{
    class Task4_SumOfChars
    {
        static void Main(string[] args)
        {
            int lines = int.Parse(Console.ReadLine());
            int sum = 0;

            for (int i = 0; i < lines; i++)
            {
                string c = Console.ReadLine();
                sum += (int)c[0];
            }

            Console.WriteLine($"The sum equals: {sum}");
        }
    }
}
