using System;

namespace Task4_TransportPrice
{
    class Task4_TransportPrice
    {
        static void Main(string[] args)
        {
            int kilometers = int.Parse(Console.ReadLine());
            string dayTime = Console.ReadLine();

            double total = 0;

            if(kilometers >= 100)
            {
                total = kilometers * 0.06;
            }
            else if(kilometers >= 20)
            {
                total = kilometers * 0.09;
            }
            else
            {
                if (dayTime.Equals("day"))
                {
                    total = 0.70 + kilometers * 0.79;
                }
                else
                {
                    total = 0.70 + kilometers * 0.90;
                }
            }

            Console.WriteLine("{0:F2}", total);
        }
    }
}
