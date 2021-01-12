using System;

namespace Task6_Pets
{
    class Task6_Pets
    {
        static void Main(string[] args)
        {
            int days = int.Parse(Console.ReadLine());
            int food = int.Parse(Console.ReadLine());
            double dogFoodKg = double.Parse(Console.ReadLine());
            double catFoodKg = double.Parse(Console.ReadLine());
            double turtleFoodGr = double.Parse(Console.ReadLine());

            double allFood = dogFoodKg * days + catFoodKg * days + (turtleFoodGr / 1000) * days;
            
            if(food >= allFood)
            {
                Console.WriteLine("{0} kilos of food left.", Math.Floor(food-allFood));
            }
            else
            {
                Console.WriteLine("{0} more kilos of food are needed.", Math.Ceiling(allFood-food));
            }
        }
    }
}
