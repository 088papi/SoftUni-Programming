﻿using System;

namespace Task1_NumbersEndingIn7
{
    class Task1_NumbersEndingIn7
    {
        static void Main(string[] args)
        {
            for (int i = 7; i <= 997; i++)
            {
                if(i % 10 == 7)
                {
                    Console.WriteLine(i);
                }
            }
        }
    }
}
