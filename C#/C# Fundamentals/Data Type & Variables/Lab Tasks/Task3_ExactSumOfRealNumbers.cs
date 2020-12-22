using System;

namespace Task3_ExactSumOfRealNumbers
{
    class Task3_ExactSumOfRealNumbers
    {
        static void Main(string[] args)
        {
            int inputNum = int.Parse(Console.ReadLine());


            decimal sum = 0;

            for (int i = 0; i < inputNum; i++)
            {
                decimal number = decimal.Parse(Console.ReadLine());

                sum += number;
            }

            Console.WriteLine(sum);
        }
    }
}
