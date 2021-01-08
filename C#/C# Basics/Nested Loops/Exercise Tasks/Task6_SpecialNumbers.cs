using System;

namespace Task6_SpecialNumbers
{
    class Task6_SpecialNumbers
    {
        static void Main(string[] args)
        {
            int number = int.Parse(Console.ReadLine());

            for (int i = 1; i <= 9; i++)
            {
                for (int j = 1; j <= 9; j++)
                {
                    for (int k = 1;  k<= 9; k++)
                    {
                        for (int l = 1; l <= 9; l++)
                        {
                            if(number % i == 0 && number % j == 0 && number % k == 0 && number % l == 0)
                            {
                                Console.WriteLine("{0}{1}{2}{3}", i,j,k,l);
                            }
                        }
                    }
                }
            }
        }
    }
}
