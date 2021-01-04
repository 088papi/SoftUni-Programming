using System;

namespace Task7_SwimmingWorldRecord
{
    class Task7_SwimmingWorldRecord
    {
        static void Main(string[] args)
        {
            double swimmingWorldRecord = double.Parse(Console.ReadLine());
            double distanceInMeters = double.Parse(Console.ReadLine());
            double timeInSeconds = double.Parse(Console.ReadLine());

            


           
            double totalTime = distanceInMeters * timeInSeconds;
            double resistanceTime = Math.Floor(distanceInMeters / 15) * 12.5;

            if(swimmingWorldRecord > totalTime + resistanceTime)
            {
                Console.WriteLine("Yes, he succeeded! The new world record is {0:F2} seconds.", totalTime + resistanceTime);
            }
            else
            {
                Console.WriteLine("No, he failed! He was {0:F2} seconds slower.", Math.Abs(swimmingWorldRecord - (totalTime + resistanceTime)));
            }
        }
    }
}
