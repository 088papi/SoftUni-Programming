using System;

namespace Task4_PrintAndSum
{
    class Task4_PrintAndSum
    {
        static void Main(string[] args)
        {
            int firstNum = int.Parse(Console.ReadLine());
            int secondNum = int.Parse(Console.ReadLine());

            int sum = 0;

            for (int i = firstNum; i <= secondNum; i++)
            {
                sum += i;
                Console.Write(i + " ");
            }
            Console.WriteLine();
            Console.WriteLine("Sum: " + sum);
        }

       
    }
}
