using System;

namespace Task6_Fishland
{
    class Task6_Fishland
    {
        static void Main(string[] args)
        {

            double priceFish1 = double.Parse(Console.ReadLine());
            double priceFish2 = double.Parse(Console.ReadLine());
            double fish3Kgs = double.Parse(Console.ReadLine());
            double fish4Kgs = double.Parse(Console.ReadLine());
            double clamsKg = double.Parse(Console.ReadLine());


            double priceFish3 = priceFish1 + 0.6 * priceFish1;
            double priceFish4 = priceFish2 + 0.8 * priceFish2;
            double allClams = clamsKg * 7.5;

            double total = fish3Kgs * priceFish3 + fish4Kgs * priceFish4 + allClams;

            Console.WriteLine("{0:F2}", total);
           // •	Първи ред – цена на скумрията на килограм.Реално число в интервала[0.00…40.00]
           // •	Втори ред – цена на цацата на килограм.Реално число в интервала[0.00…30.00]
           // •	Трети ред – килограма паламуд. Реално число в интервала[0.00…50.00]
           // •	Четвърти ред – килограма сафрид. Реално число в интервала[0.00… 70.00]
           // •	Пети ред – килограма миди. Цяло число в интервала[0... 100]
           //
        }
    }
}
