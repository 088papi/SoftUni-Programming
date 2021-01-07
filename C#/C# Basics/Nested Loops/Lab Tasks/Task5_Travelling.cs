using System;

namespace Task5_Travelling
{
    class Task5_Travelling
    {
        static void Main(string[] args)
        {
            string country = Console.ReadLine();
            double totalMoney = 0;


            while (!country.Equals("End"))
            {
                double neededMoney = double.Parse(Console.ReadLine());

                while(totalMoney< neededMoney)
                {
                    double money = double.Parse(Console.ReadLine());

                    totalMoney += money;

                }

                if (totalMoney >= neededMoney)
                {
                    Console.WriteLine($"Going to {country}!");
                    totalMoney = 0;
                }

                country = Console.ReadLine();
            }
        }
    }
}
