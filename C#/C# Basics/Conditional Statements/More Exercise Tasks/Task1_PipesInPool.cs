using System;

namespace Task1_PipesInPool
{
    class Program
    {
        static void Main(string[] args)
        {
            double volume = double.Parse(Console.ReadLine());
            int debitPipe1 = int.Parse(Console.ReadLine());
            int debitPipe2 = int.Parse(Console.ReadLine());
            double absence = double.Parse(Console.ReadLine());


            double flowPipe1 = debitPipe1 * absence;
            double flowPipe2 = debitPipe2 * absence;
            double capacity = flowPipe1 + flowPipe2;

            if (volume >= capacity)
            {

                double percentCapacity = capacity / volume * 100;

                double pipe1 = flowPipe1 / capacity * 100;
                double pipe2 = flowPipe2 / capacity * 100;

                Console.WriteLine("The pool is {0:F2}% full. Pipe 1: {1:F2}%. Pipe 2: {2:F2}%.", percentCapacity, pipe1,pipe2);
            }
            else
            {
                double overflow = Math.Abs(volume - capacity);
                Console.WriteLine("For {0} hours the pool overflows with {1:F2} liters.", absence, overflow);
            }


        }
    }
}
