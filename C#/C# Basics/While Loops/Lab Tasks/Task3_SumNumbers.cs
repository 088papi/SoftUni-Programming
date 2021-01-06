using System;

namespace Task3_SumNumbers
{
    class Task3_SumNumbers
    {
        static void Main(string[] args)
        {
            int num = int.Parse(Console.ReadLine());

            int sum = 0;

            while(true)
            {
                int n = int.Parse(Console.ReadLine());

                sum += n;
                if (sum >= num)
                {
                    break;
                }
            }
       
            Console.WriteLine(sum);
        }
    }
}
