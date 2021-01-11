using System;

namespace Task5_TrainingLab
{
    class Task5_TrainingLab
    {
        static void Main(string[] args)
        {
            double w = double.Parse(Console.ReadLine());
            double h = double.Parse(Console.ReadLine());

            double firstSeats = Math.Floor((h * 100 - 100) / 70);
            double secondSeats = Math.Floor(w * 100 / 120);

            double totalSeats = firstSeats * secondSeats - 3 ;
            Console.WriteLine(totalSeats);
        }
    }
}
