using System;

namespace Task5_TimePlus15Minutes
{
    class Task5_TimePlus15Minutes
    {
        static void Main(string[] args)
        {
            int hours = int.Parse(Console.ReadLine());
            int minutes = int.Parse(Console.ReadLine());

            minutes = minutes + 15;

            if (minutes >= 60)
            {
                hours += 1;
                minutes -= 60;
            }

            if (hours>= 24)
            {
                hours -= 24;
            }


            Console.WriteLine("{0}:{1:00}", hours, minutes);
        }
    }
}
