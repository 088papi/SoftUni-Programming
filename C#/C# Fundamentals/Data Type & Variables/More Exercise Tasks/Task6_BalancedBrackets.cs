using System;

namespace Task6_BalancedBrackets
{
    class Task6_BalancedBrackets
    {
        static void Main(string[] args)
        {
            int lines = int.Parse(Console.ReadLine());

            bool isNotBalanced = true;
            byte countLeft = 0;
            byte countRight = 0;
            for (int i = 0; i < lines; i++)
            {
                string s = Console.ReadLine();

                if(s.Equals("("))
                {
                    countLeft++;
                }
                else if(s.Equals(")"))
                {
                    countRight++;
                }    
            }
                if(countLeft == countRight)
            {
                Console.WriteLine("Balanced");
            }
                else
            {
                Console.WriteLine("Unbalanced");
            }
        }
    }
}
