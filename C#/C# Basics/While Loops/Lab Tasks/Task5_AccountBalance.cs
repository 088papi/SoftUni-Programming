using System;

namespace Task5_AccountBalance
{
    class Task5_AccountBalance
    {
        static void Main(string[] args)
        {

            double total = 0.0;

            while (true)
            {
                string input = Console.ReadLine();
                if(input.Equals("NoMoreMoney"))
                {
                    break;
                }

                double money = double.Parse(input);
                if(money < 0)
                {
                    Console.WriteLine("Invalid operation!");
                    break;
                }

                Console.WriteLine("Increase: " + money);
                total += money;

            }


            Console.WriteLine("Total: " + total);



        }
    }
}
