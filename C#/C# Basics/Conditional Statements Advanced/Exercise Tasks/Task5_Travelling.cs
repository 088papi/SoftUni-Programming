using System;

namespace Task5_Travelling
{
    class Task5_Travelling
    {
        static void Main(string[] args)
        {
            double budget = double.Parse(Console.ReadLine());
            string season = Console.ReadLine();

            double total = 0.0;
            string destination = "";
            string type = "Hotel";
            switch(season)
            {
                case "summer":
                    if(budget <= 100)
                    {
                        total = 0.3 * budget;
                        destination = "Bulgaria";
                        type = "Camp";
                        
                    }
                    else if(budget <= 1000)
                    {
                        total = 0.4 * budget;
                        destination = "Balkans";
                        type = "Camp";
                    }
                    else
                    {
                        total = 0.9 * budget;
                        destination = "Europe";
                       
                    }
                    break;

                case "winter":
                    if (budget <= 100)
                    {
                        total = 0.7 * budget;
                        destination = "Bulgaria";
                       

                    }
                    else if (budget <= 1000)
                    {
                        total = 0.8 * budget;
                        destination = "Balkans";
                       
                    }
                    else
                    {
                        total = 0.9 * budget;
                        destination = "Europe";

                    }
                    break;
            }

            Console.WriteLine($"Somewhere in {destination}");
            Console.WriteLine("{0} - {1:F2}", type, total);
        }
    }
}
