using System;

namespace Task2_EqualSumsEvenOddPosition
{
    class Task2_EqualSumsEvenOddPosition
    {
        static void Main(string[] args)
        {
            int firstNum = int.Parse(Console.ReadLine());
            int secondNum = int.Parse(Console.ReadLine());

            

            for (int i = firstNum; i <= secondNum; i++)
            {

                string currentNum = i.ToString();
                int oddSum = 0;
                int evenSum = 0;
                for (int j = 0; j < currentNum.Length; j++)
                {
                    int digit = int.Parse(currentNum[j].ToString());

                    if(j % 2 == 0)
                    {
                        evenSum += digit;
                    }    
                    else
                    {
                        oddSum += digit;
                    }
                }

                if(evenSum == oddSum)
                {
                    Console.Write(i + " ");
                }
            }
        }
    }
}
