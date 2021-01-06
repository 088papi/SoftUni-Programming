using System;

namespace Task7_MinNumber
{
    class Task7_MinNumber
    {
        static void Main(string[] args)
        {
            string s = Console.ReadLine();

            int min = int.MaxValue;

            while (!s.Equals("Stop"))
            {
                int currentNum = int.Parse(s);

                if (currentNum < min)
                {
                    min = currentNum;
                }



                s = Console.ReadLine();
            }


            Console.WriteLine(min);
        }
    }
}
