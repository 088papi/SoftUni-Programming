using System;

namespace Task9_YardGardening
{
    class Task9_YardGardening
    {
        static void Main(string[] args)
        {
            double sqMeters = double.Parse(Console.ReadLine());

            double totalPrice = sqMeters * 7.61;
            double discount = totalPrice - (0.18 * totalPrice);

            Console.WriteLine("The final price is: {0:F2} lv.", discount);
            Console.WriteLine("The discount is: {0:F2} lv.", totalPrice-discount);


        }
    }
}
