using System;

namespace Task7_WaterOverflow
{
    class Task7_WaterOverflow
    {
        static void Main(string[] args)
        {
            short capacity = 255;

            short sum = 0;

            byte n = byte.Parse(Console.ReadLine());
            for (int i = 0; i < n; i++)
            {
                short waterToAdd = short.Parse(Console.ReadLine());

                sum += waterToAdd;

                if (sum > capacity)
                {
                    Console.WriteLine("Insufficient capacity!");
                    sum -= waterToAdd;
                }
               
                 
               
            
            }
            Console.WriteLine(sum);
        }
    }
}
