using System;

namespace Task5_Login
{
    class Task5_Login
    {
        static void Main(string[] args)
        {
            string username = Console.ReadLine();

            string password = "";
            int counter = 0;


            for (int i = username.Length -1; i >= 0; i--)
            {
                password += username[i];
            }

            
            while (counter < 4)
            {
                string input = Console.ReadLine();
                if (input.Equals(password))
                {
                    Console.WriteLine("User {0} logged in.", username);
                    return;
                }
                else if (counter < 3)
                {
                    Console.WriteLine("Incorrect password. Try again.");
                }
                counter++;
            }
            if (counter == 4)
            {
                Console.WriteLine("User {0} blocked!", username);
            }
        }
        
    }
}
