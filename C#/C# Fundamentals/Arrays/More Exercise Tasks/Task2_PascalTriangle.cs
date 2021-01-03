using System;

namespace Task2_PascalTriangle
{
    class Task2_PascalTriangle
    {
        static void Main(string[] args)
        {
            int rows = int.Parse(Console.ReadLine());

            for (int i = 0; i < rows; i++)
            {
                int number = 1;

                for (int j = 0; j <= i ; j++)
                {
                    Console.Write($"{number} ");
                    number = number * (i - j) / (j + 1);
                }

                Console.WriteLine();

            }
        }
    }
}
