using System;

namespace Task9_FuelTankPart2
{
    class Task9_FuelTankPart2
    {
        static void Main(string[] args)
        {

            string fuel = Console.ReadLine();
            double litres = double.Parse(Console.ReadLine());
            string clubCard = Console.ReadLine();

            double price = 0;
            double total = 0;

            switch(fuel)
            {

                case "Gas":
                    total = litres * 0.93;
                    if (clubCard.Equals("Yes"))
                    {
                        total -= 0.08 * litres;
                    }
                    break;
                case "Gasoline":
                    total = litres * 2.22;
                    if (clubCard.Equals("Yes"))
                    {
                        total -= 0.18 * litres;
                    }
                    break;
                case "Diesel":
                    total = litres * 2.33;
                    if (clubCard.Equals("Yes"))
                    {
                        total -= 0.12 * litres;
                    }
                    break;

            }

            
            if(litres >= 20 && litres <= 25)
            {
                total -= 0.08 * total;
            }
            else if(litres > 25)
            {
                total -= 0.10 * total;
            }
             


            Console.WriteLine("{0:F2} lv.", total);


        }
    }
}
