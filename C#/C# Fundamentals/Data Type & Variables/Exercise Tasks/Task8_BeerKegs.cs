using System;

namespace Task8_BeerKegs
{
    class Task8_BeerKegs
    {
        static void Main(string[] args)
        {

            byte inputTimes = byte.Parse(Console.ReadLine());
            double maxVolume = 0;
            string winner = "";


            for (int i = 0; i < inputTimes; i++)
            {
                string model = Console.ReadLine();
                double radius = double.Parse(Console.ReadLine());
                int height = int.Parse(Console.ReadLine());


                double volume = Math.PI * radius * radius * height;

                if(volume > maxVolume)
                {
                    maxVolume = volume;
                    winner = model;
                }

            }

            Console.WriteLine(winner);



        }
    }
}
