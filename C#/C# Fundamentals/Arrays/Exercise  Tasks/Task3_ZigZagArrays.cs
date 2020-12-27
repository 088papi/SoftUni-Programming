using System;
using System.Linq;

namespace Task3_ZigZagArrays
{
    class Task3_ZigZagArrays
    {
        static void Main(string[] args)
        {
            int n = int.Parse(Console.ReadLine());
            int[] firstArray = new int[n];
            int[] secondArray = new int[n];
            for (int i = 0; i < n; i++)
            {
                int[] inputNums = Console.ReadLine().Split().Select(int.Parse).ToArray();
                if(i % 2 != 0)
                {
                    firstArray[i] = inputNums[0];
                    secondArray[i] = inputNums[1];
                }
                else
                {
                    firstArray[i] = inputNums[1];
                    secondArray[i] = inputNums[0];
                }
              
            }



            Console.WriteLine(String.Join(" ", secondArray));
            Console.WriteLine(String.Join(" ", firstArray));
        }
    }
}
