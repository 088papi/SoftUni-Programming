using System;

namespace Task3_1ToN3
{
    class Task3_1ToN3
    {
        static void Main(string[] args)
        {
            int n = int.Parse(Console.ReadLine());

            for (int i = 1; i < n; i+=3)
            {
                Console.WriteLine(i);
            }
        }
    }
}
