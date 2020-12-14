using System;

namespace Task11_MultiplicationTable2
{
    class Task11_MultiplicationTable2
    {
        static void Main(string[] args)
        {
            int n = int.Parse(Console.ReadLine());
            int multiplier = int.Parse(Console.ReadLine());

            if (multiplier > 10)
            {
                Console.WriteLine("{0} X {1} = {2}", n, multiplier, n * multiplier);
            }
            else
            {
                for (int i = multiplier; i <= 10; i++)
                {
                    Console.WriteLine("{0} X {1} = {2}", n, i, n * i);
                }
            }
        }
    }
}
