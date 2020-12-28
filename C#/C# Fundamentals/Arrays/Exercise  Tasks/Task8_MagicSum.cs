using System;
using System.Linq;

namespace Task8_MagicSum
{
    class Task8_MagicSum
    {
        static void Main(string[] args)
        {
            int[] numbers = Console.ReadLine()
                .Split()
                .Select(int.Parse)
                .ToArray();


            int magicSum = int.Parse(Console.ReadLine());


            for (int i = 0; i < numbers.Length-1; i++)
            {
                int currentNum = numbers[i];


                for (int j = i + 1; j < numbers.Length; j++)
                {
                    int nextNum = numbers[j];
                  
                    if (currentNum + nextNum == magicSum)
                    {
                        Console.WriteLine(currentNum + " " + nextNum);
                    }
                }
                
               

               
            }

        }
    }
}
