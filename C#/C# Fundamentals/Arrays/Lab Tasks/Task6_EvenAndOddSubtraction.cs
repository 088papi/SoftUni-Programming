using System;
using System.Linq;

namespace Task6_EvenAndOddSubtraction
{
    class Task6_EvenAndOddSubtraction
    {
        static void Main(string[] args)
        {
            int[] numbers = Console.ReadLine()
                .Split()
                .Select(int.Parse)
                .ToArray();




            int oddSum = 0;
            int evenSum = 0;

        for (int i = 0; i < numbers.Length; i++)
            {
                if(numbers[i] % 2 == 0)
                {
                    evenSum += numbers[i];
                }
                else
                {
                    oddSum += numbers[i];
                }

            }

            Console.WriteLine(evenSum-oddSum);
        }


        
    }
}
