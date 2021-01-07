using System;

namespace Task4_SumOfTwoNumbers
{
    class Task4_SumOfTwoNumbers
    {
        static void Main(string[] args)
        {
            int start = int.Parse(Console.ReadLine());
            int end = int.Parse(Console.ReadLine());
            int magicNum = int.Parse(Console.ReadLine());
            int counter = 0;

            for (int i = start; i <= end; i++)
            {
               

                for (int j = start; j <= end; j++)
                {
                    counter++;
                    if (i + j == magicNum)
                    {
                        Console.Write("Combination N:{0} ", counter);
                        Console.WriteLine("({0} + {1} = {2})", i, j, i+j);
                        return;
                    } 
                }
            }
            Console.WriteLine($"{counter} combinations - neither equals {magicNum}");
        }
    }
}
