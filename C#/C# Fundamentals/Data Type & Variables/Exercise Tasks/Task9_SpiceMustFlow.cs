using System;

namespace Task9_SpiceMustFlow
{
    class Task9_SpiceMustFlow
    {
        static void Main(string[] args)
        {
            int startingYield = int.Parse(Console.ReadLine());
            byte dayCounter = 0;
            int totalSpice = 0;
            while (startingYield >= 100)
            {
                totalSpice += startingYield;


                if (totalSpice >= 26) {
                    totalSpice -= 26;
                }


            
               

                startingYield -= 10;
                dayCounter++;
          
            
            }

            if (totalSpice >= 26)
            {
                totalSpice -= 26;
            }


            Console.WriteLine(dayCounter);
            Console.WriteLine(totalSpice);

        }
    }
}

