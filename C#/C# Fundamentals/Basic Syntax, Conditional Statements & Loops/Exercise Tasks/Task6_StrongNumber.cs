using System;
//100/100
namespace Task6_StrongNumber
{
    class Task6_StrongNumber
    {
        static void Main(string[] args)
        {
            string inputNumber = Console.ReadLine();
            int sum = 0;

            for (int i = 0; i < inputNumber.Length; i++)
            {
                int digit = inputNumber[i] - 48;
                int factoriel = 1;
                for (int j = 1; j <= digit; j++)
                {

                    factoriel *= j;
                }
                sum += factoriel;
            }
            int num = int.Parse(inputNumber);
            if (sum == num)
            {
                Console.WriteLine("yes");
            }
            else
            {
                Console.WriteLine("no");
            }

        }
    }
}
