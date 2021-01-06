using System;

namespace Task6_MaxNumber
{
    class Task6_MaxNumber
    {
        static void Main(string[] args)
        {
            string s = Console.ReadLine();

            int max = int.MinValue;

            while (!s.Equals("Stop"))
            {
                int currentNum = int.Parse(s);

                if(currentNum > max)
                {
                    max = currentNum;
                }



                s = Console.ReadLine();
            }


            Console.WriteLine(max);
        }
    }
}
