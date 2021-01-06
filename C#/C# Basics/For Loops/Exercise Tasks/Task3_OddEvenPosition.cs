using System;

namespace Task3_OddEvenPosition
{
    class Task3_OddEvenPosition
    {
        static void Main(string[] args)
        {
            int n = int.Parse(Console.ReadLine());

            double oddSum = 0;
            double oddMin = 1000000000.0;
            double oddMax = -1000000000.0;

            double evenSum = 0;
            double evenMin = 1000000000.0;
            double evenMax = -1000000000.0;

            for (int i = 1; i <= n; i++)
            {
                double num = double.Parse(Console.ReadLine());
                if(i % 2 == 0)
                {
                    evenSum += num;
                    if(num > evenMax)
                    {
                        evenMax = num;
                    }
                    if(num < evenMin)
                    {
                        evenMin = num;
                    }

                }
                else
                {
                    oddSum += num;
                    if (num > oddMax)
                    {
                        oddMax = num;
                    }
                    if (num < oddMin)
                    {
                        oddMin = num;
                    }
                }
            }


            Console.WriteLine("OddSum={0:F2},", oddSum);
            Console.WriteLine("OddMin={0:F2},", oddMin);
            Console.WriteLine("OddMax={0:F2},", oddMax);
            Console.WriteLine("EvenSum={0:F2},", evenSum);
            Console.WriteLine("EvenSum={0:F2},", evenMin);
            Console.WriteLine("EvenSum={0:F2}", evenMax);
        }
    }
}
