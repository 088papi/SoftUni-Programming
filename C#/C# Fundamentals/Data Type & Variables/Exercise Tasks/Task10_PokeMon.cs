using System;

namespace Task10_PokeMon
{
    class Task10_PokeMon
    {
        static void Main(string[] args)
        {
            int N = int.Parse(Console.ReadLine());
            int M = int.Parse(Console.ReadLine());
            int Y = int.Parse(Console.ReadLine());
            byte counter = 0;

            decimal halfN = N / 2.0m;
            while (N >= M )
            {
                N -= M;
                counter++;

                if(N == halfN && Y != 0)
                {
                    if (N > Y && Y != 0)
                    {
                        N /= Y;
                    }
                }
            }


            Console.WriteLine(N);
            Console.WriteLine(counter);

        }
    }
}
