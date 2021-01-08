using System;

namespace Task3_SumPrimeNonPrime
{
    class Task3_SumPrimeNonPrime
    {
        static void Main(string[] args)
        {
            int sumPrime = 0;
            int sumNonPrime = 0;

            while(true)
            {

                string input = Console.ReadLine();


                if (input.Equals("stop"))
                {
                    break;
                }
                

                int num = int.Parse(input);

                bool isPrime = true;

                if (num < 0)
                {
                    Console.WriteLine("Number is negative.");
                }
                else
                {
                    for (int i = 2; i < num; i++)
                    {
                        if(num % i == 0)
                        {
                            isPrime = false;
                            break;
                        }
                    }

                    if(isPrime)
                    {
                        sumPrime += num;
                    }
                    else
                    {
                        sumNonPrime += num;
                    }
                }




            }
            Console.WriteLine("Sum of all prime numbers is: " + sumPrime );
            Console.WriteLine("Sum of all non prime numbers is: " + sumNonPrime );
        }
    }
}
