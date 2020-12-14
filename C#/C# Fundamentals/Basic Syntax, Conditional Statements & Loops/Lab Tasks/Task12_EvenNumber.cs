using System;
//100/100
namespace Task12_EvenNumber
{
    class Task12_EvenNumber
    {
        static void Main(string[] args)
        {


            int number = int.Parse(Console.ReadLine());

            while (number % 2 != 0)
            {

                Console.WriteLine("Please write an even number.");

                number = int.Parse(Console.ReadLine());
     
            }
            Console.WriteLine("The number is: {0}", Math.Abs(number));

        }
    }
}

