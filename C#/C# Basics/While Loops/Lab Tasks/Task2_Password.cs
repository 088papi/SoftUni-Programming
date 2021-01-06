using System;

namespace Task2_Password
{
    class Task2_Password
    {
        static void Main(string[] args)
        {
            string username = Console.ReadLine();
            string password = Console.ReadLine();
            string input = Console.ReadLine();
            while(!input.Equals(password))
            {


                input = Console.ReadLine();
            }

            Console.WriteLine("Welcome " + username);
        }
    }
}
