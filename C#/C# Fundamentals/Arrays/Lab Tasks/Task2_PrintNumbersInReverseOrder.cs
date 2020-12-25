using System;

namespace Task2_PrintNumbersInReverseOrder
{
    class Task2_PrintNumbersInReverseOrder
    {
        static void Main(string[] args)
        {
            int number = int.Parse(Console.ReadLine());

            string[] numbersAsStrings = new string[number];
           
            for (int i = 0; i < number; i++)
            {
                string num = Console.ReadLine();

                numbersAsStrings[i] = num;
            }

            for (int i = numbersAsStrings.Length-1; i >= 0 ; i--)
            {
                Console.WriteLine(numbersAsStrings[i] + " ");
            }


        }
    }
}
