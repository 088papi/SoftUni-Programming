using System;

namespace Task1_Books
{
    class Task1_Books
    {
        static void Main(string[] args)
        {
            string searchedBook = Console.ReadLine();
            string input = Console.ReadLine();
            byte counter = 0;

            while(!input.Equals(searchedBook))
            {
                if(input.Equals("No More Books"))
                {
                    Console.WriteLine("The book you search is not here!");
                    Console.WriteLine("You checked {0} books.", counter);
                    return;
                }


                counter++;
                input = Console.ReadLine();
            }

            Console.WriteLine("You checked {0} books and found it.", counter);
        }
    }
}
