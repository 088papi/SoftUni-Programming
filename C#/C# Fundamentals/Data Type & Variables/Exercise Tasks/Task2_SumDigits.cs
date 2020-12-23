using System;

namespace Task2_SumDigits
{
    class Task2_SumDigits
    {
        static void Main(string[] args)
        {
            String num = Console.ReadLine();
            int sum = 0;

            for (int i = 0; i < num.Length; i++)
            {
                int currentNum = (int)num[i] - 48;

                sum += currentNum;

            }

          

            Console.WriteLine(sum);
           
        }
    }
}
