using System;

namespace Task5_PasswordGenerator
{
    class Task5_PasswordGenerator
    {
        static void Main(string[] args)
        {
            int n = int.Parse(Console.ReadLine());
            int l = int.Parse(Console.ReadLine());

            for (int i = 1; i <= n; i++)
            {
                for (int j = 1; j <= n; j++)
                {
                    for (char k = 'a' ; k < 'a' + l ; k++)
                    {
                        for (char q = 'a' ; q < 'a' + l; q++)
                        {
                            for (int s = Math.Max(i,j) + 1; s <= n; s++)
                            {
                                Console.WriteLine($"{i}{j}{k}{q}{s}");
                            }
                        }
                    }
                }
            }
        }
    }
}
