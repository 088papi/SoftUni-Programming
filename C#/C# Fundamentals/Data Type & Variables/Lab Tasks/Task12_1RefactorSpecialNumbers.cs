using System;

namespace Task12_1RefactorSpecialNumbers
{
    class Task12_1RefactorSpecialNumbers
    {
        static void Main(string[] args)
        {
            int number = int.Parse(Console.ReadLine());
            int sum = 0;
            int prime = 0;
            bool isPrime = false;
            for (int i = 1; i <= number; i++)
            {
                prime = i;
                while (i > 0)
                {
                    sum += i % 10;
                    i = i / 10;
                }
                isPrime = (sum == 5) || (sum == 7) || (sum == 11);
                Console.WriteLine("{0} -> {1}", prime, isPrime);
                sum = 0;
                i = prime;
            }
        }
        }
}
