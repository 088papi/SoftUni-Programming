using System;

namespace Task3_NewHome
{
    class Task3_NewHome
    {
        static void Main(string[] args)
        {
            string typeOfFlowers = Console.ReadLine();
            int flowersNumber = int.Parse(Console.ReadLine());
            int budget = int.Parse(Console.ReadLine());

            double total = 0.0;

            switch(typeOfFlowers)
            {
                case "Roses":
                    total = flowersNumber * 5; 
                    if(flowersNumber > 80)
                    {
                        total -= 0.1 * total;
                    }
                    break;
                case "Dahlias":
                    total = flowersNumber * 3.80;
                    if (flowersNumber > 90)
                    {
                        total -= 0.15 * total;
                    }
                    break;
                case "Tulips":
                    total = flowersNumber * 2.80;
                    if (flowersNumber > 80)
                    {
                        total -= 0.15 * total;
                    }
                    break;
                case "Narcissus":
                    total = flowersNumber * 3;
                    if (flowersNumber < 120)
                    {
                        total += 0.15 * total;
                    }
                    break;
                case "Gladiolus":
                    total = flowersNumber * 2.50;
                    if (flowersNumber < 80)
                    {
                        total += 0.2 * total;
                    }
                    break;

            }

            if(budget >= total)
            {

                Console.WriteLine("Hey, you have a great garden with {0} {1} and {2:F2} leva left.", flowersNumber, typeOfFlowers, budget-total);
            }
            else
            {
                Console.WriteLine("Not enough money, you need {0:F2} leva more.", Math.Abs(budget-total));
            }
        }
    }
}
