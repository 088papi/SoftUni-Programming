using System;

namespace Task4_Histogram
{
    class Task4_Histogram
    {
        static void Main(string[] args)
        {
            int n = int.Parse(Console.ReadLine());

            double counter1 = 0;
            double counter2 = 0;
            double counter3 = 0;
            double counter4 = 0;
            double counter5 = 0;


            for (int i = 0; i < n; i++)
            {
                int num = int.Parse(Console.ReadLine());


                if(num < 200)
                {
                    counter1++;
                }
                else if(num >= 200 && num <= 399)
                {
                    counter2++;
                }
                else if(num >= 400 && num <= 599)
                {
                    counter3++;
                }
                else if(num>=600 && num <=799)
                {
                    counter4++;
                }
                else
                {
                    counter5++;
                }
            }


            Console.WriteLine("{0:F2}%", counter1 / n * 100);
            Console.WriteLine("{0:F2}%", counter2 / n * 100);
            Console.WriteLine("{0:F2}%", counter3 / n * 100);
            Console.WriteLine("{0:F2}%", counter4 / n * 100);
            Console.WriteLine("{0:F2}%", counter5 / n * 100);


        }
    }
}
