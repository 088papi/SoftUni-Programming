using System;

namespace Task5_Firm
{
    class Task5_Firm
    {
        static void Main(string[] args)
        {
            int neededHours = int.Parse(Console.ReadLine());
            int days = int.Parse(Console.ReadLine());
            int overtimeWorkers = int.Parse(Console.ReadLine());

            double hours = (days * 8) - 0.10 * (days * 8);
            double overtime = overtimeWorkers * (2 * days);

            hours += overtime;

            hours = Math.Floor(hours);

            if(hours >= neededHours)
            {
                Console.WriteLine("Yes!{0} hours left.", hours-neededHours);
            }
            else
            {
                Console.WriteLine("Not enough time!{0} hours needed.", neededHours-hours);
            }

        }
    }
}
