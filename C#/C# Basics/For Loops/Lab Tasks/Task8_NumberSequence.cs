using System;

namespace Task8_NumberSequence
{
    class Task8_NumberSequence
    {
        static void Main(string[] args)
        {

            int n = int.Parse(Console.ReadLine());


            int maxNum = 0;
            int minNum = 0;

            for (int i = 0; i < n; i++)
            {
                int number = int.Parse(Console.ReadLine());

                if(number > maxNum)
                {
                    maxNum = number;
                }


                if (number<minNum)
                {
                    minNum = number;
                }
            }

            Console.WriteLine("Max number: {0}", maxNum);
            Console.WriteLine("Min number: {0}", minNum);


        }
    }
}
