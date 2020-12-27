using System;

namespace Task1_Train
{
    class Task1_Train
    {
        static void Main(string[] args)
        {
            int wagons = int.Parse(Console.ReadLine());

            int[] train = new int[wagons];
            int allPeople = 0;
            for (int i = 0; i < wagons; i++)
            {

                int people = int.Parse(Console.ReadLine());
                train[i] = people;
                allPeople += people;
            }


            Console.WriteLine(String.Join(" ", train));
            Console.WriteLine(allPeople);
            
        }
    }
}
