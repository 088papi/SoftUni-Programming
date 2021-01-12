using System;

namespace Task2_SleepyTomCat
{
    class Task2_SleepyTomCat
    {
        static void Main(string[] args)
        {


            int daysOff = int.Parse(Console.ReadLine());
            int workdays = 365 - daysOff;

            int allMinutes = daysOff * 127 + workdays * 63;

            if(allMinutes > 30000)
            {
                int diff = allMinutes - 30000;
                Console.WriteLine("Tom will run away");
                Console.WriteLine("{0} hours and {1} minutes more for play", diff/60, diff%60);
            }
            else
            {
                int diff = 30000 - allMinutes;
                Console.WriteLine("Tom sleeps well");
                Console.WriteLine("{0} hours and {1} minutes less for play", diff/60, diff % 60 );
            }

        }
    }
}
