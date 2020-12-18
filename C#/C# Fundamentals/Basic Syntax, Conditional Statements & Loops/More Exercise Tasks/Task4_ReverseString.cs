using System;

namespace Task4_ReverseString
{
    class Task4_ReverseString
    {
        static void Main(string[] args)
        {
            string input = Console.ReadLine();
            string reversed = "";

            for (int i = input.Length - 1; i >= 0 ; i--)
            {
                reversed += input[i];
            }

            Console.WriteLine(reversed);
        }
    }
}
