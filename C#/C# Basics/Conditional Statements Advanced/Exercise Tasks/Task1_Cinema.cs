using System;

namespace Task1_Cinema
{
    class Task1_Cinema
    {
        static void Main(string[] args)
        {
            string typeOfProjection = Console.ReadLine();
            int rows = int.Parse(Console.ReadLine());
            int columns = int.Parse(Console.ReadLine());

            double total = 0;
            switch (typeOfProjection)
            {
                case "Premiere":
                    total = rows * columns * 12.00;
                    break;
                case "Normal":
                    total = rows * columns * 7.5;
                    break;
                case "Discount":
                    total = rows * columns * 5;
                    break;
            }



            Console.WriteLine("{0:F2}", total);
        }
    }
}
