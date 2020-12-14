using System;

namespace Lab_Tasks
{
    class Task1_StudentInformation
    {
        static void Main(string[] args)
        {

            string name = Console.ReadLine();
            int age = int.Parse(Console.ReadLine());
            double grade = double.Parse(Console.ReadLine());

            Console.WriteLine($"Name: {name}, Age: {age}, Grade: {grade:F2}");

        }
    }
}
