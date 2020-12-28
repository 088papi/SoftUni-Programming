using System;
using System.Linq;

namespace Task7_MaxSequenceOfEqualElements
{
    class Task7_MaxSequenceOfEqualElements
    {
        static void Main(string[] args)
        {
            int[] arr = Console.ReadLine()
                 .Split()
                 .Select(int.Parse)
                 .ToArray();
            int currentMaxCount = 0;
          
            int sequenceNum = 0;
            int maxCount = 0;
            for (int i = 0; i < arr.Length-1; i++)
            {
                int currentNum = arr[i];
                int nextNum = arr[i + 1];

                if(currentNum == nextNum)
                {
                    currentMaxCount++;
                }
                else
                {
                    currentMaxCount = 0;
                }

                if(currentMaxCount > maxCount)
                {
                    maxCount = currentMaxCount;
                    sequenceNum = currentNum;
                }

            }

            for (int i = 0; i <= maxCount; i++)
            {
                Console.Write(sequenceNum + " ");
            }


        }
    }
}
