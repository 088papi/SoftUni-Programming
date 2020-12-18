using System;

namespace Task3_GamingStore
{
    class Task3_GamingStore
    {
        static void Main(string[] args)
        {

            double currentBalance = double.Parse(Console.ReadLine());

            string game = Console.ReadLine();
           
            double totalSpent = 0;
            double gamePrice = 0;

            while (!game.Equals("Game Time"))
            {
               

                switch (game)
                {
                 
                    case "OutFall 4":
                        gamePrice = 39.99;
                        if (currentBalance >= gamePrice)
                        {
                            currentBalance -= gamePrice;
                            totalSpent += gamePrice;
                            Console.WriteLine("Bought {0}", game);
                        }
                        else
                        {
                            Console.WriteLine("Too Expensive");
                        }

                        break;
                    case "CS: OG":
                        gamePrice = 15.99;
                        if (currentBalance >= gamePrice)
                        {
                            currentBalance -= gamePrice;
                            totalSpent += gamePrice;
                            Console.WriteLine("Bought {0}", game);
                        }
                        else
                        {
                            Console.WriteLine("Too Expensive");
                        }

                        break;
                    case "Zplinter Zell":
                        gamePrice = 19.99;
                        if (currentBalance >= gamePrice)
                        {
                            currentBalance -= gamePrice;
                            totalSpent += gamePrice;
                            Console.WriteLine("Bought {0}", game);
                        }
                        else
                        {
                            Console.WriteLine("Too Expensive");
                        }

                        break;
                    case "Honored 2":
                        gamePrice = 59.99;
                        if (currentBalance >= gamePrice)
                        {
                            currentBalance -= gamePrice;
                            totalSpent += gamePrice;
                            Console.WriteLine("Bought {0}", game);
                        }
                        else
                        {
                            Console.WriteLine("Too Expensive");
                        }

                        break;
                    case "RoverWatch":
                        gamePrice = 29.99;
                        if (currentBalance >= gamePrice)
                        {
                            currentBalance -= gamePrice;
                            totalSpent += gamePrice;
                            Console.WriteLine("Bought {0}", game);
                        }
                        else
                        {
                            Console.WriteLine("Too Expensive");
                        }

                        break;
                    case "RoverWatch Origins Edition":
                        gamePrice = 39.99;
                        if (currentBalance >= gamePrice)
                        {
                            currentBalance -= gamePrice;
                            totalSpent += gamePrice;
                            Console.WriteLine("Bought {0}", game);
                        }
                        else
                        {
                            Console.WriteLine("Too Expensive");
                        }

                        break;
                    default:
                        Console.WriteLine("Not Found");
                        break;
                        
                }


                if(currentBalance <= 0 )
                {
                    Console.WriteLine("Out of money!");
                    return;
                }
                
                
           

                game = Console.ReadLine();
            }
                
            Console.WriteLine("Total spent: ${0:F2}. Remaining: ${1:F2}", totalSpent, currentBalance);



        }
    }
}
