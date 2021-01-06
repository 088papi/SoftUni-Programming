using System;

namespace Task4_MathPower
{
    class Task4_MathPower
    {
        static void Main(string[] args)
        {
            int n = int.Parse(Console.ReadLine());

            for (int i = 0; i <= n; i+=2)
            {
                Console.WriteLine(Math.Pow(2,i));
            }
        }
    }
}
