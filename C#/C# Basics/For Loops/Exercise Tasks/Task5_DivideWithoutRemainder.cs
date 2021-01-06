using System;

namespace Task5_DivideWithoutRemainder
{
    class Task5_DivideWithoutRemainder
    {
        static void Main(string[] args)
        {
            int n = int.Parse(Console.ReadLine());


            double counter1 = 0;
            double counter2 = 0;
            double counter3 = 0;


            for (int i = 0; i < n; i++)
            {
                double num = double.Parse(Console.ReadLine());

                if(num % 2 == 0)
                {
                    counter1++; 
                }
                
                if (num % 3 == 0)
                {
                    counter2++;
                }
                
                if (num % 4 == 0)
                {
                    counter3++;
                }
            }


            Console.WriteLine("{0:F2}%", counter1 / n * 100);
            Console.WriteLine("{0:F2}%", counter2 / n * 100);
            Console.WriteLine("{0:F2}%", counter3 / n * 100);
        }
    }
}
