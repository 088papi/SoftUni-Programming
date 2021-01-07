using System;

namespace Task3_Vacation
{
    class Task3_Vacation
    {
        static void Main(string[] args)
        {
            double neededMoney = double.Parse(Console.ReadLine());
            double currentMoney = double.Parse(Console.ReadLine());
            byte spendingCounter = 0;
            byte dayCounter = 0;
            
            while (spendingCounter < 5 && currentMoney < neededMoney)
            {
                string action = Console.ReadLine();
                double money = double.Parse(Console.ReadLine());

                switch(action)
                {
                    case "spend":

                        if(money >= currentMoney)
                        {
                            currentMoney = 0;
                        }
                        else
                        {
                            currentMoney -= money;
                        }
                     
                        spendingCounter++;

                        break;
                    case "save":
                        currentMoney += money;
                        spendingCounter = 0;
                        break;
                }


                dayCounter++;

            }
            if (spendingCounter == 5)
            {
                Console.WriteLine("You can't save the money.");
                Console.WriteLine(spendingCounter);
            }
            else
            {
                Console.WriteLine("You saved the money for {0} days.", dayCounter);
            }
        }
    }
}
