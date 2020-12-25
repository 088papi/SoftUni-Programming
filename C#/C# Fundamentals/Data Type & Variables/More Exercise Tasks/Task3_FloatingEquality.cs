using System;

namespace Task3_FloatingEquality
{
    class Task3_FloatingEquality
    {
        static void Main(string[] args)
        {
            Decimal a = Decimal.Parse(Console.ReadLine());
            Decimal b = Decimal.Parse(Console.ReadLine());
            Decimal epsilon = 0.000001m;

            if ((a-b) > epsilon)
            {
                Console.WriteLine("False");
            }
            else
            {
                Console.WriteLine("True");
            }
        }
    }
}
