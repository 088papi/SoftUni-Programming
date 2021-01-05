using System;

namespace Task12_TradeCommissions
{
    class Task12_TradeCommissions
    {
        static void Main(string[] args)
        {
            string town = Console.ReadLine();
            double sales = double.Parse(Console.ReadLine());
            double commission = 0;
            if (sales < 0)
            {
                Console.WriteLine("error");
                return;
            }

            switch(town)
            {
                case "Sofia":
                    if (sales <= 500)
                    {
                        commission = 5;
                    }
                    else if (sales <= 1000)
                    {
                        commission = 7;
                    } 
                    else if(sales <= 10000)
                    {
                        commission = 8;
                    }
                    else
                    {
                        commission = 12;
                    }
                    break;
                case "Varna":
                    if (sales <= 500)
                    {
                        commission = 4.5;
                    }
                    else if (sales <= 1000)
                    {
                        commission = 7.5;
                    }
                    else if (sales <= 10000)
                    {
                        commission = 10;
                    }
                    else
                    {
                        commission = 13;
                    }
                    break;
                case "Plovdiv":
                    if (sales <= 500)
                    {
                        commission = 5.5;
                    }
                    else if (sales <= 1000)
                    {
                        commission = 8;
                    }
                    else if (sales <= 10000)
                    {
                        commission = 12;
                    }
                    else
                    {
                        commission = 14.5;
                    }
                    break;


                default:
                    Console.WriteLine("error");
                    return;
                
            }

            Console.WriteLine("{0:F2}", ((commission / 100) * sales)); 


        }
    }
}
