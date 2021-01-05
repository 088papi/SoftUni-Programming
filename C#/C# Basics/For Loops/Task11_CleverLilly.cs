using System;

namespace Task11_CleverLilly
{
    class Task11_CleverLilly
    {
        static void Main(string[] args)
        {
            int years = int.Parse(Console.ReadLine());
            double washingMachinePrice = double.Parse(Console.ReadLine());
            int oneToyPrice = int.Parse(Console.ReadLine());
            int toysNumber = 0;
            double money = 0.0;
            int stolenMoney = 0;

            for (int i = 1; i <= years; i++)
            {
                if(i % 2 != 0)
                {
                    toysNumber++;
                }
                else
                {
                    money += 5 * i; // ДОВЪРШИ ТУК
                    stolenMoney++;
                }
            }

            money -= stolenMoney;
            money+= toysNumber * oneToyPrice;

            if(money >= washingMachinePrice)
            {
                Console.WriteLine("Yes! {0:F2}", money-washingMachinePrice);
            }
            else
            {
                Console.WriteLine("No! {0:F2}", Math.Abs(money-washingMachinePrice));
            }
        }
    }
}
