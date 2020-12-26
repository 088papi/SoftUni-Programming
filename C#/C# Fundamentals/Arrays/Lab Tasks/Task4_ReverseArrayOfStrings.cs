using System;

namespace Task4_ReverseArrayOfStrings
{
    class Task4_ReverseArrayOfStrings
    {
        static void Main(string[] args)
        {
            string[] strings = Console.ReadLine().Split(" ");

            for (int i = strings.Length-1 ; i >= 0; i--)
            {
                Console.Write(strings[i] + " ");
            }


        }
    }
}
