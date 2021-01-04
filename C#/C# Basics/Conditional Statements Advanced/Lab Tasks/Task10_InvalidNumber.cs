using System;

namespace Task10_InvalidNumber
{
    class Task10_InvalidNumber
    {
        static void Main(string[] args)
        {
            int number = int.Parse(Console.ReadLine());
            
            if(number < 100 && number != 0 || number > 200)
            {
                Console.WriteLine("invalid");
            }
          
        }
    }
}
