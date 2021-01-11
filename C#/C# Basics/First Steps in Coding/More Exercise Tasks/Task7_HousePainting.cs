using System;

namespace Task7_HousePainting
{
    class Task7_HousePainting
    {
        static void Main(string[] args)
        {
            double heightHouse = double.Parse(Console.ReadLine());
            double lengthSide = double.Parse(Console.ReadLine());
            double heightRoof = double.Parse(Console.ReadLine());

            double frontBackArea = 2 * (heightHouse * heightHouse) - 1.2 * 2;

            double sideArea = 2 * (heightHouse * lengthSide) - 2 * (1.5 * 1.5);

            double roofArea = 2 * (lengthSide * heightHouse) + 2 * (heightHouse * heightRoof / 2);

            double totalRed = (frontBackArea + sideArea) / 3.4;
            double totalGreen = roofArea / 4.3;


            Console.WriteLine("{0:F2}", totalRed);
            Console.WriteLine("{0:F2}", totalGreen);
         
        
        
        
        }
    }
}
