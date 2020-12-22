using System;

namespace Task7_ConcatNames
{
    class Task7_ConcatNames
    {
        static void Main(string[] args)
        {
            string firstName = Console.ReadLine();
            string lastName = Console.ReadLine();
            string delimeter = Console.ReadLine();

            Console.WriteLine(String.Join(delimeter, firstName,lastName));
        
        }
    }
}
