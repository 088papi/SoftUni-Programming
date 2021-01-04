using System;

namespace Task2_BonusScore
{
    class Task2_BonusScore
    {
        static void Main(string[] args)
        {
            int startScore = int.Parse(Console.ReadLine());
            double bonus = 0;
            
            if(startScore <= 100)
            {
                bonus += 5;
            }
            else if (startScore > 100 && startScore < 1000)
            {
                bonus += 0.2 * startScore;
            }
            else
            {
                bonus += 0.1 * startScore;
            }

            if (startScore % 2 == 0)
            {
                bonus += 1;
            }
            else if (startScore % 10 == 5)
            {
                bonus += 2;
            }
          
            Console.WriteLine(bonus);
            Console.WriteLine(startScore + bonus);
            
        }
    }
}
