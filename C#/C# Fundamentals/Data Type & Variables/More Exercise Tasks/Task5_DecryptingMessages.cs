using System;

namespace Task5_DecryptingMessages
{
    class Task5_DecryptingMessages
    {
        static void Main(string[] args)
        {
            int key = int.Parse(Console.ReadLine());
            int lineNumber = int.Parse(Console.ReadLine());
            string result = "";
            for (int i = 0; i < lineNumber; i++)
            {
                string character = Console.ReadLine();
                char c = character[0];
                int charatcterToBeAdded = Convert.ToInt32(c) + key;
                    result += (char)charatcterToBeAdded;

            }

            Console.WriteLine(result);
        }
    }
}
