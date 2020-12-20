using System;

namespace Task8_PetShop
{
    class Task8_PetShop
    {
        static void Main(string[] args)
        {
            int dogNumber = int.Parse(Console.ReadLine());
            int otherAnimals = int.Parse(Console.ReadLine());

            Console.WriteLine((dogNumber * 2.5) + (otherAnimals * 4) + " lv."); 

        }
    }
}
