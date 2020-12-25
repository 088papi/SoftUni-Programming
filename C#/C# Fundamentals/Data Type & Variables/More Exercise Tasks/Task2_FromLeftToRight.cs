using System;

namespace Task2_FromLeftToRight
{
    class Task2_FromLeftToRight
    {
        static void Main(string[] args)
        {
            int lines = int.Parse(Console.ReadLine());

            for (int i = 0; i < lines; i++)
            {
                string numbers = Console.ReadLine();

                string[] numbersAsArray = numbers.Split(" ");
                int leftNum = int.Parse(numbersAsArray[0]);
                int rightNum = int.Parse(numbersAsArray[1]);

               int leftSum = 0;
                int rightSum = 0;

                if (leftNum > rightNum)
                {
                    while (leftNum != 0)
                    {
                        leftSum += leftNum % 10;
                        leftNum /= 10;
                       
                    }
                    Console.WriteLine(Math.Abs(leftSum));
                }
                else
                {
                    while (rightNum != 0)
                    {
                        rightSum += rightNum % 10;
                        rightNum /= 10;
                      
                    }
                    Console.WriteLine(Math.Abs(rightSum));
                }


                

                      
            }
        }
    }
}
