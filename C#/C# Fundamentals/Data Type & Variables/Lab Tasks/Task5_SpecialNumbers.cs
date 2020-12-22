using System;

namespace Task5_SpecialNumbers
{
    class Task5_SpecialNumbers
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
                if (isPrime = (sum == 5) || (sum == 7) || (sum == 11))
                {

                    Console.WriteLine("{0:d} -> True", prime); 
                }
                else
                {
                    Console.WriteLine("{0:d} -> False", prime);
                }
                sum = 0;
                i = prime;
            }




        }
    }
}
