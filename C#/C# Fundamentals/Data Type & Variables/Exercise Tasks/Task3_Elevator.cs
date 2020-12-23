using System;

namespace Task3_Elevator
{
    class Task3_Elevator
    {
        static void Main(string[] args)
        {
            int numberOfPeople = int.Parse(Console.ReadLine());
            int capacity = int.Parse(Console.ReadLine());

            int courses = (int)Math.Ceiling((double)numberOfPeople / capacity);
            Console.WriteLine(courses);

        }
    }
}
