using System;

namespace Task2_RadiansToDegrees
{
    class Task2_RadiansToDegrees
    {
        static void Main(string[] args)
        {

            double radians = double.Parse(Console.ReadLine());

            Console.WriteLine(Math.Round(radians * 180 / Math.PI));
            //: градус = радиан * 180 / π
        }
    }
}
