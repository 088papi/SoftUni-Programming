using System;

namespace Task4_RefactoringPrimeChecker
{
    class Task4_RefactoringPrimeChecker
    {
        static void Main(string[] args)
        {
            int number = int.Parse(Console.ReadLine());
            string prime = "true";
            for (int i = 2; i <= number; i++)
            {
                
                for (int j = 2; j < i; j++)
                {
                    if (i % j == 0)
                    {
                     
                        prime = "false";
                        break;
                    } 
                    else
                    {
                        prime = "true";
                    }
                }
                Console.WriteLine("{0} -> {1}", i, prime);
            }

        }
    }
}
