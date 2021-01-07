using System;

namespace Task6_Building
{
    class Task6_Building
    {
        static void Main(string[] args)
        {
            int col = int.Parse(Console.ReadLine());
            int rows = int.Parse(Console.ReadLine());

            for (int i = col; i >= 1; i--)
            {
                for (int j = 0; j < rows; j++)
                {
                    if(i % 2 == 0)
                    {
                        Console.Write("O" + i + j + " ");
                    }
                    else if (i == col)
                    {
                        Console.Write("L" + i + j + " ");
                    }
                    else
                    {
                        Console.Write("A" + i + j + " ");
                    }

                    
                    
                }
                Console.WriteLine();
            }
        }
    }
}
