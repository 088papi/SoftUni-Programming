using System;

namespace Task13_SkiTrip
{
    class Task13_SkiTrip
    {
        static void Main(string[] args)
        {
            int days = int.Parse(Console.ReadLine());
            string typeOfRoom = Console.ReadLine();
            string rate = Console.ReadLine();

            
            double totalPrice = 0.0;
            switch(typeOfRoom)
            {
                case "room for one person":
                   
                    totalPrice = (days-1) * 18;

                    break;
                case "apartment":
                

                    totalPrice = (days - 1) * 25;
                    if (days<10)
                    {
                        totalPrice -= (0.3 * totalPrice);
                    }
                    else if(days <= 15)
                    {
                        totalPrice -= (0.35 * totalPrice);
                    }
                    else
                    {
                        totalPrice -= (0.5 * totalPrice);
                    }
                    break;
                case "president apartment":
                 
                    totalPrice = (days - 1) * 35;
                   
                    if (days < 10)
                    {
                        totalPrice -= (0.1 * totalPrice);
                    }
                    else if (days <= 15)
                    {
                        totalPrice -= (0.15 * totalPrice);
                    }
                    else
                    {
                        totalPrice -= (0.2 * totalPrice);
                    }
                    break;
            }


            if(rate.Equals("positive"))
            {
                totalPrice += (0.25 * totalPrice);
            } else
            {
                totalPrice -= (0.1 * totalPrice);
            }



            Console.WriteLine("{0:F2}", totalPrice);
        }
    }
}
